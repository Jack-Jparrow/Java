import java.util.*;
public class eg4{
	public static void main(String[] args){
		Map<String, String> countries = new HashMap<String, String>();
		countries.put("CN", "�л����񹲺͹�");
		countries.put("US", "��������ڹ�");
		countries.put("UK", "���е߼�����������������");
		countries.put("JP", "�ձ�");
		String country = (String)countries.get("CN");
		System.out.println("CN: " + country);
		System.out.println("Map����" + countries.size() + "������");
		System.out.println("Map����US�� " + countries.containsKey("US"));
		countries.remove("US");
		System.out.println("�����أ�");
		System.out.println("Map����US�� " + countries.containsKey("US"));
		System.out.println(countries.keySet());
		System.out.println(countries.values());
		
		System.out.println(countries);
	}
}