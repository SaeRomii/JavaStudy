/*========================================
  ■■■ 클래스 고급 ■■■
  - 상속 관계에 있는 클래스들 간의 캐스팅
  - 업 캐스팅, 다운 캐스팅
========================================*/

// 상위 클래스, 부모 클래스
class SuperTest111
{
	public int a=10, b=20;

	public void write()
	{
		System.out.println("슈퍼클래스 write() 메소드...");
	}
	
	public int hap()
	{
		return a+b;
	}
}

// 하위 클래스, 자식 클래스
class SubTest111 extends SuperTest111
{
	public int b=100, c=200;

	@Override
	public int hap()
	{
		return a+b+c;
	}

	public void print()
	{
		System.out.println("서브클래스 print() 메소드...");
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test111
{
	public static void main(String[] args)
	{
		// 하위 클래스(sub class : SubTest111) 기반 인스턴스 생성
		SubTest111 ob1 = new SubTest111();
		System.out.println("ob1.b : " + ob1.b);
		//--==>> ob1.b : 100 자식 객체가 가지고 있는 b변수
		
		// ○ 업 캐스팅
		SuperTest111 ob2 = ob1;
		//-- SuperTest111 ob2 = (SuperTest111)ob1; 과 동일한 코드

		System.out.println("ob2.b : " + ob2.b);
		//--==>> ob2.b : 20
		// 상위 클래스랑 하위 클래스 서로 다른 메모리 영역
		// 변수는 객체별로 따로 할당되므로
		// 변수 b는 ob2의 변수이다.
		// 상위 클래스 먼저 출력하고 하위 클래스 나오는거라서 상위 클래스 값 나옴

		ob2.write();
		//--==>> 슈퍼클래스 write() 메소드...

		// ob2.print();
		// 상위 클래스에서 print 메소드가 없어서 에러남
		//--==>> 에러 발생(컴파일 에러) → 다운 캐스팅 필요

		// ○ 다운 캐스팅
		((SubTest111)ob2).print();
		// ob2가 SuperTest111이니까 SuperTest111을 SubTest111로 다운캐스팅해서 SubTest111 print 출력
		//--==>> 서브클래스 print() 메소드...

		// ※ 추가적인 관찰 -------------------------------------------------------------------------

		SuperTest111 ob3 = new SuperTest111();
		SubTest111 ob4;					//여기서도 인스턴스 생성 해줘도 상위 클래스랑 하위 클래스를 따로따로 봐야함

		//System.out.println("ob3.c : " + ob3.c);
		// 에러 발생(컴파일 에러) 상위 클래스에서는 c변수가 없음
		//-- 상위 개체는 하위 객체의 멤버에 접근하는 것이 불가능하다.

		//ob4 = ob3;
		//--==>> 에러 발생(컴파일 에러)
		//-- 상위 객체는 하위 객체에 담을 수(참조할 수) 없다.

		//ob4 = ((SubTest111)ob3);
		// 하위 클래스는 상위 클래스를 메모리 올려주는데
		// 상위 클래스는 하위 클래스를 메모리에 안올려줘서 하위 클래스를 못찾기 때문에 런타임 에러남
		//--==>> 에러 발생(런타임 에러)
		// -- 작성된 구문의 문법적인 구조만 봤을 때
		//	  다운 캐스팅이 이루어지는 상황이다.
		//	  하지만, 정상적인 캐스팅이 이루어지지 않는다.
		//	  현재, SubTest111 객체에 대해 메모리 할당이 이루어지지 않은 상태이기 때문에
		//	  다운 캐스팅은 불가능한 것이다.

		//System.out.println("ob4.c : " + ob4.c);
		//--==>> 에러 발생(컴파일 에러)

	}
}

/*
○ 업 캐스팅, 다운 캐스팅이 정상적으로 이루어지는 경우 -----------------------------------------

   1. 하위 객체 생성:				//-- ☆
   2. 상위 = 하위;					//-- 업 캐스팅. 정상.
   3. 하위 = 상위;					//-- 에러 발생.
   4. 하위 = (하위)상위;			//-- 다운 캐스팅. 정상.


○ 다운 캐스팅이 정상적으로 이루어지지 않는 경우 -----------------------------------------------

   1. 상위 객체 생성;				//-- ★
   2. 하위 = 상위;					//-- 에러 발생.
   3. 하위 = (하위)상위;			//-- 문법적으로는 다운 캐스팅이지만 런타임 에러 발생.

※ 업 캐스팅은 항상 가능, 다운 캐스팅은 경우(상황)에 따라 가능.

포유류

사람 길동 = new 사람();

포유류 객체1 = 길동;		// 업 캐스팅

사람 길동 = (사람)객체1;	// 다운 캐스팅

-------------------------------------------------

포유류 객체2 = new 포유류();

사람 길동 = 객체2;			// 상위 객체를 하위 객체에 담겠다 안됨!!
사람 길동 = (사람)객체2;	// 문법적으로는 다운 캐스팅. 런타임 에러

*/