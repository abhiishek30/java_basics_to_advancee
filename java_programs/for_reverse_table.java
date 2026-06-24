//que...reverse the table of 10*n to 1*n


import java.util.Scanner;

public class for_reverse_table {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int j=0;
        int t = 0;
        System.out.print("\nenter table of : ");
        int n = S.nextInt();
        for (int i = 10; i >= 1; i--) {
            t = n * i;
            System.out.println(+n + "*" + i + " is " + t);
        }
    }
}
