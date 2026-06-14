//name triangle on the basis of sides

import java.util.Scanner;

public class if_else_que_triangle {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("enter sides of triangle ABC ");
        System.out.print("enter side AB : ");
        int ab=S.nextInt();
        System.out.print("enter side BC : ");
        int bc=S.nextInt();
        System.out.print("enter side CA : ");
        int ca=S.nextInt();

        if(ab==bc && bc==ca && ca==ab)
        {
            System.out.println("This Is Equilateral Triangle");
            return;
        }
        if(ab==bc && bc!=ca)
        {
            System.out.println("This Is Isosceles Triangle");
            return;
        }
          else
          {
            System.out.println("This Is Scalene Triangle");
        }
    }
}
