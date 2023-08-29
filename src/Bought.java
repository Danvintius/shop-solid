import java.util.Scanner;

public class Bought {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {50, 60, 70};
        System.out.println("Список возможных товаров для покупки");

        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i] + " " + prices[i] + " руб/шт");
        }

        int[] selected = {0, 0, 0};

        int sumProducts = 0;

        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                sumProducts = prices[0] * selected[0] + prices[1] * selected[1] + prices[2] * selected[2];
                System.out.println("Ваша корзина:\nНаименование товара \t Количество \t Цена/за ед \t Общая стоимость\n");
                for (int i = 0; i < products.length; i++) {
                    System.out.println(products[i] + "\t" + selected[i] + "\t" + prices[i] + "\t" + selected[i] * prices[i]);
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
