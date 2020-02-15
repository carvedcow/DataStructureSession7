package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import Model.Employee;

public class Main {

	public static void main(String[] args) {
		// Task 1
		
		// With ArrayList Create a List of 3 cities
		List<String> cities = new ArrayList<String>();
		cities.add("Montreal");
		cities.add("Toronto");
		cities.add("Vancouver");
		
		// Then use for each on list to write the name of cities
		System.out.println("List of Cities: ");
		cities.stream().sorted().forEach(city -> System.out.println(city));
		
		// in the while loop, add a new city to your list
		
		
		// Task 2
		// Use ArrayList to store the information of 5 Employees
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "John", 50000));
		employees.add(new Employee(2, "Jim", 40000));
		employees.add(new Employee(3, "Mark", 30000));
		employees.add(new Employee(4, "David", 20000));
		employees.add(new Employee(5, "Mike", 10000));

		
		// Use stream method in collection class for filtering the Employee with salary more than 10000, print name if exist
		
		// this selects the first index found only
//		employees.stream().filter(emp -> emp.getEmpSalary() > 10000).findFirst().ifPresent(emp -> System.out.println(emp.getEmpName()));
		System.out.println("List of Employees who earn higher than 10000: ");
		employees.stream().filter(emp -> emp.getEmpSalary() > 10000).forEach(emp -> System.out.println(emp.getEmpName()));;

		
		// Use stream method in collection class for mapping the name of all employees.
		List<String> empNames = employees.stream().map(emp -> emp.getEmpName()).collect(Collectors.toList());
		System.out.println("List of Employee Names: ");
		empNames.stream().forEach(emp -> System.out.println(emp));
		
		
		int[] intArray = new int[] {1, 2, 3};
		
		//use Arrays.stream to stream an array
		Arrays.stream(intArray).map(n -> n*2).forEach(n -> System.out.println(n));
		//use .boxed() to convert to collection and save it
		List<Integer> intList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		
	}	
	
		
	

}
