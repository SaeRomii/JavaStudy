/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
=========================================*/

// Wrapper 클래스 조상은 Number
// Object - Number 순서

public class Test129
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);			//-- boxing
		Integer i2 = new Integer(i);	//-- boxing

		System.out.println(b2);			//--==>> 3
		System.out.println(i2);			//--==>> 256

		print(b2);
		print(i2);
	}

	// Object
	// Number
	// ※ java.lang.Number 클래스(추상 클래스)
	//	  모든 Wrapper 클래스들의 부모 클래스(슈퍼 클래스, 상위 클래스)이다.
	//	  b2, i2 자료형이 Number n에 넘어오면서
	//	  업 캐스팅이 일어나게 된다.	(Auto-Boxing 선행)

	/*
	static void print(Object n)		//조상값 Object 가져와서
	{
		System.out.println(n);
	}
	*/

	static void print(Number n)			// Number클래스로 담을 수 있음
	{	
		System.out.println(n);
		//System.out.println(Object obj)
		// Integer → Number → Object
		// System.out.println(n.toString());  toString은 Integer toString이라서 Number로 

	}
	// 캐스팅 유도해서 하나에 담기

	
	/* Number나 Object에 안담으면 밑에처럼 다 생성해줘야함
	static void print(Byte b)
	{
		System.out.println(b);
	}

	static void print(Integer i)
	{
		System.out.println(i);
	}
	*/

}