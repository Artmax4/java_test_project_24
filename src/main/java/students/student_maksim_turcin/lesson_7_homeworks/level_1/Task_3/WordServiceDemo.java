package main.java.students.student_maksim_turcin.lesson_7_homeworks.level_1.Task_3;

public class WordServiceDemo {
    public static void main(String[] args) {                  // Метод для нахождения повторяющегося слова
        WordService mostFrequentWord = new WordService();     // Обращение к классу WordService за помощью
        String textToSort = "Подсказка: если вы не можете придумать как разбить эту задачу\n" +
                "на подзадачи, пожалуйста попросите помощи! Умение попросить помощи,\n" +
                "когда это нужно очень цениться в ИТ. Представьте, что вы работаете\n" +
                "в реальном проекте и не можете решить поставленную перед вами\n" +
                "задачу. Если вы не решите поставленную перед вами задачу в срок,\n" +
                "то подведёте всю команду в которой работаете. Что вы будете делать?\n" +    //  \n переводит на новую строку
                "Попросите о помощи своих коллег или будете упорно пытаться\n" +
                "решить задачу самостоятельно? ";                                            // String текст для сортировки

        String result = mostFrequentWord.findMostFrequentWord(textToSort);
        mostFrequentWord.showResult(result);
    }
}
