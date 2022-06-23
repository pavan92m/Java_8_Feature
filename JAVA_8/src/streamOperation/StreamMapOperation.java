package streamOperation;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamMapOperation {
	
	public static List<String> nameList(){
		
		return StudentDataBase.getAllStudents().stream()
				.map(Student :: getName )
				.collect(Collectors.toList());
		
	}	
	public static void main(String[] args) {
		
		System.out.println(nameList());
		
	}

}
