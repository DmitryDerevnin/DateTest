package impl.other.impl;

import java.math.BigDecimal;

public class AreaOfCircle {
    private double radius;

    public BigDecimal calculateAreaOfCircle(double radius, int scale) {
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        return BigDecimal.valueOf(areaOfCircle).
                setScale(scale, BigDecimal.ROUND_HALF_DOWN);
    }


}
