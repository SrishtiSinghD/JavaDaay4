package in.ac.sharda;

public class universitydemo {

	public static void main(String[] args) {
		university u = new university();
		for (int i = 1; i < 31; i++) {
			Department d = new Department(i);
			boolean added = u.addDepartment(d);
			if (added) {
				System.out.println("Department Added");
				for (int j = 1; j < 21; j++) {
					d.addStudent(new Student(i, "Name" + i+j, "Name"+i+"@gmail.com"));	
				}
			} else {
				System.out.println("Not added");
			}
		}
		u.printDeaprtments();
		u.resultDeclared();

	}

}
