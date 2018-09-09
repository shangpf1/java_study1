package lianxi;

public class Person {
	
	String name;
	String sex;
	int age;
	
//	person(){
//		String name = null;
//		String sex = null;
//		int age = 0;
//	}                      默认的方法
	
	// 无参的构造方法
	Person(){
		
	}
	
	//有参的构造方法
	Person(String name,String sex,int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	//只对姓名进行调用
	Person(String name){
		this.name = name;
	}

	public static void main(String[] args) {
		//构造方法
		Person p = new Person();
		
		System.out.println(p.name);
		System.out.println(p.sex);
		System.out.println(p.age);
		
		Person p1 = new Person("李飞","男",32);
		System.out.println(p1.name+","+p1.sex+","+p1.age);
		
		Person p2 = new Person("lucy");
		System.out.println(p2.name);

	}
	

}
