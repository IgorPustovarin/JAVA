// Пусть дан список сотрудников:
// Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков Павел Чернов
// Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна Владимирова
// Иван Мечников Петр Петин Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

package h55HomeWork;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        String temp;
        ArrayList<String> planets = new ArrayList<>(Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Иван Юрин", "Петр Лыко", "Павел Чернов", "Светлана Чернова"));
        planets.sort(Comparator.naturalOrder());
        int count = 0;            
        System.out.println(planets);
        for (int i = 0; i < planets.size(); i++) {
            temp = planets.get(i);
            String[] words = temp.split(" ");
            for (int j = 0; j < words.length; j = j+2){
                result.add(words[j]);
                System.out.println(result);                     
        }
    }
        String name = result.get(0);
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).equals(name)){
                count++;
            }
            else {
                System.out.println(name + " " + count);
                count = 1;
                name = result.get(i);
            }            
        }
        System.out.println(result.get(result.size()-1)+ " " + count);
    }
}