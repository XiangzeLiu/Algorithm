package 有重复字符串的排列组合;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(Permutation(scanner.next()));
        }
        scanner.close();
    }

    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str.length() == 1) {
            list.add(str);
        } else {
            Set<String> set = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                String left = str.substring(i, i + 1);
                if (!set.contains(left)) {
                    String substr = str.substring(0, i) + str.substring(i + 1);
                    List<String> subList = Permutation(substr);
                    for (int j = 0; j < subList.size(); j++) {
                        list.add(left + subList.get(j));
                    }
                    set.add(left);
                }
            }
        }
        return list;
    }
}
