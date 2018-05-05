
package licorice.ws.api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultList {

    @SerializedName("objects")
    @Expose
    private List<Result> objects = null;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    public List<Result> getObjects() {
        return objects;
    }

    public void setObjects(List<Result> objects) {
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
        return "ResultList{" +
                "objects=" + objects +
                ", meta=" + meta +
                '}';
    }
}
