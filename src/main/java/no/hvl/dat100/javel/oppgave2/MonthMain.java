package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

import static no.hvl.dat100.javel.oppgave2.MonthlyPower.*;
import static no.hvl.dat100.javel.oppgave2.MonthPowerData.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        //Fjern "//" for å testkjøre valgt oppgave, grunnen til at jeg ikke gjorde dette i opg1 var fordi svarene var liten nok til å ikke ta mye plass i terminalen...


        //print_PowerUsage(powerusage_month);
        //print_PowerPrices(power_prices_month);
        //computePowerUsage(power_usage_month);
        //exceedThreshold(power_usage_month, 1000);
        //nevner at månedligforbruk er minbdre enn 1000 og 5000, så man får ikke "true"
        //computeSpotPrice(power_usage_month, power_prices_month);
        //computePowerSupport(power_usage_month, power_prices_month);
        //computeNorgesPrice(power_usage_month);
    }
}