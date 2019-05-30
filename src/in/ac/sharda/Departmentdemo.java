package in.ac.sharda;

public class Departmentdemo {
	
	public static void main(String[] args) {
		
	
	Department d= new Department(0);
	d.addStudent(new Student(1, "Ary"));
	d.addStudent(new Student(2, "Bery"));
	d.addStudent(new Student(3, "cary"));
	d.addStudent(new Student(4, "dary"));
	d.addStudent(new Student(5, "Ary"));
	d.addStudent(new Student(6, "Bery"));
	d.addStudent(new Student(7, "cary"));
	d.addStudent(new Student(8, "dary"));
	d.addStudent(new Student(9, "Ary"));
	d.addStudent(new Student(10, "Bery"));
	d.addStudent(new Student(11, "cary"));
	d.addStudent(new Student(12, "dary"));
	d.printStudents();
	
   }
}