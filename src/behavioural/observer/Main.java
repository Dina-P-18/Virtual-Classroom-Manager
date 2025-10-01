package behavioural.observer;
public class Main {
    public static void main(String[] args) {
        System.out.println("OBSERVER PATTERN - Weather Station Notification System");

        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phone = new PhoneDisplay("Phone");
        TVDisplay tv = new TVDisplay();

        weatherStation.registerObserver(phone);
        weatherStation.registerObserver(tv);

        System.out.println("Weather updates starting...");
        weatherStation.setMeasurements(25.5, 65, 1013.2);
        weatherStation.setMeasurements(23.0, 70, 1012.8);
        weatherStation.setMeasurements(27.8, 60, 1014.5);
    }
}