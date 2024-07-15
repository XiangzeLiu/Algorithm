package 成绩排序;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main main = new Main();
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        int isopen = in.nextInt();
        ArrayList<Student> personlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // String[] person = in.nextLine().split(" ");
            // String name = person[0];
            // int grade = Integer.parseInt(person[1]);
            String name = in.next();
            int grade = in.nextInt();
            Student student = new Student(name, grade,i);
            personlist.add(student);
        }
        if (isopen == 0){
            Collections.sort(personlist,new Comparator<Student>(){
                public int compare(Student o1,Student o2){
                    if (o1.grade!=o2.grade){
                        return o1.grade-o2.grade;
                    }
                    else{
                        return o1.input_num - o2.input_num;
                    }
                }
            });
        }
        else{
            Collections.sort(personlist,new Comparator<Student>(){
                public int compare(Student o1,Student o2){
                    if (o1.grade!=o2.grade){
                        return -(o1.grade-o2.grade);
                    }
                    else{
                        return -(o1.input_num - o2.input_num);
                    }
                }
            });
        }

        for (Student s:personlist){
            String result = s.name+" "+String.valueOf(s.grade);
            System.out.println(result);
        }


    }
}
