package lianxi;

public class Testbreak {

	public static void main(String[] args) {
		
//		break 跳出当前循环 ,不过此循环体外的还会执行的
//		for(int j=1;j<9;j++){
//			if(j==3){
//				break;
//			}
//			System.out.println(j);
		
		for(int i=1;i<=10;i++){
			System.out.println("这是第"+i+"次外循环");
			for(int j=1;j<3;j++){
				System.out.println("-----这是第"+j+"次内循环");
				
			}
			System.out.println("hello world!!!!");

		}


	}

}
