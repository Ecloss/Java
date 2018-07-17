package reflect;

import reflect.demo.Demo;

public class Foo {

    public void testHi() {
        System.out.println("Hi");
    }

    /**
     * @param x
     * @param y
     */
    public void bu(int x, int y) {
        System.out.println(x + y);
    }

    @Demo
    public void demo(int x, int y) {
        System.out.println("Demo");
    }

}
