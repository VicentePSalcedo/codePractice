import java.io.*;
import java.util.*;

public class InttoString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            String output = Integer.toString(input);
            System.out.println("Good job");
        } catch (InputMismatchException e){
            System.out.println("Wrong answer");
        }
    }
}
