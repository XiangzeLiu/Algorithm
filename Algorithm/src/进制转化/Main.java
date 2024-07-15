package 进制转化;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] str){
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int num = Integer.parseInt(string.substring(2),16);
        System.out.println(num);
    }
}
