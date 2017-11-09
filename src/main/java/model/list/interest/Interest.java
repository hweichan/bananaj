package model.list.interest;

import org.json.JSONObject;

import model.MailchimpObject;
import model.list.MailChimpList;

public class Interest extends MailchimpObject {

    public static final Interest ofInterest(String id) {
        return new Interest(id, new JSONObject().put("id", id));
    }

    private MailChimpList list;

    private InterestCategory category;

    private String name;

    private Integer displayOrder;

    private String subscriberCount;

    public Interest(String id, JSONObject jsonRepresentation) {
        super(id, jsonRepresentation);
    }

    public MailChimpList getList() {
        return list;
    }

    public void setList(MailChimpList list) {
        this.list = list;
    }

    public InterestCategory getCategory() {
        return category;
    }

    public void setCategory(InterestCategory category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getSubscriberCount() {
        return subscriberCount;
    }

    public void setSubscriberCount(String subscriberCount) {
        this.subscriberCount = subscriberCount;
    }

    public Interest withList(MailChimpList list) {
        setList(list);
        return this;
    }

    public Interest withCategory(InterestCategory category) {
        setCategory(category);
        return this;
    }

    public Interest withName(String name) {
        setName(name);
        return this;
    }

    public Interest withDisplayOrder(Integer displayOrder) {
        setDisplayOrder(displayOrder);
        return this;
    }

    public Interest withSubscriberCount(String subscriberCount) {
        setSubscriberCount(subscriberCount);
        return this;
    }

}
