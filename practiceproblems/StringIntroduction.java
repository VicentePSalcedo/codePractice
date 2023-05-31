import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int sumOfAB = a.length() + b.length();
        System.out.println(sumOfAB);
        if(a.compareTo(b) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        a = capitalize(a);
        b = capitalize(b);
        System.out.println(a + " " + b);
    }

    public static String capitalize(String str){
        if(str == null || str.length()<=1) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}