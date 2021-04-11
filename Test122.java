/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Object 클래스
=========================================*/

// ※ Test121.java와 비교

// import java.lang.*;

public class Test122 // extends Object
{
	/*
	Object 멤버들 상속
	*/
	
	// Object 클래스로부터 물려받은 toString() 메소드 재정의
	@Override
	public String toString()
	{
		// return 클래스명@해시코드;
		//		  ------------------ String

		return "재정의한 toString()...";

	}

	public static void main(String[] args)
	{
		Test122 ob = new Test122();

		System.out.println("ob.toString : " + ob.toString());
		//--==>> ob.toString : Test122@15db9742

		System.out.println("ob          : " + ob);
		//--==>> ob          : Test122@15db9742
		
		// 메소드 재정의 후...(17~25번째줄 쓰기전에는 클래스명@해시코드 나왔는데 재정의 후 밑에처럼 나옴)
		//--==>> ob.toString : 재정의한 toString()...
		//		 ob          : 재정의한 toString()...
	}
}