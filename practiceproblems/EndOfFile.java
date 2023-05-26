import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineCounter = 1;
        while(sc.hasNextLine()){
            String currentLine = sc.nextLine();
            System.out.println(lineCounter + " " + currentLine);
            lineCounter++;
        }
        sc.close();
    }
}

