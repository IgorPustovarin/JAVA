// Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.

package seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.*;

// import java.util.ArrayList;
// import java.util.Comparator;


// public class sem3 {
//     public static void main(String[] args) {
//         ArrayList<Integer> myList = new ArrayList<>();
//         for (int i = 0; i < 10; i++) {
//             myList.add((int) (Math.random() * 10)); 
//         }
//         System.out.println(myList);
//         // myList.sort(null);// так можно отсортировать
//         myList.sort(Comparator.naturalOrder()); //Второй вариант сортировки
//         System.out.println(myList);
//     }
    
// }

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

/**
 * sem3
 */
// public class sem3 {

//     public static void main(String[] args) {
//         ArrayList<String> planets = new ArrayList<>(Arrays.asList("Венера", "Юпитер", "Земля", "Марс", "Сатурн", "Юпитер", "Юпитер"));
//         planets.sort(Comparator.naturalOrder());
//         int count = 0;            
//         System.out.println(planets);
//         String planet = planets.get(0);
//         for (int i = 0; i < planets.size(); i++) {
//             if (planets.get(i).equals(planet)){
//                 count++;
//             }
//             else {
//                 System.out.println(planet + " " + count);
//                 count = 1;
//                 planet = planets.get(i);
//             }
            
//         }
//         System.out.println(planets.get(planets.size()-1)+ " " + count);
//     }
// }

// Создать список типа ArrayList.
// Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.

/**
 * sem3
 */
// public class sem3 {

//     public static void main(String[] args) {
//         ArrayList myList = new ArrayList<>(Arrays.asList("9", 5, 5, "gf", "dfh", 1));
//         for (int i = 0; i < myList.size(); i++) {
//             if (myList.get(i) instanceof Integer) {
//                 myList.remove(myList.get(i--));
//             } 
//         }
        
//         System.out.println(myList);
//     }
// }