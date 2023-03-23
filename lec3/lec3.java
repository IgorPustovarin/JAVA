// Колллекции функционал

// add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
// get(pos) – возвращает элемент из списка по указанной позиции
// indexOf(item) – первое вхождение или -1
// lastIndexOf(item) – последнее вхождение или -1
// remove(pos) – удаление элемента на указанной позиции и его возвращение
// set(int pos, T item) – gjvtoftn значение item элементу, который находится
// на позиции pos
// void sort(Comparator) – сортирует набор данных по правилу
// subList(int start, int end) – получение набора данных от позиции start до end

// clear() – очистка списка
// toString() – «конвертация» списка в строку
// Arrays.asList – преобразует массив в список
// containsAll(col) – проверяет включение всех элементов из col
// removeAll(col) – удаляет элементы, имеющиеся в col
// retainAll(col) – оставляет элементы, имеющиеся в col
// toArray() – конвертация списка в массив Object’ов
// toArray(type array) – конвертация списка в массив type
// List.copyOf(col) – возвращает копию списка на основе имеющегося
// List.of(item1, item2,...) – возвращает неизменяемый список
// "Удобный массив"
// Разные способы создания

// ArrayList<Integer> list1 = new ArrayList<Integer>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>(10);
// ArrayList<Integer> list4 = new ArrayList<>(list3);

package lec3;
// import java.util.ArrayList;
import java.util.List;
import java.util.*;
// public class lec3 {
//     public static void main(String[] args) {
//         // ArrayList<Integer> list = new ArrayList<Integer>();
//         ArrayList list = new ArrayList();
//         list.add(2809);
//         list.add("1234");

//         for (Object o : list) {
//             System.out.println(o);
//         }
//     }
    
// }


// public class lec3 {

//     public static void main(String[] args) {
//         List<Integer> list = new ArrayList<Integer>();
//         list.add(1);
//         list.add(123);
//         //list.add("string line"); Этот механим добавления строк будет не возможен на этапе компиляции, объявлен тип INTEGER
//         for (Object o : list) {
//             System.out.println(o);
//             //Проблема извлечения данных
//         }
//     }
// }


// public class lec3 {
//     public static void main(String[] args) {
//         int day = 29;
//         int month = 9;
//         int year = 1990;
//         Integer[] date = {day, month, year};
//         List<Integer> d = Arrays.asList(date);
//         System.out.println(d); // [29, 9, 1990]
//     }
    
// }
/**
 * lec3
 */
// public class lec3 {

//     public static void main(String[] args) {
//         StringBuilder day = new StringBuilder("28");
//         StringBuilder month = new StringBuilder("9");
//         StringBuilder year = new StringBuilder("1990");
//         StringBuilder[] date = new StringBuilder[]{day, month, year};
//         List<StringBuilder> d = Arrays.asList(date);
//         System.out.println(d); // [29, 9, 1990]
//         date[1] = new StringBuilder("09");
//         System.out.println(d);//[29, 09, 1990]
//     }
// }
/**
 * lec3
 */
// public class lec3 {

//     public static void main(String[] args) {
//         Character value = null;
//         // List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
//         List<Character> list1 = new ArrayList<Character>();
//         list1.add('S');
//         list1.add('e');
//         list1.add('r');
//         System.out.println(list1);
//         list1.remove(1); // РЕМУВ удаляет элемент java.lang.UnsupportedOperationException
//         System.out.println(list1);
//         List<Character> list2 = List.copyOf(list1);
//     }
// }
/**
 * lec3
 */
public class lec3 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }
        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            System.err.println(col.next());
            // col.next(); //В коллекциях нельзя удалять
            // col.remove(); //Если раскомитить эти строки, то будет ошибка
        }
    }
}