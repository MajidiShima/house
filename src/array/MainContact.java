package array;

import java.util.Scanner;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) ...
// MobilePhone should do everything with Contact objects only.


public class MainContact {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilPhone mobilePhone = new MobilPhone("00393304404");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printAction();
        while (!quit) {
            System.out.println("\nEnter action :(6 to show available action");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down ...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printAction();
                    break;

            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("new contact added: name= " + name + "phone number: " + phone);
        } else {
            System.out.println("Can not add ur number on the file ");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name :");
        String name = scanner.nextLine();
        Contact existContactRecord = mobilePhone.queryContact(name);
        if (existContactRecord == null) {
            System.out.println("Contact not found .");
            return;
        }

        System.out.print("Enter new contact name : ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number :  ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existContactRecord, newContact)) {
            System.out.println("successfully update record");
        } else {
            System.out.println("An error ");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name :");
        String name = scanner.nextLine();
        Contact existContactRecord = mobilePhone.queryContact(name);
        if (existContactRecord == null) {
            System.out.println("Contact not found .");
            return;
        }
        if (mobilePhone.removeContact(existContactRecord)) {
            System.out.println("successfully deleted");
        } else {
            System.out.println("an error ");
        }

    }

    private static void queryContact() {
        System.out.println("Enter existing contact name :");
        String name = scanner.nextLine();
        Contact existContactRecord = mobilePhone.queryContact(name);
        if (existContactRecord == null) {
            System.out.println("Contact not found .");
            return;
        }

        System.out.println("Name: " + existContactRecord.getName() + "phone " + existContactRecord.getPhoneNumber());

    }


    private static void startPhone() {
        System.out.println("Starting phone ...");
    }

    private static void printAction() {
        System.out.println("\nAvailable action :\npress");
        System.out.println("0   -to shutdown\n" +
                "1   -to print contacts\n" +
                "2   -to add a new contact \n" +
                "3   -to update existing an existing contact\n" +
                "4   -to remove an existing contact\n +" +
                "5   -query if an existing contact existing\n" +
                "6   -to print an list of available action.");
        System.out.println("choose your action :");
    }

}
