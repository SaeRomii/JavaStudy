/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
=========================================*/

import java.math.BigDecimal;
import java.math.MathContext;

public class Test128
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789");		//큰 실수값

		// movePointLeft() : 소수점을 왼쪽으로 이동
		BigDecimal b = a.movePointLeft(3);
		System.out.println("결과 확인 : " + b);
		//--==>> 결과 확인 : 123456.789123456789

		BigDecimal t1 = new BigDecimal("400.0");
		BigDecimal t2 = new BigDecimal("6.0");

		BigDecimal t3 = t1.divide(t2, 3);		//t1을 기반으로 t2로 나누기, 두번째 매개변수는 소수점 자리 세번째까지 유효하게(네번째자리에서 반올림)
		BigDecimal t4 = t1.divide(t2, 2);		//t1을 기반으로 t2로 나누기, 두번째 매개변수 소수점 자리 두번째자리까지 유효하게(세번째자리에서 반올림)
		System.out.println("t3 : " + t3);
		System.out.println("t4 : " + t4);
		//--==>> t3 : 66.6
		//		 t4 : 66.7

		// 나눗셈 (대체 속성 확인, 반올림 하지 않는다. → 절삭)
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);
		//BigDecimal c = a.divide(b, 1);와 동일한 구문

		System.out.println("c : " + c);
		//--==>> c : 1000.000000000

		System.out.println(BigDecimal.ROUND_DOWN);		//BigDecimal 클래스 안에 ROUND_DOWN 변수가 있는데 앞에 final이 생략되어 있겠군
		//--==>> 1										  ROUND_DOWN = 상수화된 변수, static

		BigDecimal d = a.divide(b, 5);					//a를 b로 나눠라, 소수점이하 다섯번째자리에서 유효하게 (여섯번째자리에서 반올림)
		System.out.println("d : " + d);
		//--==>> d : 1000.000000000

		// 유효 자리 : 소수점 이하 5번째 자리(두 번째 인자값 5)
		BigDecimal e = a.divide(b, 5, BigDecimal.ROUND_DOWN); // 1이라는 숫자를 세번째 인자값까지 넘기게 소수점 다섯째자리까지 유효하게(그 뒤부터는 절삭)
		// BigDecimal e = a.divide(b, 5, 1); 과 같음
		System.out.println("e : " + e);
		//--==>> e : 1000.00000
		
		// ROUND는 반올림
		System.out.println(BigDecimal.ROUND_CEILING);		//올림
		System.out.println(BigDecimal.ROUND_FLOOR);			//내림(절삭)
		//--==>> 2
		//		 3

		// 추가 보충 정리
		//BigDecimal result = t1.divide(t2);
		//System.out.println("result : " + result);
		//--==>> 에러 발생(런타임 에러)

		System.out.println(MathContext.DECIMAL32);
		//--==>> precision=7 roundingMode=HALF_EVEN
		// 소수점 전체 자리수 7번째까지 유효
		// 소수점 전체 자리수 7번째까지 유효랑, 반올림 옵션 설정도 하게 해주는거

		System.out.println(MathContext.DECIMAL64);
		//--==>> precision=16 roundingMode=HALF_EVEN

		System.out.println(MathContext.DECIMAL128);
		//--==>> precision=34 roundingMode=HALF_EVEN

		// t1.divide(t2);				// t1을 t2로 나눈 몫 → 나눗셈
										// 단, 몫이 떨어지지 않을 경우 예외 발생

		// t1.divide(t2, b);			// t1을 t2로 나눈 몫 → 나눗셈
										// 단, b 방식(모드)으로 처리해라
										// 올림 / 버림(절삭) / 반올림

		// t1.divide(t2, 올림/버림/반올림);		매개변수 두개 넘길때 사용하는 방법 ↓

		System.out.println("BigDecimal.ROUND_UP : " + BigDecimal.ROUND_UP);
		System.out.println("BigDecimal.ROUND_DOWN : " + BigDecimal.ROUND_DOWN);
		System.out.println("BigDecimal.ROUND_CEILING : " + BigDecimal.ROUND_CEILING);
		System.out.println("BigDecimal.ROUND_FLOOR : " + BigDecimal.ROUND_FLOOR);
		System.out.println("BigDecimal.ROUND_HALF_UP : " + BigDecimal.ROUND_HALF_UP);
		System.out.println("BigDecimal.ROUND_HALF_DOWN : " + BigDecimal.ROUND_HALF_DOWN);
		System.out.println("BigDecimal.ROUND_HALF_EVEN : " + BigDecimal.ROUND_HALF_EVEN);
		System.out.println("BigDecimal.ROUND_UNNECESSARY : " + BigDecimal.ROUND_UNNECESSARY);
		/*
		BigDecimal.ROUND_UP : 0
		BigDecimal.ROUND_DOWN : 1
		BigDecimal.ROUND_CEILING : 2
		BigDecimal.ROUND_FLOOR : 3
		BigDecimal.ROUND_HALF_UP : 4
		BigDecimal.ROUND_HALF_DOWN : 5
		BigDecimal.ROUND_HALF_EVEN : 6
		BigDecimal.ROUND_UNNECESSARY : 7		올림이나 절삭 수행하지 않음
		*/
		
		BigDecimal result;
		
		result = t1.divide(t2, MathContext.DECIMAL32);	
		System.out.println("result : " + result);
		//--==>> result : 66.66667

		System.out.println("----------------------------------------------------------");


		// t1.divide(t2, a, b);  a는 유효한 자리수 표기 → precision=7로 표현


		/*
		static final PI = 3.141592;

		r * r * 3.141592;

		*/
	}
}