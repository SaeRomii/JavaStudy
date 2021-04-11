/*=============================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 자바의 기본 입출력 : printf()
==============================================*/


public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");	//--  『\n』 개행

		//서식 출력 메소드
		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");	//-- 『\n』 개행
		System.out.printf("12345678901234567890%n");	//-- 『%n』 개행
		System.out.printf("%d + %d + %d\n", 10, 20, 30);
		//--==>>AAABBBCCC
		//--==>>1234567890123456789012345678901234567890
		//--==>>12345678901234567890
		//--==>>10 + 20 + 30
		//--==>>계속하려면 아무 키나 누르십시오 . . .

		System.out.printf("%d\n", 123);
		System.out.printf("%7d\n", 123);
		System.out.printf("%10d\n", 123);      // 총 10칸이 생기는데 123 세칸 잡아먹고 앞에 7칸남음
		System.out.printf("%010d\n", 123);
		//--==>> 123
		//	         123
		//		        123
		//		 0000000123

		System.out.printf("%d\n", 365);
		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);
		//--==>> 365
		//		 +365
		//		 +365

		System.out.printf("%d\n", +365);
		//--==>> 365

		System.out.printf("%d\n", -365);
		//--==>> -365

		//System.out.printf("%-d\n", 365);
		//--==>> 에러 발생(런타임 에러)

		System.out.printf("-%d\n", 365);
		//-==>> -365

		System.out.println();	// 개행
		
		System.out.printf("%(d\n", -365);		// check~!!!
		System.out.printf("%(d\n", 365);		// check~!!!
		//--==>> (365)
		//		  365

		//System.out.printf("%d\n", 'A'); 
		//--==>> 에러 발생(런타임 에러)
		// 문자는 %c에 담아야하는데 %d에 담아서 에러뜸

		System.out.printf("%c\n", 'A');
		//System.out.printf("%c\n", "ABCD");
		//--==>> 에러 발생(런타임 에러)
		// 문자열을 %c에 담아서 에러뜸 %s에 담아야함

		System.out.printf("%s\n", "ABCD");
		//--==>> A
		//		 ABCD

		System.out.println();	//개행

		System.out.printf("%h\n", 365);   //365를 16진수로 표현
		System.out.printf("%o\n", 24);	  //24를 30진수로 표현
		//--==>> 16d
		//		 30

		System.out.println();	//개행

		System.out.printf("%s\n", "true");
		System.out.printf("%b\n", true);
		//--==>> true			문자열(String) true
		//		 true			boolean형 true
		
		//printf로 출력되는 모든 결과들은 문자열로 출력되는 것임

		System.out.println();	//개행

		System.out.printf("%f\n", 123.23);
		System.out.printf("%.2f\n", 123.23);
		System.out.printf("%.2f\n", 123.236);
		System.out.printf("%.2f\n", 123.231);
		System.out.printf("%8.2f\n", 123.236); //8.2는 소수점 둘째자리까지 자르고 총 8자리 나오게 앞에 두칸남음
		System.out.printf("%2.2f\n", 123.1244); //소수점 둘째자리 자르고 총 2자리 나오게 하는건데 더 길면 그대로
		//--==>> 123.230000
		//		 123.23
		//		 123.24
		//		 123.23
		//		   123.24
		//		 123.12




	}
}

/* 실행 결과
AAABBBCCC
1234567890123456789012345678901234567890
12345678901234567890
10 + 20 + 30
123
    123
       123
0000000123
365
+365
+365
365
-365
-365

(365)
365
A
ABCD

16d
30

true
true

123.230000
123.23
123.24
123.23
  123.24
123.12
계속하려면 아무 키나 누르십시오 . . .
*/