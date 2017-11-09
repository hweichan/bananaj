package utils;

import model.list.member.MemberStatus;

/**
 * Builds various API endpoints for MailChimp.
 */
public enum EndpointUtil {

    ENDPOINT_UTIL;

    private static final String ENDPOINT_BASE = "https://%s.api.mailchimp.com/3.0";

    private static final String LISTS_ENDPOINT = ENDPOINT_BASE + "/lists";

    private static final String LIST_ENDPOINT = LISTS_ENDPOINT + "/%s";

    private static final String LIST_INTEREST_CATEGORIES_ENDPOINT = LIST_ENDPOINT
            + "/interest-categories?count=%d&offset=%d";

    private static final String LIST_INTERESTS_ENDPOINT = LIST_ENDPOINT
            + "/interest-categories/%s/interests?count=%d&offset=%d";

    private static final String PATCH_LIST_MEMBER_ENDPOINT = LIST_ENDPOINT + "/members/%s";

    private static final String LIST_MEMBERS_WITH_STATUS_AND_INTEREST_ENDPOINT = LIST_ENDPOINT
            + "/members?status=%s&interest_category_id=%s&interest_ids=%s&interest_match=all&count=%d&offset=%d";

    public String getListEndpoint(String server, String listId) {
        return String.format(LIST_ENDPOINT, server, listId);
    }

    public String getListInterestCategoriesEndpoint(String server, String listId, int count, int offset) {
        return String.format(LIST_INTEREST_CATEGORIES_ENDPOINT, server, listId, count, offset);
    }

    public String getListInterestsEndpoint(String server, String listId, String interestCategoryId, int count,
            int offset) {
        return String.format(LIST_INTERESTS_ENDPOINT, server, listId, interestCategoryId, count, offset);
    }

    public String getPatchListMemberEndpoint(String server, String listId, String memberId) {
        return String.format(PATCH_LIST_MEMBER_ENDPOINT, server, listId, memberId);
    }

    public String getListMembersWithStatusAndInterestEndpoint(String server, String listId, MemberStatus status,
            String interestCategoryId, String interestGroupId, int count, int offset) {
        return String.format(LIST_MEMBERS_WITH_STATUS_AND_INTEREST_ENDPOINT, server, listId,
                status.getStringRepresentation(), interestCategoryId, interestGroupId, count, offset);
    }
}
