package task2;

public class Employee implements Comparable<Employee>{
    private final String name;
    private final int age;
    private final int salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name +
                "'}";
    }
}
