package com.bridgelabz.moodanalyzer;

public class MoodAnalyserMain {

    public static void main(String[] args) {
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        System.out.println(moodAnalyzer.analyzeMood("iam in sad mood"));
        System.out.println(moodAnalyzer.analyzeMood("iam in a happy mood"));
    }
}
