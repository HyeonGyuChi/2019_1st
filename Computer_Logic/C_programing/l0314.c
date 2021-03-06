#include <stdio.h>

void b1()
{
	/* 16진수 표현*/
	int a = 0xa7;
	int b = 0x43;

	/* 8진수 표현*/
	int c = 032;
	int d = 024;

	/* 16진수 -> 10진수 변환출력*/
	printf("16진수 : %x -> 10진수 : %d\n", a, a);
	printf("16진수 : %x -> 10진수 : %d\n", b, b);

	/* 8진수 -> 10진수 변환출력*/
	printf("8진수 : %o -> 10진수 : %d\n", c, c);
	printf("8진수 : %o -> 10진수 : %d\n", d, d);

}

void b2()
{
	int a = 15; // 00000000 00000000 00000000 00001111
	int b = 20; // 00000000 00000000 00000000 00010100
	int c = a & b;
	
	printf("AND 연산 : %d\n", c); // 00000000 0000000 0000000 00000100

	c = a | b;
	printf("OR 연산 : %d\n", c); // 00000000 0000000 00000000 00011111

	c = a ^ b;
	printf("XOR 연산 : %d\n", c); // 00000000 00000000 00000000 00011011

	c = ~a;
	printf("NOT 연산 : %d\n", c); //11111111 11111111 11111111 11110000

	c = a << 2;
	printf("<<2 연산 : %d\n", c); // 00000000 00000000 00000000 00111100
	printf("%d", a);

	c = a >> 2; //오른쪽 shift는 부호에 따라 앞에 0(양수) 1(음수) 이 붙음

}
