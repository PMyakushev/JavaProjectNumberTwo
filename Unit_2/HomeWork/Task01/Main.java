package Unit_2.HomeWork.Task01;
/*
1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса.
Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
 */
public class Main {
    public static void main(String[] args) {
        Ciborg ciborg = new Ciborg();
        ciborg.run();
        ciborg.jump();
        Cat cat = new Cat();
        cat.run();
        cat.jump();
        Human human = new Human();
        human.run();
        human.jump();

    }
}
