package d0308;

import java.util.Arrays;

class Person {

	int[] score = new int[3];
	double avg;
	char grade;

	public Person() {
//score�� 0���� �ʱ�ȭ
		for (int i = 0; i < score.length; i++) {
			score[i] = 0;
		}
	}

//�迭�� �Ű������� �޾� score�� ����
	public Person(int[] score) {
		this.score = score;
	}

//score�� ������ ����� return
	public double average() {
		int sum = 0;
		for (int i : score) {
			sum += i;
		}

		avg = (double)sum / score.length;
		return avg;
	}

//�迭�� �Ű������� �޾� score�� ����
	public void getScore(int[] score) {
		this.score = score;
	}
//grade �������
	public char grade() {
		switch ((int) avg / 10) {

		case 10:
		case 9:
			grade = 'A';
			break;

		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';

		}
		
		return grade;
	}
	
	public String toString() {
		return Arrays.toString(this.score);
	}
}

public class Grade {

	public static void main(String[] args) {
		int[] score = { 54, 97, 88 };
		Person person1 = new Person();
		Person person2 = new Person(score);
		
		System.out.println("ù��° ��ü : " + person1);
		System.out.println("�ι�° ��ü : " + person2);
		
		int[] push = {88,90,84};
		
		person1.getScore(push);
		
		System.out.println("ù��° ��ü : " + person1);
		System.out.println("�ι�° ��ü : " + person2);

		System.out.println("ù��° ��ü ��� : " + person1.average());
		System.out.println("�ι�° ��ü ��� : " + person2.average());

		System.out.println("ù��° ��ü ���� : " + person1.grade());
		System.out.println("�ι�° ��ü ���� : " + person2.grade());
	}

}
