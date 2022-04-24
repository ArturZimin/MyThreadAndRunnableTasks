package by.itstep.zimin;

import java.util.Arrays;

public class MyRunnableCountSum implements Runnable {

    private int sum;

    public int getSum() {
        return this.sum;
    }

    @Override
    public void run() {

        for (int i = 0; i < Main.array.length; i++) {
            sum += Main.array[i];
        }
        System.out.println("The sum of the element array is : "+sum);
    }
}
