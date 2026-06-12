import javax.xml.transform.Source;
import java.util.Scanner;

public class greetingtouser {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);


        System.out.println("enter your name to greeted : ");
        System.out.println("and your class you studied");

        String ch = S.nextLine();
        int a = S.nextInt();
        System.out.print("comp : hii ");
        System.out.print(ch);
        System.out.println("  ,how are you?");
        System.out.print(ch);
        System.out.println(" : i'm fine.");
        System.out.println("comp : In which class you read ");
        System.out.print(ch);
        System.out.print(" : ");

        System.out.print(a);

    }
}
