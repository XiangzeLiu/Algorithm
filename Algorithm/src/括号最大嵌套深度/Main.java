package 括号最大嵌套深度;

import java.util.*;


/**
 * NC175 合法的括号字符串
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Main main = new Main();
        Boolean result = main.isValidString(str);
        System.out.println(result);
    }

    public boolean isValidString (String s) {
        if (s == null || s.length()==0 ){
            return true;
        }
        // write code here
        int number = 0;
        int other = 0;
        for(int i=0;i<s.length();i++){
            if(s.substring(i,i+1).equals(")")){
                if(number<1) return false;
                number--;
            }else{
                number++;
            }
        }
        number = 0;
        for(int i = 0; i<s.length();i++){
            if (s.substring(i,i+1).equals("(")){
                number++;
            }
            else if (s.substring(i,i+1).equals(")")){
                number--;
            }
            else if(s.substring(i,i+1).equals("*")){
                other++;
            }
        }
        if (number!=0){
            int result = Math.abs(number)-other;
            if (result>0){return false;}
        }
        return true;
    }
}

