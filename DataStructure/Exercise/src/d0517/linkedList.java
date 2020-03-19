package d0517;

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

	public void deleteNext(String x) { // p.link = p.link.link �� �����ϹǷ� ���������� �ٸ��� ó�� (��? p.link.link���� ���� )

		listNode p = searchNode(x);

		if (head == null) { // �� list �ϰ��
			System.out.print("�� LinkedList");
		}

		else if (p == null) { // x���� list�� ���� ��
			System.out.println("listNode don't have " + x + "data");
		} else { // list�� x���� ���� ��尡 ���� �� > ������ ��� ���� �� ���� > p�� null�ϰ�� p.link �� ����

			p = head; // x�� ������ ã������ p�� �ʱ�ȭ
			// ù��° ���� ������ x���� ��
			if (p.data.equals(x)) {
				head = p.link;
			}
			// �ι�° �׺��� x���� ����
			else {
				// �ι�° �� ���� ������ �ױ��� Ž�� > ������ �ִ� �����Ͱ� x�� p�� ����
				while (!p.link.data.equals(x)) { // �ι�° ~ ������ �ױ��� ���� ����
					p = p.link; // p�� ������ ���� �� �� ����
				}
				p.link = p.link.link;// ������ �ױ��� ��������� p�� ������ ���ױ����� ����
			}
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
//-----------------------05/17------------------------------

	public void deleteLastNode() {
		listNode previousNode, currentNode; // �������, ������

		if (head == null)
			return; // ���Ḯ��Ʈ�� ��������� �� �޼ҵ带 ��������
		if (head.link == null) { // ���Ḯ��Ʈ�� ��尡 �ϳ� �����Ѵٸ�
			head = null; // ��尡 �ϳ��̹Ƿ�, ���Ḯ��Ʈ�� ����.
			return;
		} else { // ���Ḯ��Ʈ�� ��尡 �ΰ� �̻��϶�
			previousNode = head; // ������尡 L�� ����Ŵ
			currentNode = head.link; // �����尡 .link

			while (currentNode != null) { // �����尡 null �� ���Ҷ� ����
				previousNode = currentNode;
				currentNode = currentNode.link;
			}
			previousNode.link = null; // ������ ���� ����� ��ũ�� null�� ����� ������
		}

	}

	public void reverse() { // p�� p.link�� ��� ��ȸ > p������ ��ü���� p(��)�� link�������� ������ ��ü(r)���� link��!
		listNode p = head; // pointer 
		listNode q = null; // p�� ���������� �Űܰ��� �� p�� �ӽ�����
		listNode r = null; // p�� ������ ���� �ӽ�����
		while (p != null) { // r q p < �ѹ� loop ����������
			r = q; // r = p�� ������ü����
			q = p; // p�� ���� �����ͷ� �̵��ϱ� ���� q�� �ӽ�����
			p = p.link; // p �������� �̵�
			q.link = r; // �ӽ������� p�� link�� p������ü�� ��ȯ
		}
		head = q; // while�� ����� r(tail-1) q(tail) p(null) �̹Ƿ� head�� tail�� q�� ���� 
	}

	public static linkedList addList(linkedList L1, linkedList L2) {
		if (L1 == null) {
			return L2;
		} else if (L2 == null) {
			return L1;
		} else {
			listNode p = L1.head;
			linkedList newLinkedList = new linkedList(); // ��������� L1 L2�� ��ħ
			// L1
			while (p != null) { // p�� ����Ű�� ���� ���� �� ���� // ���� (p.link != null) �̸� ������ ���� �߰�(add) ���� ����
				newLinkedList.addLastNode(p.data); // string �������� new String(p.data) ?
				p = p.link; // p�� �̵�������
			}
			// L2
			p = L2.head;
			while (p != null) {
				newLinkedList.addLastNode(p.data);
				p = p.link;
			}

			return newLinkedList;

			/*
			 * ��������� while(p.link != null) { // L1 �� ������ ��� ã�� p = p.link; }
			 * 
			 * p = L2.head; // L1�� ��������忡 L2�̾��ֱ�
			 */
		}

	}

}
