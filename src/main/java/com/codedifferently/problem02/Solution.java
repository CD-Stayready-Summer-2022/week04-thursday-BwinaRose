package com.codedifferently.problem02;

import java.util.*;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        char[] strArr = input.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        for (char character : strArr) {
            if (charCount.containsKey(character)) {
                charCount.put(character, charCount.get(character) + 1);
            }
            else {
                charCount.put(character, 1);
            }
        }
        for (Map.Entry entry : charCount.entrySet()) {
            builder.append(entry.getKey() + ":" + entry.getValue()+ " ");
        }
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }
}
