package try_catch;

public class Exception02 {

    public static void main(String[] args) {

        int[] intArray = new int[3];
        int intArray1[] = new int[3];
        try {
            for (int i = 0; i <= intArray.length; i++) {
                intArray[i] = i;
                System.out.println("intArray[" + i + "] = " + intArray[i]);
                System.out.println("intArray[" + i + "] = " + (i-2) + "的值：" + intArray[i] % (i-2));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("intArray数组下表越界异常。");
        } catch (ArithmeticException e) {
            System.out.println("除数为0异常。");
        }
        System.out.println("程序正常结束");

    }

}
