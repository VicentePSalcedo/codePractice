import java.util.InputMismatchException;
import java.util.Scanner;

public class IntToString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            String output = Integer.toString(input);
            System.out.println(output);
            System.out.println("Good job");
            sc.close();
        } catch (InputMismatchException e){
            System.out.println("Wrong answer");
        }
    }
}
