package d0531;

public class ArrayStack implements Stack {
	private int top;
	private int stackSize;
	private int increment;

	private Object[] itemArray;

	public ArrayStack() {
		top = -1; // Top�� ����
		stackSize = 50; // ������ ũ��
		increment = 10; // ������ Ȯ�����
		itemArray = new Object[stackSize];
	}

	public boolean isEmpty() {
		if (top < 0)
			return true;
		else
			return false;
	}

	public void stackFull() {
		stackSize += increment;
		Object[] tempArray = new Object[stackSize]; // Ȯ��� ũ��迭 ����

		for (int i = 0; i <= top; i++) { // �迭���Һ���
			tempArray[i] = itemArray[i];
		}
		itemArray = tempArray; // ���������� Ȯ��� �迭�� ��ü�� �迭�� ����

	}

	public void printStack() {
		System.out.print("���� ���� : ");

		for (int i = 0; i <= top; i++) {
			System.out.print(itemArray[i] + "\t");
		}
		System.out.println("");
	} // ������ ��

	public void push(Object x) {
		if (top >= stackSize - 1) { // full �̹Ƿ� ũ�� stackũ�� �ø���
			stackFull();
		}
		itemArray[++top] = x; // ���һ���
	}

	public Object pop() {
		if (top < 0) // ���� ����ó��
			return isEmpty();
		else {
			Object temp = itemArray[top--];
			return temp;
		}
	}

	public void delete() {
		if (top < 0) { // �����϶�
			System.out.println("���齺��");
		} else { // top���� ���ҽ��� �ڵ�����
			top--;
		}
	}

	public Object peek() {
		if (isEmpty()) { // �����϶�
			return null;
		}

		else {
			return itemArray[top];
		}
	}

}
