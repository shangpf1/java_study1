package lianxi;

public class TestReturn {


	public static void main(String[] args) {
		// 直接跳出方法体，整体都不执行了，和break有点相似
		
		for(int j=1;j<9;j++){
			if(j==6){
				return;
			}
			System.out.println(j);
		}
		System.out.println("hello world!");

	}

}
