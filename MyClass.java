import java.util.Scanner;

public class MyClass {
        // Задание 1:
    public static void main(String[] args){
        // Задание 2:
        String a = "Hello, World!";
        int i = 24;
        byte b = 10;
        short s = 2404;
        long l = 1500L;
        float f = 120.2f;
        double d = 14.56477;
        boolean bl = true;
        char c = 'B';
        // Задание 3:
        int g = multiplyMethod(4,5,12,2);
        String z = "Результат выражения: ";
        System.out.println(z + g);
        // Задание 4:
        int h = sumMethod(12,10);
        // Задание 5:
        int v = positiveMethod(0);
        // Задание 6:
        boolean abc = negativeMethod(-5);
        System.out.println(abc);
        //Задание 7:
        String name = sayHello("Павел");
        //*Задание 8:
        int year = whatYear(1900);
        //Задание 9:
        //Сигнатура метода — это имя метода плюс параметры (причем порядок параметров имеет значение).
        //Полагаю это 2 разных сигнатуры одного метода.



    }

    static int multiplyMethod(int a, int b, int c, int d){
        int x =  a * (b + (c / d));
        return x;
    }

    static int sumMethod(int a, int b){

        int sum = a + b;
        if (sum > 10 && sum <= 20){
            String k = "true";
            System.out.println(k);
        }
        else {
            String k = "false";
            System.out.println(k);
        }
        return sum;
    }

    static int positiveMethod(int j){
        if (j < 0 ){
            System.out.println("Число отрицательное");

        }
        else {
            System.out.println("Число положительное");
        }
        return j;
    }
    static boolean negativeMethod(int l){
        boolean e;
        if (l < 0 ){
            e = true;
        }
        else {
            e = false;
        }
        return e;
    }
    static String sayHello(String name){
        System.out.println("Привет " + name);
        return name;
    }
    static int whatYear(int year) {
        //int year = 2019;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        }
        else{
            System.out.println("Год не високосный");
        }
     return year;
    }
}






