package behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println(" STRATEGY PATTERN - Travel Route Planner");

        RoutePlanner planner = new RoutePlanner();

        planner.setStrategy(new ShortestTimeStrategy());
        planner.planRoute("Home", "Office");

        planner.setStrategy(new ShortestDistanceStrategy());
        planner.planRoute("City Center", "Airport");

        planner.setStrategy(new ScenicRouteStrategy());
        planner.planRoute("Mountain Base", "Beach");
    }
}
