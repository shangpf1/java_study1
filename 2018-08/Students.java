package lianxi;

public class Students {
	String name;
	String sex;
	String stuNo;
	int age;
	
	//无参的，系统默然定义的变量赋值为空
	public Students(){
		
	}
	
	public Students(String name){
		this.name = name;
	}
	
	public Students(String name,String sex){
		this(name);
		this.sex = sex;
	}
	
	public Students(String name,String sex,String stuNo){
		this(name,sex);
		this.stuNo = stuNo;
	}
	
	public Students(String name,String sex,String stuNo,int age){
		this(name,sex,stuNo);
		this.age = age;
	}

	public static void main(String[] args) {
		
		Students st = new Students();
		
		//调用下面的printstudent方法
		printstudent(st);
		Students st1 = new Students("张三");
		printstudent(st1);
		Students st2 = new Students("张三","男");
		printstudent(st2);
		Students st3 = new Students("张三","男","10027");
		printstudent(st3);
		Students st4 = new Students("张三","男","10027",19);
		printstudent(st4);

	}
	
	//定义一个方法printstudent
	public static void printstudent(Students s){
		System.out.println("姓名"+s.name);
		System.out.println("性别"+s.sex);
		System.out.println("学号"+s.stuNo);
		System.out.println("年龄"+s.age);
		System.out.println("-------------------------");
	}

}
