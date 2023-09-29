import java.util.Scanner;

public class HomeworkArray1 {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);
        System.out.println("Введи размерность массива: ");
        int n = insert.nextInt();
        double[] arr = new double[n];
        // перемен наибольшего отрицательного числа.
        double min = 0;
        // переменная индекса послед полож числа.
        int index = 0;
        //переменная суммы
        double sum = 0;
        // Цикл. Вводим элементы массива. Условный оператор: узнаем индекс последнего положительного числа.
        for (int i = 0; i < arr.length; i++){
            arr[i] = insert.nextInt();
            if (arr[i] > 0){
                index = i;
            }
        }
        // Условный оператор: узнаем максимальный отрицательный элемент.
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Максимальный отрицательный элемент массива: " + min);
        // Суммируем все числа перед последним положительным числом.
        for (int i = 0; i < index; i++){
            sum += arr[i];
        }
        System.out.println("Сумма чисел до последнего полож элемента: " + sum);
        System.out.print("Массив: { ");
        // Цикл для выведения массива.
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
    }
}
