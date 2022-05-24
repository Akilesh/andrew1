package andrew;

public class loopsomeofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=892;
int a=0;
while(num>0)
	
{
	a=a+num%10;
	num=num/10;
	
}
	System.out.println(a);
	}

}
