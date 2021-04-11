/*============================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - break
============================================*/

// 다음과 같은 처리가 이루어지는 프로그램을 구현한다.
// 단, 입력받는 정수는 1 ~ 1000 범위 안에서만
// 가능하도록 작성한다.

// 실행 예)
// 임의의 정수 입력(1~1000) : -10
// 임의의 정수 입력(1~1000) : 0
// 임의의 정수 입력(1~1000) : 2021
// 임의의 정수 입력(1~1000) : 10
// >> 1 ~ 10 까지의 합 : 55
// 계속하시겠습니까(Y/N)? : Y

// 임의의 정수 입력(1~1000) : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하시겠습니까?(Y/N) : N
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test064
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/* 내가 풀었던 방식
		// 주요 변수 선언
		int a,b,c;
		char ch;

		while (true)
		{
			do
			{
				System.out.print("임의의 정수 입력 : ");
				a = Integer.parseInt(br.readLine());
			}
			while (a<1 || a>1000);

			b=0;
		for (c=1; c<=a; c++)
			 b+=c;

		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", a, b);
		System.out.print(" 계속하시겠습니까?(Y/N) : ");
		ch=(char)System.in.read();

		if (ch=='y' || ch=='Y')
		{
			break;
		}

		}
		*/
		
		int n, s, i;					//-- 사용자 입력값, 누적합 0으로 초기화, 루프변수
		char ch;						//-- 계속 여부 입력값
		

		while (true)					//-- 무한 루프(반복)
		{
			do							// 입력하고 반복해야하니까 do while문으로
			{
				System.out.print("임의의 정수 입력(1~1000) : ");
				n = Integer.parseInt(br.readLine());	
			}
			while (n<1 || n>1000);		// 반복할 조건 명시 → 1부터 1000사이의 값 이외에 상황일때 반복이니까
										// 논리연산 || or
			// 테스트
			//System.out.println("입력한 정수 : " + n);  → ok


			s=0;						//누적합 수행하기 전에 0으로 초기화 하면 컴파일 했을때 합산값 안나옴
			for (i=1; i<=n; i++)
			{
			s += i;
			}

			// 테스트
			//System.out.println("누적합 : " + s);   → ok
			System.out.printf("\n>> 1 ~ %d 까지의 합 : %d\n", n, s);

			
			System.out.print("계속하시겠습니까?(Y/N) : ");
			ch = (char)System.in.read();     // char형변환 후 담기
											 // y + \r + \n

			// 테스트
			//System.out.println("계속여부 : " + ch);

			// 입력값이 소문자 y가 아니다. → ch!='y'  입력값이 대문자 Y가 아니다. → ch!='Y'
			// ch=='Y'  ch=='y' → 긍정에서만 Y,y로 인식하고 나머지 문자는 인식 안해도됨
			if (ch!='y' && ch!='Y')			// 논리연산자 or 긍정에서 부정으로 바뀌면 &&로 바뀜
			{
				// 반복문 → 『while(true)』을 빠져나갈 수 있는 코드 작성 필요
				//-- 위와 같은 의사 표현을 했다면
				//   그동안 수행했던 반복문을 멈추고 빠져나가야 한다.
				break;
				//-- 멈춘다. (+ 그리고 빠져나간다. → while문)
			}

			// 엔터값(\r\n) 추가 처리
			System.in.skip(2);

		}// end while(true)
		
				
	}//end main()

}//end class Test064

/* 실행 결과
임의의 정수 입력(1~1000) : 10

>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까?(Y/N) : y
임의의 정수 입력(1~1000) : 100

>> 1 ~ 100 까지의 합 : 5050
계속하시겠습니까?(Y/N) : n
계속하려면 아무 키나 누르십시오 . . .
*/


/*
임의의 정수 입력(1~1000) : -8
임의의 정수 입력(1~1000) : 1200
임의의 정수 입력(1~1000) : 100

>> 1 ~ 100 까지의 합 : 5050
계속하시겠습니까?(Y/N) : y
임의의 정수 입력(1~1000) : 10

>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까?(Y/N) : Y
임의의 정수 입력(1~1000) : 100

>> 1 ~ 100 까지의 합 : 5050
계속하시겠습니까?(Y/N) : n
계속하려면 아무 키나 누르십시오 . . .
*/