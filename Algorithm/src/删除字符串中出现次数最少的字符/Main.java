package 删除字符串中出现次数最少的字符;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c:chars){
            if (hashMap.containsKey(c)){
                int value = hashMap.get(c);
                hashMap.put(c,value+1);
            }
            else {
                hashMap.put(c,1);
            }
        }
        int min_num = Collections.min(hashMap.values());
        StringBuilder stringBuilder = new StringBuilder();
        for(char c:chars){
            if (hashMap.get(c)!=min_num){
                stringBuilder.append(c);
            }
        }
        String result = stringBuilder.toString();
        System.out.println(result);
    }
}