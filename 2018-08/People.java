package lianxi;

public class People {
	
	//修饰符：可以修饰类、属性、方法

	//类的一般方法
	private String name;        // private只在本类中可以看见
	private int age;            // protected 只在本类或者同一包里面可见
	private String sex;         // public 在所有类中都可见

	//无参
	void eat(){
		System.out.println("正在吃饭");
	}
	void tea(){
		System.out.println("正在喝茶");
	}
	
	public String run(){
		return "正在跑步";
	}
	
	
	// 修饰符  类型   方法名（参数类型  参数1，参数类型 参数2）{
	//   方法体
	// }
	public void drink(String type,int num){
		System.out.println("喝了"+type+",总共："+num+"杯");
	}

}
