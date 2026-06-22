//QUE...Check month name by entering number and tells if he is leap year or not


import java.util.Scanner;

public class conditional_Leap_year_month {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("\nCheck month name and whether it is leap year or not ");
        System.out.print("\nEnter month number : ");
        int a = S.nextInt();
        System.out.print("Enter year : ");
        int b = S.nextInt();

        switch (a) {
            case 1 :
                System.out.println("Month is January");
                break;
            case 2 :
                System.out.println("Month is february");
                break;
            case 3 :
                System.out.println("Month is march");
                break;
            case 4 :
                System.out.println("Month is april");
                break;
            case 5 :
                System.out.println("Month is may");
                break;
            case 6 :
                System.out.println("Month is june");
                break;
            case 7 :
                System.out.println("Month is July");
                break;
            case 8 :
                System.out.println("Month is august");
                break;
            case 9 :
                System.out.println("Month is september");
                break;
            case 10 :
                System.out.println("Month is october");
                break;
            case 11 :
                System.out.println("Month is november");
                break;
            case 12 :
                System.out.println("Month is december");
                break;
            default:
                System.out.println("invalid month number");

        }
        if (a == 1 || a==3  || a==5 || a==7 || a==8 || a==10 || a==12 ) {
            System.out.print("this month ");
            System.out.print(" has 31 days\n");
            {
                if (b % 400 == 0 || b % 4 == 0 && b % 100 != 0) {
                    System.out.println(b + " is a leap year");
                } else {
                    System.out.println(b + "not a leap year");
                }
            }
        }
        else if (a == 4 || a == 6 || a == 9 || a == 11) {

                System.out.print("this month ");
                System.out.print(" has 30 days\n");
            {
                if (b % 400 == 0 || b % 4 == 0 && b % 100 != 0) {
                    System.out.println(b + " is a leap year");
                } else {
                    System.out.println(b + "not a leap year");
                }

            }
        }

        else if (a == 2) {
            if (b % 400 == 0 || b % 4 == 0 && b % 100 != 0) {
                System.out.println("february has  29 days");
                System.out.println(b + " is a leap year");
            } else {
                System.out.println("february has 28 days\n" + b + " is not a leap year");
            }
        }
    }
}

