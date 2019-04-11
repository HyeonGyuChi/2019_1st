package d0322.Ex1;


public class IterativeGCD {

	public static void main(String[] args) {
		int a = 84;
		int b = 48;
		System.out.println("�ִ����� : " + gcd(a, b));
	}

	static int gcd(int a, int b) {
		int temp;
	
		if (a>b) { //�Է½� (a<=b)�� ���� ����ǹǷ� ó�� 
			temp = a;
			a = b;
			b = temp;
		}
		
		while (true) {
			int r = b % a;

			b = a;
			a = r;

			if (r == 0) {
				break;
			}

		}

		return b;
	}

}
