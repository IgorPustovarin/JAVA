// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ / 2 - Объем ЖД /3 - Операционная система / 4 - Цвет
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// Класс сделать в отдельном файле
// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

package h66HomeWork;

import java.util.Scanner;

public class TaskFinal {
    public static void main(String[] args) {
        NoteBook Angara = new NoteBook();
        Angara.name = "Angara";
        Angara.ozu = 16;
        Angara.hd = 512;
        Angara.os = "Windows";
        Angara.color = "Green";
        
        NoteBook Baikal = new NoteBook();
        Baikal.name = "Baikal";
        Baikal.ozu = 32;
        Baikal.hd = 1024;
        Baikal.os = "Android";
        Baikal.color = "Blue";

        NoteBook Irkut = new NoteBook();
        Irkut.name = "Irkut";
        Irkut.ozu = 16;
        Irkut.hd = 512;
        Irkut.os = "Mac";
        Irkut.color = "Black";

        NoteBook Kitoi = new NoteBook();
        Kitoi.name = "Kitoi";
        Kitoi.ozu = 8;
        Kitoi.hd = 256;
        Kitoi.os = "Windows";
        Kitoi.color = "Blue";

        NoteBook Enisey = new NoteBook();
        Enisey.name = "Enisey";
        Enisey.ozu = 8;
        Enisey.hd = 512;
        Enisey.os = "Mac";
        Enisey.color = "Blue";

        NoteBook Sayany = new NoteBook();
        Sayany.name = "Sayany";
        Sayany.ozu = 32;
        Sayany.hd = 1024;
        Sayany.os = "Windows";
        Sayany.color = "Green";

        NoteBook Arshan = new NoteBook();
        Arshan.name = "Arshan";
        Arshan.ozu = 16;
        Arshan.hd = 256;
        Arshan.os = "Android";
        Arshan.color = "Blue";

        NoteBook Belaya = new NoteBook();
        Belaya.name = "Belaya";
        Belaya.ozu = 32;
        Belaya.hd = 1024;
        Belaya.os = "Windows";
        Belaya.color = "White";
        
        
        NoteBook[] catalog = new NoteBook[] {Angara, Baikal, Irkut, Kitoi, Enisey, Sayany, Arshan, Belaya};
        System.out.print("Выберете пункт меню:\n 1. Вывести весь каталог\n 2. Фильтр объема жесткого диска\n 3. Фильтр объема оперативной памяти\n 4. Выбор операционной системы\n 5. Выбор цвета ноутбука\n");
        
        Scanner filter = new Scanner(System.in); 
        int scaner = filter.nextInt();
        switch (scaner) {
            case 1:                  // Вывод всего каталога, вывод работает
                System.out.println("Список ноутбуков: ");
                for (int i = 0; i < catalog.length; i++) {
                    System.out.println(catalog[i]);
                    
                }
                break;
            case 2:                 // Вывод данных вариантов объёма HD, при вводе параметрв вызывает свой метод и выодит перечень ноутбуков
                System.out.println("Введите размер нужного жесткого диска: 256 Гб, 512 Гб, 1024 Гб");
                int hd = filter.nextInt();
                System.out.println(NoteBook.getHD(catalog, hd));
                break;
            case 3:               // Фильтр оперативной памяти
                System.out.println("Выберете размер оперативной памяти: 8 Гб, 16 Гб, 32 Гб");
                int ram = filter.nextInt();
                System.out.println(NoteBook.getOZU(catalog, ram));
                break;
            case 4:              // Фильтр операционной системы
                System.out.println("Введите Операционную систему: Windows, Android, Mac");
                Scanner sc2 = new Scanner(System.in);
                System.out.println(NoteBook.getSystem(catalog, sc2.nextLine()));
                break;
            case 5:            // Фиильтр цвета
                System.out.println("Введите цвет: Black, Blue, Green, White");
                Scanner sc3 = new Scanner(System.in);
                System.out.println(NoteBook.getColor(catalog, sc3.nextLine()));
                break;           
               
            default:        // Ошибка при некорректном значении кейса
                System.out.println("Выберите пункт из списка  1 - 5");
        }
        filter.close();
        }
    }
    
