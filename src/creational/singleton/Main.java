package creational.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("SINGLETON PATTERN - Database Connection Manager");
        System.out.println(" ");

        DatabaseConnectionManager db1 = DatabaseConnectionManager.getInstance();
        DatabaseConnectionManager db2 = DatabaseConnectionManager.getInstance();

        System.out.println("Are both references the same instance? " + (db1 == db2));

        db1.connect();
        db2.connect();

        db1.executeQuery("SELECT * FROM users");
        db1.executeQuery("UPDATE products SET price = 99.99");

        db1.disconnect();
        db2.disconnect();
    }
}
