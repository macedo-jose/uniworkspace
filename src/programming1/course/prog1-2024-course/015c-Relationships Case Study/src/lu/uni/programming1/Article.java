package lu.uni.programming1;

import java.math.BigDecimal;
import java.util.UUID;

public class Article {
    private UUID id;
    private String description;
    private BigDecimal listPrice;
    // [6] "Article used-by OrderItem" relationship is *not* modeled explicitly,
    //     but could be done e.g. using an array 'orders' holding all order items
    //     which refer to this article

    public Article(String description, BigDecimal listPrice) {
        id = UUID.randomUUID();
        this.description = description;
        this.listPrice = listPrice;
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    @Override
    public String toString() {
        return "Article [id=" + id + ", description=" + description + ", listPrice=" + listPrice + "]";
    }
}
