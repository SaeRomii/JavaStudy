/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - String 클래스
=========================================*/

/*
○ String 클래스는 내부 문자열 데이터에 대한 수정이 불가능하다.
   (즉, 내용 불변 : Immutable)
   문자열의 내용이 변경되면 새로운 객체를 생성하며
   참조 대상을 잃어버린 개체는 가비지 컬렉션의 대상이 되고,
   새로운 객체의 새 주소를 할당하게 되므로
   해시코드도 변하게 된다.

   --> 원래 있던 메모리에 추가되는게 아니라 무언가 추가하면 다른 영역에 메모리가 새로 생기는거

○ String 클래스 간에 『+』연산자를 사용하게 되면
   문자열 간의 결합이 가능하며,
   String 클래스와 다른 클래스의 객체, 또는 기본형 데이터 간에
   『+』 연산자를 사용하는 경우에도
   내부적으로 자동 String으로 변환이 가능하다.

   --> "홍길동" + 1 => "홍길동1"

   ※ 우리 눈으로 확인되는 결과 이렇지만...
      String은 내용을 변경할 수 없기 때문에
	  『+』연산자를 사용하면
	  내부적으로 StringBuffer 를 생성하여 append() 메소드를 이용하여
	  문자열에 대한 결합을 수행하게 된다.
	  따라서 동적인 문자열을 많이 사용하는 Servlet 등에서는
	  되도록이면 String을 사용하는 것보다
	  StringBuffer 나 char[]을 사용하는 것이 효율적일 수 있다.

==> 정적인 문자열을 처리하는 경우에는 주로 String 클래스를 사용
	동적인 문자열을 처리하는 경우에는
	★ 런타임 시 동적으로 처리해주는 StringBuffer 클래스를
	사용하는 것이 효율적이다.

	String은 Buffer가 없음 그래서 문자열 변경하거나 결합하려고 하면 Buffer를 가지고 있는 StringBuffer를 이용

○ String 객체의 생성 및 특징

   String 객체를 생성하는 방법은
   ① 문자열 상수를 지정하는 방법과
   ② String 클래스의 생성자를 이용하는 방법
   이렇게 두 가지 방법이 있다.

   ① String str1 = "Java";
   ② String str2 = new String("Java");

   하지만 『=』 대입 연산자만을 사용하여 문자열 상수를 지정하는
   방법을 통해 객체를 생성하는 경우와 『new』 연산자를 이용하여
   객체를 생성하는 것은 의미가 다르다.
*/

public class Test131
{
	public static void main(String[] args)
	{
		String s1 = "seoul";					//상수를 통해 문자열 호출
		String s2 = "seoul";
		String s3 = new String("seoul");		//생성자를 통해 문자열 호출
		String s4 = new String("seoul");
		//-- s1과 s2 객체가 참조하는 문자열 상수가 동일한 경우
		//	 문자열이 저장된 기억장소의 영역이 동일하기 때문에
		//	 s1 객체와 s2 객체는 동일한 기억장소를 참조하게 된다.
		//→ 같은 주소값을 가지지만, s2를 변경하게 되면 원래 있던값은 그대로 있고 다른 메모리에 수정하는 값이 생기고 그 값에 따라 새로운
		//	 주소값이 생김 그래서 s1은 그대로고 s2는 변경된 값으로 나옴


		//	 하지만, s3와 s4는 동일한 영역이 아닌 다른 기억 공간을
		//	 새롭게(new) 확보하여 문자열 상수를 그 공간에 대입한 경우이므로
		//	 두 인스턴스는 같은 메모리 영역을 참조하는 것이 아니다.
		//→  s3랑 s4는 둘다 new로 되어있어서 각각 새롭게 메모리 공간 만들어짐
		
		//	 따라서 『s3 == s4』는 거짓(false)이 되며		(s3과 s4는 주소값 다르다)
		//	 만약 같은 문자열 상수인지의 여부를 비교해야 할 경우라면
		//	 『equals()』메소드를 이용해야 한다.

		// Object는 ==랑 equals 모두 주소값 비교였음 
		// String은 equals로 내부 내용 비교
		// ↓
		System.out.println(s1 == s2);		//--==>> true
		System.out.println(s1 == s3);		//--==>> false
		System.out.println(s3 == s4);		//--==>> false

		System.out.println(s1.equals(s2));	//--==>> true
		System.out.println(s2.equals(s3));	//--==>> true
		System.out.println(s3.equals(s4));	//--==>> true
		System.out.println(s4.equals(s1));	//--==>> true

		System.out.println("s1 : " + s1);	//--==>> seoul
		System.out.println("s2 : " + s2);	//--==>> seoul
		System.out.println("s3 : " + s3);	//--==>> seoul
		System.out.println("s4 : " + s4);	//--==>> seoul

		// ※ 객체가 같으면 hashCode가 같지만
		//	  hashCode가 같다고 해서 같은 객체는 아니다.

		// Object 물려받음
		System.out.println("s1 : " + s1.hashCode());	//--==>> s1 : 109324212
		System.out.println("s2 : " + s2.hashCode());	//--==>> s2 : 109324212
		System.out.println("s3 : " + s3.hashCode());	//--==>> s3 : 109324212
		System.out.println("s4 : " + s4.hashCode());	//--==>> s4 : 109324212

		s2 += " korea";
		System.out.println(s2);
		//--==>> seoul korea

		s2 = "korea";
		System.out.println(s2);
		//--==>> korea

		//-- 이와 같은 경우(105~111번째줄은 s2만 봤을때임!! s1이 참조되어 있으면 가비지 컬렉션 대상이 되지 않음)
		//	 s2가 참조한 "seoul"이 저장된 영역은
		//	 『s2 += "korea"』가 수행되는 시점에서
		//	 가비지 컬렉션의 대상이 되며
		//	 "seoul korea" 상수가 저장된 영역을
		//	 s2가 다시 참조하게 되었다가
		//	 또다시 s2가 참조한 "seoul korea"가 저장된 영역은
		//	 『s2 = "korea"』가 수행되는 시점에서
		//	 가비지 컬렉션의 대상이 되며
		//	 "korea"문자열 상수가 새롭게 저장된 영역을
		//	 s2가 참조하게 된다.

		//==> ★ String 객체의 내용은 불변이다. ★
	}
}