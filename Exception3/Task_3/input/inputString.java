package Task_3.input;

import Task_3.User.User;
import Task_3.Files.WriteInFileException;

import java.util.ArrayList;
import java.util.Scanner;

import static Task_3.Files.File.printAll;
import static Task_3.Preparing.Preparing.Preparing;


public class inputString {

    public static int paramCount = 6;
    public static String[] tempStr;
    public static ArrayList<User> userArrayList = new ArrayList<>();

    public static void InputUser(){
        String inStr = "start";
        Scanner scanner = new Scanner(System.in);
        screenCleaning();
        while(!inStr.equals("")){
            System.out.println();
            tempStr = new String[paramCount];
            System.out.println("*********** Введите данные пользователя в следующем формате************");
            System.out.println("Фамилию_Имя_д.р(dd.mm.yy)_тел.******_ пол (f/m)");
            System.out.println("Введите данные :");
            inStr = scanner.nextLine();
            System.out.println();

            if(!inStr.equals("")){
                tempStr=inputStringPreparing(inStr,tempStr);
                userArrayList.add(new User(tempStr[0], tempStr[1], tempStr[2], tempStr[3], tempStr[4], tempStr[5]));
                printUserArrayList();
            }

        }
        try{ 
            printAll(userArrayList);
        } catch(WriteInFileException e){
            throw new RuntimeException(e);
        }
        screenCleaning();
    }

    public static String[] inputStringPreparing(String str, String[] inpArray){
        String[] parsedStrArr = str.split(" ");
        Preparing(parsedStrArr,tempStr);
        System.out.println();
        return tempStr;

    }

    private static void printUserArrayList() {
        System.out.println("Состояние userArrayList (" + userArrayList.size() + " elements)");
        for (int i = 0; i < userArrayList.size(); i ++) {
            System.out.println(userArrayList.get(i));
        }
    }


    private static void screenCleaning() {
        for (int i = 0; i < userArrayList.size(); i++) {
            System.out.println(userArrayList.get(i));
            
        }
    }

    public static void pauseIt(){
        String s;
        System.out.println("нажмите Enter ");
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
    }
    
}
