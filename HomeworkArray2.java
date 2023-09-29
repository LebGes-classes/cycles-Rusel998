import java.util.Scanner;

public class HomeworkArray2 {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);
        int n = 8;
        // 1.колво столбцов . 2.колво строк
        double[][] matrix = new double[n][n];
        //Проходим сначала по строкам(i)потом по столбцам(j). Но в скобках матрицы (см. строку 11) сначало пишеи столбцы(j) потом строки(i).
        System.out.println("Введите значения матрицы: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[j][i] = insert.nextDouble();
            }
        }
        // Цикл на нахождение k-х строк который равны k-м столбцом
        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[j][i] == matrix[i][j]) {
                    k++;
                }
            }
            if (k == n) {
                System.out.println("k, при которых k-я строка матрицы совпадает с k-м столбцом: " + (i + 1) + " ");
                /* i + 1 потому что выводим индексы с 0 и поэтому строка 2 будет считаться как 1 в массиве. */
            }
            // При выводе будет несколько раз писать НЕТ
            else {
                System.out.println("таких k в строке - НЕТ");
            }


        }
        System.out.println("Матрица: ");
        //Проходим в цикле сначала все элементы столбцов в одной строке  затем переходим на новую строку
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            //Здесь переход на новую строку.
            System.out.println();
        }
        System.out.println("Матрица с измененными строками: ");
        //С помощью цикла и нового массива меняем строки в матрице.
        for (int i = 0; i < matrix[0].length; i++) {
            double swap = matrix[i][0];
            matrix[i][0] = matrix[i][matrix.length - 1];
            matrix[i][matrix.length - 1] = swap;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            //Здесь переход на новую строку.
            System.out.println();
        }
    }
}
