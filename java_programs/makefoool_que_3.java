// wap to encrypt a grade by adding 8 and decrypt to show correct grade

public class makefoool_que_3 {
    public static void main(String[] args) {

        char grade = 'A';
        grade = (char)('A'+8);
        System.out.print("grade : ");
        System.out.println(grade);
        grade = (char)(grade-8);
        System.out.print("grade : ");
        System.out.print(grade);

    }
}
