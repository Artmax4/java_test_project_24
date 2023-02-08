package students.student_maksim_turcin.lesson_10_homeworks.level_1.task_3;

public interface MyList {



    //добавленние элемента в начало массива
    int[] addElement(int[] aArray, int element);

    //добавленние элемента в конец массива
    int[] addElementEnd(int[] aArray, int element);

    //добавленние элемента в массив и индекс
    boolean addNum (int[] aArray, int index, int element);

    //поиск элемента по индексу
    int [] insertAtIndex(int[] aArray, int index, int element);

     //удаленние элемента по индексу
    boolean delete(int[] aArray, int index);  //добавил массив как параметр.

}
