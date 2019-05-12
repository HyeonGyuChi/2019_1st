package d0503;

public class linkedList {
	listNode head;

	public void printList() {
		listNode p = head; // ���Ḯ��Ʈ�� ��ȸ�ϱ� ���� p�� head�� ����
		System.out.print("("); // ���� "("�� ���

		while (p != null) { // ���Ḯ��Ʈ�� �������ʵ尡 ���� �� ���� �ݺ�
			System.out.print(p.data); // p�� ������ �ʵ� ���
			p = p.link; // �������� �̵�

			if (p != null) {
				System.out.print(", "); // ������ �ʵ尡 null�� �ƴѰ�� , �� ���
			}
		}
		System.out.println(")"); // ������ũ�� �̵��ϱ� �� ) ���
	}

	public void addFirstNode(String x) {
		listNode newNode = new listNode(x); // x�����͸� ���� ���ο� Node ����
		newNode.link = head; // ���� ó���� �����ؾ� �ϹǷ� ������ head�� ����Ű�� ��带 newNode�� �������� ������
		head = newNode; // head�� ���ο� newNode�� ����Ű�� ��.
	}

	public listNode searchNode(String x) {
		listNode p = head;

		while (p != null) {
			if (x.equals(p.data)) {
				return p;
			}
			p = p.link;
		}

		return p; // ���Ұ��� x�� ��尡 ���� ��� null��ȯ

	}

	public void insertNode(String x, String y) { // x�� �����͸� ���� �������� �����Ͱ� y�� ������
		listNode newNode = new listNode(y);
		listNode p = head; // x �����͸� ���� ��带 ã�� ���� p�� head�� �ʱ�ȭ

		if (head == null) { // 1. ���� LinkedList�ΰ��
			head = newNode;
			newNode.link = null;
			return;
		}
		// 2. ������ ��尡 �ƴҰ��, x�� �����Ͱ� �ִ��� Ȯ��
		while (p != null) { // ó������ ��� ��带 �湮
			if (x.equals(p.data)) { // 3. x�ε����͸� ���� ���
				newNode.link = p.link; // x���� ������ ��� ������ ����
				p.link = newNode;
			}
			p = p.link; // ������� �湮
		}

	}

	public void deleteNext(String x) {
		listNode p = head;

		while (p != null) {
			if (x.equals(p.data)) {
				break;
			}
			p = p.link;
			

		}

		// listNode p = searchNode(x);// x���� ���� ��带 ������

		if (head == null) {
			System.out.print("�� LinkedList");
		}

		else if (p == null) {
			System.out.println("listNode don't have " + x + "data");
		}

		else {
			p.link = p.link.link;
		}

	}

	public void addLastNode(String x) {
		listNode newNode = new listNode(); // ���ο� ������
		newNode.data = x;
		newNode.link = null;

		if (head == null) {
			head = newNode;
			return;
		}

		listNode p = head; // ����� link�� null�� listNode�� Ž���ϱ� ���� head�� �ʱ�ȭ

		while (p.link != null) {
			p = p.link;
		}

		p.link = newNode; // ����� link�� null�� listNode�� ������ node�̹Ƿ� ������ newNode�� ����
	}
}
