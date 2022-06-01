package andrew;

public class student1 {

	
		int rollno;
		String name;
		void display()
		{
			System.out.print(rollno);
			System.out.print(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student();
s1.rollno=100;
s1.name="Raju";
student s2=new student();
s2.rollno=26;
s2.name="Virat";
}
}