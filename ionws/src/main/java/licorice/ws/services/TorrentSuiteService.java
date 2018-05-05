package licorice.ws.services;

import licorice.ws.api.ExperimentList;
import licorice.ws.api.ResultList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TorrentSuiteService {

    @GET("/rundb/api/v1/experiment/")
    Call<ExperimentList> listExperiments(@Query("limit") int limit, @Query("offset") int offset);

    @GET("/rundb/api/v1/results/")
    Call<ResultList> listResults(@Query("limit") int limit, @Query("offset") int offset);
}
