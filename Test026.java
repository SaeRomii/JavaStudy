/*==============================
  ■■■ 연산자(Operator) ■■■
  - 논리 연산자
==============================*/


public class Test026
{
	public static void main(String[] args)
	{
		int x=128;
		// 128     → 00000000 00000000 00000000 10000000
		// 128<<3  → 00000000 00000000 00000100 00000000

		// 128     → 00000000 00000000 00000000 10000000
		// 128>>3  → 00000000 00000000 00000000 00010000


		System.out.printf("x >> 3 = %d\n", (x<<3));
		System.out.printf("x * 8  = %d\n", (x*8));

		System.out.printf("x >> 3 = %d\n", (x>>3));
		System.out.printf("x / 8  = %d\n", (x/8));

		System.out.println();

		System.out.printf("x << 24 = %d\n", (x<<24));
		// 10000000 00000000 00000000 00000000
		//--==>> x << 24 = -2147483648  음수 최대값

		System.out.printf("x << 25 = %d\n", (x<<25));
		// 1    00000000 00000000 00000000 00000000
		//--==>> x << 25 = 0

		System.out.printf("x << 26 = %d\n", (x<<26));
		System.out.printf("x << 31 = %d\n", (x<<31));

		System.out.printf("x << 32 = %d\n", (x<<32));
		System.out.printf("x << 33 = %d\n", (x<<33));
		System.out.printf("x << 34 = %d\n", (x<<34));
		System.out.printf("x << 35 = %d\n", (x<<35));
		//--==>> x << 26 = 0
		//		 x << 31 = 0
		//		 x << 32 = 128
		//		 x << 33 = 256
		//		 x << 34 = 512
		//		 x << 35 = 1024


	}
}

/* 실행 결과
x >> 3 = 1024
x * 8  = 1024
x >> 3 = 16
x / 8  = 16
계속하려면 아무 키나 누르십시오 . . .
*/