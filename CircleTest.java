//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CircleTest
{

	// 주식 걸려있는건 내가 푼 방식

	int r;								//-- 반지름
	//double pi = 3.141592;
	final double PI = 3.141592;			//-- 원주율
	//-- 『final』 : 변수의 상수화

	void input() throws IOException		// 문제가 ↓여기서 발생하면 밖으로 던진다라는 뜻으로 throws IOException이 이쪽에
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		//r = sc.nextInt();
		r = Integer.parseInt(br.readLine());

	}

	double calLength()		// 넓이 () 	← 이거 빼먹지 말기!!!
	{
		double result;
		result = r * r * PI;
		return result;
	}

	double calArea()				// 둘레
	{
		double result;
		result = r * 2 * PI;
		return result;
	}

	void print(double a, double l)			// 결과 출력
	{

		System.out.printf("반지름이 %d인 원의 \n", r);
		//System.out.println("반지름이 " + r + "인 원의");
		System.out.printf("원의 넓이 : %.2f\n", a);
		System.out.printf("원의 둘레 : %.2f\n", l);
	}
}