package pizza_shop;

public class PizzaOrderSystem {
    static Pizza choosePizza (String [] orderPizzas) {
        for (int i = 0; i < orderPizzas.length-1; i++) {
            switch (orderPizzas[i]) {
                case "Pizza Salami":
                    return new PizzaSalami();
                case "Pizza Margarita":
                    return new PizzaMargarita();
                case "Pizza Hawaii":
                    return new PizzaHawaii();
                default:
                    return new Pizza("sauce", "cheese");
            }
        }
        return new Pizza ("sauce", "cheese");
    }

    public static String nameOfPizzaOrder (String scan) {
        switch (scan) {
            case "1":
                return "Pizza Salami";
            case "2":
                return "Pizza Margarita";
            case "3":
                return "Pizza Hawaii";
            default:
                return "Unknown Pizza";
        }}




}
