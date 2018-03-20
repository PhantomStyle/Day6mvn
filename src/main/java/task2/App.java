package task2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Employee> testList = new ArrayList<>();
        testList.add(new Employee("qwe", 12, 120000));
        testList.add(new Employee("rty", 22, 12000));
        testList.add(new Employee("asd", 13, 200000));
        testList.add(new Employee("hjk", 20, 130000));
        App app = new App();
        app.sort(testList);
    }

    public void sort(List<Employee> employeeList){
        List<Employee> retList = new ArrayList<>();
        for(Employee employee : employeeList){
            if(employee.getAge() < 21 && employee.getSalary() > 100000){
                retList.add(employee);
            }
        }
        retList.sort(Employee::compareTo);
        System.out.println(retList);
    }
}
