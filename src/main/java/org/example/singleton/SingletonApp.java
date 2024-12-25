package org.example.singleton;

/**
 * Main application to demonstrate the Singleton pattern in action.
 */
public class SingletonApp {
    public static void main(String[] args) {
        // Service to manage orders.
        OrderService orderService = new OrderService();
        // Save an order using the shared connection.
        orderService.save("0001");

        // Service to manage order details.
        OrderDetailService orderDetailService = new OrderDetailService();
        // Save order details using the same shared connection.
        orderDetailService.save("0001", "IndoMie");
        orderDetailService.save("0001", "Sabun");
        orderDetailService.save("0001", "Pepsodent");

        // All operations above use the same connection instance.
    }
}
