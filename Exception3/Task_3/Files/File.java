package Task_3.Files;

import Task_3.User.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class File {
    public static void saveFile(String filePath, ArrayList<User> list) throws WriteInFileException{ 
        try(FileWriter writer = new FileWriter(filePath)){
           for (int i = 0; i < list.size(); i++) {
                writer.write(String.valueOf(list.get(i)));
                writer.write("\n");
                writer.flush();  
           }      
        } catch (IOException e) {
            throw new WriteInFileException("Запись в файл не удалась", e);
        }
    }

public static void printAll(ArrayList<User> list) throws WriteInFileException{
    String tempName;
    ArrayList<User> tempArray;
    String wrString ="";

    for (int i = 0; i < list.size(); i++) {
        tempName = list.get(i).lastName;
        tempArray = new ArrayList<>();
        tempArray = getNamesakes(list, i);
        System.out.println("tempArray: i " + i + "  " + tempArray + " -----------------");
        System.out.println("tempArray: " + tempArray );

        try(FileWriter writer = new FileWriter(tempName)){
            for (int j = i; j < tempArray.size(); j++) {
                wrString += tempArray.get(j);
                wrString += "\n";
                System.out.println("j: " + j + "  wrString = " + wrString);        
            }
            writer.write(wrString);
            writer.write("\n");
        } catch (IOException e) {
            throw new WriteInFileException("Запись в файл не удалась", e);
        }
    }
}

private static ArrayList<User> getNamesakes(ArrayList<User> userList, int pos) {
    ArrayList<User> tempArr = new ArrayList<>();
    String tempName = userList.get(pos).lastName;
        for (int i = pos; i < userList.size(); i ++) {
            if(userList.get(i).lastName.equals(tempName)){
                tempArr.add(userList.get(i));
            }
        }
        return tempArr;
    }
}

