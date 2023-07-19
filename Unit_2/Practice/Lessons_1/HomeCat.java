package Unit_2.Practice.Lessons_1;

import Unit_3.Practice.Lessons_1.Cat;

public class HomeCat extends Cat {
    static  int count;
    public HomeCat(String name) {
        super(name);
    }

    public HomeCat(String name, int runDistance) {
        super(name, runDistance);
        count++;
    }

}
