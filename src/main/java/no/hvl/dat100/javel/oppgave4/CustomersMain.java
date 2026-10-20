package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave4.Customers.*;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();
        //Alle
        Customer c1 = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Bob Johnson", "bob@example.com", 1002, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);
        Customer c4 = new Customer("Diana Prince", "diana@example.com", 1004, PowerAgreementType.NORGESPRICE);
        Customer c5 = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.POWERSUPPORT);


        //a
        Customers ca = new Customers(4);   // bevisst for liten, for å få verdien false i d)
        System.out.println("Tabell laget uten feil");
        //legger til Customers i ca (del av oppgave d)
        ca.addCustomer(c1);
        ca.addCustomer(c2);
        ca.addCustomer(c3);
        ca.addCustomer(c4);
        ca.addCustomer(c5);

        //b
        System.out.println(ca.countNonNull());

        //c
        System.out.println(ca.getCustomer(1001));          // skriver ut Alice Smith
        System.out.println(ca.getCustomer(1002) == c2);    // true
        System.out.println(ca.getCustomer(9999));          // null

        //d
        System.out.println(ca.addCustomer(c1));  // true
        System.out.println(ca.countNonNull());
        System.out.println(ca.addCustomer(c5));  // false, tabellen er full
        System.out.println(ca.countNonNull());

        //e
        System.out.println(ca.removeCustomer(1002)); // Bob
        System.out.println(ca.removeCustomer(1002)); // null
        System.out.println(ca.countNonNull());

        //f
        Customer[] all = ca.getCustomers();
        System.out.println(all.length);
        for (Customer c : all) {
            System.out.println(c);
            System.out.println();
        }

    }
}
