package N2Ejercicio1.Model;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook() {

        contacts = new ArrayList<>();
    }

    public ArrayList<Contact> getContacts() {

        return contacts;
    }

    public void addContact(Contact contact) {

        contacts.add(contact);
    }

    public void removeContact(Contact contact) {

        contacts.remove(contact);
    }

    // Otros métodos para buscar y gestionar contactos.

    public Contact findContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null; // Devuelve null si no se encuentra el contacto.
    }

    public void listContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
