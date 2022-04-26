package by.itstep.zimin.tasknew;

public class BearRunnable implements Runnable {

    Object locker;

    public BearRunnable(Object locker) {
        this.locker = locker;
    }

    @Override
    public void run() {

        while (true) {


            synchronized (locker) {


                if (LaunchOfHoneyProduction.numberOfServingsOfHoney == 200) {
                    for (int i = 200; i > 0; i--) {


                        LaunchOfHoneyProduction.numberOfServingsOfHoney--;
                        System.out.println("The bear is working : " + LaunchOfHoneyProduction.numberOfServingsOfHoney);
                    }
                } else {
                    locker.notifyAll();
                    try {
                        locker.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }

        }


    }
}
