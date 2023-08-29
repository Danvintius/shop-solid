import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product bread = new Product("Хлеб", 30);
        Product milk = new Product("Молоко", 50);
        Product eggs = new Product("Яйца", 60);
        Product[] products = {bread, milk, eggs};

        System.out.println("В магазине есть следующие товары:");
        for (int i = 0; i < products.length; i++) { // Magic
            System.out.println(i + 1 + ". " + products[i].toString());
        }
        
        while(true) {
            System.out.println("Выберите товар и количество или введите `end`");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
        }
    }
}
