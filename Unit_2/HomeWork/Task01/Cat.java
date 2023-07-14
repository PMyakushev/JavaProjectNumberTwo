package Unit_2.HomeWork.Task01;

public class Cat implements Doing{
    @Override
    public void run() {
        System.out.println("Кот побежал");
    }

    @Override
    public void jump() {
        System.out.println("Кот подпрыгнул");
    }
}
