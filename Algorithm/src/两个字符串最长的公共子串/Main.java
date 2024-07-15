package 两个字符串最长的公共子串;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            String max = s1.length()>=s2.length()?s1:s2;
            String min = s1.length()>=s2.length()?s2:s1;

            int l = 0 ;
            String s = "";
            for (int i=0;i<min.length()+1;i++ ){
                for(int j=i+1;j<min.length()+1;j++ ){
                    if(max.contains(min.substring(i,j))&& j-i>l){
                        l = j-i;
                        s = min.substring(i,j);
                    }
                }
            }
            System.out.println(s);
        }
    }

}