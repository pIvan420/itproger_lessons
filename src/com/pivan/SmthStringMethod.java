package com.pivan;

public class SmthStringMethod {

    public static String findLongString(String[] arr){
        String curString = null;
        for(String str: arr){
            if(curString == null) curString = str;
            else{
                if(curString.length() < str.length()){
                    curString = str;
                }
            }
        }
        return curString;
    }

    public static boolean isPalindrome(String str){
        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equals(reverseStr);
    }

    public static String replaceSubstring(String str){
        String delSubstring = "бяка";
        String newSubstring = "[вырезано цензурой]";
        while (str.contains(delSubstring)){
            int index = str.indexOf(delSubstring);
            str = new StringBuilder(str).delete(index, index + delSubstring.length()).toString();
            str = new StringBuilder(str).insert(index, newSubstring).toString();
        }
        return str;
    }

    public static int getSubstring(String str, String subStr){
        int count = 0;
        int index = 0;
        if (subStr.length() == 0) return count;
        while (true){
            if(str.contains(subStr)){
                count++;
                index = str.indexOf(subStr);
                str = new StringBuilder(str).delete(index, index + 1).toString();
            }
            else break;

        }
        return count;
    }
}
