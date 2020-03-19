//��������Ʈ ����

package d0517;

public class CircularLinkedList {

	listNode head;
	listNode tail;

	public void printList() {
		listNode p;
		System.out.print("(");
		p = tail.link;

		if (head != null) {
			do {
				System.out.print(p.data + " ");
				p = p.link;
			} while (p != tail.link);
			System.out.println(")");
		}
	}

	public void addFirst(String x) {
		listNode p = new listNode();
		p.data = x;

		if (tail == null) { // ��尡 ���� �� == �� ����Ʈ�϶�
			p.link = p; // �ڱ��ڽ� link
			tail = p;
			head = p;
		} else {
			p.link = head; // == tail.link
			tail.link = p; // tail�� ��������
			head = p; // head ����

		}
	}

	public void addLast(String x) {
		listNode p = new listNode(x);
		p.data = x;

		if (head == null) { // �� ����Ʈ�� ��
			addFirst(x);
		} else {
			p.link = tail.link; // == head
			tail.link = p;
			tail = p; // tail ����
		}
	}

	public void insert(String x, String y) { // x�ڿ� y����
		if (tail == null) { // �� ����Ʈ
			addFirst(y);
			return;
		} // ��尡 �Ѱ��̻�
		listNode p = new listNode(); // x�� ã�� ���
		listNode q = new listNode();
		q.data = y; // ������ ���

		p = head;
		do {
			if (p.data.equals(x)) { // tail.data������ insert �Ұ�� 
				if (p == tail) { // p�� tail�� ��� tail������ insert�� ��� insert �� tail�̵�
					q.link = p.link;
					p.link = q;
					tail = q;
				} else {
					q.link = p.link;
					p.link = q;
				}
				break;
			}
			p = p.link;
		} while (p != head);

	}

	public void deleteNext(String x) {
		if (tail == null) // �� ����Ʈ
			return;
		listNode p = new listNode();
		p = head;
		while(!p.data.equals(x) && p != tail) {
			p = p.link;
		}
		
		if(p == tail){ // head�� ������ ���� x
			System.out.println("������ ����  ����");
			return;
		}
		
		if(p.link == tail) { //�����ϴ� Ÿ���� tail �� ���
			p.link = p.link.link;
			tail = p; // ���� �� tail �� ����
			return;
		}
		
		p.link = p.link.link; 
	}
	
/*( ���� x���� ����� �ʹٸ�)
	public void deleteNext(String x) {
		if (tail == null) // �� ����Ʈ
			return;
		listNode p = new listNode();

		p = head;
		// ��尡 �Ѱ��϶�
		if (head == tail) {
			if (p.data.equals(x)) {
				head = null;
				tail = null;
			}
			return; // �����ϸ� �ٷ� ����
		}

		// ��尡 �ΰ� �̻��� ��
		do {
			if (p.link.data.equals(x)) {
				if (p.link == tail) { // ������� �ϴ� ���� tail
					p.link = p.link.link;
					tail = p;
				} else if (p.link == head) { // ������� �ϴ� ���� head
					p.link = p.link.link;
					head = p.link;
				} else {
					p.link = p.link.link;
				}
				return; // �����ϸ� �ٷ�����
			}
			p = p.link;
		} while (p != head); // head~tail���� ��� p�� �Ǿ� link�� Ž��
		// ��ܿ��� x�� ã�� ������ ��� return ���� �����Ƿ� while���� ����� �� x���� ����
		System.out.println("�������" + x + "���� ����Ʈ�� �����ϴ�.");
	}
*/

	public static void main(String[] args) {
		CircularLinkedList L1 = new CircularLinkedList();

		L1.addFirst("y");
		L1.addFirst("l");
		L1.addFirst("l");

		System.out.println("-------------addFirst-------------");
		L1.addFirst("H");
		L1.printList();
		System.out.println(L1.head.data +" " + L1.tail.data);
		System.out.println(L1.tail.link == L1.head);

		System.out.println("-------------addLast-------------");
		L1.addLast("m");
		L1.printList();
		System.out.println(L1.head.data +" " + L1.tail.data);
		System.out.println(L1.tail.link == L1.head);
		
		System.out.println("-------------Insert-------------");
		L1.insert("H", "a");
		L1.insert("m", "!");
		L1.printList();
		System.out.println(L1.head.data +" " + L1.tail.data);
		System.out.println(L1.tail.link == L1.head);
		
		
		System.out.println("-------------Delete-------------");
		L1.deleteNext("a");
		L1.printList();
		System.out.println(L1.head.data +" " + L1.tail.data);
		System.out.println(L1.tail.link == L1.head);
	}
}