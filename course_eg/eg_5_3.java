class car{
	final String PinPai = "品牌";
	void drive(){
		System.out.print(PinPai + "：");
	}
}

class Aodi extends car{
	int price;
	String model;
	Aodi(int price1, String model1){
		price = price1;
		model = model1;
	}

	public void drive(){
		System.out.println("奥迪");
		System.out.println("型号：Aodi " + model);
		System.out.println("价格：" + price);
		System.out.println("功能：变速");
	}
}

class Benchi extends car{
	int price;
	String model;
	Benchi(int price2, String model2){
		price = price2;
		model = model2;
	}

	public void drive(){
		System.out.println("奔驰");
		System.out.println("型号：Benchi " + model);
		System.out.println("价格：" + price);
		System.out.println("功能：变速");
	}
}

public class eg_5_3{
	public static void main(String[] args){
		car c = new car();
		Aodi a = new Aodi(10000000, "A10");
		c.drive();
		a.drive();
		System.out.println("======================");
		Benchi b = new Benchi(20000000, "HuaChen");
		c.drive();
		b.drive();
	}
}