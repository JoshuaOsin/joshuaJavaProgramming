package day04_Variables;

public class Currencies {
    //jpy, pound; peso, cad
    public static void main(String[] args) {

        int dollar = 1000;
        // rates
        double rateLira = 9.53;
        double rateEuro = 1.18;
        double ratePound = 1.30;
        double ratePeso = 20.32;
        double rateCanDollar = 0.76;
        double rateJpy = 114.37;
        double rateKuwaitiDinar = 3.27;
        double rateSwissFranc = 1.10;
        double rateAustralianDollar = 0.71;
        double rateSingaporeDollar = 0.74;
        // now conversions
        double lira = dollar * rateLira;
        double euro = dollar * rateEuro;
        double pound = dollar * ratePound;
        double peso = dollar * ratePeso;
        double canDollar = dollar * rateCanDollar;
        double jpy = dollar * rateJpy;
        double kuwaitiDinar = dollar * rateKuwaitiDinar;
        double australianDollar = dollar * rateAustralianDollar;
        double swissFranc = dollar * rateSwissFranc;
        double singaporeDollar = dollar * rateSingaporeDollar;
        // now printing
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("ratePound = " + ratePound);
        System.out.println("ratePeso = " + ratePeso);
        System.out.println("rateCanDollar = " + rateCanDollar);
        System.out.println("rateJpy = " + rateJpy);
        System.out.println("rateKuwaitiDinar = " + rateKuwaitiDinar);
        System.out.println("rateAustralianDollar = " + rateAustralianDollar);
        System.out.println("swissFranc = " + swissFranc);
        System.out.println("singaporeDollar = " + singaporeDollar);


    }


}
