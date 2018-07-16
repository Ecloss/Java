package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericDemo2 {

    public static void main(String[] args) {

        //  创建一个List集合，存储整数 , List ArrayList
        List<Integer> list = new ArrayList<Integer>();

        list.add(5);
        list.add(6);

        for (Iterator<Integer> it = list.iterator(); it.hasNext(); ) {

            Integer integer = it.next();
            System.out.println(integer);

        }

    }

}
