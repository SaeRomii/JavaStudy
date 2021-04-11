/*===========================
  ■■■ 배열(array) ■■■
  - 배열의 선언과 초기화
  - 배열의 기본적인 활용
============================*/

// ○ 실습 문제
// 임의의 정수들이 들어있는 배열의 숫자 데이터들 중
// 짝수의 요소만 골라서 출력하고
// 3의 배수인 요소만 골라서 출력하는 프로그램을 구현한다.

// ※ 배열을 구성하는 임의의 정수
//	  → 4 7 9 1 3 2 5 6 8

// 실행 예)
// 배열 요소 전체 출력
// 4 7 9 1 3 2 5 6 8
// 짝수 선택적 출력
// 4 2 6 8
// 3의 배수 선택적 출력
// 9 3 6
// 계속하려면 아무 키나...


public class Test081
{
	public static void main(String[] args)
	{
		/* 방법 1
		int[] arr = new int[9];
		arr[0] = 4;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 1;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
		arr[7] = 6;
		arr[8] = 8;
		*/
		
		// 방법 2
		int[] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8};

		//System.out.println(arr);  → 안됨

		/*
		System.out.println("배열 요소 전체 출력");

		for (int i=0; i<9; i++)					// 배열 방 번호가 0부터라서 초기값이 0으로 시작하는 경우 많음
												// 요소의 갯수가 9개면 방은 8개 그래서 i<9로 9번방 없으니까 
												// 9 안들어오게~!!! 
		
			System.out.print(arr[i] + " ");
		
		System.out.println();
		//--==>> 배열 요소 전체 출력
		//		 4 7 9 1 3 2 5 6 8

		// ※ 배열 arr 의 길이(방의 갯수) 확인 해주는 속성값
		//	  『arr.length』
		*/

		System.out.println("배열 arr의 길이 : " + arr.length);
		//--==>> 배열 arr의 길이 : 9

		System.out.println("배열 요소 전체 출력");

		for (int i=0; i<arr.length; i++)				 
		
			System.out.print(arr[i] + " ");
		
		System.out.println();
		//--==>> 배열 요소 전체 출력
		//		 4 7 9 1 3 2 5 6 8

		System.out.println("짝수 선택적 출력");
		
		for (int i=0; i<arr.length; i++)			// for (int i=0; i<9; i++)으로 해도되는데 수가 많으면 다 못세서
													// 길이 확인해주는 arr.length로 쓰면됨!!
		{
			if (arr[i]%2==0)						// 그냥 i로 나누면 방번호짝수니까 arr[i]로 해야함!!
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();

		System.out.println("3의 배수 선택적 출력");

		for (int i=0; i<arr.length; i++)			// for (int i=0; i<9; i++)으로 해도되는데 수가 많으면 다 못세서
													// 길이 확인해주는 arr.length로 쓰면됨!!
		{
			if (arr[i]%3==0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();


	}
}

/* 실행 결과
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8
짝수 선택적 출력
4 2 6 8
3의 배수 선택적 출력
9 3 6
계속하려면 아무 키나 누르십시오 . . .
*/