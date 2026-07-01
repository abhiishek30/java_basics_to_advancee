//count numbers between 1 and N(given number)


import java.util.Scanner;

public class for_countNumber {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number to count from 1 to : ");
        int n = S.nextInt();
        int count = 0;

        for (int i = n; i >= 1; i--)
        {
           count ++;
          //  System.out.println("total number is " +count);
        }
        System.out.println("total number is " +count);

    }
}
