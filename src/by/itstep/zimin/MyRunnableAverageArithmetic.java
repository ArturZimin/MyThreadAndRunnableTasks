package by.itstep.zimin;

public class MyRunnableAverageArithmetic implements Runnable {

    private double averageOfElementsArray;


    public double getSum() {
        return this.averageOfElementsArray;
    }

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < Main.array.length; i++) {
            averageOfElementsArray += Main.array[i];
            count++;
        }
        averageOfElementsArray = (double) (averageOfElementsArray / count);
        System.out.println("The average arithmetic of elements array is : "+averageOfElementsArray);
    }


}

