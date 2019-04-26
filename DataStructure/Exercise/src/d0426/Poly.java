package d0426;

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
	public void addTerm(int coef, int Exp) { // �� ����
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
						System.out.printf(" +%d", termArray[i].getCoef());
					}

					else if (termArray[i].getCoef() < 0) { // ����� ������ ��
						System.out.printf(" %d", termArray[i].getCoef());
					}

				} else { // ������ ���� ��, ����� ������ ���� ����
					if (termArray[i].getCoef() > 0) { // ����� ����� ��
						System.out.printf(" +%dx^%d", termArray[i].getCoef(), termArray[i].getExp());
					}

					else if (termArray[i].getCoef() < 0) { // ����� ������ ��
						System.out.printf(" %dx^%d", termArray[i].getCoef(), termArray[i].getExp());
					}

				}
			}

			System.out.println();
		}

	}

	public Term[] terms() {
		return termArray;
	}

	public Poly addPoly(Poly B) {
		Poly C = new Poly();

		int i = 0;
		int j = 0;

		while (i < this.element_Num && j < B.element_Num) { // ������ �ִ����� �� ���� �ױ��� ���� // �ε����� �ϳ��� ������Ű�鼭 ��
			if (termArray[i].getExp() > B.termArray[j].getExp()) { // ���� ������ ���� �������� ������ B�� ���������� Ŭ���
				C.addTerm(termArray[i].getCoef(), termArray[i].getExp()); // �� ū ������ �������ִ� this�� ���� �߰�(�ΰ��� Poly�� this�� ��
																			// �ϳ��� ����)
				i++; // �������� ó�������Ƿ� �����ε�����
			}

			else if (termArray[i].getExp() == B.termArray[j].getExp()) { // ���� �������� ������ ������� �ΰ��� ���� ����� ���ϱ�
				C.addTerm(termArray[i].getCoef() + B.termArray[j].getCoef(), termArray[i].getExp());
				i++;
				j++;
			}

			else { // �������� �������ִ� �������� �� ���� ���
				C.addTerm(B.termArray[j].getCoef(), B.termArray[j].getExp());
				j++;
			}

			
		}
		
		for (int k = j; k < B.element_Num; k++) { // ���� while���� ���Ұ����� �� ���� Poly�� �������� ����ǹǷ� ������ �׵鿡 ���� �߰����־�� ��
			C.addTerm(B.termArray[j].getCoef(), B.termArray[j].getExp());
		}
		
		for (int k = i; k < element_Num; k++) {
			C.addTerm(termArray[i].getCoef(), termArray[i].getExp());
		}
		
		return C;

	}
	
	public Poly multiTerm(int coef, int exp) {
		Poly x = new Poly();
		for (int i = 0; i < element_Num; i++) { //���� ���� �������� ����Ž���ϸ鼭 ����� ���� ���ϰ� ������ ���� ���ϱ�
			x.addTerm(termArray[i].getCoef()*coef, termArray[i].getExp()+exp);
		}
		x.element_Num = this.element_Num;
		return x;
	}
	
	public Poly multiPoly(Poly A) {
		Poly Total = new Poly();
		for(int i = 0; i < element_Num; i++) {
			for(int j = 0; j < A.element_Num; j++) { // ���� FOR�� multiTerm
				Total.addTerm(termArray[i].getCoef()*A.termArray[j].getCoef(), termArray[i].getExp() + A.termArray[j].getExp());
			}
			
			
			/*Poly temp = new Poly();
			temp = A.multiTerm(termArray[i].getCoef(), termArray[i].getExp());
			Total = Total.addPoly(temp);*/
		}
		
		return Total;
	}
}
