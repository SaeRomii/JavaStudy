/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - StringBuffer 클래스
=========================================*/

/*
○ StringBuffer 클래스는
   문자열을 처리하는 클래스로 String 클래스와의 차이점은
   String 클래스는 내부 문자열 데이터의 수정이 불가능하지만
   StringBuffer 클래스는 문자열을 사용할 때
   내부 문자열을 실행 단계에서 변경할 수 있다는 점이다.

   즉, StringBuffer 객체는 가변적인 길이를 가지므로
   객체를 생성하는 시점에서 미리 그 크기나 값을 지정하거나
   실행 시점에 버퍼 크기를 바꿀 수 있는 기능을 제공하는 것이다.

   또한, JDK 1.5 이후부터는
   문자열을 처리하는 StringBuilder 라는 클래스도 제공한다.
   StringBuilder 클래스의 기능은 StringBuffer 클래스와 동일하지만
   가장 큰 차이점은 multi-thread unsafe 라는 점이다.
   즉, Syncronization이 없기 때문에
   StringBuffer 보다 빠르며 동시성(동기화) 문제가 없다면
   StringBuilder 를 사용하는 것이 성능을 향상시킬 수 있다.

   thread : 작업들의 묶음 단위
   multi-thread unsafe 다중 작업 위험
   StringBuffer가 기능이 더 많음 StringBuilder보다 (안전해야하니까)
   하지만 성능은 StringBuilder가 더 좋음
*/

