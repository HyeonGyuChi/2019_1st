package d0322.Practice;

import java.util.Random;

public class TheBinsearch {

	public static void main(String[] args) {
		int arr[] = new int[100]; // 100���� ������������ ���ĵ� �����͸� ���� �� �ִ� �迭
		randomFill(arr);

		UpSort(arr); // �������� ����
		System.out.println(BinSearch(arr, 1)); // �̿�Ž��

		for (int e : arr) { // �迭���
			System.out.println(e);
		}

	}

	// �������� ������ �迭�� ä���
	public static void randomFill(int[] arr) {
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) { // 0~999 ������ random��
			arr[i] = r.nextInt(10);
		}

	}

	// ������ ����
	public static void StartSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) { // �� Ƚ��
			int minIndex = i;
			int temp;

			for (int j = i+1; j < arr.length; j++) { // ���� �ε����� �����ϰ� ����
				if (arr[minIndex] >= arr[j]) {
					minIndex = j;
				}

				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

	public static int BinSearch(int arr[], int key) {
		return binSearch(arr, key, 0, arr.length);
	}

	public static int binSearch(int arr[], int key, int left, int right) {

		if (left > right) { // ã�� �� ����
			return -1;
		}

		else {
			int mid = (left + right) / 2;

			if (key == arr[mid])
				return mid;
			else if (key < arr[mid]) {
				return binSearch(arr, key, left,mid - 1);
			} else
				return binSearch(arr, key, mid + 1, right);

		}
	}

	// ������ �������� ����
	public static void UpSort(int arr[]) {
		// StartEndSort(arr, 0, arr.length);
		StartSort(arr);
	}

	// �ִ밪 = end �ּҰ� = start ���� // -> ���� �Ф�
	public static void StartEndSort(int arr[], int start, int end) {
		if (end - start <= 1) { // ���̻� ������ �ε��� x
			return;
		}

		else {

			int minIndex = start;
			int maxIndex = start;
			int temp;

			for (int i = start; i < end; i++) {

				if (arr[maxIndex] <= arr[i]) {

					maxIndex = i;
				}

				if (arr[minIndex] >= arr[i]) {
					minIndex = i;
				}
			}

			if (maxIndex == minIndex) { // ���ĿϷ�
				return;
			}

			else {
				temp = arr[start];
				arr[start] = arr[minIndex];
				arr[minIndex] = temp;

				temp = arr[end - 1];
				arr[end - 1] = arr[maxIndex];
				arr[maxIndex] = temp;

				StartEndSort(arr, ++start, --end);
			}
		}
	}
}
