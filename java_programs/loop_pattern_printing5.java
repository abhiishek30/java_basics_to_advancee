public class loop_pattern_printing5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++)
        {
            for (int j = 1; j <= i+1; j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

}