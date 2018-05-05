package licorice.ws.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Base64;

public class ServiceBuilder {
    private static String DEFAULT_USER = "ionadmin";
    private static String DEFAULT_PASS = "ionadmin";

    public static TorrentSuiteService build(String serverUrl) {

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        String auth = DEFAULT_USER + ":" + DEFAULT_PASS;
        final byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));

        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request original = chain.request();

                String header = "Basic " + new String(encodedAuth);

                Request request = original.newBuilder()
                        .header("Authorization",header)
                        .method(original.method(), original.body())
                        .build();

                return chain.proceed(request);
            }
        });

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(serverUrl)
                .client(httpClient.build())
                .addConverterFactory(GsonConverterFactory.create(gson))
                //.addConverterFactory(ScalarsConverterFactory.create())
                .build();

        TorrentSuiteService service = retrofit.create(TorrentSuiteService.class);

        return service;
    }
}
