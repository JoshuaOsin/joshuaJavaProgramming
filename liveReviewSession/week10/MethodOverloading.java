package week10;

public class MethodOverloading {



    // 1 feet 12 inches
    public static double convertBritishtoMetric (double feet, double inches) {
        double result = feet*12 + 2.54*inches;
        return result;
    }

    public static double convertBritishtoMetric(double inches) {
        double result = inches*2.54;
        return result;
    }
}
