package pizza_shop;

public class PizzaChoice {
    static Pizza choosePizza (String scan){
        switch (scan){
            case "1" : return new PizzaSalami();
            case "2" : return new PizzaMargarita();
            case "3" : return new PizzaHawaii();
            default: return null;
        }
    }

    public String nameOfPizzaOrder (String scan) {
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
