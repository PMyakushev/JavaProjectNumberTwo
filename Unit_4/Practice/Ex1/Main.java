package Unit_4.Practice.Ex1;
/*
1) Создать класс - коробку (SimpleBox), которая может хранить любые объекты.
Посмотреть с какими ошибками можно столкнуться и исправить данное
решение на более подходящее(GenBox).
 */
public class Main {
    public static void main(String[] args) {
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        int sum = (Integer)intBox1.getObj()+ (Integer)intBox2.getObj(); //Каждый раз необходимо проверять тип данных
        System.out.println("sum = " + sum);
        // разрастаеться...
        intBox2.setObj("10"); // засетить могу что угодно и где угодно
        if(intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer){
            int sum2 = (Integer)intBox1.getObj()+ (Integer)intBox2.getObj();
            System.out.println("sum2 = " + sum2);
        }


        GenBox<Integer> genBox1 = new GenBox(10);
        GenBox<Integer> genBox2 = new GenBox(20);
        int sum3 = genBox2.getObj() + genBox1.getObj();
        System.out.println("sum3 = " + sum3);
        // разрастаеться...
        //genBox1.setObj("10"); //ошибка на стадии компиляции а не выполнения

    }
}
