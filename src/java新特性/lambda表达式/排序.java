package java新特性.lambda表达式;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 排序 {

    public static void main(String[] args) {
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};
        //1.使用匿名内部类根据name排序
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        // 转换为集合  方便使用输出
        List<String> list=Arrays.asList(players);
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
        //2.使用Lambda  来处理
        Comparator<String> sortName=(o1,o2)->(o1.compareTo(o2));
//         2.1 根据最后一个字符 排序
//        Comparator<String> ByLastLetter=(o1,o2)->(o1.charAt(o1.length()-1)-(o2.charAt(o2.length()-1)));
        list.sort(sortName);
        //按字符串穿长度进行排序
        //三种形式一样
//        Collections.sort(list,(item1, item2) -> item1.length() - item2.length() );
//         Arrays.sort(list,(item1, item2) -> item1.length() - item2.length() );
        list.forEach(p-> System.out.println(p+";"));

    }
}
