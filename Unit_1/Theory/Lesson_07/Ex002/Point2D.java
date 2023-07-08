package Unit_1.Theory.Lesson_07.Ex002;

public class Point2D  {
    int x, y;

    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }
    public Point2D(int value){
        this(value, value);
    }
    public Point2D(){
        this(0);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }
    public void setY(int value) {
        this.y = value;
    }

    public String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
