
package licorice.ws.api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("parentIDs")
    @Expose
    private String parentIDs;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("processedflows")
    @Expose
    private Integer processedflows;
    @SerializedName("bamLink")
    @Expose
    private String bamLink;
    @SerializedName("analysismetrics")
    @Expose
    private List<String> analysismetrics = null;
    @SerializedName("reportstorage")
    @Expose
    private Reportstorage reportstorage;
    @SerializedName("processedCycles")
    @Expose
    private Integer processedCycles;
    @SerializedName("autoExempt")
    @Expose
    private Boolean autoExempt;
    @SerializedName("eas")
    @Expose
    private String eas;
    @SerializedName("timeStamp")
    @Expose
    private String timeStamp;
    @SerializedName("projects")
    @Expose
    private List<String> projects = null;
    @SerializedName("tfmetrics")
    @Expose
    private List<String> tfmetrics = null;
    @SerializedName("representative")
    @Expose
    private Boolean representative;
    @SerializedName("reportLink")
    @Expose
    private String reportLink;
    @SerializedName("resultsName")
    @Expose
    private String resultsName;
    @SerializedName("resource_uri")
    @Expose
    private String resourceUri;
    @SerializedName("qualitymetrics")
    @Expose
    private List<String> qualitymetrics = null;
    @SerializedName("filesystempath")
    @Expose
    private String filesystempath;
    @SerializedName("resultsType")
    @Expose
    private String resultsType;
    @SerializedName("log")
    @Expose
    private String log;
    @SerializedName("diskusage")
    @Expose
    private Integer diskusage;
    @SerializedName("reference")
    @Expose
    private String reference;
    @SerializedName("planShortID")
    @Expose
    private String planShortID;
    @SerializedName("analysisVersion")
    @Expose
    private String analysisVersion;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("timeToComplete")
    @Expose
    private String timeToComplete;
    @SerializedName("libmetrics")
    @Expose
    private List<String> libmetrics = null;
    @SerializedName("metaData")
    @Expose
    private MetaData metaData;
    @SerializedName("reportStatus")
    @Expose
    private String reportStatus;
    @SerializedName("runid")
    @Expose
    private String runid;
    @SerializedName("pluginresults")
    @Expose
    private List<String> pluginresults = null;
    @SerializedName("experiment")
    @Expose
    private String experiment;
    @SerializedName("framesProcessed")
    @Expose
    private Integer framesProcessed;

    public String getParentIDs() {
        return parentIDs;
    }

    public void setParentIDs(String parentIDs) {
        this.parentIDs = parentIDs;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProcessedflows() {
        return processedflows;
    }

    public void setProcessedflows(Integer processedflows) {
        this.processedflows = processedflows;
    }

    public String getBamLink() {
        return bamLink;
    }

    public void setBamLink(String bamLink) {
        this.bamLink = bamLink;
    }

    public List<String> getAnalysismetrics() {
        return analysismetrics;
    }

    public void setAnalysismetrics(List<String> analysismetrics) {
        this.analysismetrics = analysismetrics;
    }

    public Reportstorage getReportstorage() {
        return reportstorage;
    }

    public void setReportstorage(Reportstorage reportstorage) {
        this.reportstorage = reportstorage;
    }

    public Integer getProcessedCycles() {
        return processedCycles;
    }

    public void setProcessedCycles(Integer processedCycles) {
        this.processedCycles = processedCycles;
    }

    public Boolean getAutoExempt() {
        return autoExempt;
    }

    public void setAutoExempt(Boolean autoExempt) {
        this.autoExempt = autoExempt;
    }

    public String getEas() {
        return eas;
    }

    public void setEas(String eas) {
        this.eas = eas;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    public List<String> getTfmetrics() {
        return tfmetrics;
    }

    public void setTfmetrics(List<String> tfmetrics) {
        this.tfmetrics = tfmetrics;
    }

    public Boolean getRepresentative() {
        return representative;
    }

    public void setRepresentative(Boolean representative) {
        this.representative = representative;
    }

    public String getReportLink() {
        return reportLink;
    }

    public void setReportLink(String reportLink) {
        this.reportLink = reportLink;
    }

    public String getResultsName() {
        return resultsName;
    }

    public void setResultsName(String resultsName) {
        this.resultsName = resultsName;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    public List<String> getQualitymetrics() {
        return qualitymetrics;
    }

    public void setQualitymetrics(List<String> qualitymetrics) {
        this.qualitymetrics = qualitymetrics;
    }

    public String getFilesystempath() {
        return filesystempath;
    }

    public void setFilesystempath(String filesystempath) {
        this.filesystempath = filesystempath;
    }

    public String getResultsType() {
        return resultsType;
    }

    public void setResultsType(String resultsType) {
        this.resultsType = resultsType;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public Integer getDiskusage() {
        return diskusage;
    }

    public void setDiskusage(Integer diskusage) {
        this.diskusage = diskusage;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getPlanShortID() {
        return planShortID;
    }

    public void setPlanShortID(String planShortID) {
        this.planShortID = planShortID;
    }

    public String getAnalysisVersion() {
        return analysisVersion;
    }

    public void setAnalysisVersion(String analysisVersion) {
        this.analysisVersion = analysisVersion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTimeToComplete() {
        return timeToComplete;
    }

    public void setTimeToComplete(String timeToComplete) {
        this.timeToComplete = timeToComplete;
    }

    public List<String> getLibmetrics() {
        return libmetrics;
    }

    public void setLibmetrics(List<String> libmetrics) {
        this.libmetrics = libmetrics;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    public String getRunid() {
        return runid;
    }

    public void setRunid(String runid) {
        this.runid = runid;
    }

    public List<String> getPluginresults() {
        return pluginresults;
    }

    public void setPluginresults(List<String> pluginresults) {
        this.pluginresults = pluginresults;
    }

    public String getExperiment() {
        return experiment;
    }

    public void setExperiment(String experiment) {
        this.experiment = experiment;
    }

    public Integer getFramesProcessed() {
        return framesProcessed;
    }

    public void setFramesProcessed(Integer framesProcessed) {
        this.framesProcessed = framesProcessed;
    }

    @Override
    public String toString() {
        return "Result{" +
                "parentIDs='" + parentIDs + '\'' +
                ", status='" + status + '\'' +
                ", processedflows=" + processedflows +
                ", bamLink='" + bamLink + '\'' +
                ", analysismetrics=" + analysismetrics +
                ", reportstorage=" + reportstorage +
                ", processedCycles=" + processedCycles +
                ", autoExempt=" + autoExempt +
                ", eas='" + eas + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", projects=" + projects +
                ", tfmetrics=" + tfmetrics +
                ", representative=" + representative +
                ", reportLink='" + reportLink + '\'' +
                ", resultsName='" + resultsName + '\'' +
                ", resourceUri='" + resourceUri + '\'' +
                ", qualitymetrics=" + qualitymetrics +
                ", filesystempath='" + filesystempath + '\'' +
                ", resultsType='" + resultsType + '\'' +
                ", log='" + log + '\'' +
                ", diskusage=" + diskusage +
                ", reference='" + reference + '\'' +
                ", planShortID='" + planShortID + '\'' +
                ", analysisVersion='" + analysisVersion + '\'' +
                ", id=" + id +
                ", timeToComplete='" + timeToComplete + '\'' +
                ", libmetrics=" + libmetrics +
                ", metaData=" + metaData +
                ", reportStatus='" + reportStatus + '\'' +
                ", runid='" + runid + '\'' +
                ", pluginresults=" + pluginresults +
                ", experiment='" + experiment + '\'' +
                ", framesProcessed=" + framesProcessed +
                '}';
    }
}
