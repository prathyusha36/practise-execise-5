package main.java.com.stackroute.pe5;

import java.util.Iterator;
import java.util.Map;

public class ModifyKeyValues {
    //Program to replace

        public Map<String, String> modifyKeyValuesOfMap(Map<String, String> mapList) {
            Iterator iterator = mapList.entrySet().iterator();
            if (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                String word = " ";

                if (!mapList.get("val1").equals(" ")) {
                    word = (String) entry.getValue();
                    mapList.put("val1", " ");
                }
                Map.Entry presentEntry = (Map.Entry) iterator.next();
                if (word != null)
                    presentEntry.setValue(word);

            }
            return mapList;
        }
    }

