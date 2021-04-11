/*===================================================
  ■■■ 메소드 중복정의(Method Overloading) ■■■
  - 메소드 오버로딩이 가능한 형태와 불가능한 형태
===================================================*/


public class Test096
{
	public static void main(String[] args)
	{
		print();
		print(10);

		double result = print(10.1);					//자바는 = 대입연산자 있으면 오른쪽만 보여서 왼쪽은 잘 안보긴함
		print(10.1);
		String temp = print(2.34);
	}
	
	public static void print(){}						// 메소드 순서는 우선순위 없음
	public static void print(int i){}					// 11번째 줄은 매개변수 없고 12번째 줄은 매개변수 있어서 둘다 쓸 수 있음	
	//public static void print(int j){}					//--(X) 매개변수 겹쳐서 안됨
	public static void print(char c){}					//--(O) ※ 자동 형 변환 규칙 check
	public static void print(int i, int j){}
	public static void print(int i, double d){}			// 타입 달라서 가능 ※ 자동 형 변환 규칙 check
	public static void print(double d, int k){}			// ※ 자동 형 변환 규칙 check
	public static double print(double){return 3.14;}	// 14번째줄 호출 → 자바는 구분못함
	public static void print(double d){}				// 15번째줄 호출 → 자바는 구분못함
	public static String print(double d){}				// 반환 자료형은 상관없음  그래서 안됨~!! 자바 구분못햐
}