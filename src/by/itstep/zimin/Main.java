package by.itstep.zimin;

import java.util.Arrays;

public class Main {


    public volatile static int[] array = new int[20];

    public static void main(String[] args) throws InterruptedException {

        MyRunnableGenerate fillInTheArray = new MyRunnableGenerate();
        MyRunnableCountSum countSum = new MyRunnableCountSum();
        MyRunnableAverageArithmetic averageArithmetic = new MyRunnableAverageArithmetic();

        Thread thread1 = new Thread(fillInTheArray);
        thread1.setName("Generate");
        Thread thread2 = new Thread(countSum);
        thread2.setName("Sum");
        Thread thread3 = new Thread(averageArithmetic);
        thread3.setName("Average");

        thread1.start();
        thread1.join();
        while (thread1.isAlive()) {
            thread1.join();
        }
        thread2.start();
        thread3.start();
        System.out.println(Arrays.toString(array));

    }
}
