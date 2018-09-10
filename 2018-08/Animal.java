package lianxi;

public class Animal {
	
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
