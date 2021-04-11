/*===========================
  ■■■ 배열(array) ■■■
  - 배열의 기본적인 활용
============================*/

// ○ 과제
// 사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
// 입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 구현한다.
// 단, 배열을 활용하여 처리할 수 있도록 한다.

// 실행 예)
// 입력할 데이터의 갯수  : 10
// 데이터 입력(공백구분) : 47 92 73 11 2 61 23 62 88 15 // → 배열 구성
// >> 가장 큰 수 → 92
// 계속하려면 아무 키나...

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=0;
		
		do
		{
			System.out.print("입력할 데이터의 갯수 : ");
			n = sc.nextInt();
		}
		while (n<0 || n>10);

		int[] arr = new int[n];

		System.out.print("데이터 입력(공백구분) ");

		for (int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int max;
		max=arr[0];

		for (int i=1; i<arr.length; i++)
		{
			if (max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.printf(">> 가장 큰 수 → %d\n", max);


		
	}
}

/* 실행 결과
입력할 데이터의 갯수 : 10
데이터 입력(공백구분) 47 92 73 11 2 61 23 62 88 15
>> 가장 큰 수 → 92
계속하려면 아무 키나 누르십시오 . . .
*/