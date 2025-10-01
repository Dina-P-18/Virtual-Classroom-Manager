package behavioural.strategy;

public class RoutePlanner {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void planRoute(String from, String to) {
        System.out.println("\n Planning route: " + from + " → " + to);
        strategy.calculateRoute(from, to);
    }
}
