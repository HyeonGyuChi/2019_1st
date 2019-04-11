package d0315.Ex1;

//�ǽ�2 Point Ŭ���� ����
class Point {
//1) �ɹ����� int x,y�� ���� ����
	int x, y;

//2)������ : �Ű����� ���� ������ ����  this()�� ��� : �ʱⰪ 0,0 / �Ű����� 2���� ������ ����
	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		String s = "(" + x + "," + y + ")";
		return s;
	}

//3)add(~) : �Ű������� ���� ��ä�� �����͸� ���� �ɹ����� x,y�� ���� ���ϴ� ��� : �ν��Ͻ��޼ҵ� 
	public void add(Point p) {
		this.x += p.x;
		this.y += p.y;
	}

//4)Point add(~,~) : �ΰ��� ��ü�� �Ű������� �޾�, �� ��ü�� x,y�� ���� ��ü�� ��ȯ : static�޼ҵ�	
	public static Point add(Point p1, Point p2) {
		int x, y;
		x = p1.x + p2.x;
		y = p1.y + p2.y;
		Point newPoint = new Point(x, y);
		return newPoint;
	}

}

public class PointEx {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(2, 2);
		Point p3;

		System.out.println(p1);
		System.out.println(p2);
		p1.add(p2);
		p3 = Point.add(p1, p2);
		System.out.println(p1);
		System.out.println(p3);
	}
}
