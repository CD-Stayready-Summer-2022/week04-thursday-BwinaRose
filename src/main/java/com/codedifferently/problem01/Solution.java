package com.codedifferently.problem01;

import java.util.*;

public class Solution {

    //sort arr with tree set
    //iterate through set
    //check tree set has next number and its consecutive
    //append to string builder
    //compare longest to current (if the longest count is less
    //      than current, our current is new longest)
    //return string
    public String findLongestConsecutiveSet(Integer[] allNumbers){
        Set<Integer> sortSet = new TreeSet<>(List.of(allNumbers));
        int countLongest = 0;
        String tempLongest = "";
        for(int n : sortSet){
                int currentNum = n;
                int consecutiveNums = 1;
                StringBuilder tempStr = new StringBuilder(String.valueOf(currentNum));
                while(sortSet.contains(currentNum+1)){
                    currentNum+=1;
                    tempStr.append(" ").append(currentNum);
                    consecutiveNums +=1;
                }
                if(countLongest < consecutiveNums){
                    countLongest = consecutiveNums;
                    tempLongest = tempStr.toString();
                }
            }
        return "Longest Set: {" + tempLongest+"}";
    }
}
