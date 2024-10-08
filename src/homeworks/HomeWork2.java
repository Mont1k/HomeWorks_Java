package homeworks;
import java.util.Scanner;
public class HomeWork2 {
        public static void main(String[] args) {
            String concatenatedResult;

            final int NUM = 5;

            String word = "Что то";

            concatenatedResult = NUM +" " + word;

            System.out.println("Значение переменной num: " + NUM);
            System.out.println("Значение переменной word: " + word);
            System.out.println("Значение переменной concatenatedResult: " + concatenatedResult);

            if (NUM < 0) {
                System.out.println("Вы сохранили отрицательное число");
            } else if (NUM > 0) {
                System.out.println("Вы сохранили положительное число");
            } else {
                System.out.println("Вы сохранили ноль");
            }

            System.out.print("Введите ваше имя: ");

            Scanner scanner = new Scanner(System.in);
            String userName = scanner.nextLine();

            System.out.println("Hello , " + userName + "!");
        }
}
