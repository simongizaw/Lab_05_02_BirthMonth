import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your birth month as a digit ");
        int age=in.nextInt();

        if ( age >= 1 && age <= 12) {
            System.out.println("Your birth month is " + age);


        }else {
            System.out.println("You entered an incorrect month " + age);
        }
    }

}
