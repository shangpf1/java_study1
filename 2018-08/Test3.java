package lianxi;
import java.util.Scanner;

public class Test3 {


	public static void main(String[] args) {
		// 学生成绩管理系统
		int Student;
		double avg=0,sum=0;
		double[] temp = new double[5];
		//创建一个Scanner类的对象，用他来获得用户的输入
		Scanner input = new Scanner(System.in);
		System.out.println("请输入前5名学生的成绩：");
		
		for(Student=0;Student<temp.length;Student++){
			temp[Student]= input.nextDouble();
			sum+=temp[Student];
			
		}
		avg=sum/5;
		System.out.println("平均成绩："+avg);
		
		for(Student=0;Student<temp.length;Student++){
			if(temp[Student]>avg){
				System.out.println("该学生的成绩高于平均成绩");
			}else if(temp[Student]<avg){
				System.out.println("该学生的成绩低于平均成绩");
			}else{
				System.out.println("该学生的成绩等于平均成绩");
			}
		}

	}

}
