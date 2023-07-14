package Unit_2.HomeWork.Task01;

public class Ciborg implements Doing{
    @Override
    public void run() {
        System.out.println("Робот побежал");
    }

    @Override
    public void jump() {
        System.out.println("Робот подпрыгнул");
    }
}
