package andrew;

public class Arithmetic
{
int a,b;
Arithmetic (int x,int y)
{
a=x;
b=y;

	}
void add()
{
	System.out.print(a+b);
	
}
void sub(int k,int l)
{
	System.out.print(k-l);
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Arithmetic ar=new Arithmetic(5,6);
	 ar.add();
	Arithmetic cr=new Arithmetic(7,6);
	 cr.sub(6,4);
}
}