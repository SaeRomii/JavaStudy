/*===================================
  ■■■ 컬렉션 (Collection) ■■■
===================================*/

// Vector v = new Vector();
//-- 비어있는 Vector 자료구조 생성

// Vector v = new Vector(8);
//-- 8개의 초기 elements를 가진 Vector 자료구조 생성
//   8개가 모두 채워지게 되면(모자라게 되면) 자동으로 확장된다.

// Vector v = new Vector(3, 5);
//-- 3개의 초기 elements를 가진 Vector 자료구조 생성
//   3개가 모두 채워지게 되면(모자라게 되면) 5개씩 증가

// ※ 벡터는 데이터 요소로서 정수형, 실수형, 문자열... 등을
//	  담아내는 것이 가능하다.
//	  → 접근 방법 → 데이터 안정성 확보 -- check~!!!

import java.util.Vector;
import java.util.Iterator;

// MyVector 클래스 설계 → Object를 담아둔 Vector클래스 상속받음
class MyVector extends Vector<Object>	// 그냥 class MyVector만 있으면 벡터 아닌데 extends Vector<Object>쓰면 벡터됨 → MyVector가 Vector<Ovject>에 속하게 돼서
{
	/*
	... 기존 Vector 멤버 상속
	*/
	
	// 생성자
	MyVector()
	{
		// Vector(슈퍼 클래스) 생성자 호출
		super(1, 1);		// 12번째 줄 생성자 Vector v = new Vector(3, 5)와 같은 맥락 
		//-- 첫 번째 인자 : 주어진 용량
		//	 두 번째 인자 : 증가량
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}

	void addFloat(float f)
	{
		addElement(new Float(f));
	}

	void addString(String s)
	{
		addElement(s);
	}

	void addCharArray(char[] a)
	{
		addElement(a);
	}

	void write()
	{
		/* 벡터 요소들 출력하는거 무조건 Iterator 쓰면 안됨.. char 문자배열에서 해시코드나옴
		Iterator<Object> it = this.iterator();

		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		5
		3.14
		안녕하세요
		[C@15db9742
		*/

		// 위 결과와 비교
		Object o;
		int length = size();

		System.out.println("벡터 요소 갯수 : " + length);
		//--==>> 벡터 요소 갯수 : 4

		for (int i=0; i<length; i++)		//length 4임(addInt, addFloat, 
		{
			o = elementAt(i);

			// 『instanceof』 연산자
			//-- 처리해야 하는 대상의 객체 타입 확인
			if (o instanceof Integer)
			{
				System.out.println("정수형 : " + o);
			}
			else if (o instanceof Float)
			{
				System.out.println("실수형 : " + o);
			}
			else if (o instanceof String)
			{
				System.out.println("문자열형 : " + o.toString());
			}
			else if (o instanceof char[])
			{
				//System.out.println("문자배열 : " + o);
				//System.out.println("문자배열 : " + o.toString());
				//--==>> Object에서 가져오는거라 해시코드 나옴
				
				/* ①
				System.out.print("문자배열 : ");
				for (char ch : (char[])o)		// o를 char 배열타입으로 형변환하는거
				{
					System.out.print(ch);
				}
				System.out.println();
				//--==>> 정수형 : 5
				//		 실수형 : 3.14	
				//		 문자열형 : 안녕하세요
				//		 문자배열 : study
				*/
				
				// ②
				System.out.println("문자배열 : " + String.copyValueOf((char[])o));		// 문자 배열을 문자열로 처리해주는거
				/*
				정수형 : 5
				실수형 : 3.14
				문자열형 : 안녕하세요
				문자배열 : study
				*/
			}
			else
			{
				System.out.println("타입 확인 불가~!!!");
			}
		}
	}
}

public class Test154
{
	public static void main(String[] args)
	{
		// MyVector 클래스 인스턴스 생성
		MyVector v = new MyVector();

		// 주요 변수 선언 및 초기화
		int digit = 5;
		float real = 3.14f;
		String s = new String("안녕하세요");
		char[] letters = {'s', 't', 'u', 'd', 'y'};

		v.addInt(digit);		//addInt를 통해 벡터 자료구조에 정수 저장

		//v.write();
		//--==>> 5

		v.addFloat(real);		//addFloat를 통해 벡터 자료구조에 실수 저장

		//v.write();
		//--==>> 3.14

		v.addString(s);			//addString을 통해 벡터 자료구조에 문자열 저장

		//v.write();
		//--==>> 안녕하세요

		v.addCharArray(letters);	//addCharArray 통해 벡터 자료구조에 문자 배열 저장

		v.write();
		//--==>> [C@15db9742 해시코드나옴
	}
}

// 벡터는 elements타입을 레퍼런스 타입 요소로 넘겨받아서 처리하는걸로 보이지만
// 크리어쩌구 타입 받으면 오토 언박싱해서 값 제대로 나옴