import java.util.Scanner;

//check no divisible by 2,3,both or neither
public class ifstate_que_check_number {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("enter number to get divided by 2,3,both or neither : ");
        float a= S.nextFloat();
        if(a%2==0){
            System.out.println("this number is divisible by 2 ");
        }
        if(a%3==0){
            System.out.println("this number is divisible by 3 ");
        }
        if(a%2==0 && a%3==0){
            System.out.println("this number is divisible by 2 and 3 both ");
        }
        if(a%2!=0 && a%3!=0){
            System.out.println("this number is neither divisible by 2 nor 3 ");
        }

    }
}
