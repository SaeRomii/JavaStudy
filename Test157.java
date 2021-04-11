/*===================================
  ■■■ 컬렉션 (Collection) ■■■
===================================*/

// 벡터 자료구조 객체 선언 및 생성시 사용자 정의 자료형 클래스 활용
// → 자료형으로 활용

import java.util.Vector;

// 사용자 정의 클래스 설계 → 자료형처럼 활용
class MyData
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)
	private String name;			//-- 이름
	private int age;				//-- 나이

	// getter / setter 구성
	public String getName()			//name 받기
	{
		return name;				//name 반환 name속성에 대한 getter 구성
	} 

	public void setName(String name)				//받아서 전달 → 매개변수가 있음
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	// 생성자(인자 없는 생성자)
	public MyData()
	{
		name = "";
		age = 0;
	}
	// 생성자(인자 2개인 생성자)
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

public class Test157
{
	public static void main(String[] args)
	{
		// 벡터 자료구조 인스턴스 생성
		Vector<MyData> v = new Vector<MyData>();
		//-- MyData 기반으로 생성된 인스턴스만
		//	 Vector 자료구조 v에 적재하는 것이 가능

		// 벡터 자료구조 v에
		// 심혜진 16세 / 소서현 14세 / 박정준 86세
		// 담아내기


		// ①
		/*
		MyData st1 = new MyData();
		st1.setName("심혜진");
		st1.setAge(16);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("소서현");
		st2.setAge(14);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("박정준");
		se3.setAge(86);
		v.add(st3);
		*/


		// ②
		MyData st1 = new MyData("심혜진", 16);
		v.add(st1);
		MyData st2 = new MyData("소서현", 14);
		v.add(st2);
		MyData st3 = new MyData("박정준", 86);
		v.add(st3);
	

		// ③
		/*
		v.add(new MyData("심혜진", 16));
		v.add(new MyData("소서현", 14));
		v.add(new MyData("박정준", 86));
		*/

		// 벡터 자료구조 v에 담긴 내용(요소) 전체 출력하기
		// 실행 예)
		// 이름:심혜진, 나이:16
		// 이름:소서현, 나이:14
		// 이름:박정준, 나이:86
		
		/* 내가 풀었던 방식
		for (MyData s : v)			//배열이 아니기때문에 st1.2.3 상관없이 꺼내서 임의로 만든 s에 넣기
		{
			System.out.println("이름 :" + s.getName() + " 나이 :" + s.getAge());
		}
		*/
		


		/* 선생님이 풀어주신 방법 ①
        for (MyData obj : v)
        {
			System.out.printf("이름:%s, 나이:%d\n", obj.getName(), obj.getAge());
        }
		이름:심혜진, 나이:16
		이름:소서현, 나이:14
		이름:박정준, 나이:86
		*/
		


		/* 선생님이 풀어주신 방법 ②
		for (int i=0; i<v.size(); i++)
		{
			System.out.printf("이름:%s, 나이:%d\n", v.elementAt(i).getName(), v.elementAt(i).getAge());
		}
		System.out.println();
		*/
		//이름:심혜진, 나이:16
		//이름:소서현, 나이:14
		//이름:박정준, 나이:86



		// 선생님이 풀어주신 방법 ③
		for (Object temp : v)	// temp가 Object로 업캐스팅 됐음
		{
			System.out.printf("이름:%s, 나이:%d\n", ((MyData)temp).getName(), ((MyData)temp).getAge());	// MyData로 다운캐스팅 
		}
		//이름:심혜진, 나이:16
		//이름:소서현, 나이:14
		//이름:박정준, 나이:86
		
	}
}

/* 실행 결과
이름 :심혜진 나이 :16
이름 :소서현 나이 :14
이름 :박정준 나이 :86
계속하려면 아무 키나 누르십시오 . . .
*/