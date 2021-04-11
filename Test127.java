/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
=========================================*/
//BigInteger 쓰는 이유 : 값이 너무 커서 정수에 안들어가서 문자열로 바꿈

import java.math.BigInteger;

public class Test127
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;      21억 넘어가서 에러
		//long b1 = 123456789123456789L;	int로 자동 형변환 되니까 뒤에 접미사 L붙여줘야함
		//long c1 = 123456789123456789123456789L;

		BigInteger a = new BigInteger("123456789123456789");		// 큰 정수값
		BigInteger b = new BigInteger("123456789123456789");

		//System.out.println(a+b); 객체를 상수연산하는거 안됨
		
		//BigInteger c = a + b;
		//System.out.println(c);

		// ※ 일반적인 산술연산자를 통한 연산 불가능

		// 메소드를 통해서 연산해야함
		// 더하기
		BigInteger c = a.add(b);							// BigInteger에서 제공하는 add메소드 사용 가능
		System.out.println("덧셈 결과 : " + c);				// add라는 메소드를 통해 덧셈 연산
		//--==>> 덧셈 결과 : 246913578246913578

		// 빼기
		BigInteger d = a.subtract(b);						// subtract 메소드를 통해 뺄셈 연산
		System.out.println("뺄셈 결과 : " + d);
		//--==>> 뺄셈 결과 : 0
		
		// 곱셈
		BigInteger e = a.multiply(b);
		System.out.println("곱셈 결과 : " + e);				// multiply 메소드를 통해 곱셈 연산
		//--==>> 곱셈 결과 : 15241578780673678515622620750190521

		// 나누기
		BigInteger f = a.divide(b);							// divide 메소드를 통해 나눗셈 연산
		System.out.println("나눗셈 결과 : " + f);
		//--==>> 나눗셈 결과 : 1

		// 지수승
		BigInteger g = new BigInteger("2");
		System.out.println("2의 3승 : " + g.pow(3));
		//--==>> 2의 3승 : 8
	}
}