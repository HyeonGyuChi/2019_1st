package d0524;

public class linkedlist {
	listNode head;

	public linkedlist() {
		head = null;
	}

	public void printList() {
		listNode p = head;

		while (p != null) {
			if (p.exp == 0) {
				if (p.coef > 0)
					System.out.print(" +" + p.coef);
				else
					System.out.print(" " + p.coef);
			}

			else {
				if (p.coef > 0)
					System.out.print(" +" + p.coef + "x^" + p.exp);
				else
					System.out.print(" +" + p.coef + "x^" + p.exp);
			}
			p = p.link;
		}
		System.out.println();
	}

	public void addTerm(int Coef, int Exp) {
		listNode q = new listNode(Coef, Exp);
		listNode previousNode, currentNode;

		if (head == null) { // ��尡 ���� ��
			head = q;
			return;
		}

		else if (head.link == null) { // ���� �ϳ�����
			if (head.exp > q.exp) {
				head.link = q;
			} else if (head.exp < q.exp) {
				q.link = head;
				head = q;
			} else { // ���� ������ ������
				head.coef += q.coef;
			}
		}

		else { // ���� �������϶� / pre �� current ���̿� ���� ������ ���� ������ ��尡 q�� link�ϰ� �־�� �ϹǷ� current����
				// �������� �˾ƾ���
			previousNode = head;
			currentNode = head.link;

			if (previousNode.exp < Exp) {
				q.link = head;
				head = q;
				return;
			} else if (previousNode.exp == Exp) {
				head.coef += q.coef;
				return;
			}
			// pre
			while (currentNode != null) {

				if (currentNode.exp == Exp) {
					currentNode.coef += q.coef;
					return;
				}

				else if (currentNode.exp < Exp) {
					previousNode.link = q;
					q.link = currentNode;
					return;
				}

				previousNode = currentNode;
				currentNode = currentNode.link;

			}		
			previousNode.link = q;
		}
		

	}

	public linkedlist addPoly(linkedlist B) {
		linkedlist C = new linkedlist();
		listNode p = head;
		listNode q = B.head;

		while (p != null && q != null) { // �� ���׽��� ������ ���� ���� C�� �˸°� addTerm
			if (p.exp > q.exp) {
				C.addTerm(p.coef, p.exp);
				p = p.link;
			} else if (p.exp < q.exp) {
				C.addTerm(q.coef, q.exp);
				q = q.link;
			} else {
				C.addTerm(q.coef + p.coef, q.exp);
				p = p.link;
				q = q.link;
			}
		}

		while (p != null) { // p�� ������ ������ ��
			C.addTerm(p.coef, p.exp);
			p = p.link;
		}

		while (q != null) { // q�� ������ ������ ��
			C.addTerm(q.coef, q.exp);
			q = q.link;
		}

		return C;
	}

	public linkedlist multiTerm(int coef, int Exp) {
		linkedlist x = new linkedlist();
		listNode p = head;

		while (p != null) {
			x.addTerm(p.coef * coef, p.exp + Exp);
			p = p.link;
		}
		return x;
	}

	public linkedlist multiPoly(linkedlist A) {
		linkedlist Total = new linkedlist();
		listNode p = head;

		while (p != null) {
			linkedlist temp = new linkedlist();
			listNode q = A.head;
			while (q != null) {
				temp.addTerm(q.coef * p.coef, q.exp + p.exp);
				q = q.link;
			}
			Total = Total.addPoly(temp);
			p = p.link;
		}

		return Total;
	}

}
