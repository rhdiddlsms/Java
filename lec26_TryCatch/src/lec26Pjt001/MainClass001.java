package lec26Pjt001;

//try catch ����ó�� : ��ü���� �ý��� �帧�� ���ذ� ���� �ʱ� ���� ����ó���Ѵ�.
public class MainClass001 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		int r = 0;
		
		System.out.println("Exception BEFORE");
		
		try {
			r = i / j;
		} catch (Exception e) {
			e.printStackTrace(); //��� ���ܰ� �߻��ߴ��� �������.
			String msg = e.getMessage();//���ܸ� �����ϰ� ������
			System.out.println("msg : " + msg);
		}
		
		System.out.println("Exception AFTER");
	}
	
}
