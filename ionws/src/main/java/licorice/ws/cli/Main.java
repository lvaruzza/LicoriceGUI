package licorice.ws.cli;

import licorice.ws.api.Result;
import licorice.ws.api.ResultList;
import licorice.ws.services.ServiceBuilder;
import licorice.ws.services.TorrentSuiteService;
import retrofit2.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TorrentSuiteService service  = ServiceBuilder.build("http://200.205.104.155");

        Response<ResultList> rl = service.listResults(10,0).execute();

        if (rl.isSuccessful()) {
            for (Result r: rl.body().getObjects()) {
                System.out.println(r.getResultsName());
            }
        } else {
            System.out.println(rl.toString());
            System.out.println(rl.headers());
        }

        /*Response<ExperimentList> el = service.listExperiments(10,0).execute();

        if (el.isSuccessful()) {
            for(Experiment e:el.body().getObjects()) {
                System.out.println(e.getExpName());
                System.out.println("\t"+e.getResults());
            }
        } else {
            System.out.println(el.toString());
            System.out.println(el.headers());
        }*/
    }
}
