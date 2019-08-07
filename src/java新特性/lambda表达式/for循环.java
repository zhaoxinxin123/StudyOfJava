package java新特性.lambda表达式;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class for循环 {
    public static void main(String[] args) {
        String[] atp={"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        //以前的方式
        List<String> palyers= Arrays.asList(atp);
        ArrayList<String> players2=new ArrayList<>();
        for (String p:palyers) {
            System.out.print(p+";");

        }
        System.out.println();
//        使用 lambda 表达式以及函数操作(functional operation)
        palyers.forEach((play)-> System.out.print(play+";"));
// 在 Java 8 中使用双冒号操作符(double colon operator)
        palyers.forEach(System.out::print);
        
    }
}
