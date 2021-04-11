/*===================================
  ■■■ 클래스와 인스턴스 ■■■
====================================*/

// ○ 실습 문제
// 원의 넓이와 둘레 구하기

// 클래스 파일 하나 더 만들기
// 원의 넓이와 둘레를 구할 수 있는 클래스를 독립적으로(별도로) 생성한다.
// (클래스명 : CircleTest) → CircleTest.java

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : xx

// >> 반지름이 xx 인 원의
// >> 넓이 : xxx.xx
// >> 둘레 : xxx.xx
// 계속하려면 아무 키나...

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		/* 내가 풀었던 방식
		CircleTest ob = new CircleTest();		// ob = object
		double a, b;

		ob.input();
		a = ob.calLength();
		b = ob.calArea();

		ob.print(a, b);
		*/

		CircleTest ob = new CircleTest();
		ob.input();								// 원래는 다 써야하는데 CircleTest에 있는 메소드에 있는 br.readLine이 만약 사고를 치면
												// 밖에 내보내기로 하는 throws IOException을 쓰면서 메인메소드 뒤에 작성하게되면
												// 내가 풀었던 방식대로 안써도됨 메인메소드 쪽에도 쓰게되면 아예 밖으로 던지는거
		double length = ob.calLength();
		double area = ob.calArea();
		
		
		/*
		System.out.println("area : " + area);
		System.out.println("length : " + length);
		*/
		
		ob.print(length, area);
	}
}

/* 실행결과
반지름 입력 : 25
반지름이 25인 원의
원의 넓이 : 1963.50
원의 둘레 : 157.08
계속하려면 아무 키나 누르십시오 . . .
*/