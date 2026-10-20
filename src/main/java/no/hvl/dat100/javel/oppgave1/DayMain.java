package no.hvl.dat100.javel.oppgave1;

import static no.hvl.dat100.javel.oppgave1.DailyPower.*;

public class DayMain {

    public static void main(String[] args) {

        double[] powerusage_day = DayPowerData.powerusage_day;
        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();



        //a)
        printPowerPrices(powerusage_day);

        //b)
        printPowerUsage(powerusage_day);

        // c)
        System.out.printf("%.2f kWh per dag%n", computePowerUsage(powerusage_day));

        // d)
        System.out.printf("%.2f NOK hver dag%n", computeSpotPrice(powerusage_day, powerprices_day));

        // f)
        System.out.printf("%.2f NOK i total strømstøtte%n", computePowerSupport(powerusage_day, powerprices_day));

        // g)
        System.out.printf("%.2f NOK i strømpris med 50 øre per kWh%n", computeNorgesPrice(powerusage_day));

        // h)
        System.out.println("Høyeste forbruk i en time: " + findPeakUsage(powerusage_day) + " kWh");

        // i)
        System.out.printf("%.2f kWh gjennomsnittlig forbruk per time%n", findAvgPower(powerusage_day));
    }
}