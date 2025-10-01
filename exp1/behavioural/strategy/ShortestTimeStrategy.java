package behavioural.strategy;

public class ShortestTimeStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String from, String to) {
        System.out.println(" Calculating FASTEST route from " + from + " to " + to);
        System.out.println("   Estimated time: 30 minutes");
        System.out.println("   Using highways and expressways");
        System.out.println("   Traffic conditions: Light");
    }
}
