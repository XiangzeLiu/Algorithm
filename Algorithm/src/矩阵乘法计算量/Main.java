package 矩阵乘法计算量;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            int n = in.nextInt();
            int a[][] = new int[n][2];
            for (int i = 0; i <n; i++) {
                a[i][0] = in.nextInt();
                a[i][1] = in.nextInt();
            }
            String s = in.next();
            Stack<Integer> stack = new Stack<>();
            int sum = 0;
            for (int i = s.length()-1,j = n-1; i >=0; i--) {
                if (s.charAt(i) >= 'A' && s.charAt(i)<='Z'){
                    stack.push(a[j][0]);
                    stack.push(a[j][0]);
                    j--;
                }
                else if(s.charAt(i) == '('){
                    int x0 = stack.pop(), y0 = stack.pop(); // 矩阵尺寸x0*y0
                    int x1 = stack.pop(), y1 = stack.pop(); // 矩阵尺寸x1*y1
                    sum += x0 * y0 * y1; // 两个矩阵的乘法次数为x0*y0*y1或x0*x1*y1（其中y0==x1）
                    stack.push(y1); // 把相乘后得到的矩阵列数入栈
                    stack.push(x0); // 把相乘后得到的矩阵行数入栈
                }

            }
            System.out.println(sum);
        }
    }
}
