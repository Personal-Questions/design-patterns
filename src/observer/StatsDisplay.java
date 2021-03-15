package observer;

import java.util.ArrayList;

public class StatsDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private float avgTemp, avgPress, avgHumid;
    private ArrayList<Float> tempList, humidList, pressList;

    public StatsDisplay(Subject weatherData) {
        tempList = new ArrayList<>();
        humidList = new ArrayList<>();
        pressList = new ArrayList<>();

        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempList.add(temp);
        humidList.add(humidity);
        pressList.add(pressure);
        updateStats();
        display();
    }

    private void updateStats() {
        avgPress = 0;
        avgHumid = 0;
        avgTemp = 0;

        for (int i=0; i < tempList.size(); i++) {
            avgPress += pressList.get(i);
            avgTemp += tempList.get(i);
            avgHumid += humidList.get(i);
        }
        avgPress /= pressList.size();
        avgHumid /= humidList.size();
        avgTemp /= tempList.size();
    }

    @Override
    public void display() {
        System.out.println("\nWeather Statistics:");
        System.out.println("Average Temperature: " + this.avgTemp);
        System.out.println("Average Humidity: " + this.avgHumid);
        System.out.println("Average Pressure: " + this.avgPress);
    }

}
