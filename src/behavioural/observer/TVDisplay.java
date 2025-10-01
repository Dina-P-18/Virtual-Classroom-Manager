package behavioural.observer;
public class TVDisplay implements WeatherObserver {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("TV Weather Update:");
        System.out.println("   Temp: " + temperature + "°C | Hum: " + humidity + "%");
        System.out.println("   Pressure: " + pressure + " hPa");
        System.out.println();
    }
}