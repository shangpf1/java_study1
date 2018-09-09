package lianxi;

public class Test1 {


	public static void main(String[] args) {
		int result = 97;
		String evaluate = null;
		if(result<0||result>100){
			evaluate = "成绩不合法，必须在0~100之间";
		}else if(result<60){
			evaluate = "不及格，加油吧！";
		}else if(result>=60&result<75){
			evaluate = "良好，仍需努力吧";
		}else if(result>=75&result<90){
			evaluate = "成绩良好，更上一层楼";
		}else{
			evaluate = "传说中的学霸";
		}
		System.out.println("你的成绩是"+result+"评价："+evaluate);


	}

}
