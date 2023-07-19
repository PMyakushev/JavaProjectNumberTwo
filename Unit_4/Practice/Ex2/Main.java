package Unit_4.Practice.Ex2;

/*
2) Создать коробку с числами(BoxWithNumber) и найти среднее
значение(average) и сравнение средних(compareAverage).
 */
public class Main {
    public static void main(String[] args) {
        BoxWithNumber<Integer> box1 = new BoxWithNumber(10, 20, 30, 40, 50, 60, 70, 80);
        System.out.println("box1.average() = " + box1.average());
        BoxWithNumber<Float> box2 = new BoxWithNumber(10, 20, 30, 40, 50, 60, 70, 80);
        System.out.println("box2.average() = " + box2.average());

        System.out.println("box1.compareAverage(box2) = " + box1.compareAverage(box2));
    }


}
