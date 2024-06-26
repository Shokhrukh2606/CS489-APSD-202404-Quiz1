package edu.mum.cs.cs425demowebapps.eContacts;

import edu.mum.cs.cs425demowebapps.eContacts.model.Contact;
import edu.mum.cs.cs425demowebapps.eContacts.model.Email;
import edu.mum.cs.cs425demowebapps.eContacts.model.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Email> emails=new ArrayList<>(List.of(new Email("dave.sang@gmail.com","home" )));
        List<PhoneNumber> phoneNumbers=new ArrayList<>(List.of(new PhoneNumber("222222222", "home")));
        List<Contact> contacts=new ArrayList<>(
                List.of(new Contact("David","Sanger","Argos","Sales Manager", emails,phoneNumbers ))
        );
        System.out.println("[");
        for (Contact contact: contacts){
            System.out.println(contact.toJSONString());
        }
        System.out.println("]");
        System.out.println("List of contacts");
    }
}