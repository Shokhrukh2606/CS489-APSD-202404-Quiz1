package edu.mum.cs.cs425demowebapps.eContacts.model;

import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<Email> emailAdresses;
    private List<PhoneNumber> phoneNumbers;

    public Contact(String firstName, String lastName, String company, String jobTitle, List<Email> emailAdresses, List<PhoneNumber> phoneNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.emailAdresses = emailAdresses;
        this.phoneNumbers = phoneNumbers;
    }
    public Contact(String firstName, String lastName, String company, String jobTitle){
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<Email> getEmailAdresses() {
        return emailAdresses;
    }

    public void setEmailAdresses(Email[] emailAdresses) {
        this.emailAdresses = List.of(emailAdresses);
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(PhoneNumber[] phoneNumbers) {
        this.phoneNumbers = List.of(phoneNumbers);
    }
    public String toJSONString(){
        return String.format("{ \"firstName\": \"%s\", \"lastName\": \"%s\", \"company\": \"%s\", \"jobTitle\":\"%s\": \"emailAddresses\":[%s], \"phoneNumbers\":[%s] }",
                firstName,lastName,company,jobTitle,this.emailAdressesJSONString(), this.phoneNumbersJSONString()
                );
    }
    public String emailAdressesJSONString(){
        StringBuilder sb=new StringBuilder();
        for(Email email: emailAdresses){
            sb.append(toJSONString());
            sb.append(",");
        }
        return sb.toString();
    }
    public String phoneNumbersJSONString(){
        StringBuilder sb=new StringBuilder();
        for(PhoneNumber phoneNumber: phoneNumbers){
            sb.append(phoneNumber.toJSONString());
            sb.append(",");
        }
        return sb.toString();
    }
}
