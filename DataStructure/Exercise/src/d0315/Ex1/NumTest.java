package d0315.Ex1;

//���� pro_value() pro_ref1() pro_ref2()�� ���� ��� ����Ǵ��� word�� �ۼ��Ͽ� ����
/*alt + ����Ű = �̵�
ctrl + shtft + / = �ּ�ó��  /*
ctrl + / = �ּ�ó�� //
ctrl + alt +���Ʒ� = �ٺ���
*/
class Num {

	public int number; //Num�� �ν��Ͻ� ����

	Num(int number){
		this.number = number; //�Ű����� 1���� �Է¹޾� �ν��Ͻ� ������number�� �ʱ�ȭ�ϴ� ������
	}
	
}

public class NumTest{
	
	static void value(int b) {//2. �Ű������� b�� a�� ���� 1�� �ʱ�ȭ
		b=2; //3. b�� 2�� �ʱ�ȭ
	}
	
	public static void pro_value() {
		int a = 1; 
		value(a); //1. value()�� �Ű������� a�� ���� 1 ���� = call by value
		System.out.println("pro_value , " + a); //4. a�� b�� �ٸ������̹Ƿ� b�� �� ������ a�� ���� ������ ���� �ʴ´�. (a=1)
	}
	
	
	
	static void ref1(Num b) { //3. b�� a�� �����ϴ� ��ü�� �ּҰ����� �ʱ�ȭ(���� ��ü�� ����)
 		b = new Num(2); // 4. Num(2)��� ���ο� ��ü�����Ͽ� b�� ���� : b�� ���̻� a�� ���� ��ü�� �������� �ʰ� ���ο� ��ü�� �����ϰ� �ȴ�.
	}
	
	public static void pro_ref1() {
		Num a = new Num(1); //1. Num(1) ��ü���� �� a�� ��ü����
		ref1(a); //2. ref1()�� �Ű������� a�� �����ϴ� ��ü�� �ּҰ� ���� = call by reference
		System.out.println("a :" + a.hashCode());
		System.out.println("pro_ref1 , " + a.number); //5. a�� b�� ���δٸ� ��ü�� �����ϹǷ� a��ü�� number = 1
	}
	
	
	
	static void ref2(Num b) { //3. b�� a�� �����ϴ� ��ü�� �ּҰ����� �ʱ�ȭ(���� ��ü�� ����)
		b.number = 2; //4. a�� b�� ���� ��ü�� ���� -> ��ü�� �ν��Ͻ� ������ number�� 2�� �ʱ�ȭ
	}
	
	public static void pro_ref2() {
		Num a = new Num(1); //1. Num(1) ��ü���� �� a�� ��ü����
		ref2(a); //2. ref1()�� �Ű������� a�� �����ϴ� ��ü�� �ּҰ� ���� = call by reference
		System.out.println("pro_ref2, " + a.number); //5. b�� a�� ���� ���� ��ü�� �����ϹǷ� 2�� ��µȴ�.
	}
	
	public static void main(String[] args) {
		
		pro_value(); //call by value
		pro_ref1(); //call by reference
		pro_ref2(); //call by reference

	}

}
