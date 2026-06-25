public class loop_pattern_printing1 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++)
        {
            for(int j=2;j<=i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
