package Unit_4.Practice.Ex1;
/*
Дженерик = обобщение
 */
public class GenBox<E> {
    E obj;

    public GenBox(E obj) {
        this.obj = obj;
    }

    public E getObj() {
        return obj;
    }

    public void setObj(E obj) {
        this.obj = obj;
    }
}
