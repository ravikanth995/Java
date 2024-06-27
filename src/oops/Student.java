package oops;

public class Student {

	int Sid = 123;
	String name = "Ravi";
	char Grade = 'A';
	
	
	void displayDetails()
	{
		System.out.println("Student Id :"+Sid+"\nStudent Name :"+name+"\nGrade :"+Grade);
	}
	
	void setStudentData(int SiD, String names, char grade)
	{
	  this.Sid = SiD;
	  this.name = names;
	  this.Grade = grade;
	}
	
	public static void main(String[] args) {
		
		Student st= new Student();
		st.displayDetails();
		System.out.println("-".repeat(80));
		st.setStudentData(1234, "ShashiKanth", 'B');
		st.displayDetails();

	}

}
