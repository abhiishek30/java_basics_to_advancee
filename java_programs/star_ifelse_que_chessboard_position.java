//check chessboard position whether it is black or white
//i could not do this question...will try later after 1 week and remove this line

import java.util.Scanner;

public class star_ifelse_que_chessboard_position {

    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);

        System.out.println("Check your black or white position ");
        System.out.print("Enter row : ");
        int r=S.nextInt();
        System.out.print("Enter column : ");
        int c=S.nextInt();

        if(r>=1 && r<=8 && c>=1 && c<=8)
        {
            if((r+c)%2==0) {
                System.out.println("Position is Black");
                return;
            }
            else{
                System.out.println("position is White");
                return;
            }
        }else{
            System.out.println("Invalid Position");
            return;
        }



    }


}
