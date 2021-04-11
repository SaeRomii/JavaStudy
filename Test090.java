/*===========================
  ■■■ 배열(array) ■■■
  - 배열과 난수 처리
============================*/

// 사용자로부터 임의의 정수를 입력받아
// 그 정수의 갯수만큼 난수(1~100)를 발생시켜서 배열에 담고
// 배열에 담겨있는 데이터들 중
// 가장 큰 값과 가장 작은 값을 선택하여 출력하는 프로그램을 구현한다.

// 실행 예)
// 발생시킬 난수의 갯수 입력 : 3
// (52 21 17 → 무작위로 발생한 정수들... → 배열에 담아내기(배열 구성))
// 가장 큰 값 : 52, 가장 작은 값 : 17
// 계속하려면 아무 키나...


import java.util.Scanner;
import java.util.Random;

public class Test090
{
	public static void main(String[] args) 
	{
		// Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 안내 메세지 출력
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		int size = sc.nextInt();

		// size 변수에 담아낸 수 만큼의 배열방 만들기
		// (배열 선언 및 메모리 할당)
		int[] arr = new int[size];

		// 무작위 숫자(난수)를 발생시키기 위해서는
		// 난수 발생 전용 객체가 필요하다.
		// → 『java.util.Random』
		Random rd = new Random();		// 객체 이름 rd

		// 테스트
		//System.out.println("발생한 난수 : " + rd.nextInt(100));		//Random도 nextInt메소드가 있음 
		// ㄴ0부터 99까지 난수 발생										//rd.nextInt()안에 숫자 넣으면 0부터 해당숫자-1까지 난수 발생
		// ※ 『Random』 클래스의 『nextInt()』 메소드
		//	  0 ~ 매개변수로 넘겨받은 정수-1까지의 수 중
		//	  무작위 정수(난수) 1개를 발생시킨다.

		for (int i=0; i<size; i++)			// for (int i=0; i<arr.length; i++) 와 같음 
		{
			arr[i] = rd.nextInt(100)+1;		// nextInt(100)은 0~99까지니까 +1하면 1~100까지 나올 수 있게됨!!
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();

		/*

		int max=arr[0];
		int min=arr[0];

		
		for (int i=1; i<size; i++)
		{
			if (max<arr[i])
			{
				max=arr[i];
			}
			if (min>arr[i])
			{
				min=arr[i];
			}
		}
			System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n", max, min);
		*/

		int max, min;				// 최대값, 최소값
		max=min=arr[0];				// 배열 0번째 값을 min이랑 max에 담겠다

		for (int i=1; i<arr.length; i++)		// i=0이 아닌 이유는 첫번째 값이랑 첫번째 값 비교하면 같기 때문에 그 다음값이랑 비교하게
		{
			// max와 i번째 요소의 크기 비교 → i가 더 큰 상황 → max에 i를 대입
			if (max<arr[i])
				max = arr[i];
				
			// min과 i번째 요소의 크기 비교 → min이 더 큰 상황 → min에 i를 대입
			if (min>arr[i])
				min = arr[i];
		}
			
		// 결과 출력
		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n", max, min);

	}
}

/* 실행 결과
발생시킬 난수의 갯수 입력 : 10
  29  10  60 100  62  26  94  40  85  72
가장 큰 값 : 100, 가장 작은 값 : 10
계속하려면 아무 키나 누르십시오 . . .
*/