import java.util.Scanner;

//  que....check if a character is upper case or lower case and vowel or consonant

public class star_ifstate_que_check_upper_or_lower {
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = S.next().charAt(0);

        //lowercase

        if(ch>= 'a' && ch<= 'z')
             {
            System.out.println("character is lowercase");
             }
        //uppercase

        if(ch>= 'A' && ch<= 'Z')
                   {
                  System.out.println("character is upperrcase");
                     }
        if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
                        {
                            System.out.println("character is vowel");          // mistake that i did is get trapped in or(||) and and(&&)
                              }
                                      if ((ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') && (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')) {
                                          System.out.println("character is consonant");

                                  }


        if(!(ch>= 'A' && ch<= 'Z' || ch>= 'a' && ch<= 'z'))   //here,we use ! (not equal)sign so whenever you
                                                               //enter character other than alphabet it shows invalid
                   {
                System.out.println("enter valid character");
                   }


    }

}
