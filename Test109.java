/*=====================================
  ■■■ 클래스 고급 ■■■
  - 상속(Inheritance)
=====================================*/

/*
※ 메소드 오버라이딩(Method Overriding)의 특징

   - 메소드 이름, 리턴 타입, 파라미터 수나 타입이 완전히 일치해야 한다.
   - 반드시 상속 관계가 있어야 한다.
   - 재정의된 하위 클래스의 메소드 접근제어지시자는
     상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
	 예를 들어, 상위 클래스의 메소드의 접근제어지시자가 『protected』인 경우
	 하위 클래스가 이 메소드를 오버라이팅(Overriding)하는 경우
	 접근제어지시자는 『protected』 또는 『public』이어야 한다.
   - 『static』, 『final』, 『private』 메소드는 오버라이딩(Overriding)할 수 없다.
   - Exception의 추가가 불가능하다.
     즉, 상위 클래스의 메소드가 가지고 있는 기존의 예외 사항에
	 새로운 Exception을 추가하는 것은 불가능하다.
*/

// 상위 클래스, 부모 클래스, super clas
class SuperTest109
{
	private int a=5;
	protected int b=10;
	public int c=20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
}

// 하위 클래스, 자식 클래스, sub class
class SubTest109 extends SuperTest109
{	
	/* 상속받은 내용
	protected int b=10;
	public int c=20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
	*/

	protected int b=100;

	public void print()
	{
		//System.out.println("Sub print()메소드 : " + a + " : " + b + " : " + c); a를 갖고 올 수 없음 에러남
		//-- 슈퍼 클래스(SuperTest109)에서 선언된 변수 a에는 접근할 수 없다.
		//   → private 변수이기 때문에...

		System.out.println("Sub print() 메소드 : " + b + " : " + c);		//여기서 b는 48번째 b가져오고 c는 27번째 c가져옴
		//--==>> Sub print() 메소드 : 100 : 20

		System.out.println("Sub print() 메소드 : " + super.b + " : " + c);
		//--==>> Sub print() 메소드 : 10 : 20
		//-- 슈퍼 클래스(SuperTest109)에서 선언된 변수 b에 접근하기 위해서는
		//	 『super』 키워드를 사용하면 된다.

		System.out.println("Sub print() 메소드 : " + c);
		System.out.println("Sub print() 메소드 : " + this.c);
		System.out.println("Sub print() 메소드 : " + super.c);
		/*
			Sub print() 메소드 : 20
			Sub print() 메소드 : 20
			Sub print() 메소드 : 20
		*/
		//-- 슈퍼 클래스(SuperTest109)에서 선언된 변수 c에 접근하는 데에는
		//	 아무런 제약과 제한이 없다.

	}
	
	@Override			//오버라이딩 (부모 클래스에 write있어서)
	public void write()
	{
		System.out.println("Sub write() 메소드 : "  + " : " + b + " : " + c);
	}
	//위에서 a가 들어가면 에러남 왜냐면 a가 부모클래스에서 상속받지 못해서 안보이기때문에 에러남!!
}

// main()메소드를 포함하고 있는 외부의 다른 클래스
public class Test109
{
	public static void main(String[] args)
	{
		// 하위 클래스(SubTest109) 인스턴스 생성
		SubTest109 ob = new SubTest109();

		ob.print();
		//--==>> Sub print() 메소드 : 100 : 20

		ob.write();
		//--==>> Sub write() 메소드 : 5 : 10 : 20
		// ※ write() 메소드 오버라이딩 후...
		//--==>> Sub write() 메소드 :  : 100 : 20
		//-- 슈퍼 클래스(SuperTest109)에서 선언된 변수 a에 접근할 수 없다.
		//	 → private 변수이기 때문에...
		//	 또한, 이 때 접근한 변수 b는 부모로부터 물려받은 b가 아닌
		//	 자신의 변수 b인 것을 확인할 수 있다.

		//----------------------------------------------------------------
		System.out.println("--------------------------------------구분선");

		ob.write();		// 자식 객체 
		//--==>> Sub write() 메소드 :  : 100 : 20
		
		((SuperTest109)ob).write();			// ob도 따로 불러오기 위해서 괄호 해주는거
		//   →  상위 클래스 타입으로 형변환 하겠다.
		//--==>> Sub write() 메소드 :  : 100 : 20
		// 메소드는 중복정의라서 덮어쓰기 한거라서 결과가 똑같이 나옴

		System.out.println(ob.b);
		//--==>> 100

		System.out.println(((SuperTest109)ob).b);
		//--==>> 10

		// 변수를 부를경우에는 자식객체 따로 부모 클래스 객체 따로 불러와져서 결과값이 다른데
		// 이걸 ★슈퍼 부름[((SuperTest109)ob).b]★이라고 함

		// 변수는 상위 클래스 타입으로 형변환 가능한~! 메소드는 중복정의로 덮어쓰기 한 형태라서 안됨

		//ex) 메소드 중복정의는 아버지로부터 물려받은 차를 리폼하고 재정의 한거라서 원래 형태가 사라졌음
		// 그래서 그거 다시 가져와!라고 하면 못가져옴 그래서 ob.write 자식객체랑 상위 클래스 타입으로 형변환 해준
		// ((SuperTest109)ob).write랑 같은 결과가 나오게됨
		// 위에서 write는 메소드~~

	}
}