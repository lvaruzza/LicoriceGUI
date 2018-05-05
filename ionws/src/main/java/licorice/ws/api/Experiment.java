
package licorice.ws.api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Experiment {

    @SerializedName("chefChipExpiration1")
    @Expose
    private String chefChipExpiration1;
    @SerializedName("eas_set")
    @Expose
    private List<EasSet> easSet = null;
    @SerializedName("unique")
    @Expose
    private String unique;
    @SerializedName("sample")
    @Expose
    private String sample;
    @SerializedName("resultDate")
    @Expose
    private String resultDate;
    @SerializedName("expDir")
    @Expose
    private String expDir;
    @SerializedName("chefKitType")
    @Expose
    private String chefKitType;
    @SerializedName("chefSamplePos")
    @Expose
    private String chefSamplePos;
    @SerializedName("reagentBarcode")
    @Expose
    private String reagentBarcode;
    @SerializedName("chefReagentsExpiration")
    @Expose
    private String chefReagentsExpiration;
    @SerializedName("sequencekitbarcode")
    @Expose
    private String sequencekitbarcode;
    @SerializedName("expName")
    @Expose
    private String expName;
    @SerializedName("chefProgress")
    @Expose
    private Integer chefProgress;
    @SerializedName("chefReagentID")
    @Expose
    private String chefReagentID;
    @SerializedName("chipBarcode")
    @Expose
    private String chipBarcode;
    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("runtype")
    @Expose
    private String runtype;
    @SerializedName("chefLastUpdate")
    @Expose
    private java.lang.Object chefLastUpdate;
    @SerializedName("resource_uri")
    @Expose
    private String resourceUri;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("baselineRun")
    @Expose
    private Boolean baselineRun;
    @SerializedName("chefReagentsPart")
    @Expose
    private String chefReagentsPart;
    @SerializedName("chefTipRackBarcode")
    @Expose
    private String chefTipRackBarcode;
    @SerializedName("flowsInOrder")
    @Expose
    private String flowsInOrder;
    @SerializedName("expCompInfo")
    @Expose
    private String expCompInfo;
    @SerializedName("chefSolutionsExpiration")
    @Expose
    private String chefSolutionsExpiration;
    @SerializedName("ftpStatus")
    @Expose
    private String ftpStatus;
    @SerializedName("chefSolutionsLot")
    @Expose
    private String chefSolutionsLot;
    @SerializedName("storage_options")
    @Expose
    private String storageOptions;
    @SerializedName("runMode")
    @Expose
    private String runMode;
    @SerializedName("chipType")
    @Expose
    private String chipType;
    @SerializedName("cycles")
    @Expose
    private Integer cycles;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("chefLogPath")
    @Expose
    private java.lang.Object chefLogPath;
    @SerializedName("star")
    @Expose
    private Boolean star;
    @SerializedName("chefExtraInfo_1")
    @Expose
    private String chefExtraInfo1;
    @SerializedName("chefScriptVersion")
    @Expose
    private String chefScriptVersion;
    @SerializedName("chefChipType1")
    @Expose
    private String chefChipType1;
    @SerializedName("seqKitBarcode")
    @Expose
    private String seqKitBarcode;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("results")
    @Expose
    private List<java.lang.Object> results = null;
    @SerializedName("plan")
    @Expose
    private String plan;
    @SerializedName("rawdatastyle")
    @Expose
    private String rawdatastyle;
    @SerializedName("chefLotNumber")
    @Expose
    private String chefLotNumber;
    @SerializedName("chefChipType2")
    @Expose
    private String chefChipType2;
    @SerializedName("chefReagentsLot")
    @Expose
    private String chefReagentsLot;
    @SerializedName("chefStatus")
    @Expose
    private String chefStatus;
    @SerializedName("flows")
    @Expose
    private Integer flows;
    @SerializedName("usePreBeadfind")
    @Expose
    private Boolean usePreBeadfind;
    @SerializedName("chefPackageVer")
    @Expose
    private String chefPackageVer;
    @SerializedName("pgmName")
    @Expose
    private String pgmName;
    @SerializedName("chefSolutionsPart")
    @Expose
    private String chefSolutionsPart;
    @SerializedName("samples")
    @Expose
    private List<java.lang.Object> samples = null;
    @SerializedName("chefExtraInfo_2")
    @Expose
    private String chefExtraInfo2;
    @SerializedName("chefInstrumentName")
    @Expose
    private String chefInstrumentName;
    @SerializedName("sequencekitname")
    @Expose
    private String sequencekitname;
    @SerializedName("isProton")
    @Expose
    private String isProton;
    @SerializedName("chefChipExpiration2")
    @Expose
    private String chefChipExpiration2;
    @SerializedName("user_ack")
    @Expose
    private String userAck;
    @SerializedName("metaData")
    @Expose
    private MetaData metaData;
    @SerializedName("log")
    @Expose
    private Log log;
    @SerializedName("autoAnalyze")
    @Expose
    private Boolean autoAnalyze;
    @SerializedName("isReverseRun")
    @Expose
    private Boolean isReverseRun;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("diskusage")
    @Expose
    private java.lang.Object diskusage;
    @SerializedName("pinnedRepResult")
    @Expose
    private Boolean pinnedRepResult;
    @SerializedName("chefManufactureDate")
    @Expose
    private String chefManufactureDate;
    @SerializedName("chefMessage")
    @Expose
    private String chefMessage;
    @SerializedName("reverse_primer")
    @Expose
    private java.lang.Object reversePrimer;
    @SerializedName("storageHost")
    @Expose
    private String storageHost;

    public String getChefChipExpiration1() {
        return chefChipExpiration1;
    }

    public void setChefChipExpiration1(String chefChipExpiration1) {
        this.chefChipExpiration1 = chefChipExpiration1;
    }

    public List<EasSet> getEasSet() {
        return easSet;
    }

    public void setEasSet(List<EasSet> easSet) {
        this.easSet = easSet;
    }

    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public String getResultDate() {
        return resultDate;
    }

    public void setResultDate(String resultDate) {
        this.resultDate = resultDate;
    }

    public String getExpDir() {
        return expDir;
    }

    public void setExpDir(String expDir) {
        this.expDir = expDir;
    }

    public String getChefKitType() {
        return chefKitType;
    }

    public void setChefKitType(String chefKitType) {
        this.chefKitType = chefKitType;
    }

    public String getChefSamplePos() {
        return chefSamplePos;
    }

    public void setChefSamplePos(String chefSamplePos) {
        this.chefSamplePos = chefSamplePos;
    }

    public String getReagentBarcode() {
        return reagentBarcode;
    }

    public void setReagentBarcode(String reagentBarcode) {
        this.reagentBarcode = reagentBarcode;
    }

    public String getChefReagentsExpiration() {
        return chefReagentsExpiration;
    }

    public void setChefReagentsExpiration(String chefReagentsExpiration) {
        this.chefReagentsExpiration = chefReagentsExpiration;
    }

    public String getSequencekitbarcode() {
        return sequencekitbarcode;
    }

    public void setSequencekitbarcode(String sequencekitbarcode) {
        this.sequencekitbarcode = sequencekitbarcode;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName;
    }

    public Integer getChefProgress() {
        return chefProgress;
    }

    public void setChefProgress(Integer chefProgress) {
        this.chefProgress = chefProgress;
    }

    public String getChefReagentID() {
        return chefReagentID;
    }

    public void setChefReagentID(String chefReagentID) {
        this.chefReagentID = chefReagentID;
    }

    public String getChipBarcode() {
        return chipBarcode;
    }

    public void setChipBarcode(String chipBarcode) {
        this.chipBarcode = chipBarcode;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getRuntype() {
        return runtype;
    }

    public void setRuntype(String runtype) {
        this.runtype = runtype;
    }

    public java.lang.Object getChefLastUpdate() {
        return chefLastUpdate;
    }

    public void setChefLastUpdate(java.lang.Object chefLastUpdate) {
        this.chefLastUpdate = chefLastUpdate;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getBaselineRun() {
        return baselineRun;
    }

    public void setBaselineRun(Boolean baselineRun) {
        this.baselineRun = baselineRun;
    }

    public String getChefReagentsPart() {
        return chefReagentsPart;
    }

    public void setChefReagentsPart(String chefReagentsPart) {
        this.chefReagentsPart = chefReagentsPart;
    }

    public String getChefTipRackBarcode() {
        return chefTipRackBarcode;
    }

    public void setChefTipRackBarcode(String chefTipRackBarcode) {
        this.chefTipRackBarcode = chefTipRackBarcode;
    }

    public String getFlowsInOrder() {
        return flowsInOrder;
    }

    public void setFlowsInOrder(String flowsInOrder) {
        this.flowsInOrder = flowsInOrder;
    }

    public String getExpCompInfo() {
        return expCompInfo;
    }

    public void setExpCompInfo(String expCompInfo) {
        this.expCompInfo = expCompInfo;
    }

    public String getChefSolutionsExpiration() {
        return chefSolutionsExpiration;
    }

    public void setChefSolutionsExpiration(String chefSolutionsExpiration) {
        this.chefSolutionsExpiration = chefSolutionsExpiration;
    }

    public String getFtpStatus() {
        return ftpStatus;
    }

    public void setFtpStatus(String ftpStatus) {
        this.ftpStatus = ftpStatus;
    }

    public String getChefSolutionsLot() {
        return chefSolutionsLot;
    }

    public void setChefSolutionsLot(String chefSolutionsLot) {
        this.chefSolutionsLot = chefSolutionsLot;
    }

    public String getStorageOptions() {
        return storageOptions;
    }

    public void setStorageOptions(String storageOptions) {
        this.storageOptions = storageOptions;
    }

    public String getRunMode() {
        return runMode;
    }

    public void setRunMode(String runMode) {
        this.runMode = runMode;
    }

    public String getChipType() {
        return chipType;
    }

    public void setChipType(String chipType) {
        this.chipType = chipType;
    }

    public Integer getCycles() {
        return cycles;
    }

    public void setCycles(Integer cycles) {
        this.cycles = cycles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public java.lang.Object getChefLogPath() {
        return chefLogPath;
    }

    public void setChefLogPath(java.lang.Object chefLogPath) {
        this.chefLogPath = chefLogPath;
    }

    public Boolean getStar() {
        return star;
    }

    public void setStar(Boolean star) {
        this.star = star;
    }

    public String getChefExtraInfo1() {
        return chefExtraInfo1;
    }

    public void setChefExtraInfo1(String chefExtraInfo1) {
        this.chefExtraInfo1 = chefExtraInfo1;
    }

    public String getChefScriptVersion() {
        return chefScriptVersion;
    }

    public void setChefScriptVersion(String chefScriptVersion) {
        this.chefScriptVersion = chefScriptVersion;
    }

    public String getChefChipType1() {
        return chefChipType1;
    }

    public void setChefChipType1(String chefChipType1) {
        this.chefChipType1 = chefChipType1;
    }

    public String getSeqKitBarcode() {
        return seqKitBarcode;
    }

    public void setSeqKitBarcode(String seqKitBarcode) {
        this.seqKitBarcode = seqKitBarcode;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<java.lang.Object> getResults() {
        return results;
    }

    public void setResults(List<java.lang.Object> results) {
        this.results = results;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getRawdatastyle() {
        return rawdatastyle;
    }

    public void setRawdatastyle(String rawdatastyle) {
        this.rawdatastyle = rawdatastyle;
    }

    public String getChefLotNumber() {
        return chefLotNumber;
    }

    public void setChefLotNumber(String chefLotNumber) {
        this.chefLotNumber = chefLotNumber;
    }

    public String getChefChipType2() {
        return chefChipType2;
    }

    public void setChefChipType2(String chefChipType2) {
        this.chefChipType2 = chefChipType2;
    }

    public String getChefReagentsLot() {
        return chefReagentsLot;
    }

    public void setChefReagentsLot(String chefReagentsLot) {
        this.chefReagentsLot = chefReagentsLot;
    }

    public String getChefStatus() {
        return chefStatus;
    }

    public void setChefStatus(String chefStatus) {
        this.chefStatus = chefStatus;
    }

    public Integer getFlows() {
        return flows;
    }

    public void setFlows(Integer flows) {
        this.flows = flows;
    }

    public Boolean getUsePreBeadfind() {
        return usePreBeadfind;
    }

    public void setUsePreBeadfind(Boolean usePreBeadfind) {
        this.usePreBeadfind = usePreBeadfind;
    }

    public String getChefPackageVer() {
        return chefPackageVer;
    }

    public void setChefPackageVer(String chefPackageVer) {
        this.chefPackageVer = chefPackageVer;
    }

    public String getPgmName() {
        return pgmName;
    }

    public void setPgmName(String pgmName) {
        this.pgmName = pgmName;
    }

    public String getChefSolutionsPart() {
        return chefSolutionsPart;
    }

    public void setChefSolutionsPart(String chefSolutionsPart) {
        this.chefSolutionsPart = chefSolutionsPart;
    }

    public List<java.lang.Object> getSamples() {
        return samples;
    }

    public void setSamples(List<java.lang.Object> samples) {
        this.samples = samples;
    }

    public String getChefExtraInfo2() {
        return chefExtraInfo2;
    }

    public void setChefExtraInfo2(String chefExtraInfo2) {
        this.chefExtraInfo2 = chefExtraInfo2;
    }

    public String getChefInstrumentName() {
        return chefInstrumentName;
    }

    public void setChefInstrumentName(String chefInstrumentName) {
        this.chefInstrumentName = chefInstrumentName;
    }

    public String getSequencekitname() {
        return sequencekitname;
    }

    public void setSequencekitname(String sequencekitname) {
        this.sequencekitname = sequencekitname;
    }

    public String getIsProton() {
        return isProton;
    }

    public void setIsProton(String isProton) {
        this.isProton = isProton;
    }

    public String getChefChipExpiration2() {
        return chefChipExpiration2;
    }

    public void setChefChipExpiration2(String chefChipExpiration2) {
        this.chefChipExpiration2 = chefChipExpiration2;
    }

    public String getUserAck() {
        return userAck;
    }

    public void setUserAck(String userAck) {
        this.userAck = userAck;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public Boolean getAutoAnalyze() {
        return autoAnalyze;
    }

    public void setAutoAnalyze(Boolean autoAnalyze) {
        this.autoAnalyze = autoAnalyze;
    }

    public Boolean getIsReverseRun() {
        return isReverseRun;
    }

    public void setIsReverseRun(Boolean isReverseRun) {
        this.isReverseRun = isReverseRun;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public java.lang.Object getDiskusage() {
        return diskusage;
    }

    public void setDiskusage(java.lang.Object diskusage) {
        this.diskusage = diskusage;
    }

    public Boolean getPinnedRepResult() {
        return pinnedRepResult;
    }

    public void setPinnedRepResult(Boolean pinnedRepResult) {
        this.pinnedRepResult = pinnedRepResult;
    }

    public String getChefManufactureDate() {
        return chefManufactureDate;
    }

    public void setChefManufactureDate(String chefManufactureDate) {
        this.chefManufactureDate = chefManufactureDate;
    }

    public String getChefMessage() {
        return chefMessage;
    }

    public void setChefMessage(String chefMessage) {
        this.chefMessage = chefMessage;
    }

    public java.lang.Object getReversePrimer() {
        return reversePrimer;
    }

    public void setReversePrimer(java.lang.Object reversePrimer) {
        this.reversePrimer = reversePrimer;
    }

    public String getStorageHost() {
        return storageHost;
    }

    public void setStorageHost(String storageHost) {
        this.storageHost = storageHost;
    }

    @Override
    public String toString() {
        return "Experiment{" +
                "chefChipExpiration1='" + chefChipExpiration1 + '\'' +
                ", easSet=" + easSet +
                ", unique='" + unique + '\'' +
                ", sample='" + sample + '\'' +
                ", resultDate='" + resultDate + '\'' +
                ", expDir='" + expDir + '\'' +
                ", chefKitType='" + chefKitType + '\'' +
                ", chefSamplePos='" + chefSamplePos + '\'' +
                ", reagentBarcode='" + reagentBarcode + '\'' +
                ", chefReagentsExpiration='" + chefReagentsExpiration + '\'' +
                ", sequencekitbarcode='" + sequencekitbarcode + '\'' +
                ", expName='" + expName + '\'' +
                ", chefProgress=" + chefProgress +
                ", chefReagentID='" + chefReagentID + '\'' +
                ", chipBarcode='" + chipBarcode + '\'' +
                ", platform='" + platform + '\'' +
                ", runtype='" + runtype + '\'' +
                ", chefLastUpdate=" + chefLastUpdate +
                ", resourceUri='" + resourceUri + '\'' +
                ", id=" + id +
                ", baselineRun=" + baselineRun +
                ", chefReagentsPart='" + chefReagentsPart + '\'' +
                ", chefTipRackBarcode='" + chefTipRackBarcode + '\'' +
                ", flowsInOrder='" + flowsInOrder + '\'' +
                ", expCompInfo='" + expCompInfo + '\'' +
                ", chefSolutionsExpiration='" + chefSolutionsExpiration + '\'' +
                ", ftpStatus='" + ftpStatus + '\'' +
                ", chefSolutionsLot='" + chefSolutionsLot + '\'' +
                ", storageOptions='" + storageOptions + '\'' +
                ", runMode='" + runMode + '\'' +
                ", chipType='" + chipType + '\'' +
                ", cycles=" + cycles +
                ", status='" + status + '\'' +
                ", displayName='" + displayName + '\'' +
                ", chefLogPath=" + chefLogPath +
                ", star=" + star +
                ", chefExtraInfo1='" + chefExtraInfo1 + '\'' +
                ", chefScriptVersion='" + chefScriptVersion + '\'' +
                ", chefChipType1='" + chefChipType1 + '\'' +
                ", seqKitBarcode='" + seqKitBarcode + '\'' +
                ", notes='" + notes + '\'' +
                ", results=" + results +
                ", plan='" + plan + '\'' +
                ", rawdatastyle='" + rawdatastyle + '\'' +
                ", chefLotNumber='" + chefLotNumber + '\'' +
                ", chefChipType2='" + chefChipType2 + '\'' +
                ", chefReagentsLot='" + chefReagentsLot + '\'' +
                ", chefStatus='" + chefStatus + '\'' +
                ", flows=" + flows +
                ", usePreBeadfind=" + usePreBeadfind +
                ", chefPackageVer='" + chefPackageVer + '\'' +
                ", pgmName='" + pgmName + '\'' +
                ", chefSolutionsPart='" + chefSolutionsPart + '\'' +
                ", samples=" + samples +
                ", chefExtraInfo2='" + chefExtraInfo2 + '\'' +
                ", chefInstrumentName='" + chefInstrumentName + '\'' +
                ", sequencekitname='" + sequencekitname + '\'' +
                ", isProton='" + isProton + '\'' +
                ", chefChipExpiration2='" + chefChipExpiration2 + '\'' +
                ", userAck='" + userAck + '\'' +
                ", metaData=" + metaData +
                ", log=" + log +
                ", autoAnalyze=" + autoAnalyze +
                ", isReverseRun=" + isReverseRun +
                ", date='" + date + '\'' +
                ", diskusage=" + diskusage +
                ", pinnedRepResult=" + pinnedRepResult +
                ", chefManufactureDate='" + chefManufactureDate + '\'' +
                ", chefMessage='" + chefMessage + '\'' +
                ", reversePrimer=" + reversePrimer +
                ", storageHost='" + storageHost + '\'' +
                '}';
    }
}
