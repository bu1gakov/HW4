// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.lang.Math;

public class JavaHomework4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(getRandomNumber());
        }
        System.out.println(list);

        for (int i = 0; i < 10; i++) {
            System.out.print(list.getLast() + " ");
            list.removeLast();
        }
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 13);
        int x1 = (int) x;
        return x1;
    }
}