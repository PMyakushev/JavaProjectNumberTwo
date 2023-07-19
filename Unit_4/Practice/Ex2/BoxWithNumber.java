package Unit_4.Practice.Ex2;

import Unit_2.Practice.Lessons_1.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BoxWithNumber<E extends  Number> {
    E[] number;

    public BoxWithNumber(E... num) {
        this.number = num;
    }

    public Double average() {
        double sum = 0.0;

        for (E e :number) {
            sum += e.doubleValue();
        }
        return sum/number.length;
    }


    public boolean compareAverage(BoxWithNumber<?> box2) {
        if (Math.abs(this.average()-box2.average()) < 0.000001){
            return true;
        };
        return false;
    }
}
