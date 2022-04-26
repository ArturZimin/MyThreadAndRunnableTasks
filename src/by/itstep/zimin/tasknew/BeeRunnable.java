package by.itstep.zimin.tasknew;

public class BeeRunnable implements Runnable {
    Object locker;

    public BeeRunnable(Object locker) {
        this.locker = locker;
    }

    @Override
    public void run() {


        while (true) {


            synchronized (locker) {

                if (LaunchOfHoneyProduction.numberOfServingsOfHoney < 200) {
                    LaunchOfHoneyProduction.numberOfServingsOfHoney++;
                    System.out.println("The bees is working : " + LaunchOfHoneyProduction.numberOfServingsOfHoney);

                } else {
                    try {
                        locker.notifyAll();
                        locker.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }


        }
    }
}
