package oop.assigment_problems;

/** Every order bumps one shared counter held in a static field. */
class Order {
    static int totalOrders = 0;
    String orderId;

    public Order(String orderId) {
        this.orderId = orderId;
        totalOrders++;
    }
}

/**
 * Week 3 - Assignment Problem L5 : Counting Objects With a Static Field.
 */
public class OrderCounter {

    public static void main(String[] args) {
        new Order("ORD-001");
        new Order("ORD-002");
        new Order("ORD-003");
        new Order("ORD-004");

        System.out.println("Total orders: " + Order.totalOrders);
    }
}
