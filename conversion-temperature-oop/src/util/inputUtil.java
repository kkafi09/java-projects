package util;

import java.util.Scanner;

public class inputUtil {
    private static Scanner sc = new Scanner(System.in);

    public static String input(String info){
        System.out.print(info + " : ");
        String data = sc.nextLine();
        return data;
    }

    public static Integer inputNumber(String info){
        System.out.print(info + " : ");
        Integer num = sc.nextInt();
        return num;
    }

}
