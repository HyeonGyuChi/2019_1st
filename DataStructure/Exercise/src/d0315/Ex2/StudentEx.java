package d0315.Ex2;

//������ �������� �������� ���� >> �̸��� ������ ���� student��ü�� �����غ���(��ü�迭�� �����Ͽ� sorting�غ���)
public class StudentEx {

	public static void main(String[] args) {
		int score[] = { 20, 54, 6, 25, 4, 3, 1, 0, 20, 11 };

		int temp = 0;
		int maxIndex = 0;
		// �迭���� ���� ū �������� �ε��� ã��
		for (int i = 0; i < score.length - 1; i++) {
			maxIndex = i;

			for (int j = maxIndex; j < score.length; j++) {
				if (score[maxIndex] < score[j]) {
					maxIndex = j;

				}
			}

			temp = score[i];
			score[i] = score[maxIndex];
			score[maxIndex] = temp;

		}
		// max�� ����Ű�� �ε����� �����Ͱ��� �����ε�����ġ�� ���� �ٲ�

		// score���
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}

	}

}
