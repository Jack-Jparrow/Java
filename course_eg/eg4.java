import java.util.*;
public class eg4{
	public static void main(String[] args){
		Map<String, String> countries = new HashMap<String, String>();
		countries.put("CN", "中华人民共和国");
		countries.put("US", "美利坚合众国");
		countries.put("UK", "大不列颠及北爱尔兰联合王国");
		countries.put("JP", "日本");
		String country = (String)countries.get("CN");
		System.out.println("CN: " + country);
		System.out.println("Map中有" + countries.size() + "个国家");
		System.out.println("Map中有US吗？ " + countries.containsKey("US"));
		countries.remove("US");
		System.out.println("现在呢？");
		System.out.println("Map中有US吗？ " + countries.containsKey("US"));
		System.out.println(countries.keySet());
		System.out.println(countries.values());
		
		System.out.println(countries);
	}
}