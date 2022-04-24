package by.itstep.zimin.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunnableTest {

    public static double one;
    public static double two;


    public static void main(String[] args) {
        MyNewRunnableLambda rl = new MyNewRunnableLambda();
        Thread thread1 = new Thread(rl);
        thread1.setName("countSum");

        Thread thread2 = new Thread(rl);
        thread2.setName("difference");
        Thread thread3 = new Thread(rl);
        thread3.setName("multiply");
        Thread thread4 = new Thread(rl);
        thread4.setName("divide");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first number  (double)");
        String pattern = "\\d+[.]\\d+";
        String read = null;
        try {
            read = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (read.matches(pattern)) {
            one = (double) Double.parseDouble(read);
        } else {
            throw new IllegalArgumentException("Entered number is wrong!");
        }
        System.out.println("Enter the second number  (double)");
        String read2 = null;
        try {
            read2 = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (read2.matches(pattern)) {
            two = (double) Double.parseDouble(read2);
        } else {
            throw new IllegalArgumentException("Entered number is wrong!");
        }

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
