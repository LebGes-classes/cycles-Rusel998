/*
Задание 1. (оператор цикла while) Вычислить и вывести на экран
в виде таблицы значения функции, заданной графически,
на интервале от xнач до xкон с шагом dx. Интервал и шаг
задать таким образом, чтобы проверить все ветви программы.
Таблицу снабдить шапкой.
 */

package Homework;

public class CyclesWHILE {
    public static void main(String[] args) {
        System.out.print("x | ");
        for (double x = -10.0; x <= 8; x+=0.5){
            System.out.print(x + " | ");
        }
        System.out.println();
        System.out.print("y | ");
        double x = -10.0;
        while (x < 8.0){
            if (x <= 0.0){
                System.out.print(0.5 * x + 10.0 + 2.0 + " | ");
            }else{
                if (x > 0.0 && x <= 3.0){
                    System.out.print(Math.sqrt(Math.abs(9 -x)) + " | ");
                } else {
                    if ( x > 3.0 && x <= 6.0){
                        System.out.print(Math.sqrt(Math.abs(9 - x)) + " | ");
                    } else {
                        if (x > 6.0 && x <= 8.0){
                            System.out.print(0);
                        }
                    }
                }
            }
            x += 0.5;
        }

    }
}
