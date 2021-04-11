/*=======================================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - 반복문 (for문) 실습
  - 별찍기 실습
=======================================================*/

// ○ 과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

/*

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/

public class Test063
{
	public static void main(String[] args)
	{
		int i, j;

		for (j=1; j<5; j++)
		{
			for (i=5-j; i>0; i--)
			{
				System.out.print(" ");
			}
			for (i=j; i>0; i--)
			{
				System.out.print("*");
			}
			for (i=j-1; i>0; i--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (j=0; j<6; j++)
		{
			for (i=j; i>0; i--)
			{
				System.out.print(" ");
			}
			for (i=5-j; i>0; i--)
			{
				System.out.print("*");
			}
			for (i=4-j; i>0; i--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/* 실행결과
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

계속하려면 아무 키나 누르십시오 . . .
*/