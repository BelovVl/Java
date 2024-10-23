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
    public static void changeValue7(Integer[] value7) {
        value7 = new Integer[]{1, 2};

    }

    //task8
    public static void changeValue3(Integer[] value3) {
        value3 = new Integer[2];
        value3[0] = 99;
    }

    //task9
    public static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }

    //task10
    public static void changePerson1(Person person1) {
        person1.name = "Ilya";
        person1.surname = "Lagutenko";
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
        Integer[] value7 = new Integer[]{3, 4};
        changeValue7(value7);
        System.out.println(Arrays.toString(value7));
        //task8
        Integer[] value3 = {3, 4};
        changeValue3(value3);
        System.out.println(Arrays.toString(value3));
        //task9
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println("person= " + person);
        //task10
        Person person1 = new Person("Lyapis", "Trubetskoy");
        changePerson1(person1);
        System.out.println("person1 = " + person1);
    }
}