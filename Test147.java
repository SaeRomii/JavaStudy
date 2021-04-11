/*=========================================
  ■■■ 예외(Exception) 처리 ■■■
  - 잡아낸 예외 다시 던지기
=========================================*/

public class Test147
{
	public static void main(String[] args)
	{
		Test147 ob = new Test147();

		try
		{
			int a = ob.getValue(-3);
			System.out.println("a : " + a);
		}
		catch (Exception e)
		{
			System.out.println("printStackTrace.....(main)");
			e.printStackTrace();
		}
	}

	public int getDate(int data) throws Exception
	{
		if (data<0)
			throw new Exception("data가 0보다 작습니다.");	// ① 새로운 예외 발생
		return data + 10;
	}

	public int getValue(int value)	throws Exception //getValue로 getDate 불러옴
	{
		int a=0;
		
		try
		{
			a = getDate(-2);								// ② 예외 발생(음수값 불러오는거니까)

		}
		catch (Exception e)									// ③ 예외 잡아냄
		{
			// 잡아낸 예외에 대한 처리
			System.out.println("printStackTrace....");
			e.printStackTrace();

			// ⑤ 잡아낸 예외를 다시 던지기(23번째에 throws Exception 넣고, main 메소드에 try catch문 넣기)
			throw e;
			//-- ③에서 잡아낸 예외를 다시 이 메소드를 호출한 지점으로 던지는 구문
			// 『throw e』 주석 처리 시
			// 즉, 잡아낸 예외를 다시 던지지 않을 경우
			// main() 메소드의 try~catch는 수행되지 않게 된다.
		}
		
		return a;	//try문 안에 넣어도됨
		
	}
}

/* 실행 결과
printStackTrace....
java.lang.Exception: data가 0보다 작습니다.
        at Test147.getDate(Test147.java:27)
        at Test147.getValue(Test147.java:37)
        at Test147.main(Test147.java:14)
printStackTrace.....(main)
java.lang.Exception: data가 0보다 작습니다.
        at Test147.getDate(Test147.java:27)
        at Test147.getValue(Test147.java:37)
        at Test147.main(Test147.java:14)
계속하려면 아무 키나 누르십시오 . . .
*/