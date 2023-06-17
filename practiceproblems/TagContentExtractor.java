
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TagContentExtractor {
    public static void main (String[] args){
        
        BufferedReader reader;
        String validHTMLregex = "(<[a-zA-Z][^>]*>)([^<>]+)(</[a-zA-Z][^>]*>)";
        
        try {
        
            reader = new BufferedReader(new FileReader("./tests/test.txt"));
            int testCases = Integer.parseInt(reader.readLine());
            ArrayList<String> finalOutput = new ArrayList<>();
            while(testCases>0){
                String line = reader.readLine();
                ArrayList<String> parsedLine = parseValidHTML(validHTMLregex, line);
                finalOutput.addAll(parsedLine);
                testCases--;
            }
            
            printArrayList(finalOutput);
        
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    public static ArrayList<String> parseValidHTML(String regex, String line) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);
        ArrayList<String> parsedLine = new ArrayList<>();
        if(matcher.find()){
            matcher.reset();
            while (matcher.find()) {
                String startTag = matcher.group(1);
                String endTag = matcher.group(3);
                if (matchStartAndEndTags(startTag, endTag)) {
                    parsedLine.add(matcher.group(2));
                } else {
                    parsedLine.add("None");
                }
            }
        } else {
            parsedLine.add("None");
        }
        return parsedLine;
    }

    public static boolean matchStartAndEndTags(String startTag, String endTag) {
        if (startTag.substring(1).endsWith((endTag.substring(2)))) {
            return true;
        }
        return false;
    }

    public static void printArrayList(ArrayList<String> output) {
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
}
