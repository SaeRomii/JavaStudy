/*================================
  ■■■ 배열(Array) ■■■
  - 배열의 복사
=================================*/

// ○ 실습 문제
// 임의의 배열(a, b)에 들어있는 숫자들의 합집합을 출력하는 프로그램을 구현한다.
// 단, 중복이 제거된 상태의 합집합을 출력할 수 있도록 한다.  중복 제거..합집합..?
// 또한, 배열 복사 개념을 적용시켜 처리할 수 있도록 한다.    복사해서 중복 제거하나본데..

// ex) 임의의 두 배열
// int[] a = {2, 3, 7, 10, 11}
// int[] b = {3, 6, 10, 14}

// 실행 예)
/*
// 첫 번째 배열 요소를 입력하세요(공백 구분) : 2 3 7 10 11	    첫 배열 0번째값이랑 둘 배열 0번째~3번째 배열 대조해서 
// 두 번째 배열 요소를 입력하세요(공백 구분) : 3 6 10 14		배열 비교해서 같으면 멈춰 다르면 실행..?
*/

// 2 3 7 10 11 6 14
// 계속하려면 아무 키나...

public class Test099
{
	public static void main(String[] args)
	{	
		// 임의의 두 배열
		int[] a = {2, 3, 7, 10, 11};
		int[] b = {3, 6, 10, 14};

		/*
		// 방법 ①
		// - 집합 a의 전체 요소 출력
		for (int i=0; i<a.length; i++)
		{
			System.out.printf("%3d", a[i]);
		}

		// - 집합 b의 요소 출력
		//	 단, 집합 b는 집합 a의 요소와 중복되는 데이터를
		//	 제거하면서 출력
		for (int i=0; i<b.length; i++)		// 4회전 → 3, 6, 10, 14 (선택적 출력)
		{
			boolean flag = false;			// 겹치지 않는다는 전제를 줌

			for (int j=0; j<a.length; j++)	// 5회전 → 2, 3, 7, 10, 11
			{		
				if (b[i] == a[j])			// a의 각 요소들이랑 비교
				{
					flag = true;			// 같은 값이 있을 경우 멈춘다 그래야지 b랑 a랑 비교하면서 멈춰서 뒤에 값 비교안함
					break;					// 멈춘다 (그리고 빠져나간다) → j관련 반복문 탈출
				}
			}
			
			if (flag)						// flag가 true 라면 (조건문에서 빠져나온 값들은 다 true라서 빠져나온거)
			{		
				continue;					// 뒷부분 무시하고 계속해라
			}
			System.out.printf("%3d", b[i]);	// ↑(뒷부분) 겹치면 출력 안한다는 의미
		}
		System.out.println();
		*/

		// 방법 ②
		// - 임시 배열을 만들고
		//int[] temp = new int[];
		int[] temp = new int[a.length + b.length]; // a랑 b 합쳐주기 그래야지 겹치는게 없더라고 합쳐서 출력됨

		// - 만들어진 임시 배열에 중복되지 않은 배열 요소를 채운 다음
		// check~!!!
		int n;							//-- 98번째 줄에서 temp 배열의 n번째에 담으라고 했어서 변수 선언을 여기서 해야함
		for (n=0; n<a.length; n++)
		{
			temp[n] = a[n];				// a의 n번째 값을 temp의 n번째 값에 담아라
		}

		// >>>> 요 시점에 72번째에 변수 선언을 해주면 n의 값이 몇인지 알 수 있음
		// 위에서 for문에서 a 요소 넣는데 방이 4개(요소 5개라서) 만들어짐 0 1 2 3 4 이렇게 근데 n++ 있어서 for문 빠져나오면 n값 5 만들어짐
		
		for (int k=0; k<b.length; k++)
		{
			boolean flag = false;

			for (int m=0; m<a.length; m++)
			{
				if (b[k]==a[m])
				{
					flag = true;
					break;
				}
			}

			if (flag)
			{
				continue;		//뒷부분 무시하고 계속해라
			}
			temp[n] = b[k];		//temp 배열의 n번째에 담아라 (continue에서 무시할 뒷부분)
			n++;											//continue에서 무시할 뒷부분
		}

		// - 그렇게 구성된 임시 배열을 출력(채워진만큼)
		for (int h=0; h<n; h++)		//n보다 작을때까지 돌아라 채워진 인덱스까지만 값이 돌게됨(temp.length로 하면 뒤에 0도 나옴)
		{
			System.out.printf("%3d", temp[h]);
		}
		System.out.println();

	
		/* 내가 풀던거
		for (int i=0; i<a.length; i++)
		{
			System.out.printf("%3d", a[i]);
		}

		for (int i=0; i<b.length; i++)		// 제거하는 방법으로
		{
			boolean result false;

			for (int j=0; j<a.length; j++)
			{
				if (b[i]==a[j])
				{
					result = true;
					break;
				}
			}
		}
		*/
	}
}

/* 실행 결과
  2  3  7 10 11  6 14
계속하려면 아무 키나 누르십시오 . . .
*/