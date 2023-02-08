package main.java.students.student_maksim_turcin.lesson_7_homeworks.level_1.Task_3;

import java.util.Arrays;

public class WordService {
    public String findMostFrequentWord(String text) {
        String[] stringArray = getArrayFromString(text);
        return stringArrayToCheck(stringArray);
    }

    private String[] getArrayFromString(String text) {
        String[] wordArray = text.split(" ");
        Arrays.sort(wordArray);
        return wordArray;
    }

    private String stringArrayToCheck(String[] stringArray) {
        String maxWord = "";
        String word = "";
        int maxCount = 1;
        int count = 1;


        for (String wordElement : stringArray) {
            if (wordElement.equals(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = wordElement;
                count = 1;
            }
        }
        if (count > maxCount) {
            maxWord = word;
        }
        return maxWord;
    }

    public void showResult(String text) {

        System.out.println("Самое популярное слово: " + text);
    }
}
