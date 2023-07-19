package Unit_4.Practice.Ex3;

import java.util.List;

public class Calculator<t> {
    public Double sum(List<? extends Number> numbers) {
        double sum = 0.0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
