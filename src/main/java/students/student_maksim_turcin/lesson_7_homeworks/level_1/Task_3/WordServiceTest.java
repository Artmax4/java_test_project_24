package main.java.students.student_maksim_turcin.lesson_7_homeworks.level_1.Task_3;

public class WordServiceTest {

    public static void main(String[] args) {
      WordServiceTest searchWordTest = new WordServiceTest();
        searchWordTest.positiveSearchResult();
        searchWordTest.negativeSearchResult();
    }

    void positiveSearchResult() {
       WordService searchTest = new WordService();
        String stringToTest = "Promiscuous girl\n" +
                "Wherever you are\n" +
                "I’m all alone\n" +
                "And it's you that I want\n";
        String result = searchTest.findMostFrequentWord(stringToTest);

        if (result.equals(" ")) {
            System.out.println("Test not working ");
        } else {
            System.out.println("Test is ok. Most popular word is: " + result);
        }
    }

    void negativeSearchResult() {
       WordService searchTest = new WordService();
        String stringToTest = "I want to thank you for giving me the best day of my life\n" +
                "Oh just to be with you is having the best day of my life";
        String result = searchTest.findMostFrequentWord(stringToTest);

        if (result.equals(" ")) {
            System.out.println("Test not working");
        } else {
            System.out.println("Test is ok: " + result);
        }
    }
}




