package edu.mum.cs.cs425demowebapps.eContacts.model;

public class PhoneNumber {
    private String number;
    private String label;

    public PhoneNumber(){}
    public PhoneNumber(String number, String label) {
        this.number = number;
        this.label = label;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String toJSONString() {
        return String.format("{ \"number\" \"%s\", \"label\":\"%s\" }", number, label);
    }
}
