// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.

package h22HomeWork;

import java.io.IOException;
import java.lang.System.Logger;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
// import java.util.logging.*;
// import java.lang.System.*;

public class task1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task1.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info(Arrays.toString(arg));

        int[] arg = {77, 99, 88, 111, 66, 55, 44, 33};
        int max = arg[0];
        int temp = 0;

        for (int i = 1; i < arg.length; i++) {
             for (int j = 1; j < arg.length; j++) {
                if (arg[j-1] > arg[j]){
                    temp = arg[j-1];
                    arg[j-1] = arg[j];
                    arg[j] = temp;
             }  
            
            }     
        System.out.println(Arrays.toString(arg));      
        }
    }
    
}
