/*===========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - 반복문 (while문) 실습
===========================================*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가... 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 10 
// 10 → 소수 아님   출력구문 반복되는게 아니라서 출력구문은 밖에 있어야함
// 계속하려면 아무 키나...

// 임의의 정수 입력 : 11
// 11 → 소수
// 계속하려면 아무 키나..

// 소수 : 1 또는 자기 자신의 값 이외의 어떤 수로도 나눌 수 없는 값
//		  단, 1은 소수 아님

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test050
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		/*
		int a=0;
		System.out.print("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		while (a%a==)
		{

			a++;
		}
		*/

		//주요 변수 선언
		int num;					//--  사용자가 입력하는 임의의 정수를 담아둘 변수

		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		int n=2;					//-- 사용자의 입력값을 대상으로
									//	 나눗셈 연산을 수행할 변수(1씩 증가 예정)

		boolean flag = true;		//-- 소수다  flag라는 임의의 변수 만들어서 이중으로 체크함

		while (n<num)
		{
			if (num%n==0)
			{
				flag = false;		//-- 소수 아니다
				//System.out.println(n);
				break;				//-- while문 탈출
			}
			n++;
		}

		// 결과 출력
		if (flag && num!=1)
		{							
			System.out.printf("%d → 소수\n", num);
		}
		else
		{
			System.out.printf("%d → 소수 아님\n", num);
		}
		// ↑ {} 생략가능
	
	}
}

/* 실행결과
임의의 정수 입력 : 10
10 → 소수 아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 29
29 → 소수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 1
1 → 소수 아님
계속하려면 아무 키나 누르십시오 . . .
*/