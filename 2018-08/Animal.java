package lianxi;

public class Animal {

	// 基本数据类型作为参数，直接操作
	// 引用类型作为参数，操作的是引用指向的堆内存中的对象
	
	String name;
	String skin;  //肤色
	String type;  //品种
	
	
	public static void main(String[]args){
		Animal a = new Animal();
		a.name = "小花";
		a.skin = "棕色";
		a.type = "猫";
		
		printAnimal(a);
		
	}


    public static void printAnimal(Animal a){
    	System.out.println("它的名字是："+a.name+"，肤色："+a.skin+
    			"，品种："+a.type);
	
	
    }
    
}
