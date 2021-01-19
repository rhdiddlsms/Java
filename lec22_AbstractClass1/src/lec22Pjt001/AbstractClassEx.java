package lec22Pjt001;

public abstract class AbstractClassEx {

	int num;
	String str;
	
	public AbstractClassEx() {
		System.out.println("AbstractClassEx constructor");
	}
	
	// 이 메서드가 super에 의해서 10, "java"를 받음
	public AbstractClassEx(int i, String s) {
		System.out.println("AbstractClassEx constructor");
		
		this.num = i;
		this.str = s;
	}
	
	public void fun1() {
		System.out.println(" -- fun1() START -- ");
	}
	
	public abstract void fun2();
	
}
