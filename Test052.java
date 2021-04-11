/*===========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - 반복문 (while문) 실습
===========================================*/

// 과제
// 사용자로부터 임의의 정수를 입력받아
// 1부터 그 수 까지의 전체 합과, 짝수의 합과, 홀수의 합을
// 각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 284
// >> 1 ~ 284 까지 정수의 합 : xxxx
// >> 1 ~ 284 까지 짝수의 합 : xxxx
// >> 1 ~ 284 까지 홀수의 합 : xxxx
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a;						// 임의 정수 담을 변수
		int b=0, c=0, d=0;			// 정수합, 짝수합, 홀수합
		int e=1;					// 루프변수

		System.out.print("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		while (e<=a)
		{
			b += e;

			if (e%2==0)
				c += e;
			else if (e%2!=0)
				d += e;
			
			e++;
		}
		System.out.printf(">> 1~ %d 까지 정수의 합 : %d\n", a, b);
		System.out.printf(">> 1~ %d 까지 짝수의 합 : %d\n", a, c);
		System.out.printf(">> 1~ %d 까지 홀수의 합 : %d\n", a, d);


	}
}

/* 실행 결과
임의의 정수 입력 : 284
>> 1~ 284 까지 정수의 합 : 40470
>> 1~ 284 까지 짝수의 합 : 20306
>> 1~ 284 까지 홀수의 합 : 20164
계속하려면 아무 키나 누르십시오 . . .
*/