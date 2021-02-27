
class Outer{
	public String name = "test";
	private static int age = 20;
	static class Inner{
		private String name;
		public void fun(){
			System.out.println(name);
			System.out.println(age);
		}
	}
}

public class eg_4_8{
	public static void main(String[] args){
		Outer.Inner in = new Outer.Inner();
		in.fun();
	}
}
