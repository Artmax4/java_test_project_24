package students.student_maksim_turcin.lesson_11_homeworks.level_1;

import java.util.List;
import java.util.ArrayList;

public class IntegerListDemo {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);

        integerList.add(0, 15); //добавить в список элемент (в начало)
        integerList.add(45); //добавил в конец
        System.out.println("size of list");
        System.out.println(integerList.size()); //узнать длину списка

        integerList.remove(5); //удалить элемент из списка (по индексу)
        integerList.remove((Integer) 6); //удалить без индекса

        System.out.println("is list empty?");
        System.out.println(integerList.isEmpty());    //узнать пустой список или нет

        for (Integer num : integerList) {  //обойти список и вывести на консоль каждый элемент
            System.out.println(num);
        }
    }
}
