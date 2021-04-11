/*=================================
  ■■■ 클래스와 인스턴스 ■■■
  - 생성자(Constructor)
=================================*/

class NumberTest2
{
	int num;
	
	/* 눈에 보이지 않지만 여기에 작성되어 있는거
		사용자 정의 생성자가 존재하지 않을 때 실행됨
		값 반환 안되지만 매개변수 넘겨받을 수 있음
	NumberTest2()
	{
		텅 비어있는 상태
	}
	*/
	
	// 사용자 정의 생성자 → 인자를 전달받는 생성자
	NumberTest2(int n)
	{
		num = n;

		// 시각적인 확인을 위한 출력 구문 삽입
		System.out.println("인자 전달 : " + n);
	}

	int getNum()
	{
		return num;
	}

}

public class Test075
{
	public static void main(String[] args)
	{
		// NumberTest2 클래스 기반의 인스턴스 생성
		// NumberTest2 ob = new NumberTest2();
		//-- 사용자 정의 생성자를 정의한 이후 컴파일 에러 발생
		//	 NumberTest2 클래스에는
		//	 사용자 정의 생성자가 존재하고 있는 상황이기 때문에
		//	 『default 생성자』(→NumberTest2())가 자동으로 생성되지(삽입되지) 않는다.

		// NumberTest2 클래스 기반의 인스턴스 생성
		NumberTest2 ob = new NumberTest2(10);		// 사용자 정의 생성자에서 매개변수 int n을 했기 때문에
													// NumberTest2() 괄호안에 값 입력!
		//--==>> 인자 전달 : 10
		//-- 인스턴스 생성과 동시에 인자값이 있는 사용자 정의 생성자 호출~!!!
		
		System.out.println("메소드 반환 값 : " + ob.getNum());	// 여기서 getNum은 8행 int num값을 받아옴
		//--==>> 메소드 반환 값 : 10

		// NumberTest2 클래스 기반의 인스턴스 생성
		NumberTest2 ob2 = new NumberTest2(2456);
		//--==>> 인자 전달 : 2456

		System.out.println("메소드 반환 값 : " + ob2.getNum());
		//--==>> 메소드 반환 값 : 2456
	}
}