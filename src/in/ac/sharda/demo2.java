package in.ac.sharda;

public class demo2 {
	public static void main(String[] args) {
		IresultarrivedListener iral =  new Student(1, "Srishti");
		iral.resultArrived();
		
		iral= new Department(1);
		
		iral.resultArrived();
		
		

	}

}
// interface cannot be instanced but you can create annoymous interclass from the interface
// interface should always be implemented
// interface are used to de-couple the system