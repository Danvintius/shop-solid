public class Product {
    public String title;
    public int cost;
    public String category;

    public Product() {

    }
    public Product(String title, int cost, String category) {
        this.title = title;
        this.cost = cost;
        this.category = category;
    }

    @Override
    public String toString() {
        return title + " " + cost + " (категория: " + category + " )";
    }
}
