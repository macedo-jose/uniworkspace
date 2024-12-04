package lu.uni.programming1;

import java.util.UUID;

public class OrderItem {
    private UUID articleId; // [5] "OrderItem uses Article" relationship (cardinality 1)
    private int quantity;
    private int discount;
    // [4] "OrderItem contained-in Order" relationship (cardinality: 1) is *not* modeled
    //     explicitly, but could be done e.g. using a property 'order' holding the object
    //     reference of the owning order
    
    public OrderItem(UUID articleId, int quantity) {
        this.articleId = articleId;
        this.quantity = quantity;
        this.discount = 0;
    }

    public OrderItem(UUID articleId, int quantity, int discount) {
        this.articleId = articleId;
        this.quantity = quantity;
        this.discount = Math.max(Math.min(discount, 100), 0);
    }

    public UUID getArticleId() {
        return articleId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "OrderItem [articleId=" + articleId + ", quantity=" + quantity + ", discount=" + discount + "]";
    }
}
