/*========================================
  ■■■ 클래스 고급 ■■■
  - 인터페이스(Interface) 
========================================*/

/*
○ 인터페이스(Interface)란
   완전히 미완성된 채로 남겨져
   인터페이스 안에 존재하는 그 어떤 메소드도
   몸체(정의부)가 없기 때문에 실행 부분이 존재하지 않는다.
   클래스를 위한 템플릿으로써의 기능을 수행하는
   추상 클래스의 한 종류이다.

○ 인터페이스는 클래스와 달리 다중 상속이 가능하며
   인터페이스 자체도 상속된다.
   기존의 C++ 언어 등에서 지원되는 다중 상속이
   사용 과정에서 많은 문제점들을 노출시켰기 때문에
   자바에서는 다중 상속의 개념을 인터페이스라는 개념으로 변형하여
   인터페이스를 통해 다중 상속을 구현하는 방법을 지원한다.

○ 인터페이스는 상수와 추상 메소드만 가질 수 있으며
   인터페이스 안의 메소드들은 접근제어지시자를 명시하지 않아도
   『public』으로 설정되어 클래스에서 구현(implements)함으로써
   바로 접근이 이루어질 수 있다.

○ 특징
   - 추상 클래스의 일종으로 선언만 있고 정의가 없다.
     인터페이스 안에는 모두 추상 메소드여야 한다.
   - final 변수는 가질 수 있다. (상수의 개념)
   - 인터페이스는 『public static final』 상수만 만들 수 있다.
   - 인터페이스를 구현하기 위해서는 『extends』대신에 『implements』를 이용한다.
   - 하나 이상의 인터페이스를 implements 할 수 있다.
   - 인터페이스를 implements 한 클래스는
     인터페이스의 모든 메소드를 Overriding 해야 한다.
	 → 그렇게 해야 해당 클래스를 기반으로 인스턴스 생성이 가능하다.
   - 인터페이스가 다른 인터페이스를 상속받을 수 있으며
     이 때, 『extends』 키워드를 사용한다.
	 또한, 클래스와 달리 인터페이스는 다중 상속이 가능하다.
*/

// 인터페이스
interface Demo
{
	public static final double PI=3.141592;

	// 인터페이스의 멤버 변수는 『static final』을 별도로 명시하여 붙이지 않아도
	// 자동으로 『static final』인 상태
	// ↓ public static final int a=10;
	public int a=10;			// a가 10이라는 상수만 담아져있음 final로 자동으로 상수화 됐음 근데 눈에 final안보임

	/* 정의부분이라 안됨! 인터페이스 안에서는 선언만
	public void print()
	{
		System.out.println("인터페이스 print() 메소드...");
	}
	*/

	public void print();		//이건 가능한~! 선언만
	//원래 추상메소드라서 abstract 붙여야하는데 인터페이스 안에서는 안붙여도됨
	// public abstract void print();
}

// 클래스
//class DemoImpl
//		↓
// Demo 인터페이스를 구현하는 추상 클래스
//abstract class DemoImpl implements Demo
//		↓
// Demo 인터페이스를 구현하는 클래스 77번째줄 오버라이딩
class DemoImpl implements Demo
{
	public void write()
	{
		System.out.println("클래스에 정의된 메소드...");
	}

	@Override
	public void print()
	{
		System.out.println("인터페이스 메소드 재정의...");
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test112
{
	public static void main(String[] args)
	{
		// Demo ob = new Demo();			// 인터페이스 기반으로 인스턴스 생성 불가능
 
		// DemoImpl obTemp = new DemoImpl();
		//-- Demo 인터페이스의 모든 메소드를 재정의한 DemoImpl 클래스는
		//	 더이상 추상 클래스가 아니기 때문에
		//	 인스턴스 생성 가능

		// Demo ob = (Demo)obTemp;   하위 객체를 상위 객체로 형변환 후 담는거라서 업캐스팅 가능
		// Demo ob = obTemp;
		
		// 인터페이스 객체는 상위 객체
		Demo ob = new DemoImpl();   // 업 캐스팅 가능한
		ob.print();					// 오버라이딩 했던 print 실행 (덮어쓰기 한거라)
		//--==>> 인터페이스 메소드 재정의...
		// DemoImpl이 인스턴스 생성됐다는건 추상이 모두 해결됐다는거라서 Demo 인터페이스도 메모리에 올려짐
		
		//ob.write();
		// 상위 객체에는 write가 없어서 오류남(컴파일 에러)

		((DemoImpl)ob).write();			//-- 다운 캐스팅
		//--==>> 클래스에 정의된 메소드

		System.out.println(Demo.PI);		// 클래스명.멤버변수 → static 클래스변수라서 인스턴스랑 상관없이 실행됨
		//--==>> 3.141592

		System.out.println(Demo.a);			// static이라서 가능(보이지 않지만 static임)
		//--==>> 10

		// Demo.a = 30;						// a가 final로 상수화 되어있어서 안됨 에러남(컴파일 에러)

	}
}

/* 실행 결과
인터페이스 메소드 재정의...
클래스에 정의된 메소드...
3.141592
10
계속하려면 아무 키나 누르십시오 . . .
*/