package by.itstep.zimin.tasknew;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LaunchOfHoneyProduction {

    public static Integer numberOfServingsOfHoney = 0;
    public static Object locker = new Object();

    public static void main(String[] args) {
        BeeRunnable bee = new BeeRunnable(locker);
        BearRunnable bear = new BearRunnable(locker);

        ExecutorService service = Executors.newFixedThreadPool(4);
        service.execute(bee);
        Thread thread = new Thread(bear);
        thread.start();


    }
}
