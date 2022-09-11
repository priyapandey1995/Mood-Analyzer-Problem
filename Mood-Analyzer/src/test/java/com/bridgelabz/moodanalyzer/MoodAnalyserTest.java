package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

    @Test
    public void MessageWithSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("Iam in sad mood");
        String result = moodAnalyser.analyzeMood();
        Assertions.assertEquals("SAD", result);
    }






}