package d0408;

public class ArrayPolynomial {

	private int[] coef; // ���
	private int max; // �ְ�����

	public ArrayPolynomial() {
		coef = new int[30]; // 9�������� ǥ���Ҽ� �ִ� ���׽�
		max = -1; // �ʱ� ������ -1 > max == -1 �϶� �ƹ��͵� ���� ��

	}

	public boolean isZeroP() { // �ƹ��͵� ���� �� == 0
		if (max == -1)
			return true;
		else
			return false;
	}

	public int coef(int e) { // ������ ������ ����� return
		return coef[e];
	}

	public int maxExp() { // �ְ����� return
		return max;
	}

	public void addTerm(int c, int e) { // ���� ���׽Ŀ� �� �߰�
		if (e >= coef.length)
			throw new OverMaxException("addTerm");

		else {
			coef[e] = c;
			if (e > max) // �߰��� ������ ���� �ְ����� ���� Ŭ ���
				max = e;
		}
	}

	public void delTerm(int e) { // �ش������� �� ����
		if (e >= coef.length)
			throw new OverMaxException("delTerm");

		else {
			coef[e] = 0;
			while (max >= 0 && coef[max] == 0) { // ���� �ְ������� �����Ѵٸ� max�� ����
				max--;
			}
		}
	}

	public ArrayPolynomial sMulti(int c, int e) throws OverMaxException { // �����׿� �ϳ��� �� ���ϱ⿬��
		if (e >= coef.length) {
			throw new OverMaxException("Polynomical sMulti");
		}

		else {
			ArrayPolynomial r = new ArrayPolynomial();
			for (int i = 0; i <= max; i++) {
				r.addTerm(coef[i] * c, i + e);
			}
			return r;
		}
	}

	public ArrayPolynomial polyAdd(ArrayPolynomial p) { // �� ���׽��� ���ϱ�!
		ArrayPolynomial r = new ArrayPolynomial();

		int bigger = max > p.max ? max : p.max;
		for (int i = 0; i <= bigger; i++) {
			r.addTerm(coef[i] + p.coef(i), i);
		}
		return r;

	}

	public ArrayPolynomial polyMul(ArrayPolynomial p) { // �� ���׽� ���ϱ�
		ArrayPolynomial r = new ArrayPolynomial();

		for (int i = 0; i <= p.max; i++) {
			ArrayPolynomial t = this.sMulti(p.coef[i], i);
			r = r.polyAdd(t);
		}
		return r;
	}

	public void printAll() {

		for (int i = 0; i < coef.length; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		for (int i = 0; i < coef.length; i++) {
			System.out.printf("%4d", coef[i]);
		}
		System.out.println();

	}

	public String toString() {
		String strPoly = "";

		for (int i = max; i >= 0; i--) {
			if (coef[i] != 0) {
				if (i == 0) {
					strPoly += "+ " + Integer.toString(coef[i]) + " ";
				} else {
					strPoly += "+ " + Integer.toString(coef[i]) + "x^" + Integer.toString(i) + " ";
				}
			}
		}
		return strPoly;

	}
}
