public class Main {
    public static void main(String[] args) {

        // Задание 2
        doTask2();

        // Задание 3
        System.out.println("Задание 3");
        System.out.println(doTask3(23.23432f, 245.523f, 567.322f, 435.5678f));

        // Задание 4
        System.out.println("\nЗадание 4");
        System.out.println(doTask4(12.455f, 7.0f));
        System.out.println(doTask4(1.044f, 25.3443f));

        // Задание 5
        System.out.println("\nЗадание 5");
        doTask5(-5);
        doTask5(0);
        doTask5(5);


        // Задание 6
        System.out.println("\nЗадание 6");
        System.out.println(doTask6(-5));
        System.out.println(doTask6(0));
        System.out.println(doTask6(5));

        // Задание 7
        System.out.println("\nЗадание 7");
        doTask7("Лунтик");


        // Задание 8
        System.out.println("\nЗадание 8");
        doTask8(1994);  // не делится на 4 -> невисокосный
        doTask8(2020);  // делится на 4 -> високосный
        doTask8(1800);  // делится на 4 и 100 -> невисокосный
        doTask8(2000);  // делится на 4, 100 и 400 -> високосный
    }

    static void doTask2() {
        // Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte var1 = -128;
        short var2 = 32767;
        int var3 = 0;
        long var4 = 54646874L;
        float var5 = 34345.3244345f;
        double var6 = 34.34546567567675676567567d;
        boolean var7 = true;
        char var8 = 'C';
        String var9 = "Hello, World!!!!!";
    }

    static float doTask3(float a, float b, float c, float d) {
        // Написать метод вычисляющий выражение a * (b + (c / d))
        // и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        return a * (b + (c / d));
    }

    static boolean doTask4(float a, float b) {
        // Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
        // в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false;
        float sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    static void doTask5(int a) {
        // Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль положительное ли число передали, или отрицательное;
        // Замечание: ноль считаем положительным числом.

        String parity = "отрицательное";

        if (a >= 0) {
            parity = "положительное";
        }

        System.out.println(String.format("%s - %s число", a, parity));
    }

    static boolean doTask6 (int a) {
        // Написать метод, которому в качестве параметра передается целое число,
        // метод должен вернуть true,
        // если число отрицательное;
        return a < 0;
    }

    static void doTask7(String str) {
        // Написать метод, которому в качестве параметра передается строка, обозначающая имя,
        // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        System.out.println(String.format("Привет, %s!", str));
    }

    static void doTask8(int year) {
        // Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

        // Любой год невисокосный
        String leap_year = "невисокосный";

        // кроме
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            leap_year = "високосный";
        }

        System.out.println(String.format("Год %s - %s", year, leap_year));
    }

}
