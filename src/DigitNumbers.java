import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * DigitNumbers - класс,отвечающий за подсчет кол-ва разрядов в чиcле.
 *
 * @author - Кувшинов А.В
 */

public class DigitNumbers {

    final static int LIMITER = 1000000000;

    public static void main(String[] args) {
        int inputNumber = input();
        int result = counting(inputNumber);
        System.out.println(result);
    }

    /**
     * input - метод для ввода числа
     *
     * @return вводимое число
     */

    public static int input() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        try {
            inputNumber = (int) scanner.nextDouble();
            if (inputNumber > LIMITER) {
                throw new ArithmeticException("Число больше чем число 10^9");
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return inputNumber;
    }

    /**
     * counting - метод для подсчета разрядов
     *
     * @param inputNumber - вводимое пользователем число
     * @return кол-во разрядов в числе
     */

    public static int counting(int inputNumber) {
        int count = 0;//кол-во повторений

        if (inputNumber == 0) {
            count++;
            return count;
        }

        if (inputNumber >= 0) {
            while (inputNumber > 0) {
                count++;
                inputNumber = Math.round(inputNumber / 10);
            }
            return count;
        } else {
            throw new IllegalArgumentException("Число меньше нуля");
        }

    }
}
