// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package h44HomeWork;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class task2 {
    // public static void main(String[] args) {
        // Queue<Integer> queue = new LinkedList<Integer>();
        // for (int i = 0; i < 5; i++) {
        //     queue.add(i+1);
        //     System.out.println(queue);            
        // }
        // int item = queue.remove();
        // System.out.println(item);
        // System.out.println(queue);
        // deque.pollFirst(); 
        // Deque<Integer> deque = new ArrayDeque<>();
        // for (int i = 0; i < 5; i++) {
        //     deque.addFirst(i);
        //     System.out.println(deque);                   
        // }
        // item = deque.pollFirst();
        // System.out.println(item); 
        // System.out.println(deque);
        public static void main(String[] args) {
            LinkedList<Integer> ll = new LinkedList<>();
            for (int i = 0; i < 5; i++) {
                enqueue(ll, getRandomNumber()); //заполняем случайными числами
                System.out.println(ll);
            }
            
    
            System.out.println(dequeue(ll)); // удалили первый элемент
            System.out.println(ll);
    
            System.out.println(first(ll)); // вывели первый элемент
            System.out.println(ll); 
        }
    
        public static void enqueue(LinkedList<Integer> ll, int num) {// помещает элемент в конец очереди
            ll.addLast(num);
        }
    
        public static int dequeue(LinkedList<Integer> ll) { // возвращает первый элемент из очереди и удаляет его
            int num = ll.get(0);
            ll.remove(0);
            return num;
        }
    
        public static int first(LinkedList<Integer> ll) { // возвращает первый элемент из очереди, не удаляя
            int num = ll.get(0);
            return num;
        }
    
        public static int getRandomNumber() { // генерирует случайное число
            double x = (Math.random() * 99);
            int num = (int) x;
            return num;
        }

    }
    
    
// }
