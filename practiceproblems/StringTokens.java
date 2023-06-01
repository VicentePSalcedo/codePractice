import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(s.matches("[A-Za-z !,?._'@]+")){
            s = s.trim();
            String[] tokens = s.split("[ !,?._'@]+");
            if(!s.isEmpty()){
                System.out.println(tokens.length);
                for(String token : tokens){
                    System.out.println(token);
                }
            } else {
                System.out.println(0);
            }
        }
        scan.close();
    }
}