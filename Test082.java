/*===========================
  ■■■ 배열(array) ■■■
  - 배열의 선언과 초기화
  - 배열의 기본적인 활용
============================*/

// ○ 실습 문제
// 『char』자료형의 배열을 만들어 알파벳 대문자를 채우고
// 채워진 배열의 전체 요소를 출력하는 프로그램을 구현한다.

// 실행 예)
// A B C D E F G ... W X Y Z
// 계속하려면 아무 키나...

public class Test082
{
	public static void main(String[] args)
	{
		char[] arr = new char[26];
		for (int i=0, ch=65; i<arr.length; i++, ch++)		//26회전
		{
			arr[i] = (char)ch;
			// arr[0] = (char)65;
			// arr[1] = (char)66;
			//	  :
			// arr[25] = (char)90;
		}

		// 배열 요소 전체 출력
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
}

/* 실행 결과
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
계속하려면 아무 키나 누르십시오 . . .
*/