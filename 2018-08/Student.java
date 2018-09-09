package lianxi;

public class Student {
	
	String name;
	String stuno;
	String sex;
	int age;
	
	public void play(){
		System.out.println("学生正在玩耍");;
	}
	
	// 无void 需要返回值
	public String eat(){
		return "学生正在吃饭";
	}
	
	public static void main(String[]args){
		Student s = new Student();
		s.name = "刘飞";
		s.stuno = "10023";
		s.sex = "男";
		s.age = 18;
		System.out.println("姓名："+s.name);
		System.out.println("学号："+s.stuno);
		System.out.println("性别："+s.sex);
		System.out.println("年龄："+s.age);
		
		s.play();
		
		System.out.println(s.eat());
	}

}
