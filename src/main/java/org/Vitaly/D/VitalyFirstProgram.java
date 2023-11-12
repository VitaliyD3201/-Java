package org.Vitaly.D;

// Целочисленные типы данных
//     byte aByte = (byte) 100;   //-128 ... 127
//         short aShort = 100; // -32768... 32767
//        int aInt = 100;
//        long aLong = 100L;
//        // Типы данных с плавающей точкой
//       float aFloat = 1.1f;
//       double aDouble = 1.2d;
//       // Символьный
//       char aChar = '\u0000';
//       // Логический
//       boolean aBoolean = false;

public class VitalyFirstProgram {
    public static void main(String[] args) {
        practiceMathOperators();
        System.out.println();
        practiceLogicalOperators();
        System.out.println();
        practiceOverflow();
        System.out.println();
        practiceCombination();
        
    }


    private static void practiceMathOperators() {
        int a= 10;
        int b= 5;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;


        System.out.println("Математические операции:");
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
        System.out.println("Остаток от деления: " + remainder);
    }


    private static void practiceCombination() {
        int a = 100;
        double b = 20.5;
        boolean c = false;
        byte d = 93;


        double sumDouble = a + b;
        double differenceDouble = a - b;
        double productDouble = a * b;
        double quotientDouble = a / b;

        int sumInt = (int) (a + b);
        int differenceInt = (int) (a - b);
        int productInt = (int) (a * b);
        int quotientInt = (int) (a / b);

        int Sum1 = (int) (a+b+d);
        double Sum2 = (double) (a+b+d);
       // boolean Sum3 = (boolean)  (c+a+b+d);
        byte Sum4 = (byte) (a+b+d);



        System.out.println("Выполнение операций между int и double приведенные к double");
        System.out.println("Сумма: " + sumDouble);
        System.out.println("Разность: " + differenceDouble);
        System.out.println("Произведение: " + productDouble);
        System.out.println("Частное: " + quotientDouble);
        System.out.println("Выполнение операций между int и double приведенные к int");
        System.out.println("Сумма: " + sumInt);
        System.out.println("Разность: " + differenceInt);
        System.out.println("Произведение: " + productInt);
        System.out.println("Частное: " + quotientInt);
        System.out.println("Выполнение операций между int и double и boolean и byte приведенные к int");
        System.out.println("Сумма: " + Sum1);
        System.out.println("Сумма: " + Sum2);
       // System.out.println("Сумма: " + Sum3);
        System.out.println("Сумма: " + Sum4); // тут как то не правильно складывается, видимо из за переполнения



    }

    private static void practiceOverflow() {

        int maxInt = 999999;
        int sum = maxInt + 1;
        byte firstByte = -127;
        byte secondByte = -10;
        byte sumByte = (byte) (firstByte + secondByte);
        float F = 1000.6f;
        byte B = (byte) (F + sum );


        System.out.println("Переполнение:");
        System.out.println("Переполнение MAX_VALUE: " + sum);
        System.out.println("Переполнение Byte: " + sumByte);// тут видимо заканчивается память, и начинает отображаться неверный результат
        System.out.println("Переполнение B:" + B);

    }

    private static void practiceLogicalOperators() {
        int a = 5;
        int b = 3;
        int c = 3;


        boolean equalTo = (a == b);
        boolean notEqualTo = (a != b);
        boolean greaterThan = (a > b);
        boolean lessThan = (a < b);
        boolean greaterOrEqual = (a >= b);
        boolean lessOrEqual = (a <= b);

        System.out.println("Логические операции:");
        System.out.println("Равно: " + equalTo);
        System.out.println("Не равно: " + notEqualTo);
        System.out.println("Больше: " + greaterThan);
        System.out.println("Меньше: " + lessThan);
        System.out.println("Больше или равно: " + greaterOrEqual);
        System.out.println("Меньше или равно: " + lessOrEqual);
    }
}