package behavioural.observer;

public class PhoneDisplay implements WeatherObserver {
    private String deviceName;

    public PhoneDisplay(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("" + deviceName + " Display:");
        System.out.println("   Temperature: " + temperature + "°C");
        System.out.println("   Humidity: " + humidity + "%");
        System.out.println("   Pressure: " + pressure + " hPa");
        System.out.println();
    }
}
