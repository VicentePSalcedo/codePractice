
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
            printToFile(finalOutput);
            
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    public static ArrayList<String> parseValidHTML(String regex, String line) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);
        ArrayList<String> parsedLine = new ArrayList<>();
        int numberOfMatches = 0;

        //Checks to see if there is anything that matche the HTML format for text inside of tags, if not we return None
        if (!matcher.find()) {
            parsedLine.add("None");
            return parsedLine;
        }

        //Checks to see if any HTML text that is found has matching start and end tags and records how many matches there are
        matcher.reset();
        while (matcher.find()) {
            String startTag = matcher.group(1);
            String endTag = matcher.group(3);
            if (matchStartAndEndTags(startTag, endTag)){
                numberOfMatches++;
            }
        }

        // If there is no valid HTML with matching start and end tags we return None
        if (numberOfMatches == 0){
            parsedLine.add("None");
            return parsedLine;
        }

        //If there are any matches left at this point we know they are valid and can add them to the parsed line
        
        matcher.reset();
        while (matcher.find()) {
            String startTag = matcher.group(1);
            String endTag = matcher.group(3);
            if (matchStartAndEndTags(startTag, endTag)) {
                parsedLine.add(matcher.group(2));
            } 
        }
        return parsedLine;
    }

    public static boolean matchStartAndEndTags(String startTag, String endTag) {
        if (startTag.substring(1).equals((endTag.substring(2)))) {
            return true;
        }
        return false;
    }

    public static void printArrayList(ArrayList<String> output) {
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }

    public static void printToFile(ArrayList<String> output){
        try {
            File outputFile = new File("testOutput.txt");
            outputFile.createNewFile();
        } catch (IOException e){
            System.out.println("An error occurred while making testOutput.txt");
            e.printStackTrace();
        }

        try{
            FileWriter writer = new FileWriter("testOutput.txt");
            for (int i = 0; i < output.size(); i++){
                writer.write(output.get(i) + "\n");
            }
            writer.close();
        } catch (IOException e){
            System.out.println("An error occured while writing to file");
            e.printStackTrace();
        }
    }
}
