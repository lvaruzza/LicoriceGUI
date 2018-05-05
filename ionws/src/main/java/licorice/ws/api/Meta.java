
package licorice.ws.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("total_count")
    @Expose
    private Integer totalCount;
    @SerializedName("offset")
    @Expose
    private Integer offset;
    @SerializedName("previous")
    @Expose
    private java.lang.Object previous;

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public java.lang.Object getPrevious() {
        return previous;
    }

    public void setPrevious(java.lang.Object previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "limit=" + limit +
                ", next='" + next + '\'' +
                ", totalCount=" + totalCount +
                ", offset=" + offset +
                ", previous=" + previous +
                '}';
    }
}
