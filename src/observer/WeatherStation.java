package observer;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        ConditionsDisplay condDisplay = new ConditionsDisplay(weatherData);
        StatsDisplay statsDisplay = new StatsDisplay(weatherData);

        weatherData.setMeasurements(30.5f, 78.0f, 1.25f);
        weatherData.setMeasurements(22.4f, 89.0f, 10.1f);
    }

}
