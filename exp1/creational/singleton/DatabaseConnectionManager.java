package creational.singleton;

public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    private int connectionCount;
    private boolean isConnected;

    private DatabaseConnectionManager() {
        this.connectionCount = 0;
        this.isConnected = false;
        System.out.println("Database Connection Manager initialized");
    }

    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public void connect() {
        if (!isConnected) {
            isConnected = true;
            connectionCount++;
            System.out.println("Connected to database. Active connections: " + connectionCount);
        } else {
            System.out.println("Already connected to database");
        }
    }

    public void disconnect() {
        if (isConnected) {
            isConnected = false;
            connectionCount--;
            System.out.println(" ");
            System.out.println("Disconnected from database. Active connections: " + connectionCount);
        }
    }

    public void executeQuery(String query) {
        if (isConnected) {
            System.out.println(" ");
            System.out.println("Executing query: " + query);
            System.out.println("Query executed successfully ✓");
        } else {
            System.out.println("Cannot execute query - not connected to database");
        }
    }
}
