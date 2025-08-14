package N2Ejercicio1.Model;

public class Contact {
    private String name;
    private Address address;
    private PhoneNumber phoneNumber;

    public Contact(String name, Address address, PhoneNumber phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters y setters para acceder a la información del contacto.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Address: " + address.toString() + "\n" +
                "Phone Number: " + phoneNumber.toString() + "\n";
    }
}

