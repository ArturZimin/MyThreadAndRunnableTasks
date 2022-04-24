package by.itstep.zimin.task2;

import java.util.Objects;

public class MyNewRunnableLambda implements Runnable {


    double one;
    double two;

    private String nameCurrentThread;

    public String getNameCurrentThread() {
        return nameCurrentThread;
    }


    public double getOne() {
        return one;
    }

    public double getTwo() {
        return two;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyNewRunnableLambda that = (MyNewRunnableLambda) o;
        return Double.compare(that.one, one) == 0 && Double.compare(that.two, two) == 0 && Objects.equals(nameCurrentThread, that.nameCurrentThread);
    }

    @Override
    public int hashCode() {
        return Objects.hash(one, two, nameCurrentThread);
    }

    @Override
    public String toString() {
        return "MyNewRunnableLambda{" +
                "one=" + one +
                ", two=" + two +
                ", nameCurrentThread='" + nameCurrentThread + '\'' +
                '}';
    }

    @Override
    public void run() {
        this.one = RunnableTest.one;
        this.two = RunnableTest.two;
        this.nameCurrentThread = Thread.currentThread().getName();

        if ("countSum".equals(getNameCurrentThread())) {
            MathFunction<Double> plus = (o, t) -> (((o * 10) + (t * 10)) / 10);
            double result = plus.multiFunctional(getOne(), getTwo());
            System.out.println("The sum of elements is : " + result);

        }
        else if ("difference".equals(getNameCurrentThread())) {
            MathFunction<Double> minus = (x, c) -> {
                if (x > c) {
                    return (((x*10) - (c*10))/10);
                } else {
                    return (((c*10) - (x*10))/10);
                }
            };
            double resultMin = minus.multiFunctional(getOne(), getTwo());
            System.out.println("The difference of elements is : " + resultMin);
        }
        else if ("multiply".equals(getNameCurrentThread())) {
            MathFunction<Double> multiply = (z, x) -> (((z*10) * (x*10))/100);
            double resultMul = multiply.multiFunctional(getOne(), getTwo());
            System.out.println("The result after multiply is : " + resultMul);

        } else if ("divide".equals(getNameCurrentThread())) {
            MathFunction<Double> divide = (z, x) -> {
                if (x != 0.0 && x != 0) {
                    return ((z*10) / (x*10));
                } else {
                    throw new ArithmeticException("Divide by zero forbidden!");
                }
            };
            double resultDiv = divide.multiFunctional(getOne(), getTwo());
            System.out.println("The result after divide is : " + resultDiv);
        }

    }


/*
  При старте приложения попросите пользователя ввести 2 дроби. Затем используя
  интерфейс Runnable запустить 4 потока, которые используя лямбда-выражения выполнят действия:
  •	Сумма двух дробей;
  •	Разница двух дробей;
  •	Произведение двух дробей;
  •	Деление двух дробей.
  Результ операций нужно вывести в консоль.
 */

}
