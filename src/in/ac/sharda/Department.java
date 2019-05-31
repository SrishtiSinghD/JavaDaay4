package in.ac.sharda;

import java.util.ArrayList;
import java.util.List;

public class Department implements Comparable<Department> , IresultarrivedListener  {//compares two departments//its an interface
	private final int id;
	
    private List<Student> students= new ArrayList<>();
    
    public Department(int id) {
    	this.id=id;
    	}
    
    public void addStudent(Student student) {
    	this.students.add(student);
    }
    
    public void printStudents()//horizonatl scaling parallelstream... how to scale systems
    {
    	students.parallelStream()// to use all cpu cores at same time...execution is faster
    	.forEach(                                                // for loop// for(Student s : students)// use only 1 cpu core so is slow
    			s -> System.out.println(
    					s.getRollNumber()));
    }// sequence will be printed randomly

	public int getId() {
		return id;
	}
	@Override
	public boolean equals(Object obj)// takes object obj as argument
	{
		if(obj instanceof Department)
		{
			return ((Department)obj)//typecasting obj as of student class
			    .getId() == id;
		}
		return false;
	}

	@Override
	public int compareTo(Department o) {
			// comapres on basis of ID (or name or number of students)
		return o.getId() -id;//subtract id of o from current dept id
		//if its positive... greater
		//if its negative...smaller
		//if its zero...same or equal dept
		// sorts dept as well compares while in equal it only tells whether it is equal or not
	}

	@Override
	public void resultArrived() {
		// single core
		for(Student s: students) {
			s.resultArrived();
		}
		
	}

	
	
}



