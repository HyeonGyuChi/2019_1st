package d0315.Ex1;
//�⺻�������� ���� = call by value
public class Q3 {
	
	public static void main(String[] args) {
	int x = 23;
	int y;
	y = x;
	
	y++;
	
	System.out.println(x);
	System.out.println(y);
	System.out.println(x==y);
	}

}
