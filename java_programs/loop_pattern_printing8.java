public class loop_pattern_printing8 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=i;j>=i;j--)
            {
              for(int k=1;k<=i;k++) {
                    System.out.print(j);
                }
            }
            System.out.println(" ");
        }
    }
}
