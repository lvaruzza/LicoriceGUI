
package licorice.ws.api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExperimentList {

    @SerializedName("objects")
    @Expose
    private List<Experiment> objects = null;

    @SerializedName("meta")
    @Expose
    private Meta meta;

    public List<Experiment> getObjects() {
        return objects;
    }

    public void setObjects(List<Experiment> objects) {
        this.objects = objects;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @Override
    public String toString() {
        return "ExperimentList{" +
                "objects=" + objects +
                '}';
    }
}
