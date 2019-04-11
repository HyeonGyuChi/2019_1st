package d0405;

// ���׽�
public class Poly {
	private int element_Num; // ���׽��� ���� ����
	private Term termArray[]; // TermŸ���� 1���� �迭
	private int MAX; // ���׽� ���� �ִ밹��

	public Poly() {
		element_Num = 0;
		MAX = 50;
		termArray = new Term[MAX]; // Term�� �迭
	}

	public boolean isEmpty() { // ���� ���� �����ϴ��� ���ϴ��� ǥ��
		if (element_Num == 0) // ���׽��� ���ǰ����� 0�̸�
			return true; // empty

		else
			return false;
	}

	// coef : ��� / Exp : ����
	public void addTerm(float coef, int Exp) { // �� ����
		Term e1 = new Term(coef, Exp);

		if (isEmpty() == true) { // ���� ���������ʴ´ٸ� == ���� �ƹ��͵� ���ٸ�
			termArray[element_Num++] = e1; // append�۾� �ʿ���� �׳� �迭�� �߰� �׸��� �װ��� ����
		}

		else {

			for (int i = 0; i < element_Num; i++) { // ������ �ִ� ���� ������ŭ �ݺ�(== termArray[]�� ũ�⸸ŭ �ݺ� i�� �������� �迭�� ������index)
				// �Է¹��� ������ ũ�⿡ ���� �迭�� ��ġ�� ������
				if (termArray[i].getExp() < Exp) { // �Է¹��� ������ �������ִ� ���� �������� ũ�ٸ� �ڷ� �ϳ��� �а�, �װ��� ������ �־��ֱ�!
					for (int j = element_Num; j > i; j--) { // ���� �ϳ��� �ڷ� �о��ֱ�
						termArray[j] = termArray[j - 1]; // ���� �ִ� �׵��� �� ���������� ��ü
					}
					termArray[i] = e1; // ��� �о��־����Ƿ� �� ���� ������ �ֱ�!
					element_Num++; // ������ �߰��Ͽ����Ƿ� �װ��� ����

					return;
				}

				else if (termArray[i].getExp() == Exp) { // ������ ������� ���� �� ����
					termArray[i].setCoef(termArray[i].getCoef() + coef); // �������ִ� ����� �����Է¹��� ����� ����
					return;
				}
			}
			termArray[element_Num++] = e1; // ������ �ִ� ���� ������ ������ ���� ���� �� //���� ������(�迭�� ������)�� �������� �� ���׽� ���� ����
		}
	}

	public void printPoly() { // ���׽� ���
		if (isEmpty() == true) { // ���׽��� ������� => ����� �ʿ� x
			System.out.println("���׽��� �����ϴ�.");
		} else { // ���׽��� ������� => �������!
			for (int i = 0; i < element_Num; i++) { // �迭 ó������ ���Ž���ϸ鼭 �� ��ü���� ����
				if (termArray[i].getExp() == 0) { // ������ ���� ��, ����� ���� ������ ���� ����
					if (termArray[i].getCoef() > 0) { // ����� ����� ��
						System.out.printf(" +%.1f", termArray[i].getCoef());
					}

					else if (termArray[i].getCoef() < 0) { // ����� ������ ��
						System.out.printf(" -%.1f", termArray[i].getCoef());
					}

				} else { // ������ ���� ��, ����� ������ ���� ����
					if (termArray[i].getCoef() > 0) { // ����� ����� ��
						System.out.printf(" +%.1fx^%d", termArray[i].getCoef(), termArray[i].getExp());
					}

					else if (termArray[i].getCoef() < 0) { // ����� ������ ��
						System.out.printf(" %.1fx^%d", termArray[i].getCoef(), termArray[i].getExp());
					}

				}
			}

			System.out.println();
		}

	}

	public Term[] terms() {
		return termArray;
	}
}
