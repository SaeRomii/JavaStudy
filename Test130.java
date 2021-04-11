/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
=========================================*/

public class Test130
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//--==>> 2147483647
		//		 -2147483648

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		//--==>> 9223372036854775807
		//		 -9223372036854775808

		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		//--==>> 1.7976931348623157E308
		//		 4.9E-324
		// → e 표기법 (IEEE 754)

		System.out.println();

		//System.out.println("1 : " + 3/0);
		//--==>> 에러 발생 (런타임 에러)
		// 정수에서 0으로 나누는게 잘못된거라고 인식해서 런타임 에러뜸

		System.out.println("2 : " + 3.0/0);
		//--==>> 2 : Infinity

		System.out.println("3 : " + -3.0/0);
		//--==>> 3 : -Infinity

		System.out.println("4 : " + (3.0/0 == 3.0/0));
		//System.out.println("4 : " + (Infinity == Infinity) 무한대랑 무한대는 같다.
		//--==>> 4 : true

		System.out.println("4 : " + (3.0/0 == -3.0/0));
		//--==>> 4 : false

		// 『Double.isInfinite()』  is있으면 ~인지 아닌지라서 true false 값으로 나옴
		// → 무한대인지 아닌지
		// static이 붙어있는 class 메소드
		System.out.println("6 : " + Double.isInfinite(3.0/0));
		//--==>> 6 : true

		System.out.println("7 : " + Double.isInfinite(-3.0/0));
		//--==>> 7 : true

		System.out.println("8 : " + (3.0/0 + -3.0/0));
		//--==>> 8 : NaN 
		//		 NaN : Not a Number

		System.out.println("9 : " + 0.0/0);
		//--==>> 9 : NaN
		//		 없는걸 없는걸로 나눠서 NaN

		System.out.println("10 : " + (0.0/0 == 0.0/0));
		//--==>> 10 : false
		//		 숫자가 아닌것끼리 같다고 볼 수 없음

		System.out.println("11 : " + (0.0/0 != 0.0/0));
		//--==>> 11 : true

		// ※ NaN(Not a Number) 값과 임의의 수를
		//	  『==』 연산자를 통해 비교 연산을 수행하게 되면
		//	  결과는 언제나 『false』를 반환한다.

		System.out.println("12 : " + Double.isNaN(0.0/0));	//NaN인지 아닌지
		//--==>> 12 : true

		System.out.println("13 : " + -0.0/0);
		//--==>> 13 : NaN


	}
}