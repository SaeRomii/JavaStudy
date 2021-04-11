/*========================================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스
========================================*/

// 외부 클래스
class Test
{
	static int a=10;		// Test 클래스의 멤버변수(전역변수) static변수(클래스변수)
	int b=20;				// Test 클래스의 멤버변수(전역변수) instance변수(인스턴스변수)

	// ▶ 첫 번째 write() 메소드
	void write()			//인스턴스 메소드
	{
		System.out.println("wrtie()...①");

		final int c=30;		// 지역변수 상수화된 변수(값이 변하지 않는 변수)
		int d=40;			// 지역변수 값이 수시로 변할 수 있는 변수

		// 내부 클래스
		// 메소드 안에 존재하는 또다른 클래스(local class)
		class LocalTest		//메모리를 할당받기 위해서 인스턴스 생성 필요
		{
			// ▶ 두 번째 write() 메소드
			void write()
			{
				System.out.println("write()...②");

				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);	//17번째줄에서 final이 없으면 값이 수시로 변할 수 있기 때문에 오류날 수 있음
				//System.out.println("d : " + d); 값을 할당받으려면 인스턴스 생성이 필요한데 인스턴스 생성이 언제 될지 모르니까
				//								  d는 값을 확정받을 수 없음. 에러!
			}
		}

		//c=20; 은 안됨 17번째 줄에서 c가 상수화된 변수라서
		d=30;		//이건 가능

		// 첫 번째 write() 메소드에서 생성한 지역 클래스의 인스턴스
		LocalTest ob1 = new LocalTest();

		// 두 번째 write() 메소드 호출
		ob1.write();
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test118
{
	public static void main(String[] args)
	{
		// 외부 클래스에 대한 인스턴스 생성
		Test ob2 = new Test();

		// 첫 번째 write() 메소드 호출
		ob2.write();
	}
}

/* 실행 결과
wrtie()...①
write()...②
a : 10
b : 20
c : 30
계속하려면 아무 키나 누르십시오 . . .
*/