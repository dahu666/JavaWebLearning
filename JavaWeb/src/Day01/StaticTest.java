package Day01;

public class StaticTest {
	
	public static void main(String[] args) {
		
		Chinese c1 = new Chinese();
		c1.age = 40;
//		c1.name = "name111";
		Chinese.nation = "CHN";
		
		Chinese c2 = new Chinese();
		c2.age = 60;
		c2.name = "name222";
		Chinese.nation = "JAP";
		
		System.out.println("c1.age = " + c1.age);
		System.out.println("c1.name = " + c1.name);
		System.out.println("c1.nation = " + Chinese.nation);
		
		System.out.println("c2.age = " + c2.age);
		System.out.println("c2.name = " + c2.name);
		System.out.println("c2.nation = " + Chinese.nation);
		
		
		
	}
}

class Chinese{
	
	String name;
	int age;
	static String nation;
}
