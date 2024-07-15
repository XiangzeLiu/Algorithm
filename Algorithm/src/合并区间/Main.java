package 合并区间;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param intervals Interval类ArrayList
     * @return Interval类ArrayList
     */
    public ArrayList<Interval> merge (ArrayList<Interval> intervals) {
        // write code here
        if(intervals ==null || intervals.size()<2){
            return intervals;
        }

        Collections.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval o1,Interval o2){
                if(o1.start != o2.start){
                    return o1.start - o2.start;
                }
                else return o1.end-o2.end;
            }
        });
        ArrayList<Interval> res = new ArrayList<>();
        res.add(intervals.get(0));
        int count = 0;
        for (int i=1;i<intervals.size();i++){
            Interval res_item = res.get(count);
            Interval o_item = intervals.get(i);
            if (o_item.start>res_item.end){
                res.add(o_item);
                count++;
            }
            else{
                res.remove(count);
                Interval s = new Interval(res_item.start, res_item.end);
                if(res_item.end < o_item.end)
                    s.end = o_item.end;
                res.add(s);
            }
        }
        return res;
    }
}