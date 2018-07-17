package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DemoTest02 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入类名");
        String className = in.nextLine();
        //  创建一个动态类
        Class cls = Class.forName(className);
        //  创建一个动态对象
        Object obj = cls.newInstance();
        //  创建对象的方法
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

}
