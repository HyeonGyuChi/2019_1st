package d0315.Ex1;

//�ǽ� 1 a�� b�� int������ 32�� 4�� �����ϰ�
//sum substrace multiply divide�� �޼ҵ带 �����ؼ� return �޾� ���
public class Ex1 {

	public static void main(String[] args) {
		int a = 32;
		int b = 4;

		System.out.println(sum(a,b));
		System.out.println(substract(a, b));
		System.out.println(multiply(a, b));
		System.out.println(divide(a,b));
		
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	

	public static int substract(int a, int b) {
		return a-b;
	}
	

	public static int multiply(int a, int b) {
		return a*b;
	}
	

	public  static double divide(int a, int b) {
		return a/b;
	}
	

}
