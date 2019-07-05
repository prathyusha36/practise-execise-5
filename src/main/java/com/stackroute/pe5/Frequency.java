package main.java.com.stackroute.pe5;

/*
    Question number 3
     a program where an array of strings is input and output is a Map< String ,boolean> whereeach different
     string  is a key and its value is true if that  string  appears 2 or more times in the array

 */

import java.util.HashMap;
import java.util.Map;

public class Frequency {

        public Map<String,Boolean> frequencyOfString(String[] input)
        {

            Map<String,Boolean> mp=new HashMap<String, Boolean>();
            for(int i=0;i<input.length;i++)
            {
                if(mp.containsKey(input[i])){
                    mp.put(input[i], true);
                } else {
                    mp.put(input[i], false);
                }

            }
            return mp;


        }

    }

