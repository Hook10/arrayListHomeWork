import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private String position;

    public Employee(int id, String firstName, String lastName, int salary, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Employee)) return false;
        Employee employee = (Employee)obj;
        if(!this.firstName.equals(firstName)) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }

    public static Comparator<Employee> getCompByName(){
        return new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.firstName.compareTo(o2.firstName));

            }
        };
    }
    public static Comparator<Employee> getCompByPosition(){
        return new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.position.compareTo(o2.position));

            }
        };
    }

    public static Comparator<Employee> getCompById() {
        return new Comparator<Employee>() {

            public int compare (Employee employee1, Employee employee2){
                Integer id1 = employee1.getId();
                Integer id2 = employee2.getId();
                return id1.compareTo(id2);
            }
        };
    }
    public static Comparator<Employee> getCompBySalary() {
        return new Comparator<Employee>() {

            public int compare (Employee employee1, Employee employee2){
                Integer id1 = employee1.getId();
                Integer id2 = employee2.getId();
                return id2.compareTo(id1);
            }
        };
    }
    @Override
    public int compareTo(Employee o) {
        return this.id - id;
    }
}
