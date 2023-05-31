import java.util.Scanner;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k){
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        int i = 0;
        while(k <= s.length()) {
            String sub = s.substring(i, k);
            if (sub.compareTo(smallest) < 0) {
                smallest = sub;
            }
            if (sub.compareTo(largest) > 0) {
                largest = sub;
            }
            i++;
            k++;
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
