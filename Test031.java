/*===========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - if문 실습
===========================================*/

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 다음과 같은 형태로 출력하는 프로그램을 구현한다.
// 단, BufferedReader 의 readLine() 을 통해 입력받을 수 있도록 하며,
// printf() 를 통해 출력할 수 있도록 한다.

// 실행 예)
// 이름 입력 : 전혜림
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// >> 당신의 이름은 전혜림입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240이고, 평균은 80입니다.
// >> 등급은 B 입니다.
// 계속하려면 아무 키나...

// ※ 이 때, 등급은 평균 점수를 기준으로 처리한다.
// 90점 이상             : A
// 80점 이상 ~ 90점 미만 : B
// 70점 이상 ~ 80점 미만 : C	
// 60점 이상 ~ 70점 미만 : D
// 60점 미만             : F

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;			//-- 이름
		int kor, eng, mat;		//-- 국어, 영어, 수학
		int tot;				//-- 총점
		double avg;				//-- 평균
		char grade = 'F';		//-- 등급
		//char grade;


		System.out.print("이름 입력 : ");
		name = br.readLine();
		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 : ");
		mat = Integer.parseInt(br.readLine());

		// 총점 산출
		tot = kor + eng + mat;

		// 평균 산출
		avg = tot / 3.0;

		// 등급 산출
		if (avg >= 90)		// 90점 이상
		{
			grade = 'A';
		}
		else if (avg >= 80) // else if (avg >= 80 && avg < 90)
		{
			grade = 'B';
		}
		else if (avg >= 70)
		{
			grade = 'C';
		}
		else if (avg >= 60)
		{
			grade = 'D';
		}
		else// if (avg < 60)
		{
			grade = 'F';
		}
		

		System.out.println();
		System.out.printf(">> 당신의 이름은 %s입니다.\n", name);
		System.out.printf(">> 국어 점수는 %d,\n", kor);
		System.out.printf(">> 영어 점수는 %d,\n", eng);
		System.out.printf(">> 수학 점수는 %d,\n", mat);
		System.out.printf(">> 총점은 %d이고, 평균은 %.2f입니다.\n", tot, avg);
		System.out.printf(">> 등급은 %c 입니다.\n", grade);

	}
}

/* [실행 결과]
이름 입력 : 전혜림
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

>> 당신의 이름은 전혜림입니다.
>> 국어 점수는 90,
>> 영어 점수는 80,
>> 수학 점수는 70,
>> 총점은 240이고, 평균은 80.00입니다.
>> 등급은 B 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/

/*
이름 입력 : 김가영
국어 점수 : 90
영어 점수 : 90
수학 점수 : 90

>> 당신의 이름은 김가영입니다.
>> 국어 점수는 90,
>> 영어 점수는 90,
>> 수학 점수는 90,
>> 총점은 270이고, 평균은 90.00입니다.
>> 등급은 A 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/

/*
이름 입력 : 이하림
국어 점수 : 10
영어 점수 : 20
수학 점수 : 30

>> 당신의 이름은 이하림입니다.
>> 국어 점수는 10,
>> 영어 점수는 20,
>> 수학 점수는 30,
>> 총점은 60이고, 평균은 20.00입니다.
>> 등급은 F 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/