import java.util.Scanner;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k){
        String sub = s.substring(0, k);
        String smallest = sub;
        String largest = sub;
        while(k < s.length()){
            if (sub.compareTo(smallest)<0){
                smallest = sub;
            }
            if (sub.compareTo(largest)>0){
                largest = sub;
            }
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
