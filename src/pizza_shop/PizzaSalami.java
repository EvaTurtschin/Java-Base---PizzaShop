package pizza_shop;

public class PizzaSalami extends Pizza{

    String salami = "Salami";

    public PizzaSalami (){
        super("sause", "cheese");
        this.salami = salami;
    }

    public void preparing (){
        super.preparing();
        System.out.println(" "+salami );
    }

    public String toString(){
        return "Pizza Salami";
    }
}
