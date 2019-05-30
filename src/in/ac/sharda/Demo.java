package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s= new Student(1, "Srishti");
		Student s1=new Student(2, "Prashant", "prashant@gmail.com");
		System.out.println(s.equals(s1));
		System.out.println(s.getRollNumber());
		System.out.println(s.getName());
		System.out.println(s1.getEmail());
		System.out.println(s1.getName());
		System.out.println(s1.getRollNumber());

	}

}
