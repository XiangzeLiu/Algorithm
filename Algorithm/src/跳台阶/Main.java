package 跳台阶;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            System.out.println(main.JumpFloor(a));
        }
    }
    public int JumpFloor(int num){
        if (num < 2)return 1;
        int[] dp = new int[num];
        dp[0] =1;
        dp[1] =1;
        for (int i = 2; i < num; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[num-1]+dp[num-2];
    }
}
