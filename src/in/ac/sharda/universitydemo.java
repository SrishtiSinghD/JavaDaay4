package in.ac.sharda;

public class universitydemo {

	public static void main(String[] args) {
		university u= new university();
		for(int i=1; i<31; i++) {
			boolean added = u
					.addDepartment(new Department(i));
			if(added) {
				System.out.println("Department Added");
			}else {
				System.out.println("Not added");
			}
		}
		u.printDeaprtments();
	    

	}

}
