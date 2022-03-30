package com.hicx.files;

import java.util.HashMap;
import java.util.Map;

public class Statistics {
    public static int calcWords(String contents) {
        //to store the number of words
        int numWords = 0;

        numWords = contents.split(" ").length;
        return numWords;
    }

    public static int calcDots(String contents) {
        //to store the number of words
        int numDots = 0;

        numDots = contents.split(".").length - 1;
        return numDots;
    }

    public static String mostUsedWord(String contents) {
        //frequency table
        Map<String, Integer> freq = new HashMap<>();

        //split based on words
        String[] words = contents.split(" ");

        for(String word : words)
            freq.put(word, freq.getOrDefault(word, 0)+1);

        //find the maximum word count
        int wordCount = Integer.MIN_VALUE;
        String maxWord = "";
        for(Map.Entry<String,Integer> dict : freq.entrySet()) {
            if(dict.getValue() > wordCount) {
                wordCount = dict.getValue();
                maxWord = dict.getKey();
            }
        }

        return maxWord;
    }
}
