package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

import static no.hvl.dat100.javel.oppgave1.DailyPower.*;


public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        printPowerPrices(powerprices_day);
        printPowerUsage(powerusage_day);
        computePowerUsage(powerusage_day);
        computeSpotPrice(powerusage_day, powerprices_day);
        computePowerSupport(powerusage_day, powerprices_day);
        computeNorgesPrice(powerusage_day);
        findPeakUsage(powerusage_day);

    }
}
