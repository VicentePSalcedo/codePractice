import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            while(testCases>0){
                String pattern = in.nextLine();
                try {
                    Pattern regex = Pattern.compile(pattern);
                    System.out.println(regex);
                    System.out.println("Valid");
                } catch (PatternSyntaxException e){
                    System.out.println("Invalid");
                }
                testCases--;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
