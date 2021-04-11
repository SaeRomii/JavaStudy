/*=============================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 자바의 기본 입출력 : System.in.read()
==============================================*/

/*
※ 『System.in.read()』 메소드는 한 문자만 가져온다.
	단, 하나의 문자를 입력받아 입력받은 문자의
	ASCII Code 값을 반환하게 된다.
*/

// 실행 예)
// 한 문자 입력 :
// 한 자리 정수 입력 :

// >> 입력한 문자 :
// >> 입력한 정수 :
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;

public class Test015
{
	public static void main(String[] srgs) throws IOException
	{	
		//주요 변수 선언
		char ch;
		int n;

		//연산 및 처리
		// · 사용자에게 안내 메세지 출력
		System.out.print(" 한 문자 입력 : ");		// G → 71   G로 입력하면 71로 나옴

		// 한 문자 입력 : 'G' + 엔터
		//						------------
		//						← + ↓   ==>    \r + \n

		// · 사용자 입력값을 문자형으로 변환한 후 변수 ch에 담아내기
		ch = (char)System.in.read();				//System.in.read는 71로 읽히니까 char로 명시적 형변환
													//해줘야함 그럼 G로 나옴
													//자바는 System.in.read() 싫어함 이유 : 외부 데이터
													//자기 허락없이 들어오니까 위에 문제 생기면 던진다 라는
													//throws IOException 해줘야함
		// ※ 입력 대기열에 남아있는 『\r』과 『\n』을 스킵(건너뛰기, 버리기)
		System.in.skip(2);
		//--  두 글자를 읽지 않고 건너뛴다. (버린다.)
		
		// · 사용자에게 안내 메세지 출력
		System.out.print(" 한 자리 정수 입력 : ");

		// · 사용자 입력값을 변수 n에 담아내기
		n = System.in.read();			// 0 → 48
										// 1 → 49
										// :
										// 7 → 55
										// :
										// 9 → 57
		
		// n을 48만큼 감소시켜라~!!!
		n -= 48;

		// 결과 출력
		System.out.println();
		System.out.println(">> 입력한 문자 : " + ch);
		System.out.println(">> 입력한 정수 : " + n);


	}
}

/* 실행 결과
 한 문자 입력 : A
 한 자리 정수 입력 : 5

>> 입력한 문자 : A
>> 입력한 정수 : 5
계속하려면 아무 키나 누르십시오 . . .
*/