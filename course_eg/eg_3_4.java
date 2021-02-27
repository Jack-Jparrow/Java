
public class eg_3_4 {

	String employeeName;//声明变量
	String employeeAddress;
	
	public eg_3_4()/*构造函数，初始化雇员姓名和地址*/{
		employeeName = "Jack";
		employeeAddress = "950YuCaiRoad";
	}
	//没有返回值的方法，return可以忽略
	
	public void displayDetails(){//输出姓名和地址
		System.out.println("雇员名字是：" + employeeName);
		System.out.println("雇员地址是：" + employeeAddress);
		
		return;//无返回值
	}
	
	public static void main(String[] args) {
		eg_3_4 employee1 = new eg_3_4();//生成雇员
		employee1.displayDetails();//打印雇员信息
	}

}
