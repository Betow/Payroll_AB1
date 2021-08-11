package payroll.menu.utils;

import java.util.Scanner;

public class InputUtils {
    
    public static String strIn(Scanner in){
        String str = in.nextLine();
        System.out.println();
        return str;
    }
}
