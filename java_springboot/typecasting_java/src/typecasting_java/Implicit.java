package typecasting_java;

public class Implicit {

    public static void main(String[] args) {

        /*
        type casting:

        converting one data type to another data type
        "1" -> 1

        1. implicit : auto conversion by JVM
           byte -> short -> int -> long -> float

        2. explicit : manually need to convert
           double -> float -> long -> int -> short

        syntax: (datatype)
        */

        int marks = 3000;
        System.out.println("int: " + marks);

        long marks1 = marks;
        System.out.println("long: " + marks1);

    }
}