
package h55HomeWork;

public class Task3 {
    public static void main(String[] args) {
        int[] ferz = new int[8];
        stepMotion(0, ferz);  
        for (int horizontal = 0; horizontal < 8; horizontal++) {
            for (int vertical = 0; vertical < 8; vertical++) {
                if (ferz[horizontal] == vertical) {
                    System.out.print(" X ");
                } 
                else System.out.print(" _ ");
            }
            System.out.println();
        }
    }

    public static boolean stepMotion(int count, int[] queenArray) {
        if (count == 8) {
            return true;
        }
        for (int vertical = 0; vertical < 8; vertical++) {
            boolean positionQ = true;
            for (int i = 0; i < count; i++) {               
                if (queenArray[i] == vertical || queenArray[i] == vertical - count + i || queenArray[i] == vertical + count - i) { 
                    positionQ = false;
                    break;
                }
            }
            if (positionQ) {
                queenArray[count] = vertical;
                if (stepMotion(count + 1, queenArray)) {
                return true;
                }
            }
        }
        return false;
       
    }
}

