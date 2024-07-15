package 整数与IP地址间的转换;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] strings = string.split("\\.");
        if (strings.length<2){
            String s=main.inttoIP(strings);
            System.out.println(s);
        }
        else if (strings.length>2){
            long s=main.IPtoint(strings);
            System.out.println(s);
        }
    }
    public String inttoIP(String[] strings){
        long a = Integer.parseInt(strings[0]);
        String str = Long.toBinaryString(a);
        String[] strs = new String[4];
        for (int i = 0; i < 4; i++) {
            while (str.toCharArray().length<32){
                str = "0" +str;
            }
            String temp = str.substring(i*8,i*8+8);
            int s = Integer.parseInt(temp,2);
            String str2 = String.valueOf(s);
            strs[i] = str2;
        }
        String resultIP =strs[0]+"."+strs[1]+"."+strs[2]+"."+strs[3];
        return resultIP;
    }
    public long IPtoint(String[] strings){
        String[] strs = new String[4];

        for (int i=0;i<strings.length;i++){
            int num = Integer.parseInt(strings[i]);
            String s = Integer.toBinaryString(num);
            while (s.toCharArray().length<8){
                s = "0" +s;
            }
            strs[i]=s;
        }
        String result_str = new String();
        for (int i = 0; i < 4; i++) {
            result_str = result_str+strs[i];
        }
        long result = Long.parseLong(result_str,2);
        return result;
    }

}
