package main.java.students.student_maksim_turcin.lesson_7_homeworks.level_1.Task_1;


import java.util.Arrays;

public class WordService {                                     // класс сортировки
    public String findMostFrequentWord(String text) {          // метод сортировки
        String maxWord = "";
        String word = "";
        int maxCount = 1;
        int count = 1;
        String[] wordArray = text.split(" ");
        Arrays.sort(wordArray);

        for (String wordElement : wordArray) {                 // цикл
            if (wordElement.equals(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = wordElement;
                count = 1;                         // Я не понимаю почему здесь единица а не любая цифра? например 0
            }
        }
        if (count > maxCount) {
            maxWord = word;
        }
        return maxWord;
    }

    public void showResult(String text) {
        System.out.println("Самое популярное слово: " + text);           // метод для вывода текста из mostFrequentWord.showResult(result);
    }
}