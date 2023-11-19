package N2Ejercicio1.Factory;

import N2Ejercicio1.Model.Address;
import N2Ejercicio1.Model.Contact;
import N2Ejercicio1.Model.PhoneNumber;

public interface AddressPhoneFactory {
    Address createAddress();
    PhoneNumber createPhoneNumber();
    Contact createContact(String name, Address address, PhoneNumber phoneNumber);
}
