/*========================================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스
========================================*/

// 외부 클래스(outer)
class InnerOuterTest
{
	static int a=10;
	int b=20;

	// 내부 클래스(inner)
	class InnerNested		//인스턴스 생성되지 않으면 메모리 올라가지 않음
	{
		int c=30;
			
		// ▶ inner의 write() 메소드
		void write()		//10번째줄, 15번째줄이랑 탄생시점 같음
		{
			System.out.println("inner의 write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}	

	// ▶ outer의 write() 메소드
	void write()
	{
		System.out.println("outer의 write()...");

		// 내부 클래스(inner)의 인스턴스 생성
		InnerNested ob1 = new InnerNested();

		// inner의 write() 메소드 호출
		ob1.write();
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스

public class Test119
{
	public static void main(String[] args)
	{
		// 외부 클래스(outer)의 인스턴스 생성
		InnerOuterTest ob2 = new InnerOuterTest();

		// outer의 write() 메소드 호출
		ob2.write();
		//--==>> outer의 write()...
		//		 inner의 write()...
		//		 a : 10
		//		 b : 20
		//		 c : 30

		//InnerNested ob3 = new InnerNested();
		//--==>> 에러 발생(컴파일 에러)

		//InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//--==>> 에러 발생(컴파일 에러)
		// ※ 중첩 내부 클래스(static 내부 클래스)와는 달리
		//	  외부 클래스의 인스턴스(객체)를 사용하지 않고
		//	  단독으로 내부 클래스의 인스턴스를 생성하는 것은
		//	  불가능하다.

		// ※ Test117.java 비교할 것
		// → static 붙어있는건 메모리를 먼저 할당받아서 올라가기 때문에 가능하지만 여긴 static없어서
		//	  인스턴스 꼭 생성해줘야함

		InnerOuterTest.InnerNested ob5 =  ob2.new InnerNested();
		ob5.write();
		//--==>> inner의 write()...
		//		 a : 10
		//		 b : 20
		//		 c : 30

		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
		//--==>> inner의 write()...
		//		 a : 10
		//		 b : 20
		//		 c : 30

	}
}