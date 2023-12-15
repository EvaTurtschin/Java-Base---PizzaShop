package pizza_shop;

public class PizzaSalami extends Pizza{

    String salami = "Salami";

    public PizzaSalami (){
        super("dough", "sause", "cheese");
        this.salami = salami;
    }

    public void preparing (){
        super.preparing();
        System.out.println(", "+salami );
    }
}
