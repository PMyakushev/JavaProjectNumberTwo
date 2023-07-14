package Unit_2.Practice.Cat;

public abstract class Animal {
    protected String name;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное :" + name);
    }

    public abstract void voice();


    public void jump() {
        System.out.println(" Прыжок ! ");
    }

}
