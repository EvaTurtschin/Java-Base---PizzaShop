package pizza_shop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class OnlinePizzaShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose you pizza here. " +
                "Enter 1 - choosing Pizza Salami, " +
                "Enter 2 - choosing Pizza Margarita, " +
                "Enter 3 - choosing Pizza Hawaii.");
        String scan = scanner.nextLine();

        PizzaChoice order = new PizzaChoice();
        System.out.println("You have ordered: "+ order.nameOfPizzaOrder(scan));

        PizzaChoice.choosePizza(scan).preparing();
        System.out.println();
        PizzaChoice.choosePizza(scan).backing();
        System.out.println();
        PizzaChoice.choosePizza(scan).packing();
        System.out.println();
        PizzaChoice.choosePizza(scan).finish();


    }}
