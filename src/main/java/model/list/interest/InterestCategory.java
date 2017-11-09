package model.list.interest;

import static utils.EndpointUtil.ENDPOINT_UTIL;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import model.MailchimpObject;
import model.list.MailChimpList;

public class InterestCategory extends MailchimpObject {

    private MailChimpList list;

    private String title;

    private Integer displayOrder;

    private DisplayType type;

    public InterestCategory(String id, JSONObject jsonRepresentation) {
        super(id, jsonRepresentation);
    }

    public MailChimpList getList() {
        return list;
    }

    public void setList(MailChimpList list) {
        this.list = list;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public DisplayType getType() {
        return type;
    }

    public void setType(DisplayType type) {
        this.type = type;
    }

    public InterestCategory withList(MailChimpList list) {
        setList(list);
        return this;
    }

    public InterestCategory withTitle(String title) {
        setTitle(title);
        return this;
    }

    public InterestCategory withDisplayOrder(Integer displayOrder) {
        setDisplayOrder(displayOrder);
        return this;
    }

    public InterestCategory withType(DisplayType type) {
        setType(type);
        return this;
    }

    /**
     * Get all interests in this interest category.
     *
     * @return the list of Interests.
     * @throws Exception
     */
    public List<Interest> getInterests() throws Exception {
        return getInterests(0, 0);
    }

    /**
     * Get interests in this list.
     *
     * @param count
     *            x interests from offset, positive value to limit results or 0 for
     *            all.
     * @param offset
     *            skip x first interests.
     * @return the list of Interest.
     * @throws Exception
     */
    public List<Interest> getInterests(int count, int offset) throws Exception {

        List<Interest> interests = new ArrayList<>();
        URL interestsUrl = new URL(ENDPOINT_UTIL.getListInterestsEndpoint(getList().getConnection().getServer(),
                getList().getId(), getId(), count > 0 ? count : 0, offset));
        final JSONObject response = new JSONObject(
                getList().getConnection().do_Get(interestsUrl, getList().getConnection().getApikey()));

        final JSONArray interestsArray = response.getJSONArray("interests");

        for (int i = 0; i < interestsArray.length(); i++) {
            final JSONObject interestDetail = interestsArray.getJSONObject(i);
            interests.add(new Interest(interestDetail.getString("id"), interestDetail)
                    .withCategory(this)
                    .withList(getList())
                    .withName(interestDetail.getString("name"))
                    .withDisplayOrder(interestDetail.getInt("display_order"))
                    .withSubscriberCount(interestDetail.getString("subscriber_count")));
        }
        return interests;
    }
}
