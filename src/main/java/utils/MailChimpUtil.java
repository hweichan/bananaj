package utils;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONObject;

public enum MailChimpUtil {

    MAILCHIMP_UTIL;

    public JSONObject buildMergeFields(Map<String, Object> merge_fields_values) {
        JSONObject merge_fields = new JSONObject();

        Iterator it = merge_fields_values.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            it.remove(); // avoids a ConcurrentModificationException
            merge_fields.put(pair.getKey().toString(), pair.getValue());
        }
        return merge_fields;
    }

    public JSONObject buildInterests(Map<String, Boolean> interests) {
        JSONObject updateInterests = new JSONObject();
        for (Entry<String, Boolean> interest : interests.entrySet()) {
            updateInterests.put(interest.getKey(), interest.getValue());
        }
        return updateInterests;
    }
}
