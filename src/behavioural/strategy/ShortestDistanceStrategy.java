package behavioural.strategy;

public class ShortestDistanceStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String from, String to) {
        System.out.println(" Calculating SHORTEST route from " + from + " to " + to);
        System.out.println("   Distance: 15 km");
        System.out.println("   Using local roads and shortcuts");
        System.out.println("   Estimated time: 45 minutes");
    }
}