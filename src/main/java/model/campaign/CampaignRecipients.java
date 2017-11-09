package model.campaign;

public class CampaignRecipients {

    private String listId;

    private CampaignSegmentOptions segmentOptions = new CampaignSegmentOptions();

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public CampaignSegmentOptions getSegmentOptions() {
        return segmentOptions;
    }

    public void setSegmentOptions(CampaignSegmentOptions segmentOptions) {
        this.segmentOptions = segmentOptions;
    }

    public CampaignRecipients withListId(String listId) {
        setListId(listId);
        return this;
    }

    public CampaignRecipients withSegmentOptions(CampaignSegmentOptions segmentOptions) {
        setSegmentOptions(segmentOptions);
        return this;
    }
}
