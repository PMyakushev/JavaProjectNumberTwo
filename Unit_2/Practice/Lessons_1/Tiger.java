package Unit_2.Practice.Lessons_1;

import Unit_3.Practice.Lessons_1.Cat;

public class Tiger extends Cat {
    static  int count;
    public Tiger(String name) {
        super(name);
    }
    public Tiger(String name, int runDistance) {
        super(name, runDistance);
        count++;
    }


}
