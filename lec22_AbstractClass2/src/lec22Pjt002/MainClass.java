package lec22Pjt002;

public class MainClass {

	public static void main(String[] args) {
		
		Bank myBank = new MyBank("박찬호", "123-4567-89012", 10000);
		
		myBank.deposit();				// ����
		myBank.withdraw();				// ���
		myBank.installmentSavings();	// ����
		myBank.cancellation();			// �ؾ�
		
		System.out.println();
		
		myBank.getInfo();
		
	}
	
}
