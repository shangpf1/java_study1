package lianxi;

public class Demo {
    
	//静态变量
	static int a = 0;
	
	static{
		a = 100;
	}
	
	//Demo方法，执行此方法前先执行上面的static方法
	Demo(){
		System.out.println(a);
	}
	public static void main(String[] args) {
		//构造方法
		new Demo();

	}

}
