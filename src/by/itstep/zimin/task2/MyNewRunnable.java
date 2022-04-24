package by.itstep.zimin.task2;

public class MyNewRunnable implements Runnable {


    @Override
    public void run() {
        double one = RunnableTest.one;
        double two = RunnableTest.two;
        double sum = one + two;
        System.out.println("\nThe sum of numbers is : " + sum);
        double difference = 0;
        if (one > two) {
            difference = one - two;
            System.out.printf("\nThe number one bigger two on : % .3f" , difference);

        } else {
            difference = two - one;
            System.out.printf("\nThe number two bigger ona on : % .3f" , difference);

        }
        double multiply = one * two;
        System.out.printf("\nThe result after multiply is : % .3f" , multiply);
        double divide = 0;
        if (two != 0 && two != 0.0 && one > two) {
            divide = one / two;
        } else if (one < two && one != 0 && one != 0.0) {
            divide = two / one;
        }
        System.out.printf("\n2The result after divide is : % .3f" , divide);


    }

    /**
     * При старте приложения попросите пользователя ввести 2 дроби. Затем используя
     * интерфейс Runnable запустить 4 потока, которые используя лямбда-выражения выполнят действия:
     * •	Сумма двух дробей;
     * •	Разница двух дробей;
     * •	Произведение двух дробей;
     * •	Деление двух дробей.
     * Результ операций нужно вывести в консоль.
     */
}
