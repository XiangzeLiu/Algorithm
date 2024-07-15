package 坐标移动;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] strings = string.split(";");
        HashMap<Character,Integer> hashMap = new HashMap<>();
        hashMap.put('A',0);
        hashMap.put('W',0);
        hashMap.put('S',0);
        hashMap.put('D',0);
        for (int i = 0; i < strings.length; i++) {
            int length =strings[i].length();
            if(length<4 && length>1 && hashMap.containsKey(strings[i].charAt(0)) == true) {
                char cha0 = strings[i].charAt(0);
                if ((length == 3) && hashMap.containsKey(cha0)
                        && Character.isDigit(strings[i].charAt(1))==true
                        && Character.isDigit(strings[i].charAt(2))==true)
                {
                    char cha1 = strings[i].charAt(1);
                    char cha2 = strings[i].charAt(2);
                    int num1 = Integer.parseInt(String.valueOf(cha1));
                    int num2 = Integer.parseInt(String.valueOf(cha2));
                    if (num1 > 0 || num1 < 10 && num2 > 0 || num2 < 10) {
                        int value = num1 * 10 + num2;
                        int value2 = hashMap.get(cha0) + value;
                        hashMap.put(cha0, value2);
                    }
                }
                if (length == 2 && hashMap.containsKey(cha0)&& Character.isDigit(strings[i].charAt(1))) {
                    char cha1 = strings[i].charAt(1);
                    int num1 = Integer.parseInt(String.valueOf(cha1));
                    if (num1 > 0 || num1 < 10) {
                        int value = hashMap.get(cha0) + num1;
                        hashMap.put(cha0, value);
                    }
                }
            }
        }
        int x = hashMap.get('D')-hashMap.get('A');
        int y = hashMap.get('W')-hashMap.get('S');
        System.out.println(x+","+y);
    }
}
