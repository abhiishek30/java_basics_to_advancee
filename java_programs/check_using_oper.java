import java.util.Scanner;

//check whether the given number greater than the
// user entered number or not
public class check_using_oper {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number : ");
        int a = s.nextInt();
        System.out.println(a);

        System.out.println( 8 > a );

    }
}
