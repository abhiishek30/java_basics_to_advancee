//calculate cricket result based on target and score


import java.util.Scanner;

public class if_else_cricket_result {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);

        System.out.print("Enter Target Score : ");
        int ts = S.nextInt();
        System.out.print("Enter wicket fall to give target : ");
        int wf = S.nextInt();
        System.out.print("Enter Score you made by chasing target : ");
        int sm = S.nextInt();
        System.out.print("Enter wicket fall to chase target : ");
        int wft = S.nextInt();

        if(ts>sm) {
            System.out.print("Team A won by : ");
            int wr = ts - sm;
            System.out.print(wr);
            System.out.print(" run");
            return;
        }
            if(ts<sm){
                System.out.print("Team B won by : ");
                int ww = 10-wft;
                System.out.print(ww);
                System.out.print( " wicket");
                return;
            }
            else{
                System.out.println("Match Tied");
                System.out.println("Now Match Will Be Decided By Super Over");
                System.out.println("Team B will play first");
                System.out.print("Enter the score by team B : ");
                int tss = S.nextInt();
                System.out.print("Enter the score by team A : ");
                int smm = S.nextInt();
                if(tss>smm)
                {
                    System.out.println("TEAM B won the super over");
                    return;
                }
                if(tss<smm)
                {
                    System.out.println("TEAM A won the super over");
                    return;
                }
                if(tss==smm){
                    System.out.println("Super over tied");
                    System.out.println("match over");
                }
            }
        }
    }

