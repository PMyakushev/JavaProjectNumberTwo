package Unit_2.HomeWork.Task01;

public class Human implements Doing{
    @Override
    public void run() {
        System.out.println("Человек побежал");
    }

    @Override
    public void jump() {
        System.out.println("Человек подпрыгнул");
    }
}
