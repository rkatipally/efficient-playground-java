package org.raj.cci.c1;

import java.util.HashMap;

public class CheckPermutation {

    public static boolean checkPermutation(String str1, String str2){
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for(int i=0; i<str1.length(); i++){
            int count = charCountMap.get(str1.charAt(i)) == null? 0 : charCountMap.get(str1.charAt(i));
            charCountMap.put(str1.charAt(i), count+1);
        }

        for (int i=0; i < str2.length() ; i++){
            int count = charCountMap.get(str2.charAt(i));
            count = count-1;
            if(count < 0) return false;
            charCountMap.put(str2.charAt(i), count);
            if(count == 0) charCountMap.remove(str2.charAt(i));
        }
        return charCountMap.size() == 0;
    }
}
