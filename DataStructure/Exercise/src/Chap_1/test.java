package Chap_1;

public class test {

	public static void main(String[] args) {
		CalFormula op = new CalFormula();
		String exp = "(3*5)-(6/2)";
		
		System.out.println("���� : " + exp);
		
		if(op.parenTest(exp)) {
			System.out.println("��ȣ�� �� ��ġ");
		}
		else {
			System.out.println("��ȣ�� �� ����ġ");
		}
		
		op.convPostfix(exp);

	}

}
