/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
=========================================*/

public class Test126
{
	public static void main(String[] args)
	{
		boolean bi = true;
		Boolean wrapBi = new Boolean(bi);			//-- 인스턴스 생성
		Boolean wBi = bi;							//-- 오토 박싱

		int n = 300;
		Integer wrapN = new Integer(n);
		int n2 = wrapN;								//-- 객체를 대입 → 오토 언박싱

		float f = 300.3f;
		Float wrapF = new Float(f);					//-- 객체 생성

		// 객체의 toString
		System.out.println(wrapBi.toString());		//--==>> true
		System.out.println(wrapN.toString());		//--==>> 300
		System.out.println(wrapF.toString());		//--==>> 300.3

		// 테스트(비교)
		Object obj = new Object();					// obj는 객체
		System.out.println(obj);					//--==>> java.lang.Object@15db9742
		System.out.println(obj.toString());			//--==>> java.lang.Object@15db9742
		// String을 반환하는 println 객체는(Object obj)
		// {
		//     toString() 활용...
	    // }
		// Object 타입을 toString활용
	
		// 오버라이딩한 toString 객체가 출력됨
		System.out.println(wrapBi);					//--==>> true
		System.out.println(wrapN);					//--==>> 300
		System.out.println(wrapF);					//--==>> 300.3

		System.out.println(wBi);					//--==>> true
		System.out.println(n2);						//--==>> 300

		System.out.println("\n-----------------------------------------------------------------\n");

		// Integer 클래스

		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  12

		ni = Integer.parseInt("0101", 2);		//문자열을 첫번째 인자값, 두번째 인자값으로 받게 → 오버로딩
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :   5
		//		 "0101"이 2진법으로 바뀌면 5라서 결과값 5나옴

		ni = Integer.parseInt("12", 8);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  10
		//		 12가 8진수로 바뀐 값

		ni = Integer.parseInt("A", 16);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni : 10
		//		 A가 16진수로 바뀐 값

		sn = Integer.toBinaryString(20);
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 10100
		//	     2진수 형태로 바뀐 값

		sn = Integer.toHexString(31);
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 1f
		//		 16진수 형태로 바뀐 값

		sn = Integer.toOctalString(31);
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 37
		//		 8진수 형태로 바뀐 값

		Integer num = new Integer(50);
		System.out.println(num.toString());
		//--==>> 50

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4);
		// valueOf → 일반적인 정수를 객체로 반환해줌
		//--==>> 345



	}
}