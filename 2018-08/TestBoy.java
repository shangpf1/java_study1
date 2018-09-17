package lianxi;

public class TestBoy {

	public static void main(String[] args) {
		// 封装
		Boy b = new Boy();
		b.setName("李四");
		System.out.println(b.getName());
		
		b.setSex("男");
		System.out.println(b.getSex());
		
		b.setAge(16);
		System.out.println(b.getAge());
		
		b.setAddr("上海");
		System.out.println(b.getAddr());

		
	}

}
