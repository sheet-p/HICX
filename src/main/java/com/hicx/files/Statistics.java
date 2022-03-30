package com.hicx.files;

public class Statistics {
    public int calcWords(String contents) {
        //to store the number of words
        int numWords = 0;

        numWords = contents.split("//s*").length;
        return numWords;
    }

    public int calcDots(String contents) {
        //to store the number of words
        int numDots = 0;

        numDots = contents.split(".").length - 1;
        return numDots;
    }
}
