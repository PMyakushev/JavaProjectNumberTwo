package Unit_2.Practice.Cat;


public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Barsik", "White", 21);
        // по полям
        //cat.Name("Тиша");
        //cat.Color("Black");
        //cat.Age(31);
        //Инкапсулировал
//        cat.setName("Тиша");
//        cat.setColor("Black");
//        cat.setAge(31);
//        System.out.println("Cat = " + cat);
//        cat.jump();
//        cat.voice();
//        cat.animalInfo();
        Animal[] caAndDogs = {
                new Cat("qwe", "asd", 21),
                new Dog("Bobik", "Black", 31)
        };
        for (Animal c : caAndDogs) {
            if (c instanceof Cat){
            ((Cat) c).klubok();
            } else {
                System.out.println("не кот! ");
            }
        }
    }
}

