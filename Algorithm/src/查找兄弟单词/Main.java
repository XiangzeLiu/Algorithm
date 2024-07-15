package 查找兄弟单词;
import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        String str =new String();
        ArrayList<String> str_list = new ArrayList<>();
        ArrayList<String> bro_list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            str = in.next();
            str_list.add(str);
        }
        String aim = in.next();
        int k = in.nextInt();
        Main main = new Main();
        for(int i=0;i<n;i++){
            if (main.ismatched(str_list.get(i),aim)){
                bro_list.add(str_list.get(i));
            }
        }
        Collections.sort(bro_list);
        System.out.println(bro_list.size());
        System.out.println(bro_list.get(k-1));

    }
    public boolean ismatched(String str,String aim){
        if (str.equals(aim) || str.length()!=aim.length()){
            return false;
        }
        String[] strs = str.split("");
        String[] aims = aim.split("");
        Arrays.sort(strs);
        Arrays.sort(aims);
        if (Arrays.equals(strs,aims)){
            return true;
        }
        else return false;
        // for(int i=0;i<strs.length;i++){
        //     String temp_strs = strs[i];
        //     String temp_aims = aims[i];
        //     if(temp_strs.equals(temp_aims)){
        //         continue;
        //     }
        //     else return false;
        // }
    }
}