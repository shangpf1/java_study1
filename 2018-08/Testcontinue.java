package lianxi;

public class Testcontinue {

	public static void main(String[] args) {
		// 停止本次循环，继续其他的循环

		for(int i=1;i<5;i++){
			if(i==4){
				continue;
			}
			System.out.println(i);
		}


	}

}
