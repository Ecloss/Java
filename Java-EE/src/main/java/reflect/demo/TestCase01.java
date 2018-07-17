package reflect.demo;

import javax.xml.ws.handler.MessageContext;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestCase01 {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        String className = in.nextLine();
        //  获取动态类
        Class cls = Class.forName(className);
        //  获取动态方法
        Object obj = cls.newInstance();
        //  获取动态方法
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            Demo demo = method.getAnnotation(Demo.class);
            if (demo != null) {
                System.out.println(demo);
                System.out.println(method.getName());
            }
        }

        //  加入类的名字
        String name = "testHi";
        //  定义要传递的参数
        Object[] types = {int.class, int.class};
        Method method1 = cls.getMethod(name, int.class, int.class);
        method1.invoke(obj, types);

    }

}
