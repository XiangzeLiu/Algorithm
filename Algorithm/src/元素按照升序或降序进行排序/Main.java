package 元素按照升序或降序进行排序;

import java.util.Scanner;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        ArrayList<String> input_list = main.input(3);
        ArrayList<Integer> num_list = main.convert_nums(input_list.get(0),input_list.get(1));
        int[] ints = main.sort_ints(input_list.get(2),num_list);
        String result = new String();
        for(int i=0;i<ints.length;i++){
            if(i==0 || i==(ints.length)){
                result = result+String.valueOf(ints[i]);
            }
            else{
                result = result +" "+String.valueOf(ints[i]);
            }
        }
        System.out.println(result);
    }
    public ArrayList<String> input(int num){
        ArrayList<String> input_list = new ArrayList<>();
        Scanner in  = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                input_list.add(in.nextLine());
            }
        }

        return input_list;
    }

    public ArrayList<Integer> convert_nums(String length,String num){
        ArrayList<Integer> arrayList=new ArrayList<>();
        String[] strs = num.split(" ");
        for(int i=0;i<strs.length;i++){
            arrayList.add(Integer.parseInt(strs[i]));
        }
        return arrayList;
    }
    public int[] sort_ints(String isopen,ArrayList<Integer> arrayList){
        int switch_num = Integer.parseInt(isopen);
        int[] result_ints = new int[arrayList.size()];
        // ArrayList<Integer> resultlist = new ArrayList<Integer>();
        if(switch_num == 0){
            Collections.sort(arrayList);
        }
        else{
            Collections.sort(arrayList, Collections.reverseOrder());
        }
        for(int i=0;i<arrayList.size();i++){
            result_ints[i] = arrayList.get(i);
        }

        return result_ints;
    }
}