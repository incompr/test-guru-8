package incompr.data;

public class Product {

    String name;
    int price;
    String description;
    int amountInStock;
    boolean discount15;

    public Product(String name, int price, String description, int amountInStock, boolean discount15) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.amountInStock = amountInStock;
        this.discount15 = discount15;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", amountInStock=" + amountInStock +
                ", discount15=" + discount15 +
                '}';
    }
}
