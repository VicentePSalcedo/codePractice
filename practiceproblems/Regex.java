import java.util.Scanner;

public class Regex {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            while(in.hasNext()){
                String IP = in.next();
                System.out.println(IP.matches(new MyRegex().pattern));
            }
        }
    }
}

class MyRegex{
//    So this works a little to well. If you use this it fails HackerRank's first test case because it does not permit
//    things like "000.12.12.034".
//    String pattern = "^(?:(?:25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}"
//            +"(?:25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])$";
    String pattern = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])(?:\\\\.(?!$)|$)){4}$";
}