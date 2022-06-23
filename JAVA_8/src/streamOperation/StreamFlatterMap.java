package streamOperation;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamFlatterMap {
	
	public static List<List<String>> mapStudentActivity(){
		// Data Transfer
		return StudentDataBase.getAllStudents().stream()
				.map(Student :: getActivities)
				.collect(Collectors.toList());
		
	}
	
	public static List<String> studentActivity1(){
		// Data transfer + flattering
		return StudentDataBase.getAllStudents().stream()
				.map(Student :: getActivities)
				.flatMap(List :: stream)
				.collect(Collectors.toList());
		
	}
	public static List<String> studentActivity2(){
		// Data transfer + flattering
		return StudentDataBase.getAllStudents().stream()
				.flatMap(Student -> Student.getActivities().stream())
				.collect(Collectors.toList());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mapStudentActivity());
		System.out.println(studentActivity1());
		System.out.println(studentActivity2());

	}

}
