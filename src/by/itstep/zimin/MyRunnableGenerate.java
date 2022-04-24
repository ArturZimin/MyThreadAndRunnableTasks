package by.itstep.zimin;

import java.util.Arrays;
import java.util.Objects;

public class MyRunnableGenerate implements Runnable {


    @Override
    public void run() {

        for (int i = 0; i < Main.array.length; i++) {
            Main.array[i] = (int) ((Math.random() * 10) + 20);
        }

    }
}
/**
 * Задание 1
 * При старте приложения запускаются три потока. Первый поток заполняет массив случайными числами. Два
 * других потока ожидают заполнения. Когда массив заполнен оба потока запускаются. Первый поток находит сумму
 * элементов массива, второй поток среднеарифметическое
 * значение в массиве. Полученный массив, сумма и среднеарифметическое возвращаются в метод main, где должны
 * быть отображены
 */
