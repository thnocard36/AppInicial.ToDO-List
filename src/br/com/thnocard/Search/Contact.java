package br.com.thnocard.Search;

import java.util.Objects;

public class Contact {

    private String firstName;
    private String lastName;
    private String email;
    private int phone;

    public Contact(String firstName, String lastName, String email, int phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) { // Endereço de E-mail e numero de telefone não podem ser iguais
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(email, contact.email) && Objects.equals(phone, contact.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, phone);
    }

    @Override
    public String toString() {
        return "Contato: {" +
                "Nome Completo= '" + firstName + " " + lastName + '\'' +
                ", E-mail= '" + email + '\'' +
                ", Telefone= '" + phone + '\'' +
                '}';
    }
}