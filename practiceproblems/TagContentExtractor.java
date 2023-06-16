import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor {
    public static void main (String[] args){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("./tests/TagContentExtractor.txt"));
            int testCases = Integer.parseInt(reader.readLine());
            ArrayList<String> currentStringArray = new ArrayList<>();
            while(testCases>0){
                String line = reader.readLine();
                String parsedLine = validateAndRemoveHTMLTags(line);
                currentStringArray.add(parsedLine);
                testCases--;
            }
            printArrayList(currentStringArray);
        } catch (IOException e) {
            e.printStackTrace(); 
        }
        // Scanner in = new Scanner (System.in);
        // int testCases = Integer.parseInt(in.nextLine());
        // ArrayList<String> currentStringArray = new ArrayList<>();

        // while(testCases>0) {
        //     String line = in.nextLine();
        //     String parsedLine = validateAndRemoveHTMLTags(line);
        //     currentStringArray.add(parsedLine);
        //     testCases--;
        // }

        // printArrayList(currentStringArray);
        // in.close();
    }

    public static String validateAndRemoveHTMLTags(String line){
        Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\\\1>");
        Matcher matcher = pattern.matcher(line);
        String parsedLine;
        if(matcher.find()){
            parsedLine = matcher.group(2);
        } else {
            parsedLine = "None";
        }
        return parsedLine;
    }
    
    public static void printArrayList(ArrayList<String> currentStringArray){
        for (int i = 0; i < currentStringArray.size(); i++){
            System.out.println(currentStringArray.get(i));
        }

    }
}
