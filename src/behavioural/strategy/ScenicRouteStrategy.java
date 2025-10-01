package behavioural.strategy;

public class ScenicRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String from, String to) {
        System.out.println(" Calculating SCENIC route from " + from + " to " + to);
        System.out.println("   Distance: 25 km");
        System.out.println("   Estimated time: 60 minutes");
        System.out.println("   Points of interest: Lake View, Mountain Pass");
    }
}