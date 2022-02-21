import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class HomeWorkApp {
    public static void main(String[] args) {
        method(5,6);
        method2(5);
        method3(10);
        method4("Дратути",5);
        method5(1978);
    }


    public static boolean method(int a, int b) {
        if (a + b > 9 && a + b < 21) {
            return true;
        } else {
            return false;
        }
    }

    public static void method2(int a) {
        if (a > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean method3(int a) {
        if (a > 0) {
            return false;
        } else return true;
    }

    public static void method4(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean method5(int year) {
        if (year / 400 == 0 || (year / 4 == 0 && year / 100 != 0)) {
            return true;
        } else return false;
    }

}

