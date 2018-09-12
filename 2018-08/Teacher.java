package lianxi;

// 静态变量：静态变量是属于类的，和对象没有关系。
// 非静态变量是属于某个对象的，每个对象都有该数据的副本，儿静态变量只有一个。
// 访问静态变量是通过（类名.变量名）来访问的。
public class Teacher {
	
	int id = 0;  //记录学号
	static int num = 0;    //记录数量
	
	Teacher(int id){
		this.id = id;
		num++;
	}

	public static void main(String[] args) {
		Teacher s1 = new Teacher(100);
		Teacher s2 = new Teacher(200);
		Teacher s3 = new Teacher(300);
		
		
		System.out.println("s1的学号："+s1.id);
		System.out.println("s2的学号："+s2.id);
		System.out.println("s3的学号："+s3.id);
		
		System.out.println("学生的数目："+Teacher.num);  //学生的数目
		
	}

}
