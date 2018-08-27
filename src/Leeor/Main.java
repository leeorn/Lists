package Leeor;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        /**
         * Learn and play a bit with ArrayList and its methods.
         * If capacity is not mention in () the initial capacity is 10.
         * We can add, remove (change size of the arraylist), replace an
         * element and much more.
         */
        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        //adding employees to the ArrayList
        employeeArrayList.add(new Employee("Noy", "Neh", 1));
        employeeArrayList.add(new Employee("John", "Smith", 10));
        employeeArrayList.add(new Employee("Jack", "John", 314));

        //Uses lambda expression to printout all the employees
        employeeArrayList.forEach(employee -> System.out.println(employee));

        //get only one member and print it
        System.out.println(employeeArrayList.get(0));

        //change one member to a new different one
        employeeArrayList.set(1, new Employee("Lee", "King", 456));
        System.out.println("after replacement:");
        employeeArrayList.forEach(employee -> System.out.println(employee));

        //add a new member to a specific location
        employeeArrayList.add(1,new Employee("Leeor", "Neh", 2));



    }
}
