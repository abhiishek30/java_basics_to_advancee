import java.util.Scanner;

public class count_even_And_odd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("\ncount even and odd upto : ");
        int n=s.nextInt();
        int evencount =0;
        int oddcount =0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                evencount++;
            }
            else{
                oddcount++;
            }
           // System.out.println(evencount);
        }
        System.out.println(" total even numbers = "+evencount);
        System.out.println(" total odd numbers = "+oddcount);

    }
}
