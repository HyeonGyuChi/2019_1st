package d0329;

public class hanoiTowers {

	public static void main(String[] args) {
		int numTowers = 3;

		hanoi(numTowers, 'A', 'C', 'B'); // ���� 3���� A���� C�� �ű�µ� 
	}

	public static void hanoi(int n, char x, char y, char z) { //x = ���� / y = ���� / z = �ӽ�
		if (n == 1) // �ű� ������ �ϳ��ۿ� ���ٸ� �ٷ� ���ۿ��� �������� �ű�� == ���� �ؿ� �ִ� ����
			System.out.println("disk 1 : " + x + "--->" + y);
		else { // �ű� ������ �ΰ� �̻��� ��(n-1��)
			hanoi(n - 1, x, z, y); // �ű氳���� n-1���� ���ۿ��� �ӽÿ� �ű��.
			System.out.println("disk " + n + " : " + x + "--->" + y); // �׸���  ���ۿ� ���� 1���� �������� �ű��.
			hanoi(n - 1, z, y, x); // �ű� n-1���� �ӽÿ��� �������� �ű��.
		}
	}

}
