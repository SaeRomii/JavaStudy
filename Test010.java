/*==================================================
  ■■■ 변수와 자료형 ■■■
  - 퀴즈
  	사전에 부여된 반지름 정보를 통해
	원의 넓이와 둘레를 구하는 프로그램을 작성한다.
	·반지름 : 10
==================================================*/

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 넓이 : xxxx
// 둘레 : xxxx
// 계속하려면 아무 키나 누르세요...


public class Test010
{
	public static void main(String[] args)
	{
		int r;

		r = 10;

		double b = r * r * 3.141592d;

		double c = r * 2 * 3.141592d;

		System.out.println("넓이 : " + b);
		System.out.println("둘레 : " + c);
		


		// ※ 키워드 『final』 : 변수의 상수화~!!

		// 선생님이 출력한 방법
		/*
		int r;
		r=10;
		
		double area, length;

		area = r * r * pi;
		length = r * 2 * pi;

		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);

		또는
		System.out.println("넓이 : ○\n둘레 : ○\n", area, length);
		System.out.println("넓이 : %f\n둘레 : %f\n", area, length);

		*/


	}
}

/* 실행 결과
넓이 : 314.1592
둘레 : 62.83184
계속하려면 아무 키나 누르십시오 . . .
*/

