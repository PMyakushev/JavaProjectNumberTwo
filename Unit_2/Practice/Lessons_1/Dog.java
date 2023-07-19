package Unit_2.Practice.Lessons_1;

import Unit_3.Practice.Lessons_1.Animal;

public class Dog extends Animal {
    protected static int count;
    int runDistance;
    int swimingDistance;

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int runDistance, int swimingDistance) {
        super(name);
        if (runDistance > 500) {
            this.runDistance = 500;
            System.out.println("Введите значение больше максимально, установлено максимальное");
        } else {
            this.runDistance = runDistance;
        }

        if (runDistance > 10) {
            this.swimingDistance = 10;
            System.out.println("Введите значение больше максимально, установлено максимальное");
        } else {
            this.swimingDistance = swimingDistance;
        }
        count++;

    }

    @Override
    public void run(int distance) {
        if (distance > runDistance) {
            System.out.println("Dog " + name + " Не сможет пробежать");
        } else {
            System.out.println("Dog " + name + " Сможет пробежать");
        }
    }

    public void swiming(int distance) {
        if (distance > runDistance) {
            System.out.println("Dog " + name + " Не сможет проплыть");
        } else {
            System.out.println("Dog " + name + " Сможет проплыло");
        }
    }
}
