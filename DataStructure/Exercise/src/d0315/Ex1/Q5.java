package d0315.Ex1;
//String�������� ����
public class Q5 {

	public static void main(String[] args) {
		String name1 = new String("�ڷᱸ��");
		String name2 = new String("�ڷᱸ��");
		String name3 = "�ڷᱸ��";
		String name4 = "�ڷᱸ��";
		
		//������ ��
		System.out.println("name1, name2 > " + (name1 == name2));
		System.out.println("name3, name4 > " + (name3 == name4)); //���ڸ��ͷ� ������ ���� �ڹٰ� �ڵ����� ���� �������� ����
		System.out.println("name1, name2 equals> " + name1.equals(name2));
		
		name2 = name1;
		System.out.println("name1, name2 > " + (name1==name2));
	}

}
