package org.example.singleton.database;

/**
 * Service class to manage orders in the system.
 */
public class OrderService {
    /**
     * Saves an order to the database.
     * Demonstrates using the singleton connection instance.
     *
     * @param orderId Unique identifier of the order.
     */
    public void save(String orderId) {
        // Using the shared connection instance for database interaction.
        DatabaseHelper.getConnection().sql("INSERT INTO orders (id) VALUES ('" + orderId + "');");
    }
}
