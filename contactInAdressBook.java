package adressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class contactInAdressBook {
    static List<contactInAdressBook> contact = new ArrayList<contactInAdressBook>();
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long phoneNumber;
    String email;

    public contactInAdressBook(String firstName, String lastName, String address, String city, String state, int zip, int phoneNumber, String email) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("firstName");
        firstName = scanner.next();
        this.firstName = firstName;

        System.out.println("lastName");
        lastName = scanner.next();
        this.lastName = lastName;

        System.out.println("address");
        address = scanner.next();
        this.address = address;

        System.out.println("city");
        city = scanner.next();
        this.city = city;

        System.out.println("state");
        state = scanner.next();
        this.state = state;

        System.out.println("zip");
        zip = scanner.nextInt();
        this.zip = zip;

        System.out.println("phoneNumber");
        phoneNumber = scanner.nextInt();
        this.phoneNumber = phoneNumber;

        System.out.println("email");
        email = scanner.next();
        this.email = email;

    }




    public void printDetails() {

        contactInAdressBook person = new contactInAdressBook(firstName, lastName, address, city, state, zip, (int) phoneNumber, email);
        contact.add(person);

        System.out.println("name" + firstName + " " + lastName + "adress" + address + "city" + city + "state" + state + "zip" + zip + "phoneNumber" + phoneNumber + "email" + email);
    }


}
