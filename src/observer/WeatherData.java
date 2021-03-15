package observer;

import java.util.ArrayList;


public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    public void notifyObservers() {
        for (int i=0; i < observers.size(); i++) {
            Observer obs = observers.get(i);
            obs.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humid, float pressure) {
        this.temperature = temp;
        this.humidity = humid;
        this.pressure = pressure;
        measurementsChanged();
    }

}
