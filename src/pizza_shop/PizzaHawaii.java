package pizza_shop;

public class PizzaHawaii extends  Pizza{

    String chicken = "Chicken";
    String pineapple = "Pineapple";

    public PizzaHawaii(){
        super("dough", "sauce", "cheese");
        this.chicken = chicken;
        this.pineapple = pineapple;
    }

    public void preparing (){
        super.preparing();
        System.out.println(", "+chicken+", "+pineapple );
    }


}
