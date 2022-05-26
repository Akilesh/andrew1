package andrew;

public class reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=759;
int s=0;
while(num>0) {
	s=(s*10)+(num%10);
num=num/10;
}
System.out.print(s);
}  }