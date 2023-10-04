package homeWork56;

import java.io.Serializable;

public class Product implements Serializable {

    private static final long serialVersionUID = 1001;
    private int id;
    private String name;
    private double price;
    private int quantity;
    private transient int discount;

    public Product(int id, String name, double price, int quantity, int discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product: " + "id = " + id + ", name = " + name + ", price = " + price +
                ", quantity = " + quantity + ", discount = " + discount;
    }
}
