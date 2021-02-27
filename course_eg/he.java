/* import java.util.*;

//将Shape定义为interface
interface Shape{
	void draw();
	void erase();
}

//定义Circle类实现Shape
class Circle implements Shape{
	public void draw(){
		System.out.println("Call Cicle.draw()");
	}
	public void erase(){
		System.out.println("Call Cicle.erase()");
	}
}

//定义Square类实现Shape
class Square implements Shape{
	public void draw(){
		System.out.println("Call Square.draw()");
	}
	public void erase(){
		System.out.println("Call Square.erase()");
	}
}

//定义Triangle类实现Shape
class Triangle implements Shape{
	public void draw(){
		System.out.println("Call Triangle.draw()");
	}
	public void erase(){
		System.out.println("Call Triangle.erase()");
	}
}

//定义Triangle类实现Shape
class 长方形  implements Shape{
	public void draw(){
		System.out.println("Call 长方形.draw()");
	}
	public void erase(){
		System.out.println("Call 长方形.erase()");
	}
}
//包含main()的测试类
public class he{
	static void drawOneShape(Shape s){
		s.draw();
	}
	static void drawShapes(Shape[] ss){
		for(int i = 0; i < ss.length; i++){
			ss[i].draw();
		}
	}
	public static void main(String[] args){
		Random rand = new Random();
		Shape[] s = new Shape[9];
		for(int i = 0; i < s.length; i++){
			switch(rand.nextInt(4)){
			case 0: s[i] = new Circle();break;
			case 1: s[i] = new Square();break;
			case 2: s[i] = new Triangle();break;
			case 3: s[i] = new 长方形();break;
			default: break;
			}
		}
		drawShapes(s);
	}
}

 */