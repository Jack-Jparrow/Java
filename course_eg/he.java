/* import java.util.*;

//��Shape����Ϊinterface
interface Shape{
	void draw();
	void erase();
}

//����Circle��ʵ��Shape
class Circle implements Shape{
	public void draw(){
		System.out.println("Call Cicle.draw()");
	}
	public void erase(){
		System.out.println("Call Cicle.erase()");
	}
}

//����Square��ʵ��Shape
class Square implements Shape{
	public void draw(){
		System.out.println("Call Square.draw()");
	}
	public void erase(){
		System.out.println("Call Square.erase()");
	}
}

//����Triangle��ʵ��Shape
class Triangle implements Shape{
	public void draw(){
		System.out.println("Call Triangle.draw()");
	}
	public void erase(){
		System.out.println("Call Triangle.erase()");
	}
}

//����Triangle��ʵ��Shape
class ������  implements Shape{
	public void draw(){
		System.out.println("Call ������.draw()");
	}
	public void erase(){
		System.out.println("Call ������.erase()");
	}
}
//����main()�Ĳ�����
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
			case 3: s[i] = new ������();break;
			default: break;
			}
		}
		drawShapes(s);
	}
}

 */