/*=====================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
=====================================*/

// ○ 실습 문제
//	  사용자로부터 여러 학생의 성적 데이터를 정수 형태로 입력받아
//	  점수가 높은 순으로 등수를 부여하여 결과를 출력하는 프로그램을 구현한다.
//	  단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1) : 박정준 90
// 이름 점수 입력(2) : 선혜연 80
// 이름 점수 입력(3) : 소서현 85
// 이름 점수 입력(4) : 심혜진 75
// 이름 점수 입력(5) : 안정미 95

//================
// 1등 안정미 95
// 2등 박정준 90
// 3등 소서현 85
// 4등 선혜연 80
// 5등 심혜진 75
//================
// 계속하려면 아무 키나...

import java.util.Scanner;

public class Test105
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int inwon;
		int i=1, j;
		int pass=0;
		boolean flag;

		System.out.print("인원 수 입력 : ");
		inwon = sc.nextInt();

		//배열방 만들기
		String[] name = new String[inwon];		//이름
		int[] score = new int[inwon];			//점수
		int[] rank = new int[inwon];			//등수
		String temp;

		do
		{
			System.out.print("이름 점수 입력(" + i + ") : ");
			name[i-1] = sc.next();			//이름은 문자열
			score[i-1] = sc.nextInt(); 
		}
		while (i++<inwon);

		do
		{
			pass++;
			flag = false;

			for (j=0; j<inwon-pass; j++)
			{
				if (score[j]<score[j+1])
				{
					temp=name[j];
					name[j]=name[j+1];
					name[j+1]=temp;

					score[j]=score[j]^score[j+1];		//자리 바꿈은 바이트로 비교하는거라서 String은 안됨
					score[j+1]=score[j+1]^score[j];
					score[j]=score[j]^score[j+1];

					flag = true;

				}
			}
		}
		while (flag);

		for (i=0; i<inwon; i++)
		{
			rank[i]=1;						//1등이라는 가정하에
			for (j=0; j<inwon; j++)
			{
				if (score[i]<score[j])
				{
					rank[i] += 1;
				}
			}
		}


		System.out.println("\n================");

		for (i=0; i<inwon; i++)		//배열 이용해서 결과값 출력할때
		{
			System.out.printf("%d등 %s %d\n", rank[i], name[i], score[i]);
		}
		System.out.println("================");

		
	}
}

/* 실행 결과
인원 수 입력 : 3
이름 점수 입력(1) : 새롬 90
이름 점수 입력(2) : 혜림 95
이름 점수 입력(3) : 하림 100

================
1등 하림 100
2등 혜림 95
3등 새롬 90
================
계속하려면 아무 키나 누르십시오 . . .
*/