package day08.final_.quiz3;

import static day08.final_.quiz3.WeatherConstants.*;

public class WeatherAnalyzer {

    public static boolean checkTemperatureAlert(double temperature) {
        if (temperature > MAX_TEMPERATURE_ALERT || temperature < MIN_TEMPERATURE_ALERT) {
            return true;
        }
        return false;
    }

    public static boolean checkPrecipitationAlert(double precipitation) {
        if (precipitation > PRECIPITATION_ALERT) {
            return true;
        }
        return false;
    }
}
