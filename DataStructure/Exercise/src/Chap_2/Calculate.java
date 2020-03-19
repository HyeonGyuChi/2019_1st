package Chap_2;

public class Calculate {
	//35*62/-
	public static void main(String[] args) {
		String postfix = "35*62/-";
		evalPostfix(postfix);

	}

	public static void evalPostfix(String postfix) {
		ListStack stack = new ListStack();

		char symbol;
		int expSize = postfix.length();
		int num_1 = 0, num_2 = 0;

		for (int i = 0; i < expSize; i++) {
			symbol = postfix.charAt(i);

			// �������� ��� �˸°� �����Ͽ� push
			if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') {
				num_2 = stack.pop();
				num_1 = stack.pop();

				switch (symbol) {
				case '+':
					stack.push(num_1 + num_2);
					break;

				case '-':
					stack.push(num_1 - num_2);
					break;

				case '*':
					stack.push(num_1 * num_2);
					break;

				case '/':
					stack.push(num_1 / num_2);
					break;
				}
			} else // �����ڰ� �ƴҶ�
				stack.push((int) symbol - 48); // charAt(i) �� int�� casting // ascii(0) ==int(48)
		}
		System.out.println("������: " + stack.pop());
	}

}
