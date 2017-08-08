package lesson13;

public class Employee {
    private String fullname;
    private double salary;

    @Override

    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        return fullname != null ? fullname.equals(employee.fullname) : employee.fullname == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fullname != null ? fullname.hashCode() : 0;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee[] = new Employee[4];
        employee[0] = new Employee();
        employee[0].setFullname("Иванов Иван Иванович");
        employee[0].setSalary(6500.00);
        employee[1] = new Employee();
        employee[1].setFullname("Петров Алесандр Иванович");
        employee[1].setSalary(6500.00);
        employee[2] = new Employee();
        employee[2].setFullname("Гончарова Светлана Петровна");
        employee[2].setSalary(5000.00);
        employee[3] = new Employee();
        employee[3].setFullname("Панина Лидия Михайловна");
        employee[3].setSalary(5300.00);
        Report.generateReport(employee);
    }

}
