package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for (int i = 0; i < usage.length; i++) {
            System.out.print("Dag" + (i+1) + ":");
            DailyPower.printPowerUsage(usage[i]);
            System.out.print("kWh ");
        }
        System.out.println();
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int i = 0; i < prices.length; i++) {
            System.out.printf("Day " + (i + 1) + ":");
            DailyPower.printPowerPrices(prices[i]);
            System.out.print("NOK ");
        }
        System.out.println();
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                sum += usage[i][j];
            }
        }
        System.out.println(sum);
        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        int i=0;
        while (i < powerusage.length && !exceeded) {

            int j = 0;
            while (j < powerusage[i].length && !exceeded) {
                usage += powerusage[i][j];
                if (usage > threshold) {
                    exceeded = true;
                }
                j++;
            }
            i++;
        }
        System.out.println(usage);
        System.out.println("Went over = " + exceeded);
        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                price += usage[i][j] * prices[i][j];
            }
        }
        System.out.printf("%.2f nok", price);
        System.out.println();

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                if (prices[i][j] > 0.9375) {
                    support += (prices[i][j] - 0.9375) * 0.90 * usage[i][j];
                }
            }
        }
        System.out.println("Menge penger i støtte: " + support);

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for (double[] dag : usage) {
            for (double time : dag) {
                price += time * 0.5;
            }
        }
        System.out.println(price);

        return price;
    }
}
