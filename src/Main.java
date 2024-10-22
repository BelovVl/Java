import java.util.Arrays;

public class Main {
    //task5
    public static void changeValue(int value) {
        value = 22;
    }

    //task6
    public static void changeValue1(Integer value1) {
        value1 = 22;
    }

    //task7
    public static void changeValue2(Integer[] value2) {
        value2 = new Integer[]{1, 2};
    }

    //task8
    public static void changeValue3(Integer[] value3) {
        value3 = new Integer[2];
        value3[0] = 99;
    }

    public static void main(String[] args) {
        //task5
        int value = 33;
        changeValue(value);
        System.out.println(value);
        //task6
        Integer value1 = 33;
        changeValue1(value1);
        System.out.println(value1);
        //task7
        Integer[] value2 = {3, 4};
        changeValue2(value2);
        System.out.println(Arrays.toString(value2));
        //task8
        Integer[] value3 = {3, 4};
        changeValue2(value3);
        System.out.println(Arrays.toString(value3));
    }

}