package d0412;

public class Polynomial {

	private int[] coef;
	private int max;

	public Polynomial() {
		coef = new int[100];
		max = -1;
	}

	public boolean isEmpty() { // ����ִ� �迭�ΰ�?
		return coef.length == 0 ? true : false;
	}

	public int maxExp() {
		return max;
	}

	public int maxCoef() {
		return coef[max];
	}

	public void addTerm(int c, int e) { // c = ��� e = ����(�迭�ε���)
		coef[e] += c; // �����ִ� �� + ���� ��
		if (e > max) { // ���ϴ� ���� ���� max������ ũ�ٸ� max�� ����
			max = e;
		}
	}

	public void delTerm(int e) {
		coef[e] = 0;
		if (e == max) { // ���� �װ� �������� max���� ���ٸ� max������
			while (coef[max--] == 0) { // max���� ����� ���� ������ �ٿ�������
			}
		}
	}

	public Polynomial multiTerm(int c, int e) { // �Ŀ� �Ѱ��� �� ���ϱ�
		Polynomial n = new Polynomial();
		for (int i = 0; i <= max; i++) {
			n.addTerm(coef[i] * c, i + e); // ����Ŀ��� ������ c���� ���ؼ� ���� +e ��ŭ �Űܼ� ����
		}
		return n;
	}

	public Polynomial addPoly(Polynomial p) { // �ĳ��� ���ϱ�
		Polynomial n = new Polynomial(); // ���� �ĳ��� ���� �������� �����ֱ�
		int bigger = this.max > p.max ? this.max : p.max; // �� ū ������ ���� ���� �������� �����ֱ�
		for (int i = 0; i <= bigger; i++) {
			n.addTerm(this.coef[i] + p.coef[i], i);
		}
		return n;
	}

	public Polynomial multiPoly(Polynomial p) { // �ĳ��� ���ϱ�
		Polynomial n = new Polynomial(); // ������ �Ŀ��� �ϳ��� ������ ���� �� �׸��� ���ؼ� ���ϱ�
		for (int i = 0; i <= p.max; i++) {
			Polynomial t = new Polynomial(); // t ��ü ��� �ʱ�ȭ
			t = this.multiTerm(p.coef[i], i); // ����Ŀ��� ������ ���� �� �׾� ���ϱ�
			//for (int j = 0; j <= t.max; j++) {
				n = n.addPoly(t); // �� �׸��� ������ ������ ���� ���ϱ�}
			//}
		}
		return n;
	}

	public void print() { // (��ȣ)���x^����
		for (int i = max; i >= 0; i--) {// ū �׺��� ǥ��
			if (coef[i] == 0) { // ����� ���� ��
				continue;
			}

			else { // ǥ���� ����� �ִ°��
				if (i == 0) { // x���� ���� �� > (��ȣ)���
					if (coef[i] < 0) { // �����϶��� ��ȣ������ֱ� > ��? ������ integer������ �տ� -��ȣ�� ������
						System.out.print(" " + coef[i]);
					} else {
						System.out.print(" +" + coef[i]);
					}
				}

				else { // x���� ���� ��{
					if (coef[i] < 0) {
						System.out.printf(" %dx^%d", coef[i], i);
					} else {
						System.out.printf(" +%dx^%d", coef[i], i); // ����� �׳������� �������ϱ� �տ� +�߰�
					}

				}
			}
		}
		System.out.println();
	}

}