public class Test133
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");	//lang패키지 안에 있음

		System.out.println(sb1 == sb2);
		//--==>> false
		// new가 있어서 서로 다른 주소값임

		System.out.println(sb1.equals(sb2));			
		//--==>> false
		// Object 그대로 받아서 쓰고있어서 오버라이딩 없기때문에 서로 주소값 같은지 다른지를 비교하는거라서 false

		// toString은 Object의 자손
		// StringBuffer은 Object의 자손

		//sb1.toString() 
		//sb1만 잡으면 StringBuffer객체이지만 sb1.toString()으로 같이 잡으면 String객체로 잡힘
		// String을 반환하기 때문에

		//sb1.toString().equals()
		// sb1.toString()은 String이니까 String메소드 . 뒤에 equals사용

		System.out.println(sb1.toString().equals(sb2.toString()));
		//--==>> true
		// sb1.toString과 sb2.toString은 String객체이니까 String에서 equals는 내부 값 비교라서 둘다 seoul이기때문에 true

		/*
		String str1 = sb1.toString();
		String str2 = sb2.toString();

		System.out.println(str1.equals(str2));
		*/

		StringBuffer sb3 = new StringBuffer();
		//-- StringBuffer 기본 생성자 호출시(인스턴스 생성 과정)
		//	 기본적으로 생성되는 버퍼 크기 『16』

		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 16

		///////////////////////////////////////////////////////////////////////////////////

		System.out.println(sb3);
		//--==>> 無

		sb3.append("seoul");		// sb3 += "seoul"; → sb3를 seoul만큼 증가
									// sb3 = sb3 + "seoul"; → sb3 = "" + "seoul"; → sb3 = "seoul";
		sb3.append("korea");
		sb3.append("우리나라");
		sb3.append("대한민국");

		System.out.println(sb3);
		//--==>> seoulkorea우리나라대한민국

		System.out.println(sb3.toString());
		//--==>> seoulkorea우리나라대한민국

		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 34
		// 안에 구성되는 내용이 많아지면 버퍼 크기는 자동으로 늘어남

		///////////////////////////////////////////////////////////////////////////////////

		// toUpperCase : 소문자를 대문자로 변경
		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE

		// toLowerCase : 대문자를 소문자로 변경
		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//--==>> java and oracle

		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());
		// sb3.to~Case가 String객체라서 오류남

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		System.out.println(temp3.toLowerCase());
		System.out.println(sb3.toString().toUpperCase());
		//--==>> SEOULKOREA우리나라대한민국
		//		 seoulkorea우리나라대한민국
		//		 SEOULKOREA우리나라대한민국


		// seoulkorea우리나라대한민국 → sb3
		// ○ 대상 문자열(sb3) 중 seoul 문자열 앞에
		//	  『한국』이라는 문자열 추가 (insert를 수행하게 되면 문자열 추가되면서 sb3 자체가 변경됨)
		//	  insert
		sb3.insert(0, "한국");
		System.out.println("seoul 앞에 『한국』추가 : " + sb3.toString());
		//--==>> seoul 앞에 『한국』추가 : 한국seoulkorea우리나라대한민국


		// 한국seoulkorea우리나라대한민국 → sb3(변경후)
		// ○ 대상 문자열(sb3) 중 seoul 문자열 뒤에
		//	  『사랑』이라는 문자열 추가
		//	  단, 대상 문자열의 인덱스를 직접 확인하지 말고... [문제]
		
		// ★ 인덱스 직접 확인해서 추가하기
		//sb3.insert(7, "사랑");
		//System.out.println("seoul 뒤에 『사랑』추가 : " + sb3.toString());
		//--==>> seoul 뒤에 『사랑』추가 : 한국seoul사랑korea우리나라대한민국

		// ★ 인덱스 직접 확인하지 않고 추가하기
		// step 1
		//System.out.println(sb3.indexOf("seoul"));
		//--==>> 2
		
		// step 2
		//sb3.insert(sb3.indexOf("seoul"), "사랑");
		//System.out.println(sb3.toString());
		//--==>> 한국사랑seoulkorea우리나라대한민국

		// step 3
		//sb3.insert(sb3.indexOf("seoul"+5, "사랑"); 근데 5도 인덱스 직접 센거라서 안됨
		//System.out.println(sb3.toString());
		//--==>> 한국seoul사랑korea우리나라대한민국

		// step 4
		//sb3.insert(sb3.indexOf("seoul")+("seoul"의 길이), "사랑");
		//System.out.println(sb3.toString());
		
		// step 5
		sb3.insert(sb3.indexOf("seoul")+"seoul".length(), "사랑");
		System.out.println(sb3.toString());
		//--==>> 한국seoul사랑korea우리나라대한민국

		// 문자열 삭제 : delete
		// ○ 『우리나라』문자열 삭제
		//sb3.delete(14, 18);
		//System.out.println(sb3);
		//--==>> 한국seoul사랑korea대한민국

		// 직접 인덱스 확인하지 않고 문자열 삭제
		//System.out.print(sb3.toString());
		sb3.delete(sb3.indexOf("우리나라"), sb3.indexOf("우리나라")+"우리나라".length());
		System.out.println(sb3);
		//--==>> 한국seoul사랑korea대한민국


		// ○ 대상 문자열(sb3)에서
		//	  『korea』부터 문자열 삭제(korea 포함)
		//	  위에 했던것처럼 배열아니고 sb3.length()메소드 사용하여 출력
		
		// 인덱스 확인하고 삭제
		//sb3.delete(9, 19);
		//System.out.println(sb3);
		//--==>> 한국seoul사랑

		// 인덱스 확인하지 않고 삭제
		//sb3.delete(sb3의 "korea"문자열시작위치, sb3의문자열길이)
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3.toString());
		//--==>> 한국seoul사랑

		// ○ 대상 문자열(sb3)에서
		//	  『seoul』이후 문자열 삭제(seoul 제외)
		sb3.delete(sb3.indexOf("seoul")+"seoul".length(), sb3.length());
		System.out.println(sb3);
		//--==>> 한국seoul

		///////////////////////////////////////////////////////////////////////////////////

		// 버퍼 크기 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 34
		// 버퍼크기 그대로
		// 안에 내용물 증가하면 버퍼크기 자동으로 증가되지만 안에 내용물 감소해도 버퍼 크기 줄어들지 않음

		
		// 문자열(sb3)의 길이 확인
		System.out.println("문자열의 길이 : " + sb3.length());
		//--==>> 문자열의 길이 : 7

		// 버퍼 크기 조절 → 현재 문자열을 담아둘 수 있는 버퍼 크기로...
		sb3.trimToSize();

		// 버퍼 크기 조절 이후 다시 버퍼 크기 확인
		System.out.println("버퍼 크기 : " + sb3.length());
		//--==> 버퍼 크기 : 7
		
	}
}

