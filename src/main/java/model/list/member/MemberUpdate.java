package model.list.member;

import java.util.Map;
import java.util.Optional;

/**
 * Represents the properties of a {@code Member} which should be updated.
 * 
 * @author Hwei Chan
 */
public class MemberUpdate {

    private Optional<MemberStatus> status = Optional.empty();

    private Optional<Map<String, Boolean>> interests = Optional.empty();

    private Optional<Map<String, Object>> mergeFields = Optional.empty();

    public Optional<MemberStatus> getStatus() {
        return status;
    }

    public MemberUpdate withStatus(MemberStatus status) {
        this.status = Optional.ofNullable(status);
        return this;
    }

    public Optional<Map<String, Boolean>> getInterests() {
        return interests;
    }

    public MemberUpdate withInterests(Map<String, Boolean> interests) {
        this.interests = Optional.ofNullable(interests);
        return this;
    }

    public Optional<Map<String, Object>> getMergeFields() {
        return mergeFields;
    }

    public MemberUpdate withMergeFields(Map<String, Object> mergeFields) {
        this.mergeFields = Optional.ofNullable(mergeFields);
        return this;
    }

    @Override
    public String toString() {
        return "MemberUpdate [status=" + status + ", interests=" + interests + ", mergeFields=" + mergeFields + "]";
    }
}
