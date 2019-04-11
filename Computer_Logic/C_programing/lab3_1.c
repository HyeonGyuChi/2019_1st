#include <stdio.h>

void lab3_1()
{
	signed char a = 10; // 00001010 / signed char �̹Ƿ� 1byte = 8bit ǥ���������� : -(2�� 7��) ~ 2�� 7�� - 1
	signed char b = 15; // 00000111
	signed char result;

	result = a & b;
	printf("a AND b ���� : %d\n", result); 
	/* a = 00001010
	   b = 00001111 &
	   ------------
  result = 00001010
		
		result = 10
	   &�� ��� 1�ϰ�쿡�� 1, �ϳ��� 0�̸� 0
	   */
	

	result = a | b;
	printf("a OR b ���� : %d\n", result);
	/* a = 00001010
	   b = 00001111 |
	   ------------
  result = 00001111

	   result = 15
	   |�� �ϳ��� 1�̸� 1
	   */

	result = a ^ b;
	printf("a XOR b ���� : %d\n", result);
	/* a = 00001010
	   b = 00001111 ^
	   ------------
  result = 00000101

	   result = 5
	   ^�� ���� �ٸ��� 1, ���ΰ����� 0
	   */


	result = ~a;
	printf("NOT a ���� : %d\n", result);
	/* a = 00001010 ~
	   ------------
  result = 11110101
	   
	   result = -11
	   ~�� 0->1 1->0���� �ٲ�

	   signed char�̹Ƿ� 2�Ǻ��� ǥ������ ����Ѵ�. �׷��Ƿ� msb�� ���� 1�̹Ƿ� ����
	   ���->������ �ٲ� �� 2�Ǻ����� ��������Ƿ�
	   ����->����� �ٲܶ��� �� ����� �ݴ�� �����Ѵ�.
	   ���� -1 : 11110100
	   1�Ǻ��� : 00001011 -> 11
		   
	   ����->����� ��ȯ�� ���� 11�̹Ƿ� result = -11
	   */

	
}