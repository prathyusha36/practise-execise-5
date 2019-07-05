package main.java.com.stackroute.pe5;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
    Question number 2
    Write a program to find the number of counts in the following  String

 */

public class NumberOfCounts {
    public static Map<String, Integer> numberOfCounts(String inputString) {
        Map<String, Integer> stringIntegerMap = new TreeMap<>();
        Pattern pattern = Pattern.compile("one|two|three");
        Matcher matcher = pattern.matcher(inputString);
        while(matcher.find()) {
            String foundWord = matcher.group();
            if(!stringIntegerMap.containsKey(foundWord)) {
                stringIntegerMap.put(foundWord, 1);
            }
            else {
                stringIntegerMap.put(foundWord, stringIntegerMap.get(foundWord)+1);
            }
        }
        return stringIntegerMap;
    }
}
