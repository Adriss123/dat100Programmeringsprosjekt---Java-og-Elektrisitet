package no.hvl.dat100.javel.oppgave5;

public class Invoices {

    // d) beregner og skriver ut alle fakturaene i tabellen
    public static void processInvoices(Invoice[] invoices) {

        for (Invoice invoice : invoices) {
            System.out.println("========================");
            invoice.computeAmount();
            invoice.printInvoice();
            System.out.println("========================");
            System.out.println();
        }
    }
}
