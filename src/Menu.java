import java.util.List;
import java.util.*;
import java.util.Scanner;

public class Menu {
    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Cierra's Resturant of Palace! Would you like to eat the delicious food here? " +
                "Please see our menu." );
        //Make a list of all foods and prices on the menu
        String[] strArray = {"1.) Chicken Sandwiches $6.00", "2.) Chicken Tenders $8.00", "3.) Red Beans and Rice $10.00", "4.) Curly Fries $5.00", "5.) Cinnamon rolls $3.00"};
        List<String> menu = Arrays.asList(strArray);
        //Print each item in a list
        for(String val : menu){
            System.out.println(val + " ");
        }

        //Finding out from buyers what would they like to eat
        System.out.println("Please enter the number of the food item that you want to purchase.");
        float food_choice = input.nextFloat();
        //Adding global variables
        float food_price = 0;
        float food_total = 0;

        if (food_choice == 1)
            food_price += 6.00;
        else if (food_choice == 5)
            food_price += 8.00;
        else if (food_choice == 7)
            food_price += 10.00;
        else if (food_choice == 3)
            food_price += 5.00;
        else if (food_choice == 2)
            food_price += 3.00;

        //Asking the customer if they would want their food to be delivered
        System.out.println("Would you like your food to be delivered or will you like to pick it up? A $4.99 fee will be charged to your order. "+
                " Please type 0 for No delivery or Type 1 for Yes delivery. ");
        float delivery_choice = input.nextFloat();

        if(delivery_choice == 1){
            //Giving customer the option to tip
            System.out.println("Put tip % by typing 0, 10, 15, 20");
            float tip = input.nextFloat();

            if(tip == 0)
                food_total = (float) (food_price + 4.99);
            else if (tip == 10)
                food_total = (float) (food_price*.05 + food_price*.6 + food_price / 4.99);
            else if(tip == 15)
                food_total = (float) (food_price*.08 + food_price*.6 + food_price / 4.99);
            else if(tip== 20)
                food_total = (float) (food_price*.15 +food_price / 4.99);
            else
                System.out.println("If tip is not paid, then order may be invalid.");

            System.out.println("Your order will come out to a total of $$" + food_total + "Thank you for dining!");
        }

        else
            System.out.println("If you are not dining in, you are more than welcome to come in and pick up your order. Your total is $$" + food_price);


    }



}
