
public class eg_3_4 {

	String employeeName;//��������
	String employeeAddress;
	
	public eg_3_4()/*���캯������ʼ����Ա�����͵�ַ*/{
		employeeName = "Jack";
		employeeAddress = "950YuCaiRoad";
	}
	//û�з���ֵ�ķ�����return���Ժ���
	
	public void displayDetails(){//��������͵�ַ
		System.out.println("��Ա�����ǣ�" + employeeName);
		System.out.println("��Ա��ַ�ǣ�" + employeeAddress);
		
		return;//�޷���ֵ
	}
	
	public static void main(String[] args) {
		eg_3_4 employee1 = new eg_3_4();//���ɹ�Ա
		employee1.displayDetails();//��ӡ��Ա��Ϣ
	}

}
