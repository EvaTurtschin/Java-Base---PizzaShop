package pizza_shop;

import java.util.Scanner;

public class OnlinePizzaShop {
    public static void main(String[] args) {

        int numberOfPizzasInOrder = 0;
        Scanner scanner = new Scanner(System.in);
        String[] orderPizzas = new String[10];

        while (true) {
            System.out.println("Choose you pizza here. " +
                    "Enter 1 - choosing Pizza Salami, " +
                    "Enter 2 - choosing Pizza Margarita, " +
                    "Enter 3 - choosing Pizza Hawaii. " +
                    "Enter 0 - to finish your order.");
            String scan = scanner.nextLine();

            PizzaOrderSystem order = new PizzaOrderSystem();

            if (scan.equals("0")) {
                System.out.println("Thank you for your order. We are starting to make your order.");
                break;
            } else if (scan.equals("1") || scan.equals("2") || scan.equals("3")) {

                orderPizzas[numberOfPizzasInOrder] = order.nameOfPizzaOrder(scan);
                numberOfPizzasInOrder++;
            } else {
                System.out.println("Invalid choice. Please enter a valid number.");
            }
        }

        System.out.println("\nYOu have ordered in total:");
        for (int i = 0; i < numberOfPizzasInOrder; i++) {
            System.out.println(orderPizzas[i]);
        }
        PizzaOrderSystem.choosePizza(orderPizzas).preparing();
        PizzaOrderSystem.choosePizza(orderPizzas).backing();
        PizzaOrderSystem.choosePizza(orderPizzas).packing();
        PizzaOrderSystem.choosePizza(orderPizzas).finish();
}}


