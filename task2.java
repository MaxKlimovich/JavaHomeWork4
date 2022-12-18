//  2.Реализуйте очередь с помощью LinkedList со следующими методами:
//- enqueue() - помещает элемент в конец очереди,
//- dequeue() - возвращает первый элемент из очереди и удаляет его,
//- first() - возвращает первый элемент из очереди, не удаляя.

import java.util.*;

public class task2 {
    // Метод заполнения списка LinkedList случайными числами
    public static LinkedList<Object> getRandom(int len, int min, int max) {
        Random rd = new Random(); // Заводим генератор случайных чисел
        LinkedList<Object> numbers = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            numbers.addLast(rd.nextInt(max - min) + min); // добавляем в конец списка очередное случ число i раз
        }
        return numbers;
    }

    // Метод enqueue() помещает элемент в конец очереди
    public static void enqueue(LinkedList<Object> inList) {
        System.out.print("Введите элемент: ");
        Scanner enqScanner = new Scanner(System.in);
        Object element = enqScanner.nextLine();
        inList.addLast(element);
        System.out.printf(String.valueOf(inList));

    }

    // Метод dequeue() возвращает первый элемент из очереди и удаляет его
    public static void dequeue(LinkedList<Object> inList) {
        if (inList.size() >= 1) {
            Object firstEl = inList.pollFirst();
            System.out.printf("Первый элемент: " + firstEl + " удален");
        } else {
            System.out.print("В списке нет элементов");
        }
    }

    // Метод first() возвращает первый элемент из очереди, не удаляя.
    public static void first(LinkedList<Object> inList) {
        Object firstEl = inList.peekFirst();
        System.out.printf("Первый элемент элемент: " + firstEl);
    }

    public static void main(String[] args) {
        LinkedList<Object> list = getRandom(2, 0, 100);
        String choose;
        Scanner iScanner;
        do {
            System.out.printf("\nИсходный список: " + list);
            System.out.printf("\nВыберите метод для работы со списком" +
                    "\n1 - добавить элемент в конец очереди" +
                    "\n2 - отобразить первый элемент и удалить его" +
                    "\n3 - отобразить первый элемент" +
                    "\nq - ВЫХОД\n");
            iScanner = new Scanner(System.in);
            choose = iScanner.nextLine();

            if (Objects.equals(choose, "1"))
                enqueue(list);
            if (Objects.equals(choose, "2"))
                dequeue(list);
            if (Objects.equals(choose, "3"))
                first(list);

        } while (!Objects.equals(choose, "q"));
        System.out.printf("До свидания!");
        iScanner.close();
    }
}
