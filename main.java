package adressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("welcome to addressBook");

        System.out.println("add information to our address book");
        System.out.println("hint : 1: add name,2:edit , 3: deleting contact");
        Scanner scanner = new Scanner(System.in);
        int choice= scanner.nextInt();
        if (choice!=0){
            switch (choice){
                case 1:
                    contactInAdressBook adressBook = new contactInAdressBook("mayur","vijay","chamorshi","chamorshi","maharashtra",44263,750783342,"mayu@g");
                    adressBook.printDetails();
                    break;
                case 2:
                    editContact editContact = new editContact();
                    editContact.firstName = "mayur";
                    break;
                case 3:
                    DeletingFile deletFile = new DeletingFile();
                    deletFile.toString(contactInAdressBook.contact.remove(null));

            }
        }




    }
}
