import java.io.*;

public class Loops1 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        for(int i=0; i<10 ;i++){
            System.out.printf("%d x %d",N,i);
        }
    }
}
