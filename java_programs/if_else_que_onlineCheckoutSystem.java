//build a Online Checkout system

import java.util.Scanner;

public class if_else_que_onlineCheckoutSystem {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("choose option\n 1.Add to Cart\n 2.See product description\n 3.exit the app  ");
        int a = S.nextInt();
        if(a==1) {
            System.out.print("enter your house no to get product delivered : ");
            int b = S.nextInt();
            System.out.println("continue");
            System.out.println();
            System.out.println("pay product amount as given");
            int c = S.nextInt();
            System.out.println("amount paid");
            System.out.println("your product will be delivered soon");
            System.out.println("Thank You");
        }
        if(a==2)
        {
            System.out.println("your product name is XYZ");
            System.out.println("this product has a 5 year warranty");

        }
        else{
            return;
        }
    }
}
