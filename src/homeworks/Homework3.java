package homeworks;

public class Homework3 {
    public static void main(String[] args) {
        double[] numbers = {1.5, 2.3, -4.6, 3.7, 5.9, 6.1, -2.5, 4.3, 7.8, -3.4, 9.1, -1.2, 2.5, 8.8, -5.9};

        boolean foundNegative = false;
        double sum = 0;
        int count = 0;

        for (double num : numbers) {
            if (num < 0) {
                foundNegative = true;
            }
            else if (foundNegative && num > 0) {
                sum += num;
                count++;
            }
        }


        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("Положительные числа после первого отрицательного отсутствуют.");
        }
    }
}
