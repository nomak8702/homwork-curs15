package exercise1;

public class ConvertTemperature {

    public static double fahrenheitToCelsius(double temperature) {
        double convert = (temperature - 32) * 5 / 9;
        return convert;
    }

    public static double celsiusToFahrenheit(double temperature) {
        double convert = temperature * 9 / 5 + 32;
        return convert;
    }
}
