package lv.accenture.preboot.collections;

public class CheckEntry {

    private String product;

    private String category;

    private double price;

    private int quantity;

    public CheckEntry(String product, String category, double price, int quantity) {
        this.product = product;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
