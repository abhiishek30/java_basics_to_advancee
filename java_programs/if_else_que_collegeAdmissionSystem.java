//make a college admisssion system


import java.util.Scanner;

public class if_else_que_collegeAdmissionSystem {

public void main(String[] args) {
    Scanner S = new Scanner(System.in);
    System.out.println("fill this form to get admission ");
    System.out.print("Enter your Name : ");
    String name = S.nextLine();
    System.out.print("Enter your Age : ");
    int age = S.nextInt();
    System.out.print("Enter the Course name you want to take admission in : ");
    String cour = S.next();
    System.out.print("Enter your class 12th Percentage : ");
    float per = S.nextFloat();
    if(age < 18 ) {
        System.out.println("You are not eligible, You age is too low ");
        System.out.println("you can not take admission");
        return;
    }
        if( age >=25) {
            System.out.println("You are not eligible, You age is too high ");
            System.out.println("you can not take admission");
            return;
    }
        if(per<50.0) {
            System.out.println("percentega is too low");
            System.out.print("you can not take admission in : ");
            System.out.print(cour);
            return;
        }


            if(per>100){
                System.out.println("invalid percentage");
                System.out.println("fill this form again");
                return;

        }

        else {

        System.out.println("You are Selected");
        System.out.println("HAPPY LEARNING");
        return;
    }


 }


}






