package N2Ejercicio1.Factory;

import N2Ejercicio1.Model.Address;
import N2Ejercicio1.Model.Contact;
import N2Ejercicio1.Model.PhoneNumber;

import java.util.Scanner;

public class FactoryEEUU implements AddressPhoneFactory {
    Scanner sc = new Scanner(System.in);

    @Override
    public Address createAddress() {
        // Implementa la lógica para crear una dirección estadounidense.
        System.out.println("Enter street name: ");
        String streetName = sc.nextLine();
        System.out.println("Enter city: ");
        String city = sc.nextLine();
        System.out.println("Enter country");
        String country = sc.nextLine();
        Address address = new Address(streetName, city, country);
        return address;
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        // Implementa la lógica para crear un número de teléfono estadounidense.
        System.out.println("Enter prefix: ");
        String prefix = sc.nextLine();
        System.out.println("Enter the phone number: ");
        String number = sc.nextLine();
        PhoneNumber phoneNumber = new PhoneNumber(prefix, number);
        return phoneNumber;
    }

    @Override
    public Contact createContact(String name, Address address, PhoneNumber phoneNumber) {
        // Implementa la lógica para crear un contacto estadounidense.

        Contact contact = new Contact(name, address, phoneNumber);
        return contact;
    }
}
