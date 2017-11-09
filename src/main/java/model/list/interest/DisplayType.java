package model.list.interest;

public enum DisplayType {

    CHECKBOXES("checkboxes"), DROPDOWN("dropdown"), RADIO("radio"), HIDDEN("hidden");

    private String stringRepresentation;

    DisplayType(String stringRepresentation) {
        setStringRepresentation(stringRepresentation);
    }

    /**
     * @return the stringRepresentation
     */
    public String getStringRepresentation() {
        return stringRepresentation;
    }

    /**
     * @param stringRepresentation
     *            the stringRepresentation to set
     */
    private void setStringRepresentation(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }
}
