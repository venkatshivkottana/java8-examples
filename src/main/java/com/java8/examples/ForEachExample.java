package com.java8.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.examples.model.Employee;

public class ForEachExample {

	public static void main(String args[]) {

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(assignEmployee(1, "Venkat", 10000000, "Hyderabad"));
		employeeList.add(assignEmployee(2, "Shiva", 100000, "Chodavaram"));

		employeeList.forEach(employee -> {
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
		});

		System.out.println(Stream.of(1, 4, 1, 5, 9).mapToInt(i -> i.intValue()).sum());

		System.out.println(Stream.of(1, 4, 1, 5, 9, 10, 30).reduce(0, (a, b) -> a + b));

		System.out.println(Stream.of(1, 4, 1, 5, 9).filter(i -> i % 2 == 0).collect(Collectors.toList()));

		Stream.of(1, 4, 1, 5, 9).filter(i -> i % 2 == 0).forEach(x -> System.out.println(x));

		Stream.of(60, 65, 45, 30, 45).map(x -> x + 5).forEach(x -> System.out.print(x));

		System.out.println(Stream.of(60, 65, 45, 30, 45, 25, 15).filter(i -> i < 35).count());
		System.out.println("--------------------");
		Stream.of(60, 65, 45, 30, 45, 25, 15, 26).sorted().forEach(x -> System.out.println(x));
		System.out.println("--------------------");
		Stream.of(60, 65, 45, 30, 45, 25, 15, 26).sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)
				.forEach(x -> System.out.print(" " + x));
		System.out.println("--------------------");
		List<String> stringList = new ArrayList<String>();
		stringList.add("a");
		stringList.add("bb");
		stringList.add("a");
		stringList.add("cccc");
		stringList.add("d");

		stringList.stream().sorted((s1, s2) -> s1.compareTo(s2)).forEach(x -> System.out.print(" " + x));

		System.out.println("--------------------");

		/*
		 * Comparator<String> c = (str1,str2)-> { int firstStringLength = str1.length();
		 * int secondStringLength = str2.length();
		 * 
		 * if(firstStringLength<secondStringLength) { return -1; } else
		 * if(firstStringLength<secondStringLength) { return 1; } else { return
		 * str1.compareTo(str2); }
		 * 
		 * };
		 * 
		 * stringList.stream().sorted(c).forEach(System.out::println);
		 */

		Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5 };
		int min = (int) Collections.min(Arrays.asList(numbers));
		int max = (int) Collections.max(Arrays.asList(numbers));

		System.out.println("Min number: " + min);
		System.out.println("Max number: " + max);

		// Stream.of("Shiva","Kumar","komali","Keka","Ishita").sorted((s1,s2)->s1.compareTo(s2)).forEach(x->System.out.print("
		// "+x));
	}

	private static Employee assignEmployee(int id, String name, double salary, String address) {
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(10000);
		employee.setAddress(address);

		return employee;
	}
}
