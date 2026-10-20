package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer a = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE);
        System.out.println(a);

        System.out.println(a.getName());
        System.out.println(a.getEmail());
        System.out.println(a.getCustomer_id());
        System.out.println(a.getAgreement());

        Customer b = new Customer("test", "test", 1, PowerAgreementType.SPOTPRICE);

        b.setName("Adrian");
        b.setEmail("AdrianErKul@gmail.com");
        b.setCustomer_id(67);
        b.setAgreement(PowerAgreementType.NORGESPRICE);

        System.out.println(b);

    }
}
