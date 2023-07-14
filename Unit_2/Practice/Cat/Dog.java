package Unit_2.Practice.Cat;

public class Dog  extends Animal{
    private String color;
    private int age;
    public Dog(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void voice(){
        System.out.println("Gav Gav");
    }
    public void animalInfo() {
        System.out.println("Этот кот с именем " + name + ", с возрастом- " + age + " , с цветом шерсти: " + color);
    }
}
