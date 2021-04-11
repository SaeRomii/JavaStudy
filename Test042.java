/*===========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - switch문 실습
===========================================*/

// 사용자로부터 임의의 두 정수의 연산자를 입력받아
// 해당 연산의 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch 문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 형태로 처리한다.

// 실행 예)
// 첫 번째 정수 입력    : 10
// 두 번째 정수 입력    : 31
// 연산자 입력(+ - * /) : +

// >> 10 + 31 = 41
// 계속하려면 아무 키나 누르세요...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/* 내가 풀었던 방식

		int a, b;
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		switch (op)
		{
		case +: System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b)); 
		case -: System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b)); 
		case *: System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b)); 
		case /: System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b)); 
		default : System.out.print(
		
		}
		*/

		int a, b, result;
		char op;

		System.out.print("첫 번째 정수 입력    : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력    : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		// jdk 1.5이상부터 '' 사용가능
		// jdk 1.7이상부터는 문자열도 사용가능 case 뒤에
		switch (op)
		{
		case '+': result = a+b; break;
		case '-': result = a-b; break;
		case '*': result = a*b; break;
		case '/': result = a/b; break;
		default : return;	//-- 메소드 종료 → main() 메소드 종료 → 프로그램 종료
		// 실행 결과에서 에러가 뜨지 않고 종료하는걸 return이 있어서 가능
		
		}

		// ※ 『return』 : 1. 값의 반환
		//				   2. 메소드의 종료

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);



	}
}