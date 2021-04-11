/*==============================
  ■■■ 연산자(Operator) ■■■
  - 삼항 연산자 == 조건 연산자
==============================*/

// 피연산자 연산자 피연산자 연산자 피연산자
// --------        --------		   --------
//	 1항			  2항			  3항

// 피연산자 ? 피연산자 : 피연산자
// --------   --------   --------
//    1항		 2항	    3항

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 짝수인지 홀수인지 판별하는 프로그램을 구현한다.
// 단, 조건연산자(삼항연산자)를 활용하여 처리할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : 5

//==[판별 결과]==
// 5 → 홀수
//===============
//계속하려면 아무 키나 누르세요....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test027
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언
		int n;				//-- 사용자로부터 입력받은 임의의 정수(데이터)를 담을 변수
		String strResult;	//-- 홀수인지 짝수인지에 대한 판별 결과를 담을 변수


		// 연산 및 처리
		// · 사용자에게 안내 메세지 출력
		System.out.print("임의의 정수 입력 : ");		// "13"

		// · 사용자가 입력한 값을 변수(n)에 담아내기
		n = Integer.parseInt(br.readLine());			// 13

		// · 홀수인지 짝수인지에 대한 판별 연산
		// _____ ? _____ : _____;
		// 수식1   수식2   수식3

		// 수식 1 : 참 또는 거짓을 반환할 수 있는 수식의 형태로 작성
		// 수식 2 : 수식1의 처리 결과가 『참(true)』일 경우 수행하는 영역
		// 수식 3 : 수식1의 처리 결과가 『거짓(false)』일 경우 수행하는 영역

		// n을 2로 나눈 나머지가 0이면... 짝수... 아니면... 홀수
		strResult = n % 2 == 0 ? "짝수" : "홀수";

		// ex) 사용자의 입력값이 13인 경우... 처리 과정~!!!
		// 1 strResult = 13 % 2 == 0 ? "짝수" : "홀수";
		// 2 strResult = 1 == 0 ? "짝수" : "홀수";
		// 3 strResult = false ? "짝수" : "홀수";
		// 4 strResult = "홀수";

		// ex) 사용자의 입력값이 12인 경우.. 처리 과정~!!!
		// 1 strResult = 12 % 2 == 0 ? "짝수" : "홀수";
		// 2 strResult = 0 == 0 ? "짝수" : "홀수";
		// 3 strResult = true == 0 ? "짝수" : "홀수";
		// 4 strResult = "짝수";


		// 결과 출력
		System.out.println();
		System.out.println("==[판별 결과]==");
		System.out.printf(" %d → %s\n", n, strResult);
		System.out.println("===============");


	}
}

/* 실행결과
임의의 정수 입력 : 3

==[판별 결과]==
 3 → 홀수
===============
계속하려면 아무 키나 누르십시오 . . .
*/