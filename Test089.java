/*===========================
  ■■■ 배열(array) ■■■
  - 배열의 배열(2차원 배열)
============================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5x5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
 1  2  3  4  5		→ a == 0
 5  1  2  3  4		→ a == 1
 4  5  1  2  3		→ a == 2
 3  4  5  1  2		→ a == 3
 2  3  4  5  1		→ a == 4
계속하려면 아무 키나...
*/

public class Test089
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];
		
		
		/* 내가 풀었던 방식
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=n;
				n++;
			}
			for (int k=i; k<arr[i].length; k++)
			{
				arr[i][k]=n;
				n++;
			}
			n=1;
			
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		*/

		// 초기화
		// 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5
		for (int a=0; a<arr.length; a++)			// a → 0 1 2 3 4
		{
			for (int b=a, n=1; n<=5; n++)			// b=a로 해놓으면 a가 1일때 b는 1부터 시작
													// n++로 한 이유는 5번째 방이 없기때문에 앞에서 n=1부터 5미만까지 하기로 했기때문에
													// 네번째 방까지만 들어가게
			{										// n → 1 2 3 4 5 / 1 2 3 4 5
				arr[a][b] = n;

				b++;
				if (b==5)							// b가 0이되면 0으로 초기화
				{
					b=0;
				}
			}
		}

		// 배열의 배열 요소 전체 출력

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}//end main()
}//end class

/* 실행 결과
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
계속하려면 아무 키나 누르십시오 . . .
*/