/*========================================
  ■■■ 클래스 고급 ■■■
  - 인터페이스(Interface) 
========================================*/

// ○ 실습 문제
//	  성적 처리 프로그램을 구현한다.
//	  단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2		do while문
// 1번째 학생의 학번 이름 입력(공백 구분) : 2104256 박민지 Scanner
// 국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2104257 김서현
// 국어 영어 수학 점수 입력   (공백 구분) : 85 70 65

// 2104256 박민지 90 100 85		275		91
//				  수 수 우
// 2104257 김서현 85 70 65		220		73
//				  우 미 양

// 계속하려면 아무 키나...

// 90 ~ 100 : 수
// 80 ~ 89  : 우
// 70 ~ 79  : 미
// 60 ~ 69  : 양
// 나머지   : 가


import java.util.Scanner;
import java.io.IOException;

// 속성만 존재하는 클래스 → 자료형 활용
class Record
{
	String hak, name;		// 학번, 이름
	int kor, eng, mat;		// 국어, 영어, 수학 점수
	int tot, avg;			// 총점, 평균(편의상 정수 처리)
}

// 인터페이스
interface Sungjuk
{
	public void set();
	public void input();
	public void print();
}

// 문제 해결 과정에서 설계해야 할 클래스
class SungjukImpl extends Record implements Sungjuk
{
	int n, i, j;
	int[][] temp;
	char[][] rank;
	Record[] rc;

	//인원수
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			n = sc.nextInt();

		}
		while (n<1 || n>10);

		rc = new Record[n];
		temp = new int[n][3];
		rank = new char[n][3];
	}

	// 정보, 점수
	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		for (i=0; i<n; i++)
		{
			rc[i] = new Record();

			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", (i+1));
			rc[i].hak = sc.next();
			rc[i].name = sc.next();

			System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
			temp[i][0] = rc[i].kor = sc.nextInt();
			temp[i][1] = rc[i].eng = sc.nextInt();
			temp[i][2] = rc[i].mat = sc.nextInt();

			rc[i].tot = rc[i].kor + rc[i].eng + rc[i].mat;
			rc[i].avg = rc[i].tot/3;
		}
		System.out.println();
		
		// 수우미양가
		for (i=0; i<n; i++)
		{
			for (j=0; j<3; j++)
			{
				switch (temp[i][j]-temp[i][j]%10)
				{
				case 100: case 90: rank[i][j]='수'; break;
				case 80: rank[i][j]='우'; break;
				case 70: rank[i][j]='미'; break;
				case 60: rank[i][j]='양'; break;
				default: rank[i][j]='가'; break;
				
				}
			}
		}
	}

	@Override
	public void print()
	{
		for (i=0; i<n; i++)
		{
			System.out.printf("%s %s %3d %3d %3d\t %d %d\n", rc[i].hak, rc[i].name, rc[i].kor, rc[i].eng, rc[i].mat, rc[i].tot, rc[i].avg);

			System.out.printf("\t\t%c%3c%3c\n", rank[i][0], rank[i][1], rank[i][2]);
		}
	}
}
public class Test116
{
	public static void main(String[] args) throws IOException
	{
		// 
		// Sungjuk은 인터페이스
		Sungjuk ob;
		//SungjukImpl ob;

		// 문제 해결 과정에서 작성해야 할 ob 구성
		ob = new SungjukImpl();

		ob.set();
		ob.input();
		ob.print();
	}
}