//Calculate final salary after tax and bonus deductions

import java.util.Scanner;

public class if_else_calc_salary {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print(" Enter your CTC(cost to company) : ₹");
        float ctc = S.nextFloat();
        if(ctc<=40000){
            System.out.println("There is no tax , you have to pay");
        }
        else{
            System.out.println("You have to pay 18% tax and 2% bonus deduction of your salary");
            float sal = (18*ctc)/100;
            System.out.print(" 18% tax of your salary is : ₹");
            System.out.println(sal);
            float bnd = (2*ctc)/100;
            System.out.print(" 2% bonus deduction of your salary is : ₹" );
            System.out.println(bnd);
            float TDS = sal+bnd;
            float tb = ctc - TDS;
            System.out.print(" Your Final Salary Is : ₹");
            System.out.print(tb);
        }

    }
}
