package CommonTest;

public class TestInt {

    public static void main(String[] args) {
        System.out.println(0xffffffff);
        System.out.println(Integer.toBinaryString(0xffffffff));

        byte b = -1;
        System.out.println((int) (char) b);
        System.out.println((int) (char) (b & 0xff));

        System.out.println(TestInt.class);
        System.out.println(TestInt.class.getSimpleName());

        System.out.println(new Byte("-1"));

        int BIT_SEQUENCE = 2;
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-1 << 1));
        System.out.println(-1L ^ (-1L << BIT_SEQUENCE));
        System.out.println(~(-1L << BIT_SEQUENCE));

//        private final static long MAX_SEQUENCE = -1L ^ (-1L << BIT_SEQUENCE);
//        private final static long MAX_SEQUENCE= ~(-1L << BIT_SEQUENCE);
    }

}
