/*=====================================
  ■■■ 클래스 고급 ■■■
  - 상속(Inheritance)
=====================================*/

// ○ 실습 문제
//	  다음과 같은 프로그램을 구현한다.
//	  단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15
// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class AClass
{
	protected int x, y;
	protected char op;

	AClass()
	{
		
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

class BClass extends AClass
{
	/*
	private int a, b;

	BClass()
	{
		super();
	}


	public void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		super.x = sc.nextInt();
		super.y = sc.nextInt();

		System.out.print("연산자 입력(+ - * /) : ");
		super.op = (char)System.in.read();

	}

	public void cal()
	{
		double result =0;

		this.a=a;
		this.b=b;

		if (super.op=='+')
		{
			result=a+b;
		}
		else if (super.op=='-')
		{
			result=a-b;
		}
		else if (super.op=='*')
		{
			result=a*b;
		}
		else if (super.op=='/')
		{
			result=a/b;
		}

		write(result);
		
	}
	*/

	BClass()
	{
		
	}

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		String temp = br.readLine();
		String[] str = temp.split("\\s");	// 구분자 → 공백
		// ※ 문자열.split("구분자");
		//	  ex) "사과 딸기 바나나 포도 수박".split(공백);
		//		   반환 → 배열 → {"사과", "딸기", "바나나", "포도", "수박"}
		//	  ex) "1 23 456 7".split(공백);
		//		   반환 → 배열 → {"1", "23", "456", "7"}

		//==>> String[] str = {"20", "15"};

		if (str.length!=2)
		{
			return false;	// 값의 반환 → false 그리고 메소드 종료
		}					// false(거짓)를 반환하며 메소드 종료

		// ※ 이 조건문을 수행할 경우 아래에 코드가 남아있는 상황이더라도
		//	  더 이상 수행하지 않고 결과값을 반환하며 메소드는 종료된다.

		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		/*
		if (op!='+' && op!='-' && op!='*' && op!='/')	//부정 논리연산자
		{
			return false;
		}
		return true;
		*/

		if (op=='+' || op=='-' || op=='*' || op=='/')
		{
			return true;
		}
		return false;
	}// end input()

	double calc()
	{
		double result = 0;

		switch (op)
		{
		case '+': result=x+y; break;
		case '-': result=x-y; break;
		case '*': result=x*y; break;
		case '/': result=(double)x/y; break;
		}
		return result;
	}

	
}

// main()메소드를 포함하고 있는 외부의 다른 클래스
public class Test108
{
	public static void main(String[] args) throws IOException
	{
		BClass ob = new BClass();

		if (!ob.input())		//원래 void로 했어서 ob.input하면 되는데 위에서 boolean input해서 if조건문으로
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();
		ob.write(result);
	}
}

/* 실행 결과
임의의 두 정수 입력(공백 구분) : 20 15
연산자 입력(+ - * /) : -
>> 20 - 15 = 5.00
계속하려면 아무 키나 누르십시오 . . .
*/