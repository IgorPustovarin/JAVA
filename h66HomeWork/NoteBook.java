package h66HomeWork;

public class NoteBook {
    public String name;
    public int ozu;
    public int hd;
    public String os;
    public String color;

    // public NoteBook (String name, int ozu, int hd, String os, String color){
    //     this.name = name;
    //     this.ozu = ozu;
    //     this.hd = hd;
    //     this.os = os;
    //     this.color = color;
    // }
    @Override
    public String toString() {
        return String.format("n:%s, ozu:%d, hd:%d, os:%s, color:%s", name,  ozu, hd, os, color);
        
    }
    public static StringBuilder getColor(NoteBook[] catalog, String color) {   // Ф-ция получения данных System OS
        StringBuilder result = new StringBuilder();
        for (NoteBook el : catalog) {     // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
            if (el.color.equalsIgnoreCase(color)) {         
                result.append("name: "+ el.name +", "+ "RAM: "+ el.ozu +", "+"HD: "+ el.hd +", "+ "System: "+ el.os + ", "+ "colour: " + el.color + "\n");
            }
        }
        return result;
    }
    public static StringBuilder getOZU(NoteBook[] catalog, int ozu) {  // Ф-ция получения данных HD
        StringBuilder result = new StringBuilder();
        for (NoteBook el : catalog) {
            if (ozu == el.ozu) {  // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
                result.append("name: "+ el.name +", "+ "RAM: "+ el.ozu +", "+"HD: "+ el.hd +", "+ "System: "+ el.os + ", "+ "colour: " + el.color + "\n");            
            }
        }
            return result;
        }
    public static StringBuilder getName(NoteBook[] catalog, String name) {   // Ф-ция получения данных System OS
        StringBuilder result = new StringBuilder();
        for (NoteBook el : catalog) {     // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
            if (el.name.equalsIgnoreCase(name)) {         
                result.append("name: "+ el.name +", "+ "RAM: "+ el.ozu +", "+"HD: "+ el.hd +", "+ "System: "+ el.os + ", "+ "colour: " + el.color + "\n");
            }
        }
        return result;
    }
    public static StringBuilder getSystem(NoteBook[] catalog, String os) {   // Ф-ция получения данных System OS
        StringBuilder result = new StringBuilder();
        for (NoteBook el : catalog) {     // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
            if (el.os.equalsIgnoreCase(os)) {         
                result.append("name: "+ el.name +", "+ "RAM: "+ el.ozu +", "+"HD: "+ el.hd +", "+ "System: "+ el.os + ", "+ "colour: " + el.color + "\n");
            }
        }
        return result;
    }
    public static StringBuilder getHD(NoteBook[] catalog, int hd) {  // Ф-ция получения данных HD
        StringBuilder result = new StringBuilder();
        for (NoteBook el : catalog) {
            if (hd == el.hd) {  // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
                result.append("name: "+ el.name +", "+ "RAM: "+ el.ozu +", "+"HD: "+ el.hd +", "+ "System: "+ el.os + ", "+ "colour: " + el.color + "\n");

            }
        }
        return result;
    }
}