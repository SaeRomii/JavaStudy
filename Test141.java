/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Random 클래스
=========================================*/

/*
○ java.util.Random 클래스는
   
   여러 형태의 난수를 발생시켜 제공하는 클래스이다.
   Math 클래스의 정적 메소드인 random() 메소드도 난수를 제공하는 메소드이지만
   0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
   필요한 여러 형태의 난수를 만들어내기 위해서는 추가적인 연산들을 수행해야 한다.
   그래서 자바는 여러 형태의 난수를 발생시켜주는
   전용 클래스인 Random 클래스를 별도로 제공하고 있다.
*/

// 로또 번호 생성기 (난수 발생 프로그램) 실습 문제

// 프로그램이 실행되면 기본적으로 로또를 5게임 수행하는 프로그램을 구현한다.

// 실행 예)
// 1 3 4 17 23 44
// 1 2 8 16 28 42
//       :
// 계속하려면 아무 키나...
// 1~45까지, 중복값 없이, 작은수에서 큰수로 출력

import java.util.Random;
import java.util.Arrays;		//찾아보기

class Lotto
{
	/* 내가 풀었던 방식
	int num[] = new int[6];
	Random random = new Random();

	void input()
	{
		for (int j=0; j<6; j++)		//비교	0 1 2 3 4 5 
		{
			num[j] = random.nextInt(45)+1;
		
			for (int k=0; k<j; k++)
			{
				if (num[j]==num[k])
				{
					j--;			//0 1 2 인덱스가 있어서 2가 중복이 나오면 다시 위로 올라가서 반복 돌아야하니까
				}
			}
		}

		for (int a=0; a<num.length-1; a++)		//선택정렬
		{
			for (int b=a+1; b<num.length; b++)
			{
				if (num[a]>num[b])
				{
					num[a]=num[a]^num[b];
					num[b]=num[b]^num[a];
					num[a]=num[a]^num[b];
				}
			}
		}
		
	}
	

	void print()
	{
		for (int n : num)
		{
		System.out.printf("%4d", n);
		}
		System.out.println();
	}
	*/
	
	// 선생님이 풀어주신 방법
	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6개
	private int[] num = new int[6];

	// getter
	public int[] getNum()
	{
		return num;
	}

	// 6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		int cnt = 0;
		Random rd = new Random();
		int n;
		
		jump :
		while (cnt<6)							// cnt → 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;				//rd.nextInt(45) 0~44까지 무작위 수 하나 나오는거 그래서 +1해줌
			
			for (int i=0; i<cnt; i++)
			{
				// 확인(테스트)
				//System.out.println("i : " + i + ", cnt : " + cnt);
				if (num[i]==n)			//난수 다시 발생
				{
					continue jump;				// continue 레이블
				}
			}
			num[cnt++] = n;						// num[0] 27 num[1] 3 num[2] 14 ..... num[5] 30 중복되지 않으면 담아라
		}

		// 정렬 메소드 호출
		sorting();

	}//end start()
	
	// 정렬 메소드 정의
	private void sorting()	// 정렬 메소드
	{
		Arrays.sort(num);
	}


}

public class Test141
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();
		
		for (int i=1; i<=5; i++)
		{
			// 확인(테스트)
			lotto.start();

			// 결과 출력
			for (int n : lotto.getNum())
			{
				System.out.printf("%4d", n);
			}
			System.out.println();
		}
		
		
		/*
		for (int i=1; i<=5; i++)
		{
			//lotto.input();
			//lotto.print();
		}
		*/
	}
}

/* 실행 결과
  11  21  26  30  34  45
   6   9  15  24  25  32
   1   4   5  11  22  36
   5   6  25  29  30  31
   7  12  20  28  34  45
계속하려면 아무 키나 누르십시오 . . .
*/

/* 실행 결과
   3   9  19  22  25  45
  10  11  18  19  36  43
   3  16  18  26  35  39
   1   8  22  27  31  38
   8   9  10  15  25  37
계속하려면 아무 키나 누르십시오 . . .
*/