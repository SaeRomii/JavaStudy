/*============================================
  ■■■ 메소드 재귀호출(재귀 메소드) ■■■
============================================*/

public class Test067
{
	public static void main(String[] args)
	{
		showHi(5);
	}

	public static void showHi(int cnt)	// 4
	{
		
		System.out.println("Hi~~!!!");
		if(cnt==1)						
			return;
		showHi(--cnt);					// showHi(3);  뒤에있던 감소연산자 앞으로 --
										// 조건부문보다 showHi를 밑으로 내려야 조건문 실행
		
	}

}

/* 실행 결과
Hi~~!!!
Hi~~!!!
Hi~~!!!
Hi~~!!!
Hi~~!!!
계속하려면 아무 키나 누르십시오 . . .
*/