//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class task1 {

    // Метод заполнения списка LinkedList случайными числами
    public static LinkedList<Integer> getRandom(int len, int min, int max) {
        Random rd = new Random(); // Заводим генератор случайных чисел
        LinkedList<Integer> llst = new LinkedList<Integer>(); // Создаем список и заполняем случ-ми чслами
        for (int i = 0; i < len; i++) {
            llst.add(i, rd.nextInt(max - min) + min);
        }
        return llst;
    }

    // Метод разворачивания имеющегося списка LinkedList
    public static LinkedList<Integer> reverseList(LinkedList<Integer> llst) {
        LinkedList<Integer> rev = new LinkedList<>();
        Iterator<Integer> it = llst.iterator(); // Создаем итератор для перебора начального списка
        while (it.hasNext()) { // Каждый следующий эл-т начального списка добавляем в начало нового списка
            rev.addFirst(it.next());
        }

        return rev;

    }

    // Код
    public static void main(String[] args) {
        LinkedList<Integer> randList = getRandom(5, 0, 100);
        System.out.println(randList);
        LinkedList<Integer> revList = reverseList(randList);
        System.out.println(revList);
    }

}