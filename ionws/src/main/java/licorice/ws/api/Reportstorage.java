
package licorice.ws.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reportstorage {

    @SerializedName("default")
    @Expose
    private Boolean _default;

    @Override
    public String toString() {
        return "Reportstorage{" +
                "_default=" + _default +
                ", resourceUri='" + resourceUri + '\'' +
                ", webServerPath='" + webServerPath + '\'' +
                ", name='" + name + '\'' +
                ", dirPath='" + dirPath + '\'' +
                ", id=" + id +
                '}';
    }

    @SerializedName("resource_uri")
    @Expose
    private String resourceUri;
    @SerializedName("webServerPath")
    @Expose
    private String webServerPath;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("dirPath")
    @Expose
    private String dirPath;
    @SerializedName("id")
    @Expose
    private Integer id;

    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    public String getWebServerPath() {
        return webServerPath;
    }

    public void setWebServerPath(String webServerPath) {
        this.webServerPath = webServerPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirPath() {
        return dirPath;
    }

    public void setDirPath(String dirPath) {
        this.dirPath = dirPath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
