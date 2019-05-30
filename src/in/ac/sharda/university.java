package in.ac.sharda;

import java.util.Set;
import java.util.TreeSet;

public class university {
	private Set<Department> departments= new TreeSet<>();
	
	public boolean addDepartment(Department department) {
    	return departments.add(department);
    }
	
	
	 public void printDeaprtments()//horizonatl scaling parallelstream... how to scale systems
	    {
	    	departments.parallelStream()// to use all cpu cores at same time...execution is faster
	    	.forEach(                                                // for loop// for(Student s : students)// use only 1 cpu core so is slow
	    			s -> System.out.println(
	    				s.getId()));
	    }// sequence will be printed randomly
	
	}
