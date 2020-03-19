package d0604;

public class ArrayQueue implements Queue { // ���Լ���
	private int front;
	private int rear;
	private int count; // ���Ҽ�
	private int queueSize; // ť(�迭)ũ��
	private int increment; // �迭�� Ȯ�����
	private Object[] itemArray; // ť �迭

	public ArrayQueue() {
		front = 0;
		rear = 0;
		count = 0;
		queueSize = 5; //50
		increment = 2; // 10
		itemArray = new Object[queueSize];
	}

	public boolean isEmpty() {
		return (count == 0);
	}

	public void enqueue(Object x) {
		rear = (rear + 1) % queueSize; // 0~49���� ���ٰ��� // ���������� 1����

		if (count == queueSize-1)
			queueFull();

		itemArray[rear] = x;
		count++;
	}

	public void queueFull() { // ����� �ø���
		int oldSize = queueSize; // ����迭�� ũ������
		queueSize += increment; // ���ο� �迭�� ũ��
		Object[] tempArray = new Object[queueSize]; // Ȯ��� ũ���� �ӽù迭

		for (int i = 1; i <= count; i++) { // �ӽù迭�� �����̵� // 1���� �ϸ�����ʤ�?
			tempArray[i] = itemArray[++front % oldSize];
			// tempArray[i] = i % oldSize;
		}
		itemArray = tempArray;
		front = 0;
		rear = count + 1;
	}

	public Object dequeue() {
		if (isEmpty()) // ť�� ����
			return null;

		front = (front + 1) % queueSize;

		Object item = itemArray[front];
		count--;

		return item;

	}

	public void delete() {
		if (isEmpty())
			return;
		else {
			front = (front + 1) % queueSize;
			count--;
		}
	}

	public Object peek() {
		if (isEmpty())
			return null;
		else
			return itemArray[(front + 1) % queueSize];
	}

	public void queuePrint() {
		System.out.print("Queue �迭 :");
		for (int i = front + 1; i < queueSize; i++) {
			if (itemArray[i] == null) { // ������� ������ �� ����
				System.out.println();
				return;
			}
			System.out.print(" " + itemArray[i]);
		}
	}

}
