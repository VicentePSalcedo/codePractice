//import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
//    The code below determines if the string are palindromes by sorting but that isn't allowed in the challenge
//    problem.

//    static boolean isAnagram(String a, String b){
//        int n1 = a.length();
//        int n2 = b.length();
//        if (n1 != n2) return false;
//        char[] aArray = a.toCharArray();
//        Arrays.sort(aArray);
//        char[] bArray = b.toCharArray();
//        Arrays.sort(bArray);
//        for(int i = 0; i < n1; i++){
//            if(aArray[i] != bArray[i]){
//                return false;
//            }
//        }
//        return true;
//    }

//    This code is what I ended up using instead, it's way less memory efficient if you try to use something like UTF-8.

    static boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        int[] count = new int[256];
        a = a.toLowerCase();
        b = b.toLowerCase();
        for(int i = 0; i < a.length(); i++){
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }
        for(int i = 0; i < 256; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams");
    }
}
