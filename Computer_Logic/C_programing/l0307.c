#include <stdio.h>
#include <limits.h> //������ ������Ÿ���� �ּҰ�(MIN) �ִ밪(MAX) ��� ���� ���̺귯��
#include <float.h> //�Ǽ��� ������ �ּ� �ִ밪

void a1() {
	//������� ��Ʈ�� k c �ϸ� �ּ�
	short num1 = 2;
	int num2 = 4;
	long num3 = 4;
	float num4 = 1.4;
	double num5 = 2.5;
	char c1;

	printf("-----------�ڷ����� ������ �޸� ũ��---------\n");
	printf("char\t �ڷ����� ũ�� = %dbyte\t�޸� ũ�� = %dbyte\n", sizeof(char), sizeof(c1));
	printf("short\t �ڷ����� ũ�� = %dbyte\t�޸� ũ�� = %dbyte\n", sizeof(char), sizeof(num1));
	printf("int\t �ڷ����� ũ�� = %dbyte\t�޸� ũ�� = %dbyte\n", sizeof(int), sizeof(num2));
	printf("long\t �ڷ����� ũ�� = %dbyte\t�޸� ũ�� = %dbyte\n", sizeof(long), sizeof(num3));
	printf("float\t �ڷ����� ũ�� = %dbyte\t�޸� ũ�� = %dbyte\n", sizeof(float), sizeof(num4));
	printf("double\t �ڷ����� ũ�� = %dbyte\t�޸� ũ�� = %dbyte\n", sizeof(double), sizeof(num5));
}

void a2() {
	printf("char\t�� �ּҰ�\t%d, �ִ밪\t%d\n", CHAR_MIN, CHAR_MAX);
	printf("short\t�� �ּҰ�\t%d, �ִ밪\t%d\n", SHRT_MIN, SHRT_MAX);
	printf("int\t�� �ּҰ�\t%d, �ִ밪\t%d\n", INT_MIN, INT_MAX);
	printf("long\t�� �ּҰ�\t%d, �ִ밪\t%d\n", LONG_MIN, LONG_MAX);
}

void a3() {
	printf("float\t\t�� �ּҰ�\t%Le, �ִ밪\t%Le\n", FLT_MIN, FLT_MAX);
	printf("double\t\t�� �ּҰ�\t%Le, �ִ밪\t%Le\n", DBL_MIN, DBL_MAX);
	printf("long double\t�� �ּҰ�\t%Le, �ִ밪\t%Le\n", LDBL_MIN, LDBL_MAX);
}

void a4() {
	printf("unsugined char�� �ִ밪 %d\n", UCHAR_MAX);
	printf("unsugined short�� �ִ밪 %d\n", USHRT_MAX);
	printf("unsugined int�� �ִ밪 %d\n", UINT_MAX);
	printf("unsugined long�� �ִ밪 %d\n", ULONG_MAX);
}

void a5() {
	signed char char1 = 130; //-128~127 / (+3��ŭ)
	unsigned char char2 = 130; //0~255 
	printf("------ over flow ----- \n"); 
	printf("%d\n", char1);
	printf("%d\n", char2);

	char1 = 127;
	char2 = -1; //underflow(-1��ŭ)

	printf("------ under flow ----- \n");
	printf("%d\n", char1);
	printf("%d\n", char2);

}

void a6() {
	signed char char1 = -129; //(under flow -1��ŭ)
	signed char char2 = 128; //(overflow +2��ŭ)
	printf("%d\n", char1);
	printf("%d\n", char2);
	
	char1 = -130; //under flow(-2��ŭ)
	char2 = 129; //over flow(+2��ŭ)
	printf("%d\n", char1);
	printf("%d\n", char2);
}