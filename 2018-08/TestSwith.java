package lianxi;

public class TestSwith {

	public static void main(String[] args) {
      
		int i = 3;
		switch(i){
		case 1:
			System.out.println("周一");
			break;          // 切记：每条语句后面都要执行break
		case 2:
			System.out.println("周二");
			break;
		case 3:
			System.out.println("周三");
			break;
		case 4:
			System.out.println("周四");
			break;
		case 5:
			System.out.println("周五");
			break;
		default:
			System.out.println("default语句");
			break;

		}

	}

}
