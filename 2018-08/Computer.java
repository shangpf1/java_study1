package lianxi;

public class Computer {
	/*
	 * 方法的重载：在一个类中可以有多个方法共享同一个名称,只要他们的参数不同就可以。
	 * 根据参数类型和参数数量来决定要调用的方法。
	 * 重载：具有相同的方法名称，不同的参数列表。
	 * 不同的参数列表指：参数类型不同、参数数量不同、参数次序不同
	 */
	
	//static方法可以通过类名调用，不需要实例化
	public static int sum(int a,int b){
		return a + b;
	}
	
	public static int sum(int a,int b,int c){
		return a + b + c;
	}
	
	// 3个参数
	public static double sum(double a,double b){
		return a + b;
	}
	
	public static void main(String[]args){
		//Computer c = new Computer();
		int sum = Computer.sum(3, 4);
		System.out.println(sum);
		
		int sum1 = Computer.sum(1,2,3);
		System.out.println(sum1);
		
		double sum2 = Computer.sum(3.5, 4.8);
		System.out.println(sum2);
		
	}
	


}
