// Вывести все простые числа от 1 до 1000

package h11HomeWork;

public class TaskTwo {
    public static void main(String[] args) {
        int number = 1000;
        int count = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
                
            }
            if (count == 2){
                System.out.print(" " + i + " ");
            }            
            count = 0;
        }
    }
    
}
