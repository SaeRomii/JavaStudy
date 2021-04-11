/*=========================================
  ■■■ 변수와 자료형 ■■■
  - 변수와 자료형 실습 및 테스트 : double
=========================================*/


public class Test009
{
	public static void main(String[] args)
	{
		// 정수와 정수의 나눗셈
		double a = 1/2;
		// 대입연산자라서 오른쪽부터 계산 double a = 0;
		// 정수와 정수 나눗셈은 결과가 몫만 (정수로) -> 정수 정수니까 형변환 안해도 돼서 몫만 취함
		// 1/2가 0인데 double에 담기니까 0.0

		System.out.println("double a : " + a);
		//--==>> double a : 0.0

		double b = 1/2 + 1/2;
		// 1/2=0 + 1/2=0 = 0
		// 0.0...?
		System.out.println("double b : " + b);
		//--==>> double b : 0.0

		// 정수와 실수의 나눗셈
		double c = 1/2.0;
		// 1/2.0을 정수랑 실수로 이루어져있으니까 실수로 바꿔서 계산해야함
		// 1.0 나누기 2.0 이니까 0.5
		System.out.println("double c : " + c);
		//--==>> double c : 0.5
		//-- 나눗셈 연산과 관련하여 피연산자 중 실수가 포함되어 있다면
		//   실수 기반의 연산이 이루어지며 결과값은 실수 형태로
		//	 연산되어 반환된다.

		double d = 3/2 + 1/2;
		// 3/2=1 + 1/2=0
		// 1
		// 1.0
		System.out.println("double d : " + d);
		//--==>> double d : 1.0


		double e = 3/2 + 1/2.0;
		// 1 + 0.5
		// 1.0 + 0.5
		// 1.5

		System.out.println("double e : " + e);
		//--==>> double e : 1.5



	}
}

/* 실행 결과
double a : 0.0
double b : 0.0
double c : 0.5
double d : 1.0
double e : 1.5
계속하려면 아무 키나 누르십시오 . . .
*/