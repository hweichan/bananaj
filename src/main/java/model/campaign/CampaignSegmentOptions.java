package model.campaign;

public class CampaignSegmentOptions {

    private Integer savedSegmentId;

    public Integer getSavedSegmentId() {
        return savedSegmentId;
    }

    public void setSavedSegmentId(Integer savedSegmentId) {
        this.savedSegmentId = savedSegmentId;
    }

    public CampaignSegmentOptions withSavedSegmentId(Integer savedSegmentId) {
        setSavedSegmentId(savedSegmentId);
        return this;
    }
}
