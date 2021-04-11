/*================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스 설계
  - 배열 활용
=================================*/

// ○ 실습 문제
// 아래의 클래스(WeekDay)를 완성한다.
// 사용자로부터 년, 월, 일을 입력받아
// 해당 날짜의 요일을 출력하는 프로그램을 구현한다.
// 단, 달력 클래스(Calendar)는 사용하지 않는다.
// 또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.

// 실행 예)
// 년 월 일 입력(공백 구분) : 

// >> 1997년 110월 6일 → 월요일
// 계속하려면 아무 키나...

// ※ 문제 인식 및 분석
//	  - 윤년 및 평년의 개념 적용   
//	  - 1년 1월 1일 → 월요일    이로부터 며칠 더해서 요일 나오게

import java.util.Scanner;

class WeekDay
{
	// 주요 변수 선언(속성 구성)
	private int y, m, d;

	// 메소드 정의(입력받기)
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백 구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}

	// 메소드 정의(요일 산출하기)
	String week()
	{
		// 여기서 각 월 마지막 날 배열 구성(각 월의 최대값)
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// 여기서 요일명 배열 구성
		String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};
		
		// 날 수를 종합할 변수, 루프 변수, 요일 변수
		int nal, w;
		
		// 윤년에 따른 2월의 날 수 계산
		// 윤년이라면... 2월의 마지막 날짜를 29일로 설정 → months[1] = 29;	months배열 1번방에 29 넣겠다
		// 평년이라면... 2월의 마지막 날짜를 28일로 설정 → months[1] = 28;
		if ((y%4==0 && y%100!=0) || y%400==0)	//-- 입력한 연도가 윤년이라면
		{
			// 2월의 마지막 날짜를 29일로 설정
			months[1]=29;
		}
		else									//-- 입력한 연도가 평년이라면
		{
			// 2월의 마지막 날짜를 28일로 설정
			months[1]=28;
		}

		// ① 1년 1월 1일 부터 입력받은 년도의 이전 년도 12월 31일 까지 계산 (전년도 12월 31일까진 꽉 채워져있어서)
		nal = (y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400;
		// y-1 입력받은 연도의 이전 년도 + 4년마다 하루씩 늘어남 - 100년 마다 하루 늘어난거 빼주기 + 400년 배수 될 때 더하기

		// ② 해당 년도의 1월 1일 부터 입력받은 월의 이전 월까지의 날 수 계산 후
		//    1번 결과에 더하는 연산
		for (int i=0; i<(m-1); i++)		// m-1보다 작을때까지 
		{
			nal += months[i];
		}

		// ③ 입력받은 일의 날짜만큼 날 수 계산 후
		//	  2번 결과에 더하는 연산
		nal += d;						// nal을 d만큼 증가

		// 무슨 요일인지 확인하기 위한 연산
		w = nal % 7;					// 전체날수 % 7 == 0 → 일요일

		return weekNames[w];
	}

	// 메소드 정의(결과 출력)
	void print(String day)
	{
		System.out.printf("\n>> %d년 %d월 %d일 → %s요일\n", y, m, d, day);
	}
}

public class Test092
{
	public static void main(String[] args)
	{
		WeekDay wd = new WeekDay();

		wd.input();					//-- 입력 메소드 호출
		String result = wd.week();	//-- 요일 산출 메소드 호출
		wd.print(result);			//-- 결과 출력 메소드 호출
	}
}


/*
년 월 일 입력(공백 구분) : 2021 7 9

>> 2021년 7월 9일 → 금요일
계속하려면 아무 키나 누르십시오 . . .
*/