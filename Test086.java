/*===========================
  ■■■ 배열(array) ■■■
  - 배열의 배열(2차원 배열)
============================*/


public class Test086
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언과 초기화
		// 방법 ①
		//int[] arr1 = new int[3];  그냥 배열
		int[][] arr1 = new int[3][3];		//3개 배열안에 각각의 배열 있는거

		//arr1[0] = 1;	 그냥 배열
		//배열의 배열
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		arr1[2][0] = 7;
		arr1[2][1] = 8;
		arr1[2][2] = 9;

		// 방법 ②
		//int[] arr2 = {1, 2, 3};  그냥 배열
		// 배열의 배열
		int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		// 방법 ③
		int[][] arr3 = new int[3][3];
		int n=1;
		for (int i=0; i<arr3.length; i++)		//arr3.length == 3		큰 방 3개
		{
			for (int j=0; j<arr3[i].length; j++)	//큰 방 안에 있는 방 갯수	  arr3[0].length == 3
			{																//arr3[1].length == 3
				arr3[i][j] = n;												//arr3[2].length == 3
				n++;
			}														  
		}
		
		for (int i=0; i<arr3.length; i++)
		{
			for (int j=0; j<arr3[i].length; j++)
			{
				System.out.printf("%2d", arr3[i][j]);
			}
			System.out.println();
		}
	}
}

/* 실행 결과
 1 2 3
 4 5 6
 7 8 9
계속하려면 아무 키나 누르십시오 . . .
*/