/*============================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - continue
============================================*/

// 실행 예)
/*
1 : 1
3 : 4
5 : 9
7 : 16
    :
	:
99 : 2500
결과 : 2500
*/

public class Test065
{
	public static void main(String[] args)
	{
		int a=0, b=0;

		while (a<100)
		{
			a++;
			if (a%2==0)							//a가 짝수면 뒷부분 무시하고 계속하고 홀수를 b에 담아버려
			{
				continue;
			}
			b+=a;								//뒷부분
			System.out.println(a + " : " + b);	//뒷부분
		}
		System.out.println("결과 : " + b); 

	}
}