package d0405;
//���׽� ǥ��
public class Term {
	float coef; //���
	int exp; //����
	
	public Term() {
		coef = 0; //����� 0���� �ʱ�ȭ
		exp = 0; //������ 0���� �ʱ�ȭ
	}
	
	public Term(float c, int e) {
		coef = c; //����� �Է¹��� �Ű������� �ʱ�ȭ
		exp = e; // ������ �Է¹��� �Ű������� �ʱ�ȭ
	}
	
	public float getCoef() {
		return coef; //��������ȯ
	}

	public int getExp() {
		return exp; //����������ȯ
	}
	
	public void setCoef(float c) {
		coef = c; //�������� �Ű����� ������ ����
	}
	
	
	public void setExp(int e) {
		exp = e; //���������� �Ű����� ������ ����
	}
	
	public String toString() {
		return "Exp : " + getExp() + " Cof : "+ getCoef(); 
	}
	
	
	
	
	
}
