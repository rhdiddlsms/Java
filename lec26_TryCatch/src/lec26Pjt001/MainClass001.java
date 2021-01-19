package lec26Pjt001;

//try catch 예외처리 : 전체적인 시스템 흐름에 방해가 되지 않기 위해 예외처리한다.
public class MainClass001 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		int r = 0;
		
		System.out.println("Exception BEFORE");
		
		try {
			r = i / j;
		} catch (Exception e) {
			e.printStackTrace(); //어떠한 예외가 발생했는지 출력해줌.
			String msg = e.getMessage();//예외를 간략하게 보여줌
			System.out.println("msg : " + msg);
		}
		
		System.out.println("Exception AFTER");
	}
	
}
