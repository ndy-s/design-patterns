package org.example.singleton.database;

/**
 * Service class to manage order details.
 */
public class OrderDetailService {
    /**
     * Saves order details to the database.
     * Demonstrates using the singleton connection instance.
     *
     * @param orderId  Unique identifier of the order.
     * @param itemName Name of the item in the order.
     */
    public void save(String orderId, String itemName) {
        // Using the shared connection instance for database interaction.
        DatabaseHelper.getConnection().sql(
                "INSERT INTO order_details (order_id, item_name) VALUES ('" + orderId + "', '" + itemName + "');"
        );
    }
}
