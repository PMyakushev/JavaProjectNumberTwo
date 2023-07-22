package Unit_5.HomeWork.Phone;


public class Student extends Person {
    private String course;

    public Student(String name, Integer age, String course) {
        super(name, age);
        this.course = course;
    }


    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
