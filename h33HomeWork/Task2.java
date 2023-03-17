// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package h33HomeWork;
import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arList = new ArrayList<>(Arrays.asList(1, 2, 1, 9, 1, 4, 1, 6));
        System.out.println(arList);
        for (int i = arList.size()-1; i >= 0; i--) {
            if (arList.get(i)%2 == 0){
                arList.remove(arList.get(i));
            }                
        }
        System.out.println(arList);  
    }
    
}
