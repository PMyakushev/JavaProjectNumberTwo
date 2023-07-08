package Unit_1.Practice.Cat;
public class Cat extends Animal{

    private String color;
    private Integer age;


    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 0) {
            this.age = age;
        }else {
            System.out.println("Введн некорректный возраст");
        }
    }
    @Override
    public void voice(){
        System.out.println("Мявк - Мявк");
    }
}

