package Unit_4.Practice.Ex4;

import java.util.ArrayList;
import java.util.List;

public class LRUCache<N> {
    ArrayList<N> liseE;
    int size;

    public LRUCache(int size) {
        this.size = size;
        liseE = new ArrayList<>();
    }

    public void addElement(N employees) {
        if (liseE.size() > size){
            liseE.remove(0);
        }
            this.liseE.add(employees);
    }

    public N getElement(int ind) {
        if (ind >= liseE.size()) {
            return null;
        }
        return this.liseE.get(ind);
    }

    public List<N> getAllElement() {
        return this.liseE;
    }

    @Override
    public String toString() {
        return "LRUCache{" +
                "liseE=" + liseE +
                ", size=" + size +
                '}';
    }
}
