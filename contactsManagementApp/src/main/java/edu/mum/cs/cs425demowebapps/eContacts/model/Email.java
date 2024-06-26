package edu.mum.cs.cs425demowebapps.eContacts.model;

public class Email {
    private String address;
    private String label;
    public Email(String address, String label) {
        this.address = address;
        this.label = label;
    }

    private Email(){
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    public String toJSONString() {
        return String.format("{ \"address\": \"%s\", \"label\": \"%s\" }", address, label);
    }
}
