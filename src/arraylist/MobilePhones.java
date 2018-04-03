package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contact (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contact
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
public class MobilePhones {
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    private Contact searchContact(String name){
           for(Contact contact: contacts){
               if(name.equals(contact.getName())){
                   return contact;
               }
           }
           return null;
    }

    private void storeContact(String name, String phoneNumber){
         Contact contact = searchContact(name);
         if(contact != null){
             System.out.println("Contact Can not be added as contact already exist with given name");
             return;
         }

         contacts.add(new Contact(name,phoneNumber));
    }


    private void modifyPhoneNumber(String name, String phoneNumber){
        Contact contact  = searchContact(name);
        contact.setPhoneNumber(phoneNumber);
    }

    private void removeContact(String name){
        Contact contact = searchContact(name);
        contacts.remove(contact);
    }

    private void printContacts(){
        for(int i=0;i<contacts.size();i++){
            System.out.println("Contact: "+ (i+1));
            System.out.println("Name: "+ contacts.get(i).getName());
            System.out.println("Phone Number: "+ contacts.get(i).getPhoneNumber());
        }

    }
    //Quit, print list of contacts, add new contact, update existing contact, remove contact
    // and search/find contact
    public void runMobileApplication(Scanner scanner){
        String name;
        String phoneNumber;
        boolean flag = true;
        while(flag){
              System.out.println("Press Number for Desired Operation");
              System.out.println("1. Print Contacts");
              System.out.println("2. Add Contact");
              System.out.println("3. Modify Contact Number");
              System.out.println("4. Remove Contact");
              System.out.println("5. Search Contact");
              System.out.println("6. Exit");
              int option = scanner.nextInt();

              switch (option){
                  case 1 :
                      printContacts();
                      break;
                  case 2 :
                      System.out.println("Enter Name of Person: ");
                      name = scanner.nextLine();
                      name = scanner.nextLine();
                      System.out.println("Enter Phone Number: ");
                      phoneNumber = scanner.nextLine();
                      storeContact(name,phoneNumber);
                      break;
                  case 3 :
                      System.out.println("Enter Name of Person whose number to be updated: ");
                      name = scanner.nextLine();
                      name = scanner.nextLine();
                      System.out.println("Enter Phone Number");
                      phoneNumber = scanner.nextLine();
                      modifyPhoneNumber(name,phoneNumber);
                      break;
                  case 4 :
                      System.out.println("Enter Name of Person whose contact should  be removed: ");
                      name = scanner.nextLine();
                      name = scanner.nextLine();
                      removeContact(name);
                      break;
                  case 5:
                      System.out.println("Enter Name of Person whose whose contact to be searched: ");
                      name = scanner.nextLine();
                      name = scanner.nextLine();
                      Contact contact = searchContact(name);
                      if(contact != null){
                         System.out.println("Name: "+ contact.getName());
                          System.out.println("Phone Number: "+ contact.getPhoneNumber());
                      }else{
                          System.out.println("No contact Found");
                      }
                      break;
                  case 6 :
                      flag = false;
                      break;

              }
          }
    }

}
