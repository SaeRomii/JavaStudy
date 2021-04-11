/*=========================================
  ■■■ 예외(Exception) 처리 ■■■
=========================================*/

// Test146.java 파일과 비교

class Demo1
{
	// 주요 속성 구성
	private int value;		//자동초기화 지원됨(int value 기본 0 초기화)
	
	// setter
	public void setValue(int value)
	{
		if (value<=0)		//0보다 작으면 세팅못하게함
			return;			//-- 종료하겠다. → 메소드 종료

		this.value = value;
	}

	// getter
	public int getValue()
	{
		return value;
	}
}

public class Test145
{
	public static void main(String[] args)
	{
		Demo1 ob = new Demo1();
		ob.setValue(-10);
		int result = ob.getValue();
		System.out.println(result);
	}
}