package com.order;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByNameAndGpa {

	public static List<Student> sortStudentByName(){
	return	StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList());
	}
	public static List<Student> sortStudentByGpa(){
		return	StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed()).collect(Collectors.toList());
		}
	public static void main (String [] args) {
		System.out.println("Sort By Name:");
		sortStudentByName().forEach(System.out::println);
		System.out.println("Sort By Gpa:");
		sortStudentByGpa().forEach(System.out::println);

	}
}
