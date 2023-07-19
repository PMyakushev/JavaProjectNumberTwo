package Unit_2.Practice.Lessons_1;

public class Cat extends Animal {
    protected static int count;
    int runDistance;
    int swimingDistance;

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int runDistance) {
        super(name);
        if (runDistance > 200) {
            this.runDistance = 200;
            System.out.println("Введите значение больше максимально, установлено максимальное");
        } else {
            this.runDistance = runDistance;
        }
        this.swimingDistance = 0;
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance > runDistance) {
            System.out.println("Cat " + name + " Не сможет пробежать");
        } else {
            System.out.println("Cat " + name + " Сможет пробежать");
        }
    }

    @Override
    public void swiming(int distance) {
        swimingDistance = 0;
        System.out.println("Кот не умеет плавать");
    }
}
