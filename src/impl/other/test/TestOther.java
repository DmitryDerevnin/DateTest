package impl.other.test;

import impl.other.impl.AreaOfCircle;
import impl.other.impl.MaxMin;
import impl.other.impl.SumChecker;

public class TestOther {

    public void start() {
        AreaOfCircle areaOfCircle = new AreaOfCircle();
        SumChecker sumChecker = new SumChecker();
        MaxMin maxMin = new MaxMin();

        System.out.println("Площадь круга " +
                areaOfCircle.calculateAreaOfCircle(54.2354, 50));

        System.out.println("Третье число сумма первых двух? " +
                sumChecker.checkSum("0.1 0.3 0.4"));

        System.out.println("Максимум: " + maxMin.findMax(new int[]{4, 6, 2}));
        System.out.println("Минимум: " + maxMin.findMin(new int[]{6, 3, 5}));
    }
}
