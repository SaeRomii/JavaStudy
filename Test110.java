/*=====================================
  ■■■ 클래스 고급 ■■■
  - 추상 클래스(Abstract)
=====================================*/

/*
○ 추상 클래스(abstract)는
   선언만 있고 정의가 없는 하나 이상의 메소드(추상 메소드)를 갖는 클래스로
   하위 클래스에서 오버라이딩(Overriding)할 것으로 예상되는 메소드에 대해
   메모리 낭비 없이 미리 호출 계획을 세워두기 위해 만든다.

○ 형식 및 구조
   [접근제어지시자] abstract class 클래스명
   {
		[접근제어지시자] abstract 자료형 메소드명([매개변수], ...);
   }

○ 특징
   클래스가 적어도 하나 이상의 추상 메소드를 포함할 때
   그 클래스는 클래스 이름 앞에 『abstract』 키워드를 붙여
   추상 클래스로 명시해야 하며, 
   추상 클래스로 명시해서 선언한 경우에는
   불완전한 형태의 클래스이므로 객체를 생성할 수 없다.
   추상 메소드가 존재하지 않는 추상 클래스마저도
   객체를 생성할 수 없는 것이다.

   즉, 추상 클래스는 독립적으로 존재할 수 없기 때문에
   상속을 위해서만 존재하며,
   추상 클래스에서 상속받은 하위 클래스에서는
   반드시 추상 메소드를 오버라이딩(Overriding)해야 한다.

※ 『abstract』 키워드는
   클래스와 메소드에서만 사용할 수 있으며
   멤버 변수나 로컬 변수에서는 사용 불가능하다.
*/

abstract class SortInt	//protected를 보고 상속쓸 클래스인거 알 수 있음
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();			//sorting 메소드 호출  정렬하겠다
	}

	// 추상 메소드(abstract)
	protected abstract void sorting();	// 써놓기만 하고 정의 안할거라서 ; 찍고 abstract 써서 추상 메소드 만들기
										// 어떤 정렬할지 몰라서 써놓기만함

	protected int dataLength()
	{
		return value.length;	//value 길이 반환
	}

	// 크기 비교 메소드
	// final 키워드로 이 클래스를 상속받는 클래스에서 이 메소드를 재정의할 수 없다.
	protected final int compare(int i, int j)	//value i번째 j번째 크기비교
												//오버라이딩 불가라는 final 키워드 넣어줌
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
		{
			return 0;		//
		}
		else if (x>y)
		{
			return 1;		// 앞에 크면 1
		}
		else
			return -1;		// 뒤에 크면 -1			
	}
	
	// 자리 바꾸기 메소드
	// final 키워드로 인해 이 클래스를 상속받는 클래스에서
	// 적어도 이 메소드만큼은 Overriding 해서 사용하지 말아라 라는 의미 전달
	protected final void swap(int i, int j)		//오버라이딩 불가라는 final 키워드 넣어줌
	{
		// 자리 바꾸기
		int temp = value[i];
		value[i] = value[j];
		value[j]=temp;
	}
}

// SortInt(추상클래스)를 상속받은 클래스 → 추상클래스 → 추상메소드재정의(오버라이딩) → 일반정상클래스
public class Test110 extends SortInt
//public abstract class Test110 extends SortInt
{
	int i, j;		//루프변수

	static int[] data = {7, 10, 3, 8, 7};		//차례대로 나오게 소스 하나랑, 오름차순 한개 만들기

	//---------------------------------------------------
	// 빈 칸 채워넣기~!!!
	//---------------------------------------------------
	
	@Override
	protected void sorting()
	{	
		// 선택정렬
		for (i=0; i<dataLength()-1; i++)
		{
			for (j=i+1; j<dataLength(); j++)
			{
				if (compare(i, j)>0)		// 크기 비교(정렬 기준)
				{
					swap(i,j);				// 자리 바꿈
				}
				
				System.out.print((i+1) + "Round Data : ");		// 몇회전했는지 알아보는거
				for (int n : data)
				{
					System.out.print(n + " ");
				}
				System.out.println();		
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.print("Source Data : ");
		for (int n : data)
		{
			System.out.print(n + " ");
		}
		System.out.println();
		
		Test110 ob = new Test110();
		ob.sort(data);

		System.out.print("Sorted Data : ");
		for (int n : data)
		{
			System.out.print(n + " ");
		}
		System.out.println();
	}
}

/* 실행 결과
Source Data : 7 10 3 8 7
Sorted Data : 3 7 7 8 10
계속하려면 아무 키나 누르십시오 . . .
*/