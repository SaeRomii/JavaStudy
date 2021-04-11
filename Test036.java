/*===========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - if ~ else문 실습
===========================================*/

// 사용자로부터 임의의 정수를 세 개 입력받아
// 작은 수 부터 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 45
// 두 번째 정수 입력 : 81
// 세 번째 정수 입력 : 13

// >> 정렬 결과 : 13 45 81
// 계속하려면 아무 키나...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;		//--사용자가 입력하는 임의의 정수를 담을 변수
		int temp;			//--임시 저장 변수(빈 컵)

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());


		// 2 2 2 | 3 2 1 | 2 1 3 | 3 1 2 | 1 3 2
		//       | 2 3 1 | 1 2 3 | 1 3 2 | 1 2 3   첫번째 두번째 비교해서 작은게 더 앞으로 오게 자리 바꿈
		//       | 2 1 3 |       | 1 2 3
		//       | 1 2 3


		//else if 아니고 단독 if로 입력해야함 else if하면 다음 if문 실행안해서

		if (a>b)		// 첫 번째 정수가 두 번째 정수보다 크다면...
		{
			// 두 정수(a와 b)의 자리를 바꾼다.
			temp = a;
			a = b;
			b = temp;
		}

		if (b>c)		// 두 번째 정수가 세 번째 정수보다 크다면...
		{
			// 두 정수(b와 c)의 자리를 바꾼다.
			temp = b;
			b = c;
			c = temp;
		}

		if (a>b)		// 첫 번째 정수가 두 번째 정수보다 크다면...
		{
			// 두 정수(a와 b)의 자리를 바꾼다.
			temp = a;
			a = b;
			b = temp;
		}


		System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, b, c);



	}
}

/* 실행 결과
첫 번째 정수 입력 : 45
두 번째 정수 입력 : 81
세 번째 정수 입력 : 13

>> 정렬 결과 : 13 45 81
계속하려면 아무 키나 누르십시오 . . .
*/