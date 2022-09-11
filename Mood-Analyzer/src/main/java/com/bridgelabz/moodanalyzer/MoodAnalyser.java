package com.bridgelabz.moodanalyzer;

public class MoodAnalyser {
    public String message;

    public MoodAnalyser(String message){
        this.message = message;
        analyzeMood();
    }

    public String analyzeMood() {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";



    }


}