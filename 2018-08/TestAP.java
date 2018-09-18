package lianxi;

public class TestAP {
	
	public static void main(String[]args){
		
//		Fruit f = new Fruit();
//		f.showMe();
		
//		Fruit s = new Apple();
//		s.showMe();
//		
//		Fruit a = new Pear();
//		a.showMe();
		
		//多态，指的就是一个对象（Fruit）的多种状态
		Fruit y = new Apple();
		Fruit p = new Pear();
		showMe(p);
	}
	
	public static void showMe(Fruit r){
		r.showMe();
	}

}
