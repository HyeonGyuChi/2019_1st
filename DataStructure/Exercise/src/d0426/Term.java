package d0426;
//���׽� ǥ��
public class Term {
	int coef; //���
	int exp; //����
	
	public Term() {
		coef = 0; //����� 0���� �ʱ�ȭ
		exp = 0; //������ 0���� �ʱ�ȭ
	}
	
	public Term(int c, int e) {
		coef = c; //����� �Է¹��� �Ű������� �ʱ�ȭ
		exp = e; // ������ �Է¹��� �Ű������� �ʱ�ȭ
	}
	
	public int getCoef() {
		return coef; //��������ȯ
	}

	public int getExp() {
		return exp; //����������ȯ
	}
	
	public void setCoef(int f) {
		coef = f; //�������� �Ű����� ������ ����
	}
	
	
	public void setExp(int e) {
		exp = e; //���������� �Ű����� ������ ����
	}
	
	public String toString() {
		return "Exp : " + getExp() + " Cof : "+ getCoef(); 
	}
	
	
	
	
	
}
