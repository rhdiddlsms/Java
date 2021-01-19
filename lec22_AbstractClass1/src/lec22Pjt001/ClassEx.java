package lec22Pjt001;

public class ClassEx extends AbstractClassEx {

	public ClassEx() {
		System.out.println("ClassEx constructor");
	}
	
	public ClassEx(int i, String s) {
		super(i, s); //상속 : 상위개념으로 매개변수값을 넘겨줌
	}
	
	@Override
	public void fun2() {
		System.out.println(" -- fun2() START -- ");
	}

}
