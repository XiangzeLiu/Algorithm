package 合法的括号字符串;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
//            char
            int number = 0;
            int other = 0;
            for(int i = 0; i<s.length();i++){
                String  temp=s.substring(i,i+1);
                if (s.substring(i,i+1)=="("){
                    number = number+1;
                }
                if (s.substring(i,i+1)==")"){
                    number = number -1;
                }
                if(s.substring(i,i+1)=="*"){
                    other = other+1;
                }
            }
            if (number!=0){
                int result = Math.abs(number)-other;
                if (result!=0){return false;}
            }
            return true;
        }
    }

