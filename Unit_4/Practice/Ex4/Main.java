package Unit_4.Practice.Ex4;

import java.util.ArrayList;
import java.util.List;

/*
4) Написать Generic-class LRUCache, с методами : addElement, getElement(по
позиции), getAllElement . Посмотреть как поведет себя с классом
Employee(fio,salary,jobTitle)
Логика кэша такая:
 в конструктор при создании подается количество кэшируемых
элементов
 При переполнении крайний левый элемент кэша(самый старый)
удаляется
 В самый правый конец добавляется новый элемент
 */
public class Main {
    public static void main(String[] args) {
        LRUCache<Employee> lruCache = new LRUCache<Employee>(4);
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            employees.add(new Employee("Ивано Иван Иванович" + i, i * 100, "Раб" + i));
        }
        for (Employee e : employees) {
            lruCache.addElement(e);
            System.out.println("lruCache.getAllElement() = " + lruCache.getAllElement().size());
        }

    }
}
