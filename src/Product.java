public class Product {
    public String title;
    public int cost;
    // public static String category;

    public Product(String title, int cost) {
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return title + " " + cost + " (категории пока нет)";
    }
}
