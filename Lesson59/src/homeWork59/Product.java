package homeWork59;

public class Product {
    private String title;
    private int rating;
    private double price;
    private String category;

    public Product(String title, int rating, double price, String category) {
        this.title = title;
        this.rating = rating;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return title + ", rating: " + rating + ", price: " + price + ", category: " + category + "\n";
    }
}
