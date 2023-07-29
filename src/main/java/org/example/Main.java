package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Test1 test1 = new Test1();
//        Test2 test2 = new Test2();
//        test1.setTest(2);
//        test2.setT2(test1.getTest());
//
//        System.out.println(test1);
//        System.out.println(test2);
//        test1.setTest(7);
//        System.out.println(test2);
//        System.out.println(test1);
        Main obj = new Main();
        List<Employee> emps = obj.initEmp();


        System.out.println(emps.stream().filter(a -> a.designation().contains("codder")).map(Employee::salary).reduce(0d, Double::sum));
        Employee emp = new Employee();
//        emp.id()=1;
        emps.stream().peek(a -> System.out.println(emp.id())).count();
//        emps.stream().mapMulti(a -> a.designation().contains(""));

    }


    List<Employee> initEmp() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "rama", "1234567890", Arrays.asList("java dev", "project lead"), (double) 50000));
        list.add(new Employee(2, "sama", "1234567891", Arrays.asList("java dev", "codder"), (double) 30000));
        list.add(new Employee(3, "dama", "1234567892", Arrays.asList("java dev", "codder"), (double) 30000));
        list.add(new Employee(4, "cama", "1234567893", Arrays.asList("java dev", "codder"), (double) 30000));
        list.add(new Employee(5, "vama", "1234567894", Arrays.asList("java dev", "codder"), (double) 30000));
        list.add(new Employee(6, "nama", "1234567895", Arrays.asList("java dev", "codder"), (double) 30000));
        list.add(new Employee(7, "gama", "1234567896", Arrays.asList("java dev", "codder"), (double) 30000));
        list.add(new Employee(8, "pama", "1234567897", Arrays.asList("java dev", "codder", "marketing"), (double) 40000));
        list.add(new Employee(9, "jama", "1234567898", Arrays.asList("java dev", "codder"), (double) 30000));
        list.add(new Employee(10, "bama", "1234567899", Arrays.asList("java dev", "codinator"), (double) 30000));
        list.add(new Employee(11, "lulu", "1234567810", Arrays.asList("java dev", "lead", "manager"), (double) 60000));
        list.add(new Employee(12, "bulu", "1234567811", Arrays.asList("java dev"), (double) 35000));
        list.add(new Employee(13, "gitu", "1234567812", Arrays.asList("java dev"), (double) 36000));
        list.add(new Employee(14, "mama", "1234567813", Arrays.asList("java dev"), (double) 31000));


        return list;
    }
}