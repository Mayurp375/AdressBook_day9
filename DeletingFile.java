package adressBook;

import java.util.ArrayList;
import java.util.Iterator;

import static adressBook.contactInAdressBook.contact;

class DeletingFile  {


    private String Iterator;



    private void deleteByFirstName (String firstName) {
        for (Iterator<contactInAdressBook> iterator = contact.iterator(); iterator.hasNext(); ) {
            contactInAdressBook temp = iterator.next();
           // if (Iterator < contactInAdressBook > iterator = contact.iterator())

            contact.remove(new ArrayList<contactInAdressBook>());

        }

        System.out.println("No contact with first name " + firstName + " was found.");
    }

    public void toString(boolean remove) {

    }
}
