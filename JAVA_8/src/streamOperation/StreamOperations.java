package streamOperation;

import java.util.List;
import java.util.stream.Collectors;

import data.StudentDataBase;

public class StreamOperations {
	
	// distict, count, sorted
	
	public static void getPerformOperations(){
		List<String> allStudentNames = StudentDataBase.getAllStudents().stream()
		.map(Student -> Student.getName())
		.collect(Collectors.toList());
		System.out.println("allStudentNames : "+allStudentNames);
		
		Long countStudentNames =StudentDataBase.getAllStudents().stream()
				.map(Student -> Student.getName())
				.count();
				System.out.println("allStudentNames count : "+countStudentNames);
		
		List<String> distinctStudentNames =StudentDataBase.getAllStudents().stream()
		.map(Student -> Student.getName())
		.distinct()
		.collect(Collectors.toList());
		System.out.println("distinctStudentNames : "+distinctStudentNames);
		
		Long counDistinctStudentNames = StudentDataBase.getAllStudents().stream()
				.map(Student -> Student.getName())
				.distinct()
				.count();
				System.out.println("distinctStudentNames count : "+counDistinctStudentNames);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPerformOperations();

	}

}
