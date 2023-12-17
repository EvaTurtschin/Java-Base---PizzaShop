package pizza_shop;

public class PizzaMargarita extends Pizza{

    String tomatoes = "Tomatoes";

    public PizzaMargarita (){
        super("sauce", "mozzarella cheese");
        this.tomatoes = tomatoes;
    }

    public void preparing (){
        super.preparing();
        System.out.println(" "+tomatoes );
    }

    public String toString (){
        return "Pizza Margarita";
    }


}
