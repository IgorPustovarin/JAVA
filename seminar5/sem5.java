// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов       321456 Васильев     234561 Петрова      234432 Иванов       654321 Петрова  345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.
package seminar5;

import java.util.*;

public class sem5 {
    public static void main(String[] args) {
        Map<Integer, String> pasportData = new HashMap<>(); 
        pasportData.put(123456, "Иванов");
        pasportData.put(321456, "Васильев");
        pasportData.put(234561, "Петрова");
        pasportData.put(234432, "Иванов");
        pasportData.put(654321, "Петрова");
        pasportData.put(345678, "Иванов");
        for (var number : pasportData.entrySet()) {
            if (number.getValue().equals("Иванов")){// .equals Сверяет строковые значения
                System.out.printf("%d - %s\n", number.getKey(), number.getValue());// В намбере хранится не большой кортеж, достаём 
            }//                                             Методами ГетВэлью и ГетКей
        }
    }
}
