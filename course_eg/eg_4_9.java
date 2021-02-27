
public class eg_4_9{
	private int size;
	public class Inner{
		public void doStuff(){
			size++;
		}
	}
	
	Inner i = new Inner();
	
	public void increaseSize(){
		i.doStuff();
	}
	
	public static void main(String[] a){
		eg_4_9 o = new eg_4_9();
		for(int i = 0;i < 4;i++){
			o.increaseSize();
			System.out.println("The value of size:" + o.size);
		}
	}
}
