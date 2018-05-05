
package licorice.ws.api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EasSet {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("mixedTypeRNA_targetRegionBedFile")
    @Expose
    private java.lang.Object mixedTypeRNATargetRegionBedFile;
    @SerializedName("isDuplicateReads")
    @Expose
    private Boolean isDuplicateReads;
    @SerializedName("analysisargs")
    @Expose
    private String analysisargs;
    @SerializedName("hotSpotRegionBedFile")
    @Expose
    private String hotSpotRegionBedFile;
    @SerializedName("libraryKey")
    @Expose
    private String libraryKey;
    @SerializedName("thumbnailionstatsargs")
    @Expose
    private String thumbnailionstatsargs;
    @SerializedName("calibrateargs")
    @Expose
    private String calibrateargs;
    @SerializedName("resource_uri")
    @Expose
    private String resourceUri;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("beadfindargs")
    @Expose
    private String beadfindargs;
    @SerializedName("barcodeKitName")
    @Expose
    private String barcodeKitName;
    @SerializedName("ionstatsargs")
    @Expose
    private String ionstatsargs;
    @SerializedName("thumbnailbasecallerargs")
    @Expose
    private String thumbnailbasecallerargs;
    @SerializedName("basecallerargs")
    @Expose
    private String basecallerargs;
    @SerializedName("targetRegionBedFile")
    @Expose
    private String targetRegionBedFile;
    @SerializedName("base_recalibration_mode")
    @Expose
    private String baseRecalibrationMode;
    @SerializedName("isEditable")
    @Expose
    private Boolean isEditable;
    @SerializedName("threePrimeAdapter")
    @Expose
    private String threePrimeAdapter;
    @SerializedName("thumbnailalignmentargs")
    @Expose
    private String thumbnailalignmentargs;
    @SerializedName("libraryKitBarcode")
    @Expose
    private java.lang.Object libraryKitBarcode;
    @SerializedName("thumbnailanalysisargs")
    @Expose
    private String thumbnailanalysisargs;
    @SerializedName("reference")
    @Expose
    private String reference;
    @SerializedName("experiment")
    @Expose
    private String experiment;
    @SerializedName("isOneTimeOverride")
    @Expose
    private Boolean isOneTimeOverride;
    @SerializedName("selectedPlugins")
    @Expose
    private SelectedPlugins selectedPlugins;
    @SerializedName("realign")
    @Expose
    private Boolean realign;
    @SerializedName("results")
    @Expose
    private List<java.lang.Object> results = null;
    @SerializedName("custom_args")
    @Expose
    private Boolean customArgs;
    @SerializedName("thumbnailcalibrateargs")
    @Expose
    private String thumbnailcalibrateargs;
    @SerializedName("mixedTypeRNA_reference")
    @Expose
    private java.lang.Object mixedTypeRNAReference;
    @SerializedName("thumbnailbeadfindargs")
    @Expose
    private String thumbnailbeadfindargs;
    @SerializedName("barcodedSamples")
    @Expose
    private BarcodedSamples barcodedSamples;
    @SerializedName("mixedTypeRNA_hotSpotRegionBedFile")
    @Expose
    private java.lang.Object mixedTypeRNAHotSpotRegionBedFile;
    @SerializedName("libraryKitName")
    @Expose
    private String libraryKitName;
    @SerializedName("prethumbnailbasecallerargs")
    @Expose
    private String prethumbnailbasecallerargs;
    @SerializedName("alignmentargs")
    @Expose
    private String alignmentargs;
    @SerializedName("tfKey")
    @Expose
    private String tfKey;
    @SerializedName("prebasecallerargs")
    @Expose
    private String prebasecallerargs;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public java.lang.Object getMixedTypeRNATargetRegionBedFile() {
        return mixedTypeRNATargetRegionBedFile;
    }

    public void setMixedTypeRNATargetRegionBedFile(java.lang.Object mixedTypeRNATargetRegionBedFile) {
        this.mixedTypeRNATargetRegionBedFile = mixedTypeRNATargetRegionBedFile;
    }

    public Boolean getIsDuplicateReads() {
        return isDuplicateReads;
    }

    public void setIsDuplicateReads(Boolean isDuplicateReads) {
        this.isDuplicateReads = isDuplicateReads;
    }

    public String getAnalysisargs() {
        return analysisargs;
    }

    public void setAnalysisargs(String analysisargs) {
        this.analysisargs = analysisargs;
    }

    public String getHotSpotRegionBedFile() {
        return hotSpotRegionBedFile;
    }

    public void setHotSpotRegionBedFile(String hotSpotRegionBedFile) {
        this.hotSpotRegionBedFile = hotSpotRegionBedFile;
    }

    public String getLibraryKey() {
        return libraryKey;
    }

    public void setLibraryKey(String libraryKey) {
        this.libraryKey = libraryKey;
    }

    public String getThumbnailionstatsargs() {
        return thumbnailionstatsargs;
    }

    public void setThumbnailionstatsargs(String thumbnailionstatsargs) {
        this.thumbnailionstatsargs = thumbnailionstatsargs;
    }

    public String getCalibrateargs() {
        return calibrateargs;
    }

    public void setCalibrateargs(String calibrateargs) {
        this.calibrateargs = calibrateargs;
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

    public String getBeadfindargs() {
        return beadfindargs;
    }

    public void setBeadfindargs(String beadfindargs) {
        this.beadfindargs = beadfindargs;
    }

    public String getBarcodeKitName() {
        return barcodeKitName;
    }

    public void setBarcodeKitName(String barcodeKitName) {
        this.barcodeKitName = barcodeKitName;
    }

    public String getIonstatsargs() {
        return ionstatsargs;
    }

    public void setIonstatsargs(String ionstatsargs) {
        this.ionstatsargs = ionstatsargs;
    }

    public String getThumbnailbasecallerargs() {
        return thumbnailbasecallerargs;
    }

    public void setThumbnailbasecallerargs(String thumbnailbasecallerargs) {
        this.thumbnailbasecallerargs = thumbnailbasecallerargs;
    }

    public String getBasecallerargs() {
        return basecallerargs;
    }

    public void setBasecallerargs(String basecallerargs) {
        this.basecallerargs = basecallerargs;
    }

    public String getTargetRegionBedFile() {
        return targetRegionBedFile;
    }

    public void setTargetRegionBedFile(String targetRegionBedFile) {
        this.targetRegionBedFile = targetRegionBedFile;
    }

    public String getBaseRecalibrationMode() {
        return baseRecalibrationMode;
    }

    public void setBaseRecalibrationMode(String baseRecalibrationMode) {
        this.baseRecalibrationMode = baseRecalibrationMode;
    }

    public Boolean getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(Boolean isEditable) {
        this.isEditable = isEditable;
    }

    public String getThreePrimeAdapter() {
        return threePrimeAdapter;
    }

    public void setThreePrimeAdapter(String threePrimeAdapter) {
        this.threePrimeAdapter = threePrimeAdapter;
    }

    public String getThumbnailalignmentargs() {
        return thumbnailalignmentargs;
    }

    public void setThumbnailalignmentargs(String thumbnailalignmentargs) {
        this.thumbnailalignmentargs = thumbnailalignmentargs;
    }

    public java.lang.Object getLibraryKitBarcode() {
        return libraryKitBarcode;
    }

    public void setLibraryKitBarcode(java.lang.Object libraryKitBarcode) {
        this.libraryKitBarcode = libraryKitBarcode;
    }

    public String getThumbnailanalysisargs() {
        return thumbnailanalysisargs;
    }

    public void setThumbnailanalysisargs(String thumbnailanalysisargs) {
        this.thumbnailanalysisargs = thumbnailanalysisargs;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getExperiment() {
        return experiment;
    }

    public void setExperiment(String experiment) {
        this.experiment = experiment;
    }

    public Boolean getIsOneTimeOverride() {
        return isOneTimeOverride;
    }

    public void setIsOneTimeOverride(Boolean isOneTimeOverride) {
        this.isOneTimeOverride = isOneTimeOverride;
    }

    public SelectedPlugins getSelectedPlugins() {
        return selectedPlugins;
    }

    public void setSelectedPlugins(SelectedPlugins selectedPlugins) {
        this.selectedPlugins = selectedPlugins;
    }

    public Boolean getRealign() {
        return realign;
    }

    public void setRealign(Boolean realign) {
        this.realign = realign;
    }

    public List<java.lang.Object> getResults() {
        return results;
    }

    public void setResults(List<java.lang.Object> results) {
        this.results = results;
    }

    public Boolean getCustomArgs() {
        return customArgs;
    }

    public void setCustomArgs(Boolean customArgs) {
        this.customArgs = customArgs;
    }

    public String getThumbnailcalibrateargs() {
        return thumbnailcalibrateargs;
    }

    public void setThumbnailcalibrateargs(String thumbnailcalibrateargs) {
        this.thumbnailcalibrateargs = thumbnailcalibrateargs;
    }

    public java.lang.Object getMixedTypeRNAReference() {
        return mixedTypeRNAReference;
    }

    public void setMixedTypeRNAReference(java.lang.Object mixedTypeRNAReference) {
        this.mixedTypeRNAReference = mixedTypeRNAReference;
    }

    public String getThumbnailbeadfindargs() {
        return thumbnailbeadfindargs;
    }

    public void setThumbnailbeadfindargs(String thumbnailbeadfindargs) {
        this.thumbnailbeadfindargs = thumbnailbeadfindargs;
    }

    public BarcodedSamples getBarcodedSamples() {
        return barcodedSamples;
    }

    public void setBarcodedSamples(BarcodedSamples barcodedSamples) {
        this.barcodedSamples = barcodedSamples;
    }

    public java.lang.Object getMixedTypeRNAHotSpotRegionBedFile() {
        return mixedTypeRNAHotSpotRegionBedFile;
    }

    public void setMixedTypeRNAHotSpotRegionBedFile(java.lang.Object mixedTypeRNAHotSpotRegionBedFile) {
        this.mixedTypeRNAHotSpotRegionBedFile = mixedTypeRNAHotSpotRegionBedFile;
    }

    public String getLibraryKitName() {
        return libraryKitName;
    }

    public void setLibraryKitName(String libraryKitName) {
        this.libraryKitName = libraryKitName;
    }

    public String getPrethumbnailbasecallerargs() {
        return prethumbnailbasecallerargs;
    }

    public void setPrethumbnailbasecallerargs(String prethumbnailbasecallerargs) {
        this.prethumbnailbasecallerargs = prethumbnailbasecallerargs;
    }

    public String getAlignmentargs() {
        return alignmentargs;
    }

    public void setAlignmentargs(String alignmentargs) {
        this.alignmentargs = alignmentargs;
    }

    public String getTfKey() {
        return tfKey;
    }

    public void setTfKey(String tfKey) {
        this.tfKey = tfKey;
    }

    public String getPrebasecallerargs() {
        return prebasecallerargs;
    }

    public void setPrebasecallerargs(String prebasecallerargs) {
        this.prebasecallerargs = prebasecallerargs;
    }

}
