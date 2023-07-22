package Unit_5.HomeWork.Phone;

import java.util.ArrayList;
import java.util.List;
public class Institution {
    private String name;
    private List<Student> students;

    public Institution(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
}