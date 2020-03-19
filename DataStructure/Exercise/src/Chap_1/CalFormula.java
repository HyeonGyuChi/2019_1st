package Chap_1;

public class CalFormula {
	private String exp; // ����
	private int expSize; // ������ ����
	private char symbol; // ���� ��ȣ
	private char pairs; // �ݴ� ��ȣ

	public boolean parenTest(String exp) {
		ListStack stack = new ListStack();

		this.exp = exp;
		expSize = this.exp.length();

		for (int i = 0; i < expSize; i++) {
			symbol = exp.charAt(i);
			switch (symbol) {
			case '(':
			case '{':
			case '[':
				stack.push(symbol); // ������ȣ�� push
				break;
			case ')':
			case '}':
			case ']':
				if (stack.isEmpty()) // ���̻� pop�Ҳ� ���� == ������ȣ�� �� ����
					return false;
				else {
					pairs = stack.pop(); // ¦ �˻� == ������ȣ�� pop

					if ((pairs == '(') && (symbol == ')'))
						break;
					else if (pairs == '[' && (symbol == ']'))
						break;
					else if (pairs == '{' && (symbol == '}'))
						break;
					else
						return false;
				}
			}
		}
		if (stack.isEmpty()) // ������ȣ�� �� ���� ��� check
			return true;
		else
			return false;
	}

// �ı� ǥ��� ��ȯ�� ���� �켱����
	public int PIS(char y) {
		int n = 0;
		if (y == '*' || y == '/')
			n = 2;
		else if (y == '+' || y == '-')
			n = 1;
		else if (y == '(')
			n = 0;
		else if (y == '^')
			n = 3;
		return n;
	}

	public int PIE(char y) {
		int n = 0;
		if (y == '*' || y == '/')
			n = 2;
		else if (y == '+' || y == '-')
			n = 1;
		else if (y == '(')
			n = 4;
		else if (y == '^')
			n = 3;
		return n;
	}

	/*
	 * ������ ������ pop �� push�� ���� ���ݴ��� ó���ؾ� �� �� == pop // �����ڸ� ��� push�ϴ� ����ó���ؾ��Ҷ��� ����
	 * pop �����ǿ켱���� >= �����ǿ켱���� ���߿� ó���ؾ� �� �� == push
	 * 
	 * ps. '('�� ��� push �ϰ� ')'�� ���� �� �ȿ��ִ� �� ��� == ')'������ '('���� pop
	 * 
	 * ������ ������ stack��� pop
	 * 
	 */
	public void convPostfix(String exp) {
		ListStack stack = new ListStack();

		char symbol;
		this.exp = exp;
		expSize = exp.length();

		for (int i = 0; i < expSize; i++) {
			symbol = exp.charAt(i);

			switch (symbol) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				System.out.print(symbol);
				break;
			case '(':
			case '+':
			case '-':
			case '*':
			case '/':
				while (PIS(stack.peek()) >= PIE(symbol)) // '('in stack = 0�̹Ƿ� ������ push ')'
					System.out.print(stack.pop());
				stack.push(symbol);
				break;
			case ')':
				while (stack.peek() != '(')
					System.out.print(stack.pop());
				stack.delete(); // '('�� ����
				break;
			}
		}

		while (!stack.isEmpty()) { // ������ ��
			System.out.print(stack.pop());
		}
	}

}
