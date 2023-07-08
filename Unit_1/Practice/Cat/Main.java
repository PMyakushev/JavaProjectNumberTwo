package Unit_1.Practice.Cat;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "White", 21);
        System.out.println("Кот " + cat1.getName() + ", " + cat1.getColor() + ", Цвет " + cat1.getAge() + " лет");
        Cat cat2 = new Cat("Murzik", "black", 10);
        System.out.println("Кот " + cat2.getName() + ", " + cat2.getColor() + ", Цвет " + cat2.getAge() + " лет");
        cat1.animalInfo();
        cat2.jump();
        cat1.voice();
    }
}

