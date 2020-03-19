package Chap_2;

public class ListStack implements Stack {
	private ListNode top;

	public boolean isEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}

	public void printStack() { // �������
		ListNode p; // ���Ḯ��Ʈ�� ��ȸ�ϱ� ���� p
		System.out.print("�������� : ");
		p = top; // p�� ���� ����Ʈ�� ù ����� top�� ����Ű�����Ѵ�.

		while (p != null) {
			System.out.print(p.data);
			p = p.link;

			if (p != null)
				System.out.print("\t");
		}
		System.out.println();
	}

	public void push(int x) {
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = top; // �ֽų��(5) -> 4 -> 3 -> 2 -> 1(���� ó���� ���� ���)
		top = newNode;
	}

	public int pop() {
		if (isEmpty()) {
			return 0;
		} else {
			ListNode item = top; // ���� top���� ����
			top = top.link; // top�� �������� ����
			return item.data; // temp��ȯ
		}
	}

	public void delete() {
		if (isEmpty()) {
			return;
		} else {
			top = top.link; // ������ �ƴϸ� top�� �������� ����
		}
	}

	public int peek() {
		if (isEmpty()) {
			return 0;
		} else {
			return top.data; // top����� ������ ��ȯ
		}
	}
}
