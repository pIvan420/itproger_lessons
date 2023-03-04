package com.pivan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class FreqDist {

    static void buildDistWithMap(String str){

        str = str.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'а' && ch <= 'я' || ch == 'ё'){
                map.compute(ch, ((character, integer) -> integer == null ? 1 : integer + 1));
            }
        }
        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
        for(Map.Entry<Character, Integer> entry : entries){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
