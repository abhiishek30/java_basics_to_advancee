//rock,paper,scissor game


import java.util.Scanner;
import java.util.Random;

public class if_game_R_P_C{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random R = new Random();

        System.out.print("Enter rock, paper or scissors: ");
        String user = sc.next();

        int num = sc.nextInt(3);

        String computer = "";

        if (num == 0) {
            computer = "rock";
        }

        if (num == 1) {
            computer = "paper";
        }

        if (num == 2) {
            computer = "scissors";
        }

        System.out.println("Computer chose: " + computer);

        if (user.equals(computer)) {
            System.out.println("Draw!");
        }

        if (user.equals("rock") && computer.equals("scissors")) {
            System.out.println("You Win!");
        }

        if (user.equals("paper") && computer.equals("rock")) {
            System.out.println("You Win!");
        }

        if (user.equals("scissors") && computer.equals("paper")) {
            System.out.println("You Win!");
        }

        if (computer.equals("rock") && user.equals("scissors")) {
            System.out.println("Computer Wins!");
        }

        if (computer.equals("paper") && user.equals("rock")) {
            System.out.println("Computer Wins!");
        }

        if (computer.equals("scissors") && user.equals("paper")) {
            System.out.println("Computer Wins!");
        }
    }
}


