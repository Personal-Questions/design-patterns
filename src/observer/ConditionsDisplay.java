package observer;

public class ConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("\nCurrent Conditions: ");
        System.out.println("Temperature: "  + this.temperature);
        System.out.println("Humidity: "     + this.humidity);
        System.out.println("Pressure: "     + this.pressure);
    }

}
