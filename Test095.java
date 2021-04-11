/*==================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스와 인스턴스 활용
===================================*/

// ○ 실습 문제
// 1 ~ 3 사이의 정수 형태의 난수를 발생시켜
// 가위, 바위, 보 게임 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 배열을 활용하여 처리할 수 있도록 한다.    방 번호 0 1 2 니까 +1씩 해줘야할듯

// 기준 데이터 → 1:가위, 2:바위, 3:보

// 실행 예)
// 1:가위, 2:바위, 3:보 중 입력(1~3) : 4
// 1:가위, 2:바위, 3:보 중 입력(1~3) : -10
// 1:가위, 2:바위, 3:보 중 입력(1~3) : 2
// - 유저   :바위
// - 컴퓨터 :보										//random 활용
// >> 승부최종결과 : 컴퓨터가 이겼습니다~!!!		//비교해야할듯
// 계속하려면 아무 키나...

import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	int user;
	int com;
	/*
	String[] game = {"가위", "바위", "보"};
		
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		Random rd = new Random();
		com = rd.nextInt(3)+1; // 컴퓨터 랜덤으로 배열 방 번호는 0 1 2 인데 가위 바위 보를 1~3으로 정해서 +1해줘야함

		do
		{
			System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
				
	}

	void print()
	{
		System.out.printf("-유저 : %s\n", game[user-1]);		//값이 1 2 3으로 나오는데 배열은 0 1 2 번 방이니까 -1
		System.out.printf("-컴퓨터 : %s\n", game[com-1]);
		

		if ((user==1 && com==2) || (user==2 && com==3)  || (user==3 && com==1))	//유저가 1일때 컴퓨터가 2이면 승리, 유저가 2일때 컴퓨터가 3이면 승리, 유저가 3일때 컴퓨터가 1이면 승리
		{
			System.out.print(">> 승부최종결과 : 컴퓨터가 이겼습니다~!!!\n");	
		}
		if ((user==2 && com==1) || (user==3 && com==2) || (user==1 && com==3))
		{
			System.out.print(">> 승부최종결과 : 유저가 이겼습니다~!!!\n");
		}
	}
}
*/
	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3) + 1;			//컴퓨터가 하는거니까 com에 담기 3+1은 배열의 방은 0부터 시작이라서
	}

	public void input()
	{
		runCom();				//컴퓨터가 먼저 내게하고 유저값 받기

		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);

	}

	public void middleCalc()
	{
		String[] str = {"가위", "바위", "보"};

		System.out.println("- 유저 : " + str[user-1]);
		System.out.println("- 컴퓨터 : " + str[com-1]);
	}

	public String resultCalc()
	{
		String result = "무승부";

		if ((user==1 && com==3) || (user==2 && com==1) || (user==3 && com==2))
		{
			result = "당신이 승리했습니다~!!!";
		}
		if ((user==1 && com==2) || (user==2 && com==3) || (user==3 && com==1))
		{
			result = "컴퓨터가 승리했습니다~!!!";
		}
		return result;
	}

	public void print(String result)
	{
		System.out.println(">> 승부최종결과 : " + result);
	}
}

public class Test095
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);
	}
}

/* 실행 결과
1:가위, 2:바위, 3:보 중 입력(1~3) : 2
- 유저 : 바위
- 컴퓨터 : 가위
>> 승부최종결과 : 당신이 승리했습니다~!!!
계속하려면 아무 키나 누르십시오 . . .
*/