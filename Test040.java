/*===========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - switch문 실습
===========================================*/

/*
○ 다중 선택문이라 하며, switch 문 다음의 수식 값에 따라
   실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.

○ 형식 및 구조
   switch(수식)
   {
		case 상수1 : 문장1 : [break;]
		case 상수2 : 문장2 : [break;]

		[default : 문장n+1:] [break;]    생략 가능한 부분[]로 표기
   }

   switch 문의 『수식』과 case의 『상수』는
   byte, short, int, long 형이여야 한다.

   case 문 뒤에 『break;』 구문이 없는 형태인 경우
   다음 case 문의 문장을 계속해서 수행하게 된다. (기본 모델)
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test040
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 입력 : ");
		String name = br.readLine();

		System.out.print("국어 점수 : ");
		int kor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 : ");
		int eng = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 : ");
		int mat = Integer.parseInt(br.readLine());

		int tot = kor + eng + mat;

		int avg = tot / 3;

		char grade;

		/*
		if (avg>=90)
		{
		}
		else if (avg>=80)
		{
		}
		*/


		/*
		switch (avg)
		{
			
			case 100: ...;break;
			case 99: ...;break;
			case 98: ...;break;
			  |
			case 0: ...;break;
			*/

			/*
			case 100: case 99: case 98: ... grade = 'A'; break;
			case 89: case 88: case 87: ... grade = 'B'; break;
			   |
			case 0: ...; break

		}
		*/

		switch (avg/10)
		{
		case 10: case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default : grade = 'F'; break;
		
		}
		
		System.out.println("grade : " + grade);  //위에서 grade 아무것도 담아두지 않은 상태에서는 default문 있어야함
												 //위에서 char grade = "" 담아두면 default문 없어도됨

	}
}