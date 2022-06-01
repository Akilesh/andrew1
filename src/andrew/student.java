package andrew;

public class student {

	
int rollno;
String name;
void display()
{
	System.out.print(rollno);
	System.out.print(name);
}
student ()
{
	rollno=100;
	name="Raju";
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	student s1=new student();
	s1.display();
}

}
