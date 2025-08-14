package N2Ejercicio1.Client;
import N2Ejercicio1.Factory.FactoryEEUU;
import N2Ejercicio1.Factory.FactorySpain;
import N2Ejercicio1.Factory.AddressPhoneFactory;
import N2Ejercicio1.Model.Address;
import N2Ejercicio1.Model.AddressBook;
import N2Ejercicio1.Model.Contact;
import N2Ejercicio1.Model.PhoneNumber;

import java.util.Scanner;
public class Init {
        static Scanner sc = new Scanner(System.in);
        private AddressBook addressBook = new AddressBook();

        public void init() {
            while (true) {
                byte opcion = menu();

                switch (opcion) {

                    case 1:
                        addContact();
                        break;
                    case 2:
                        removeContact();
                        break;
                    case 3:
                        addressBook.listContacts();
                        break;
                    case 0:
                        System.out.println("Out.");
                        return;
                    default:
                        System.out.println("The option is not valid.");
                        break;
                }
            }
        }

        public static byte menu() {

            byte option;
            final byte MINIMO = 0;
            final byte MAXIMUM = 4;

            do {
                System.out.println("Main Menu\nChoose an option: ");
                System.out.println("1.Add a new contact");
                System.out.println("2.Remove a contact");
                System.out.println("3.Show the list Contacts");
                System.out.println("0.Get out of the App");

                option = sc.nextByte();
                sc.nextLine();

                if (option < MINIMO || option > MAXIMUM) {
                    System.out.println("Choose a valid option");
                }
            } while (option < MINIMO || option > MAXIMUM);
            return option;
        }

        public void addContact() {
            System.out.println("Enter the contact's name: ");
            String name = sc.nextLine();

            // Preguntar al usuario por el país del contacto.
            System.out.println("Enter the contact's country (1 for Spain, 2 for USA): ");
            int countryChoice = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea después del número.

            AddressPhoneFactory factory;

            // Elegir la fábrica según la elección del usuario.
            switch (countryChoice) {
                case 1: // España
                    factory = new FactorySpain();
                    break;
                case 2: // EEUU
                    factory = new FactoryEEUU();
                    break;
                default:
                    System.out.println("Invalid country choice.");
                    return;
            }

            // Usar la fábrica seleccionada para crear la dirección y el número de teléfono.
            Address address = factory.createAddress();
            PhoneNumber phoneNumber = factory.createPhoneNumber();

            // Crear una nueva instancia de Contact con el nombre, dirección y número de teléfono.
            Contact newContact = factory.createContact(name, address, phoneNumber);

            // Agregar el nuevo contacto a la libreta de direcciones.
            addressBook.addContact(newContact);
        }

        public void removeContact() {
            System.out.println("Enter the contact's name that you want to remove: ");
            String name = sc.nextLine();
            Contact contact = addressBook.findContact(name);
            if (contact == null) {
                System.out.println("Contact not found, nothing to remove.");
            } else {
                addressBook.removeContact(contact);
                System.out.println("Contact removed.");
            }
        }
    }
