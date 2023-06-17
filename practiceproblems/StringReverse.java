import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String original = sc.next();
            StringBuilder reversed = new StringBuilder();
            for (int i = 0; i < original.length(); i++) {
                reversed.insert(0, original.charAt(i));
            }
            if(original.compareTo(String.valueOf(reversed)) == 0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
