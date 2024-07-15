package 密码验证合格程序;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            String result = "OK";
            String str = in.nextLine();
            char[] chars = str.toCharArray();
            Main main = new Main();

            if (chars.length<8){
                result = "NG";
            }
            else if (main.check(chars) == false){
                result = "NG";
            }
            else if (main.check_repeat(str)==false){
                result = "NG";
            }
            System.out.println(result);
        }
    }
    public Boolean check(char[] chars){
        int[] arr =new  int[4];
        for(char c:chars){
            if ('A'<=c&&c<'Z'){
                arr[0]=1;
            }
            else if ('a'<=c&&c<='z'){
                arr[1]=1;
            }
            else if ('0'<=c&&c<='9'){
                arr[2]=1;
            }
            else if (c!=' ' && c!='\n'){
                arr[3]=1;
            }
        }
        int times = 0;
        for (int nums:arr){
            times = times+nums;
        }
        if (times>2){
            return true;
        }
        return false;
    }

    public Boolean check_repeat(String s){
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < s.length()-3; i++) {
            String str = s.substring(i,i+3);
            if (hashSet.contains(str)==false){
                hashSet.add(str);
            }
            else return false;
        }
        return true;
    }
}
