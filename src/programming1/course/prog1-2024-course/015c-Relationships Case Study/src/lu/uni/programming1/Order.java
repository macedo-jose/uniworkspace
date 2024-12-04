package lu.uni.programming1;

import java.util.Arrays;
import java.util.UUID;

public class Order {
    private UUID number;
    private Customer customer; // [2] "Order belongs-to Customer" relationship (cardinality: 1)
    // 'status' (from the example slides) intentionally omitted


    // order items are inaccessible from the outside; they are 'owned' by
    // the order and are not shared outside of it; the order items will
    // be deleted automatically once the enclosing order is deleted
    private OrderItem[] items; // [3] "Order owns OrderItems" relationship (cardinality: 1..*)

    public Order(Customer customer, OrderItem[] items) {
        number = UUID.randomUUID();
        this.customer = customer;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order [number=" + number + ", customer=" + customer + ", items=" + Arrays.toString(items) + "]";
    }
}
