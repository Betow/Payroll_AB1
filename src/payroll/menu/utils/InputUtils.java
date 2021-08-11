package payroll.menu.utils;

import java.util.Scanner;

public class InputUtils {
    
    public static String strIn(Scanner in){
        String str = in.nextLine();
        System.out.println();
        return str;
    }

    public static Double dbIn(Scanner sc){
        Double db = sc.nextDouble();
        System.out.println();
        return db;
    }
}
