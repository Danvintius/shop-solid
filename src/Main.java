import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product bread = new Product("Хлеб", 30, "Еда");
        Product milk = new Product("Молоко", 50, "Еда");
        Product eggs = new Product("Яйца", 60, "Еда");
        Product[] products = {bread, milk, eggs};

        System.out.println("В магазине есть следующие товары:");
        for (int i = 0; i < products.length; i++) { // Magic
            System.out.println(i + 1 + ". " + products[i].toString());
        }

        ArrayList<Integer> prices = new ArrayList<>();
        for (int i = 0; i < products.length; i++) {
            prices.add(products[i].cost);
        }

        int[] selected = {0, 0, 0};

        int sumProducts = 0;
        
        while(true) {
            System.out.println("Выберите товар и количество или введите `end`");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("end")) {
                sumProducts = prices.get(0) * selected[0] + prices.get(1) * selected[1] + prices.get(2) * selected[2];
                System.out.println("Ваша корзина:\nНаименование товара \t Количество \t Цена/за ед \t Общая стоимость\n");
                for (int i = 0; i < products.length; i++) {
                    System.out.println(products[i] + "\t" + selected[i] + "\t" + prices.get(i) + "\t" + selected[i] * prices.get(i));
                }
                System.out.println("\n Итого \t" + sumProducts);
            }


            String[] parts = input.split(" ");
            int product = Integer.parseInt(parts[0]) - 1;
            int amount = Integer.parseInt(parts[1]);

            for (int i = 0; i < selected.length; i++) {
                selected[product] += amount;
            }
        }
    }
}
