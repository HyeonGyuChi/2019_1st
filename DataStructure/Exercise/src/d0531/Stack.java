package d0531;

public interface Stack {
	public boolean isEmpty(); // ������ ����˻�
	public void printStack(); // ���
	public void push(Object x); // ���ÿ� ���� x ����
	public Object pop(); // ������ Top���� ������ȯ
	public void delete(); // ���� Top���� ����
	public Object peek(); // ������ Top���� �˻� 
}
