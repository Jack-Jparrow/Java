class A
{
	int a= 0;
	public void print()
	{
		System.out.println(a);
	}
	public void printf()
	{
		System.out.println(a+1);
	}
}
class B extends A
{
	int a=1;
	int b=3;
	public void printd()
	{
		System.out.println(a+2);
	}
	public void print()
	{
		System.out.println(a+b);
	}
}
public class eg_5_2 {
	public static void main(String[] args)
	{
		A a = new B();
		a.print();
		a.printf();
	}
}
