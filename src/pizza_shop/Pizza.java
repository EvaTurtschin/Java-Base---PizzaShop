package pizza_shop;

public class Pizza {

    String name = "Pizza";
    String dough = "Dough";
    String sauce = "Sauce";
    String cheese = "Cheese";

    public Pizza (String dough, String sauce, String cheese){
        this.cheese = cheese;
        this.dough = dough;
        this.sauce = sauce;
    }

    public void preparing (){
        System.out.println("Your order is in process...");
        System.out.print("Preparing pizza with: " +dough+", "+sauce+", "+cheese);
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


    public static String toString(String name, String dough, String sauce, String cheese){
        return name + " with "+dough+", "+sauce+", "+cheese;
    }


}
