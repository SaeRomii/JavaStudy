/*===========================
  ■■■ 배열(array) ■■■
  - 배열의 기본적인 활용
============================*/

// ○ 과제
// 사용자로부터 학생 수를 입력받고, 그 만큼의 점수(정수형태)를 입력받아
// 전체 학생 점수의 합, 평균, 편차를 구하여 결과를 출력하는 프로그램을 구현한다.
// 단, 배열을 활용하여 처리할 수 있도록 한다.

// 실행 예)
// 학생 수 입력 : 5
// 1번 학생의 점수 입력 : 90
// 2번 학생의 점수 입력 : 82
// 3번 학생의 점수 입력 : 64
// 4번 학생의 점수 입력 : 36
// 5번 학생의 점수 입력 : 98

// >> 합 : 370
// >> 평균 : 74.0
// >> 편차
// 90 : -16.0
// 82 : -8.0
// 64 : 10.0
// 36 : 38.0
// 98 : 24.0
// 계속하려면 아무 키나...

import java.util.Scanner;

public class Test085
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int sum=0;
		double avg;

		System.out.print("학생 수 입력 : ");
		n = sc.nextInt();

		int[] arr = new int[n];

		for (int i=0; i<n; i++)
		{
			System.out.print((i+1) + "번 학생의 점수 입력 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		avg = sum/(double)n;

		System.out.printf("\n>> 합 : %3d\n", sum);
		System.out.printf(">> 평균 : %.2f\n", avg);
		System.out.print(">> 편차 \n");

		for (int i=0; i<n; i++)
		{
			// 표준편차는 → 점수 : 평균-점수
			System.out.printf("%d : %.1f\n", arr[i], avg-arr[i]);
		}
	}
}

/* 실행 결과
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98

>> 합 : 370
>> 평균 : 74.00
>> 편차
90 : -16.0
82 : -8.0
64 : 10.0
36 : 38.0
98 : -24.0
계속하려면 아무 키나 누르십시오 . . .
*/