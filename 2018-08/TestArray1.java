package lianxi;

public class TestArray1 {

	public static void main(String[] args) {
		// array1、array2分别赋值
		
		int[] array1 = {1,2,3};
		int[] array2 = {4,5,6};
		
		System.out.println("两个数组的初始值为：");
		for(int i=0;i<array1.length;i++){
			System.out.println("array1["+i+"]="+array1[i]);
		}
		for(int j=0;j<array2.length;j++){
			System.out.println("array2["+j+"]="+array2[j]);
		}
		
		//将array2赋值给array1
		array1=array2;
		System.out.println("----赋值后的值：---");
		for(int i=0;i<array1.length;i++){
			System.out.println("array1["+i+"]="+array1[i]);
		}
		for(int j=0;j<array2.length;j++){
			System.out.println("array2["+j+"]="+array2[j]);
		}
		
		//前2个数组赋值后会改变，其他的不改变
		array1[0]=100;
		array2[1]=60;
		System.out.println("---重新赋值之后的值：---"); 
		for(int i=0;i<array1.length;i++){
			System.out.println("array1["+i+"]="+array1[i]);
		}
		for(int j=0;j<array2.length;j++){
			System.out.println("array2["+j+"]="+array2[j]);
		}
	}

}
