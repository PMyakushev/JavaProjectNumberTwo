package Unit_4.Practice.Ex4;

public class Employee {
    String flo;
    double salary;
    String jobTitle;

    public Employee(String flo, double salary, String jobTitle) {
        this.flo = flo;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getFlo() {
        return flo;
    }

    public void setFlo(String flo) {
        this.flo = flo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "flo='" + flo + '\'' +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
