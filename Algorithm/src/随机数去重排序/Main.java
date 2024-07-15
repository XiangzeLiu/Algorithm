package 随机数去重排序;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main main  =  new Main();
        ArrayList<Integer> randomlist = main.GenerateList(1,500,3);
        HashSet<Integer> hashSet = new HashSet<>();
//        for (int i = 0; i < randomlist.size(); i++) {
//            if (hashSet.contains(randomlist[i])):
//
//        }


    }
    public ArrayList GenerateList(int min,int max,int random){
        Random random1 = new Random();
        ArrayList<Integer> aim_list = new ArrayList();
        for (int i = 0; i < random; i++) {
            int num = random1.nextInt(max);
            aim_list.add(num);
        }
        return aim_list;
    }
}
