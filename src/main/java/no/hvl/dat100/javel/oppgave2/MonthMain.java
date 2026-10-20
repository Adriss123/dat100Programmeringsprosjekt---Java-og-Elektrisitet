package no.hvl.dat100.javel.oppgave2;


import static no.hvl.dat100.javel.oppgave2.MonthlyPower.*;

public class MonthMain {

    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;
        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        // a) skriv ut forbruk (kommenter ut hvis det blir for mye i terminalen)
        print_PowerUsage(power_usage_month);
        System.out.println();

        // b) skriv ut priser (kommenter ut hvis det blir for mye i terminalen)
        print_PowerPrices(power_prices_month);
        System.out.println();

        // c)
        System.out.printf("Totalt forbruk: %.2f kWh%n", computePowerUsage(power_usage_month));

        // d) månedsforbruket er under 1000 og 5000, så begge gir false
        System.out.println("Over 1000 kWh: " + exceedThreshold(power_usage_month, 1000));
        System.out.println("Over 5000 kWh: " + exceedThreshold(power_usage_month, 5000));

        // e)
        System.out.printf("Spotpris: %.2f NOK%n", computeSpotPrice(power_usage_month, power_prices_month));

        // f)
        System.out.printf("Strømstøtte: %.2f NOK%n", computePowerSupport(power_usage_month, power_prices_month));

        // g)
        System.out.printf("Norgespris: %.2f NOK%n", computeNorgesPrice(power_usage_month));
    }
}