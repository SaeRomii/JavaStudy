/*=======================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스 개념 적용 및 클래스 설계 실습
=======================================*/

// 사용자로부터 임의의 정수를 입력받아
// 1부터 입력받은 수 까지의 합을 연산하여
// 결과를 출력하는 프로그램을 구현한다.

// 단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 입력 처리 과정에서 BufferedReader 의 readLine() 을 사용하며,
// 입력받은 데이터가 1보다 작거나 1000보다 큰 경우
// 다시 입력받을 수 있는 처리를 포함하여 프로그램을 구성할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력(1~1000) : 1002
// 임의의 정수 입력(1~1000) : -20
// 임의의 정수 입력(1~1000) : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	int a;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			a = Integer.parseInt(br.readLine());
		}
		while (a<1 || a>1000);									//이 조건에 맞지 않으면 위에 실행 a = Integer~
	}

	int calResult()
	{
		int sum=0;

		for (int i=0; i<=a; i++)
		{
			sum+=i;
		}

		return sum;
	}

	void print(int b)
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", a, b);
	}

	
}

public class Test072
{
	public static void main(String[] args) throws IOException
	{
		Hap ob = new Hap();
		ob.input();						// 생성한 인스턴스를 통해 입력 메소드 호출~!!! → throws IOException 처리

		int a = ob.calResult();			// 생성한 인스턴스를 통해 연산 메소드 호출~!!! → int형 결과값 반환 → 받아낼 수 있는 처리

		ob.print(a);					// 생성한 인스턴스를 통해 출력 메소드 호출~!!! → 매개변수 전달
		

	}
}

/* 실행 결과
임의의 정수 입력(1~1000) : -5
임의의 정수 입력(1~1000) : 2000
임의의 정수 입력(1~1000) : 500
>> 1 ~ 500 까지의 합 : 125250
계속하려면 아무 키나 누르십시오 . . .
*/