package Task_3.Files;

import java.io.IOException;

public class WriteInFileException extends IOException{
    public WriteInFileException(String message, Throwable cause){
        super(message,cause);
    }

}
