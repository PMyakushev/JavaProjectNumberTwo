package Unit_2.Practice.Lessons_1;

public abstract class Animal {
    protected String name;
    static int count;
    public Animal(String name) {
        this.name = name;
        count++;
    }

    public abstract void run(int distance);
    public abstract void swiming(int distance);

}
