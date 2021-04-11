/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - String 클래스
=========================================*/

public class Test132
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		//--==>> seoul korea

		// ○ 문자열 추출
		System.out.println(s.substring(6, 9));	// 6번째자리~9번째자리까지 = 6,7,8
		//--==>> kor
		//-- 『String 클래스의 substring(s, e)』
		//	  String 문자열을 대상으로
		//	  s번째에서 e-1번째까지
		//	  (단, 인덱스는 0부터 시작)

		System.out.println(s.substring(7));
		//--==>> orea
		//-- 『String 클래스의 substring(s)』
		//	  String 문자열을 대상으로
		//	  s번째에서 끝까지...(즉, 문자열이 가진 길이만큼...)

		// ○ 문자열 데이터의 값 비교
		System.out.println(s.equals("seoul korea"));
		//--==>> true

		System.out.println(s.equals("seoul Korea"));
		//--==>> false
		// 대소문자 다르면 false나옴(대소문자 엄격히 구분)

		System.out.println(s.equalsIgnoreCase("Seoul KoReA"));
		//--==>> false
		// equalsIgnoreCase는 대소문자 구분 안함

		// ○ 찾고자 하는 대상 문자열(s)에
		//	  『for』 문자열이 존재할까?
		//	  존재한다면 그 위치는 어떻게 될까?
		// indexOf

		// s에는 seoul korea 들어있음
		System.out.println(s.indexOf("kor"));
		//--==>> 6
		// 6번째부터 있다고 알려줌

		System.out.println(s.indexOf("ea"));
		//--==>> 9

		System.out.println(s.indexOf("e"));
		//--==>> 1
		// 중복되는 값 있으면 앞에 있는 위치만 알려줌 뒤에까지 안봄

		System.out.println(s.indexOf("tt"));
		//--==>> -1
		// 찾으려는 값이 없으면 -1로 나옴
		
		//-- 찾고자 하는 문자열이 대상 문자열에 존재할 경우
		//	 그 문자열의 인덱스를 반환하지만
		//	 존재하지 않을 경우 음수를 반환하게 된다. (-1)
		//   ㄴ무조건 -1이 나오진 않음 

		// ○ 대상 문자열(s)이 『rea』로 끝나는지의 여부 확인
		//	  (true / false)
		//	  endsWith
		System.out.println(s.endsWith("rea"));
		//--==>> true

		System.out.println(s.endsWith("oul"));
		//--==>> false

		// ○ 찾고자 하는 대상 문자열(s)에
		//    『e』문자열이 존재할까?
		//    존재한다면 그 위치는 어떻게 될까?
		//    (단, 뒤에서부터 검사)
		//    lastIndexOf
		//    스캔은 뒤에서부터 하는데 숫자 카운팅은 앞에서부터함

		// seoul korea
		System.out.println(s.indexOf("e"));
		//--==>> 1

		System.out.println(s.indexOf("o"));
		//--==>> 2

		System.out.println(s.lastIndexOf("e"));
		//--==>> 9

		System.out.println(s.lastIndexOf("o"));
		//--==>> 7

		// ○ 대상 문자열(s) 중
		//	  『6』번째 인덱스 위치의 문자는?
		//	   charAt

		// seoul korea
		System.out.println(s.charAt(6));
		//--==> k

		//System.out.println(s.charAt(20));
		//--==>> 에러 발생(런타임에러)
		//-- java.lang.StringIndexOutOfBoundsException
		// String 인덱스 벗어났다는 뜻

		// ○ 대상 문자열(s)과 비교 문자열("seoul corea")중
		//	  어떤 문자열이 더 큰가?
		//	  두 문자열이 다르다면 차이를 확인
		//	  compareTo
		System.out.println(s.compareTo("seoul corea"));
		//--==>> 8
		//-- c ~ k → defghijk(8)

		System.out.println(s.compareTo("seoul koreb"));
		//--==>> -1
		// b에서~a까지니까 -1 음수로나옴

		System.out.println(s.compareTo("seoua korea"));
		//--==>> 11
		//--==>> a ~ l → bcdefghijkl(11)

		// ○ 대상 문자열(s) 중
		//	  해당 문자열을 찾아 원하는 형태로 수정
		//	  replaceAll
		s = "우리나라 대한민국 대한독립 만세";
		s = s.replaceAll("대한", "大韓");
		System.out.println("s : " + s);
		//--==>> s : 우리나라 大韓민국 大韓독립 만세

		// ○ 공백 제거
		//	  .trim()
		s = "        사        랑        ";
		System.out.println("|" + s + "|");
		//--==>> |        사        랑        |

		System.out.println("|" + s.trim() + "|");	//trim메소드 → 잘라내는 기능을 가진 메소드
		//--==>> |사        랑|
		//-- 양쪽 끝단 가장자리 공백 제거
		//	 양쪽 끝단 가장자리부터 공백 제거하다가 공백 아닌거 만나면 멈춤

		System.out.println("|" + s.replaceAll(" ", "") + "|");
		//--==>> |사랑|
		
		// format
		int n = 2345678;
		System.out.printf("%d", n);
		System.out.format("%d", n);	//2345678을 %d형태로 출력해라
		//--==>> 23456782345678

		System.out.println();

		s = String.format("%d", n);		//n을 %d형식에 맞게 문자열 형태로 반환해라
		System.out.println(s);
		//--==>> 2345678

		s = String.format("%,d", n);
		System.out.println(s);
		//--==>> 2,345,678		세번째 자리마다 , 들어감

		double p = 3.141592;
		s = String.format("%f", p);
		System.out.println(s);
		//--==>> 3.141592

		s = String.format("%.2f", p);
		System.out.println(s);
		//--==>> 3.14

		String[] strArray = "기본,열정,배려".split(",");		// {"기본", "열정", "배려"}
		for (String str : strArray)		//strArray 배열에 있는거 하나씩 꺼내고 공백 하라는 반복문
		{
			System.out.print(str + " ");
		}
		System.out.println();
		//--==>> 기본 열정 배려

		
	}
}