package d0315.Ex1;
//���� �������� ���� call by reference
import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b; //�ּҰ� ����x
		b = a; //�ּҰ� ����
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		b[1]++;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(a==b);

	}

}
