import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        List<String> words = new LinkedList<>();
        words.add("Orange");
        words.add("Banana");
        words.add("Apple");

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void checkSumSign() {
        Random random = new Random();
        int firstNumber = random.nextInt();
        int secondNumber = random.nextInt();
        int sum = firstNumber + secondNumber;
        if (sum >= 0) {
            System.out.println("Cумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        Random random = new Random(-200);
        int value = random.nextInt();
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
