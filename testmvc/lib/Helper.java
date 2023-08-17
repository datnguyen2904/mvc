package testmvc.lib;

import java.util.Scanner;

public class Helper {
    private static Scanner sc = new Scanner(System.in);

    public static int intInput(String mess, String error) {
        int n = 0;
        System.out.println(mess);
        try {
            n = Integer.parseInt(sc.nextLine());
            return n;
        } catch (Exception e) {
            System.out.println(error);
            return intInput(mess, error);
        }
    }

    public static String stringInput(String mess) {
        System.out.println(mess);
        String str = sc.nextLine();
        return str;
    }
}
