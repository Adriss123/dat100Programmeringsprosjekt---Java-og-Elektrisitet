package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        double[][] prices = MonthPowerData.powerprices_month;

        Customer c1 = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);
        Customer c2 = new Customer("Diana Prince", "diana@example.com", 1004, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.SPOTPRICE);

        // a)-c) én faktura
        Invoice invoice = new Invoice(c3, "January", CustomerPowerUsageData.usage_month_customer3, prices);
        invoice.computeAmount();
        invoice.printInvoice();
        System.out.println();

        // d) flere fakturaer
        Invoice[] invoices = {
                new Invoice(c1, "January", CustomerPowerUsageData.usage_month_customer1, prices),
                new Invoice(c2, "January", CustomerPowerUsageData.usage_month_customer2, prices),
                new Invoice(c3, "January", CustomerPowerUsageData.usage_month_customer3, prices)
        };

        Invoices.processInvoices(invoices);
    }
}
