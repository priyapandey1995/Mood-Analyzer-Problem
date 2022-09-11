package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

    @Test
    public void MessageWithSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("Null");
        String result = moodAnalyser.analyzeMood();
        Assertions.assertEquals("HAPPY", result);

    }

//    @Test
//    public void WithAnyHappy_ShouldReturnHappy() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser("Iam in happy mood");
//        String result = moodAnalyser.analyzeMood();
//        Assertions.assertEquals("HAPPY", result);
//    }

}