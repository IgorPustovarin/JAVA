// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

package h55HomeWork;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        Scanner myData = new Scanner(System.in);
        String menuItem;
        String nameUser;//Имя юзера будет ключом
        String phoneUser;//Номер телефона юзера, номер попробую с помощью конкатинации строк добавлять по ключу
        Map<String, String> phoneBook = new HashMap<>();
        int keyMenu = 0;
        
        while (true) {
            if (keyMenu == 0){
                System.out.println("Выберете цифру из меню:\n 1. Добавить контакт. \n 2. Вывести на печать все контакты\n 3. Выход из программы");
                menuItem = myData.next();
                keyMenu = Integer.parseInt(menuItem);
                System.out.println("Ты выбрал пункт " + keyMenu);
            }
            if (keyMenu == 3){
                System.out.println("Выход из программы ");
                break;
            }
            if (keyMenu == 1){
                System.out.println("Добавим контакт товарищ, введи фамилию ");
                nameUser = myData.next();
                System.out.println("Друг введи номер телефона ");
                phoneUser = myData.next();
                // containsKey(V) putIfAbsent(K,V)
                if (phoneBook.containsKey(nameUser)){//Проверяю наличие ключа в Хэше, если он есть делаю конкатинацию значения телефона
                    phoneUser = phoneBook.get(nameUser) + ", " + phoneUser;//Здесь гетом получаю значение по ключу и конкатинирую значение телефона
                    phoneBook.put(nameUser, phoneUser);

                }
                else{////////////////////////////////////В общем ЗАРАБОТАЛО!!!!!!!!!!! ПУСТОВАРИН МОЛОДЕЦ))))))))))))))))))))
                phoneBook.put(nameUser, phoneUser);
                }
                
            }
            if (keyMenu == 2){
                for (var item : phoneBook.entrySet()) {
                    System.out.printf("[%s: %s]\n", item.getKey(), item.getValue());
                    
                }
            }
            else{
                System.out.println("Введи корректный пункт меню пожалуйста ");
            }
        keyMenu = 0;
        }

    myData.close();
    }
    
}
