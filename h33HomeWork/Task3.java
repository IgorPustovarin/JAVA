// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package h33HomeWork;

import java.util.ArrayList;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arList = new ArrayList<>(Arrays.asList(1, 1, 1, 9, 1, 1, 1, 1));
        arList.sort(null);
        System.out.println(arList);
        Integer min = arList.get(0);
        Integer max = arList.get(arList.size()-1);
        int sum = arList.stream().mapToInt(Integer::intValue).sum();
        int size = arList.size();
        System.out.println("Среднее арифметическое " + sum/size);
        System.out.println("Минимум " + min);
        System.out.println("Максимум " + max);
    }
}
