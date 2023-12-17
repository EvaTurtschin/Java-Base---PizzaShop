package pizza_shop;

public class Pizza {

    String name = "Pizza";
    String sauce = "Sauce";
    String cheese = "Cheese";

    public Pizza (String sauce, String cheese){
        this.cheese = cheese;
        this.sauce = sauce;
    }

    public void preparing (){
        System.out.print("Your order is in process... Preparing pizza with "+sauce+", "+cheese+" and ");
    }

    public void backing(){
        System.out.println("Backing in progress...");
    }

    public void packing (){
        System.out.println("Packing Pizza...");
    }

    public void finish (){
        System.out.println("You can take your order.");
    }


    public String toString(){
        return "Pizza";
    }


}
