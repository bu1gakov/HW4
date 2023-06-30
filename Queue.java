// Реализуйте очередь с помощью LinkedList:

// Enqueue: Вставляет элемент в конец queue.
// Dequeue: Удаляет объект из начала queue и возвращает его, тем самым уменьшая размер queue на единицу.
// Peek: Возвращает объект в начале queue, не удаляя его.
// IsEmpty: Проверяет, пуста queue или нет.
// Size: Возвращает общее количество элементов, присутствующих в queue.

import java.util.LinkedList;

public class Queue {


        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i <= 3; i++) {
                // Заполнение случайными числами:
                enqueue(list, getRandomNumber());
            }
            System.out.println(list);
            // Удаление первого элемента:
            System.out.println(dequeue(list));
            System.out.println(list);
// Вывод первого элемента:

            System.out.println(first(list));
            System.out.println(list);
        }
// Переводим элемент в конец очереди:
        public static void enqueue(LinkedList<Integer> list, int num) {
            list.addLast(num);
        }
// Перебор и удаление первого:
        public static int dequeue(LinkedList<Integer> list) {
            int num = list.get(0);
            list.remove(0);
            return num;
        }
// Возврат первого элемента:
        public static int first(LinkedList<Integer> ll) {
            int num = ll.get(0);
            return num;
        }
// Генерация рандомной переменной:
        public static int getRandomNumber() {
            double x = (Math.random() * 99);
            int num = (int) x;
            return num;
        }
    }