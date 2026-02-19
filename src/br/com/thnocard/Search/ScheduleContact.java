package br.com.thnocard.Search;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class ScheduleContact {

    private Set<Contact> contactsSet;

    public ScheduleContact() {
        this.contactsSet = new HashSet<>();
    }

    // Metodo de cadastro de contatos
    public void addContact(String firstName, String lastName, String email, int phone) {
        contactsSet.add(new Contact(firstName, lastName, email, phone));
    }

    // Metodo de exibir contatos gravados / registrados.
    public void showContacts() {
        System.out.println(contactsSet);
    }

    // Metodos de pesquisar contatos e esses contatos não podem ser iguais (nem por nome, nem por e-mail ou por nuemro de telefone).
    public Set<Contact> searchByName(String firstName) {
        Set<Contact> contactsByName = new HashSet<>();
        for(Contact contact : contactsSet) {
            if(contact.getFirstName().startsWith(firstName)) {
                contactsByName.add(contact);
            }
        }
        return contactsByName;
    }

    public Set<Contact> searchByEmail(String email) {
        Set<Contact> contactsByEmail = new HashSet<>();
        for(Contact contact : contactsSet) {
            if(contact.getEmail().equals(email)) {
                contactsByEmail.add(contact);
            }
        }
        return contactsByEmail;
    }

    public Contact updatePhoneContact(String firstName, String lastName, int newPhoneNumber) {
        Contact updateContact = null;
        for(Contact contact : contactsSet) {
            if(contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                contact.setPhone(newPhoneNumber);
                updateContact = contact;
                System.out.println("Nenhum Contato Localizado!");
                break;
            }
        }
        return updateContact;
    }

    public static void main(String[] args) {

        ScheduleContact scheduleContact = new ScheduleContact();

        System.out.println("============================ AGENDA ============================");
        System.out.println();

        scheduleContact.showContacts();

        scheduleContact.addContact("Thiago", "Cardoso", "thnocard36@gmail.com", 22406622);
        scheduleContact.addContact("Thiago", "Cardoso", "thnocard36@gmail.com", 22406622);
        scheduleContact.addContact("Janaina", "Thaynara", "thay.jana94@ig.com.br", 40602290);

        scheduleContact.showContacts();

        System.out.println();
        System.out.println(scheduleContact.searchByName("Thiago"));

        System.out.println();
        System.out.println("Contato Atualizado: " + scheduleContact.updatePhoneContact("Thiago", "Cardoso", 60224090));

        System.out.println();
        scheduleContact.showContacts();

    }
}