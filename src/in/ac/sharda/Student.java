package in.ac.sharda;

public class Student implements IresultarrivedListener {
	
	private final int rollNumber;
	private final String name;
	private String email;//state
	
	public Student (int rn, String nm)
	{
		this.rollNumber=rn;
		this.name=nm;
		//this shows current state of the variable
	}
	
	public Student (int rn, String nm, String e)// we can have n number of constructor in our class with same name
	{
		this.rollNumber=rn;
		this.name=nm;
		this.email=e;
		//this shows current state of the variable
	}
	
	//constructor:-
	//when class initialization  requires an external input we use constructor and when it is not possible 
	//to modify the value of few fields (variables) which are declared as final.
	
    public void attendance() {
    	System.out.println("Present Sir");//behaviour
    }
    
    public int getRollNumber() {
		return rollNumber;
	}
    
    //public void setRollNumber(int rn) {
    //	this.rollNumber=rn;
    //}
    //we cannot have setter method for final variable

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}
    
   //identity
	@Override
	public boolean equals(Object obj)// takes object obj as argument
	{
		if(obj instanceof Student)
		{
			return ((Student)obj)//typecasting obj as of student class
			    .getRollNumber() == rollNumber;
		}
		return false;
		
	}

@Override
public void resultArrived() {
	// TODO Auto-generated method stub
	System.out.println("IMPORTANT: Result has arrived, Click on the link below to see it !!!"+name);
	
}
	
	//public void resultArrived() {
		//System.out.println("Result Came In");//its a bug
	//}

}
