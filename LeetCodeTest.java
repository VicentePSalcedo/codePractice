import leetcode.*;
public class LeetCodeTest {
    public static void main(String[] args){
        IncreasingTripletSubsequenceTest();
        System.out.println("Everything else if working as intended.");
    }

    public static void IncreasingTripletSubsequenceTest(){
        int[] increasingTripletTest1 = new int[]{1,2,3,4,5};
        int[] increasingTripletTest2 = new int[]{5,4,3,2,1};
        int[] increasingTripletTest3 = new int[]{2,1,5,0,4,6};
        if (IncreasingTripletSubsequence.increasingTriplet(increasingTripletTest1) != true) {
            System.out.println("Test 1 for IncreasingTripletSubsequence failed.");
        }
        if (IncreasingTripletSubsequence.increasingTriplet(increasingTripletTest2) != false) {
            System.out.println("Test 2 for IncreasingTripletSubsequence failed.");
        }
        if (IncreasingTripletSubsequence.increasingTriplet(increasingTripletTest3) != true) {
            System.out.println("Test 3 for IncreasingTripletSubsequence failed.");
        }
    }
}
