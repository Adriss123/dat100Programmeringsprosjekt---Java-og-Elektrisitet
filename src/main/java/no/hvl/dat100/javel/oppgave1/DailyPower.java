package no.hvl.dat100.javel.oppgave1;


public class DailyPower {

    public static void main(String[] args) {
    printPowerPrices(powerprices_day);
    printPowerUsage(powerusage_day);
    computePowerUsage(powerusage_day);
    computeSpotPrice(powerusage_day, powerprices_day);
    computePowerSupport(powerusage_day, powerprices_day);
    computeNorgesPrice(powerusage_day);
    findPeakUsage(powerusage_day);

    }
    
    public static double[] powerprices_day = {

            0.1, 0.2, 0.3, 0.4, 0.5, 0.6,
            0.7, 0.8, 1.9, 1.0, 1.1, 1.2,
            1.3, 1.4, 1.5, 1.6, 1.7, 1.8,
            1.9, 2.0, 1.5, 1.0, 0.5, 0.1
    };
    public static double[] powerusage_day = {

            0.34, 0.29, 0.31, 0.45, 0.41, 0.38,
            2.12, 1.87, 2.03, 1.01, 0.95, 0.89,
            1.11, 0.84, 0.93, 1.08, 2.45, 2.78,
            2.36, 2.19, 0.91, 0.73, 0.66, 0.59
    };


    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        for (int i =0; i < prices.length; i++) {
        }
        System.out.println();
    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        for (int i =0; i < usage.length; i++) {
        }
        System.out.println();
    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        for (int i = 0;  i < usage.length; i++) {
            sum += usage[i];
        }
        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++) {
            price += usage[i] * prices[i];
        }
        System.out.printf("%.2f NOK hver dag ", price);
        System.out.println();
        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {
        double support = 0;

        if (price > THRESHOLD) {
            support = usage * (price - THRESHOLD) * PERCENTAGE;
        }

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;

        for  (int i = 0; i < usage.length; i++) {
            support += getSupport(usage[i], prices[i]);
            //bruker getSupport fra opg E for denne oppgaven
        }
        System.out.printf("%.2f NOK i total stømstøtte", support);
        System.out.println();
        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        for (int i = 0; i <usage.length; i++) {
            price += usage[i] * 0.5;
        }
        System.out.printf("%.2f NOK i strømpris med 50øre per kWh", price);
        System.out.println();

        return price;
    }

    // h) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        for (int i = 0; i < usage.length; i++) {
            if (usage[i] > temp_max) {
                temp_max = usage[i];
            }
        }
        System.out.println("temp_max = " + temp_max);
        return temp_max;
    }
    // i)
    public static double findAvgPower(double[] usage) {

        double average = 0;

        average = computePowerUsage(usage)/usage.length;
        //bruker computePowerUsage fra opg C på denne oppgaven

        return average;
    }
}