package d0329;

public class Binarynotation {

	public static void main(String[] args) {
		bin(9);

	}

	public static void bin(int n) {
		if (n > 1) {
			bin(n/2);
		}
		System.out.print(n%2);
		 
		
			
		}
	}
// 1���� �۾��� ������ ����
// �׸��� �� ���� ���� 2�� ���� �������� ��� 

/*if (n > 1) {
bin(n/2);
System.out.print(n%2);
}
else {
System.out.print(n);}
*/ 
