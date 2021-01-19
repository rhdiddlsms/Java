package lec22Pjt002;

public class MyBank extends Bank {

	public MyBank(String name, String account, int totalAmount) {
		super(name, account, totalAmount); //상위클래스인 Bank 호출
	}
	
	@Override
	public void installmentSavings() {
		System.out.println(" -- installmentSavings() START -- ");
	}

	@Override
	public void cancellation() {
		System.out.println(" -- cancellation() START -- ");
	}

}
