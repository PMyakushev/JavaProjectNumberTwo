package Unit_2.Practice.Lessons_1;

/*5) Попрактикуемся на задаче:
 Создать классы Собака, Кот,Домашний Кот, Тигр, Животное
 Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина
препятствия.
 У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м;
плавание: кот — не умеет плавать, собака — 10 м). Результатом выполнения действия
будет печать в консоль.
 Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'.
 Создать один массив с животными и заставить их по очереди пробежать дистанцию и
проплыть.
 Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных.
 */
public class Programm {
    public static void main(String[] args) {
        Animal[] animal = {
                new Dog("Bobik", 500, 1),
                new HomeCat("Barsik", 20),
                new Cat("Myrka", 50),
                new Tiger("Leo", 100)

        };
        for (Animal a : animal) {
            a.run(600);
            a.swiming(10);

        }
//        System.out.println("Было созданно животных: " + animal.length);
//        System.out.println("Animal count = " + Animal.count);
//        System.out.println("Dog.count = " + Dog.count);
//        System.out.println("Cat.count = " + Cat.count);
//        System.out.println("HomeCat.count = " + HomeCat.count);
//        System.out.println("Tiger count = " + Tiger.count);


    }
}
