import java.util.Scanner;
 class Pizza
{
String size;
String crust;
String flavour;
String topping;
int Price;
void showPizzaTypes()
{
System.out.println("Available Pizza Flavours");
System.out.println();
  System.out.println("======================================================");
System.out.println("1.Vegetarian");
System.out.println("2.Non-Veg");
System.out.println("3.Vegan");
System.out.println();
System.out.println("Available Pizza Sizes");
System.out.println();
 System.out.println("======================================================");
System.out.println("1.Small");
System.out.println("2.Medium");
System.out.println("3.Large");
System.out.println();
System.out.println("Available Pizza Crust types");
System.out.println();
 System.out.println("======================================================");
System.out.println("1.Thik");
System.out.println("2.Thin");
System.out.println();

}
void showPizzaPrices()
{
System.out.println("Prices of a pizza based on the type of flavour and size");
System.out.println();
 System.out.println("======================================================");
System.out.println("Vegetarian (20 USD SMALL, 40 USD MEDIUM, 60 USD LARGE)");
System.out.println("Non-Veg (20 USD SMALL, 40 USD MEDIUM, 60 USD LARGE)");
System.out.println("Vegan (20 USD SMALL, 40 USD MEDIUM, 60 USD LARGE)");
System.out.println();
System.out.println("Pizza can have following toppings(Please note each toppings has some extra cost)");
System.out.println();
 System.out.println("=========================================================================================");
System.out.println("Cheese(1.00 USD)");
System.out.println("Tomato(1.00 USD)");
System.out.println("Mushroom(1.00 USD");
System.out.println("Jalapeno (1.00 USD)");
System.out.println("Spinach(1.00 USD)");
System.out.println();

}
String estimateCostOfPizza()
{
if(this.flavour.equalsIgnoreCase("Vegetarian")&&this.size.equalsIgnoreCase("Small"))
return "20 USD";
else if(this.flavour.equalsIgnoreCase("Vegetarian")&&this.size.equalsIgnoreCase("mediun"))
return "40 USD";
else if(this.flavour.equalsIgnoreCase("Vegetarian")&&this.size.equalsIgnoreCase("large"))
return "60 USD";
else if(this.flavour.equalsIgnoreCase("Non-Veg")&&this.size.equalsIgnoreCase("small"))
return "25 USD";
else if(this.flavour.equalsIgnoreCase("Non-Veg")&&this.size.equalsIgnoreCase("mediun"))
return "50 USD";
else if(this.flavour.equalsIgnoreCase("Non-Veg")&&this.size.equalsIgnoreCase("large"))
return "75 USD";
else if(this.flavour.equalsIgnoreCase("vegan")&&this.size.equalsIgnoreCase("small"))
return "15 USD";
else if(this.flavour.equalsIgnoreCase("vegan")&&this.size.equalsIgnoreCase("medium"))
return "30 USD";
else if(this.flavour.equalsIgnoreCase("vegan")&&this.size.equalsIgnoreCase("large"))
return "45 USD";
else
return "null";
}}
class Pasta
{
    String type;
    String flavour;
    int price;
    void showPastaTypes()
    {
     System.out.println("Available Pasta Types");  
     System.out.println();
     System.out.println("======================================================");
        System.out.println("1.Penne");
System.out.println("2.Ditalini");
System.out.println();
    }
    void showPastaFlavours()
    {
        System.out.println("Available Pasta Flavours"); 
        System.out.println();
        System.out.println("======================================================");
        System.out.println("1.White sauce");
System.out.println("2.Red sauce");
System.out.println();
    }
    void showPastaPrices()
    {
        System.out.println("Cost of Pasta based on flavour. Any type can be chosen with no change in cost"); 
        System.out.println();
        System.out.println("======================================================================================");
        System.out.println("1.White sauce : 10 USD");
System.out.println("2.Red sauce : 20 USD");
System.out.println();
        
    }
    String estimateCostOfPasta()
    {
        if(this.flavour.equalsIgnoreCase("White sauce"))
        return "10 USD";
        else if(this.flavour.equalsIgnoreCase("Red sauce"))
        return "20 USD";
        else
   return "null";
    }
}
class OrderSystem
{
String input;
OrderSystem(String S1)
{
this.input=S1;
}
void takeOrder()
{
  System.out.println();  
System.out.println("Thanks for Ordering "+this.input);
   System.out.println();
}
void payment(int payment)
{
    System.out.println("Your total bill is "+payment+" USD");
    System.out.println("Thansk for the Payment. Visit us again");
       System.out.println("***************************************************");
    }
}
class Kitchen
{
void prepareOrder()
{
    System.out.println("Your order is being prepared by the Kitchen. We will notify you once it is completed");
}
void notifyOrdersystem()
{
    System.out.println("...............................................................................................................................................");
    System.out.println("Thanks for your wating. Your order is ready");
    System.out.println();
}
}
public class PizzaAndPasta
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
String S1,S2,S3,S4,S5,S6;
for(int i=0;i<10;i++)
{
System.out.println("Welcom to the OrderSystem. Below are the available food iteams with us.");
System.out.println("1.Pizza");
System.out.println("2.Pasta");
System.out.println("Please select your choise");
S1=s.nextLine();
OrderSystem o=new OrderSystem(S1);
o.takeOrder();
if(S1.equalsIgnoreCase("Pizza"))
{
Pizza p= new Pizza();
p.showPizzaTypes();
p.showPizzaPrices();
System.out.println("Please provide the pizza flavour you want");
S2=s.nextLine();
p.flavour=S2;
System.out.println("Please provide the pizza size you want");
S3=s.nextLine();
p.size=S3;
System.out.println("Please provide the pizza crust type you want");
S4=s.nextLine();
p.crust=S4;
System.out.println("Please provide the topping type you want");
S5=s.nextLine();
p.topping=S5;
Kitchen k=new Kitchen();
k.prepareOrder();
k.notifyOrdersystem();
S6=p.estimateCostOfPizza();
p.Price=Integer.parseInt(S6.substring(0,2));
if(p.topping.equalsIgnoreCase("Cheese"))
o.payment(Integer.parseInt(S6.substring(0,2))+1);
else if(p.topping.equalsIgnoreCase("tomato"))
o.payment(Integer.parseInt(S6.substring(0,2))+1);
else if(p.topping.equalsIgnoreCase("maashroom"))
o.payment(Integer.parseInt(S6.substring(0,2))+1);
else if(p.topping.equalsIgnoreCase("Jalapeno"))
o.payment(Integer.parseInt(S6.substring(0,2))+1);
else if(p.topping.equalsIgnoreCase("Spinach"))
o.payment(Integer.parseInt(S6.substring(0,2))+1);
}
else{
    Pasta p=new Pasta();
    p.showPastaTypes();
    p.showPastaFlavours();
    p.showPastaPrices();
    System.out.println("Please provide the pasta flavour you want");
S2=s.nextLine();
p.flavour=S2;
    System.out.println("Please provide the pasta type you want");
    S3=s.nextLine();
    p.type=S3;
Kitchen k=new Kitchen();
k.prepareOrder();
k.notifyOrdersystem();
S4=p.estimateCostOfPasta();
p.price=Integer.parseInt(S4.substring(0,2));
o.payment(Integer.parseInt(S4.substring(0,2)));
}
}
}
}