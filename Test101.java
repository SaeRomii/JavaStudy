/*=========================================
  ■■■ 주민등록번호 유효성 검사■■■
=========================================*/

/*
○ 주민번호 검증 공식

   ① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.
   
      123456-1234567 (→ 주민번호)
	  ****** ******
	  234567 892345  (→ 각 자리에 곱해질 수)
   
   ② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

   ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
       * * * * * *   * * * * * *
	   2 3 4 5 6 7   8 9 2 3 4 5
   --------------------------------
   →14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15
     
	 == 217

   ③ 더해진 결과물을 11로 나누어 『나머지』를 구한다.
	   19
	  -------
  11 | 217
       11
	  -------
	   107
	    99
	  -------
	     8 → 나머지

   ④ 11에서 나머지를 뺀 결과값을 구한다.
      
	  11 - 8 → 3

	  추가~!
	  ④를 수행한 결과값이 11이나 10이 나오게 되었을 경우
	  ex) 11 - 1 → 10 (두자리 나오면 10으로 나누어서 그 나머지가 주민번호 마지막 숫자) → 0
	      11 - 0 → 11 (두자리 나오면 10으로 나누어서 그 나머지가 주민번호 마지막 숫자) → 1

   ⑤ ④에서 처리한 연산 결과가 주민번호를 구성하는 마지막 숫자와
      일치하는지 비교한다.

   ※ 마지막 숫자와 같은 경우 유효한 주민등록번호~!!!
   
*/

// 실행 예)
// 주민번호 입력(xxxxxx-xxxxxxx) : 750615-1862133
// >> 정확한 주민번호~!!!
// 계속하려면 아무 키나...

// 주민번호 입력(xxxxxx-xxxxxxx) : 750615-1234567
// >> 잘못된 주민번호~!!!
// 계속하려면 아무 키나...

// 주민번호 입력(xxxxxx-xxxxxxx) : 750615-18621		// → 자릿수 부적합
// >> 입력 오류~!!!
// 계속하려면 아무 키나...

// 배열.length → 배열방의 길이(크기, 갯수) 여기서 length는 속성

// ※ 문자열.length() → 문자열의 길이 반환 여기서 length()는 메소드  문자열의 길이가 몇글자인지 반환해주는 메소드
//	  문자열.substring() → 문자열 추출

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test101
{
	public static void main(String[] args) throws IOException
	{
		// 테스트
		//String strTemp = "동해물과백두산이 마르고닳도록";
		//System.out.println(strTemp.length());
		//--==>> 15

		// 테스트
		//System.out.println("남산위의 저 소나무".length());
		//--==>> 10

		// 테스트
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 5));
		//--==>> de
		// substring(m, n) → 문자열 인덱스 m번째 부터 n-1번째까지 추출
		//					  인덱스는 0부터...

		// 테스트
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 24));
		//--==>> defghijklmnopqrstuvwx

		// 테스트
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 25));
		//--==>> defghijklmnopqrstuvwxy

		// 테스트
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 26));
		//--==>> defghijklmnopqrstuvwxyz
		
		// 테스트
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 27));
		//--==>> 에러 발생(런타임 에러)
		//		 java.lang.StringIndexOutOfBoundsException

		// 테스트
		//System.out.println("봄이오니졸려죽겠네".substring(4, 9)); 메소드 오버로딩
		//--==>> 졸려죽겠네

		// 테스트
		//System.out.println("졸려도좀참자".substring(3));
		//System.out.println("졸려도좀참자".substring(3, "졸려도좀참자".length()));
		//System.out.println("졸려도좀참자".substring(3,6));
		//System.out.println("좀참자");
		/*
		--==>> 좀참자
			   좀참자
			   좀참자
			   좀참자
		*/
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int[] gop = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		String num;
		int sum=0;		//곱셈 연산 후 누적합 담기 

		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		num = br.readLine();

		if (num.length()<14 || num.length()>14)
		{
			System.out.print("입력 오류~!!!\n");
			return;
		}

		for (int i=0; i<13; i++)
		{
			if (i==6)			// -처리
			{
				continue;
			}
			sum += gop[i]*Integer.parseInt(num.substring(i, (i+1)));		// 곱셈 연산 후 tot에 담기
		}
		
		int result = 11-sum%11;

		if (result==Integer.parseInt(num.substring(13)))
		{
			System.out.print(">> 정확한 주민번호~!!!\n");
		}
		else
			System.out.print(">> 잘못된 주민번호~!!!\n");
		*/

		// 입력받은 주민번호
		String str;

		// 주민번호를 대상으로 곱해지는 수 배열 구성
		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		//							   - 하이픈 들어가야해서 곱해지면 안되니까 0으로 넣었음

		// 곱셈 연산 후 누적합
		int tot=0;		// tot는 곱셈에 개입하지 않고 누적합 누적하는거라서 0으로 초기화

		// 사용자에게 안내 메세지 출력 및 주민번호 입력받기
		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		str = br.readLine();

		if (str.length()!=14)	// str가 (입력받은 주민번호) 14자리가 아니라면
		{
			System.out.println(">> 입력 오류~!!!");
			return;	// 메소드 종료 → 프로그램 종료 return써줘야 입력 오류 메세지 뜬 다음 밑으로 안내려감
		}

		// 확인(테스트)
		//System.out.println(">> 자릿수가 적합한 상황~!!!");

		for (int i=0; i<13; i++)	// chk.length와 같음 i → 0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			if (i==6)				// 하이픈 들어갈 자리를 0으로 썼으니까 
									// i가 그 자리에 오면 아래 tot 누적합 계산 무시하고 계속해라(그 다음 숫자랑 주민번호 추출곱함)
			{
				continue;			// (뒷부분 무시하고) 계속해라
			}
			// ↓ continue가 무시할 뒷부분
			tot += chk[i]*Integer.parseInt(str.substring(i, (i+1)));	//chr의 i번째 자리랑 주민번호 i번째 자리 추출 후 곱함 
			// chk[0]*Integer.parseInt(str.substrint(0,1));
			// (정수형으로 형변환) 주민번호 입력받은게 문자열로 받아서
			// tot는 담고 그 다음값 증가시키고 해야하니까 +=라고 써야함

		}
		//-----------------------------------①번과 ②번 까지 끝낸 상황이며
		// 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한 값은
		// 변수 tot에 담겨있는 상태가 된다.

		int su = 11-tot%11;
		// tot에서 11나눈 나머지 계산 먼저, 그다음 11에서 뺀 계산
		
		// 테스트(확인)
		//System.out.println(su);
		/*
		--==>> 주민번호 입력(xxxxxx-xxxxxxx) : 950529-2199011
			   1
			   계속하려면 아무 키나 누르십시오 . . .
		*/

		// 최종 결과 출력 이전에 추가 연산 필요
		// → su에 대한 연산 결과가 두 자리로 나올 경우
		//	  주민번호 마지막 자릿수와 비교할 수 없는 상황
		su = su%10;		//su %= 10;

		//-- 여기까지 수행하면 ③번과 ④번의 추가까지 모두 끝낸 상황이며
		//	 최종 연산 결과는 변수 su에 담겨있는 상황이 된다.

		// 최종 결과 출력
		//if (su == Integer.parseInt(주민번호마지막자리추출))
		if (su == Integer.parseInt(str.substring(13)))
		{
			System.out.println(">> 정확한 주민번호~!!!");		// true면
		}
		else
		{
			System.out.println(">> 잘못된 주민번호~!!!");		// false면
		}
	}					  
}

/* 실행 결과
주민번호 입력(xxxxxx-xxxxxxx) : 950529-2199011
>> 정확한 주민번호~!!!
계속하려면 아무 키나 누르십시오 . . .
*/

/* 실행 결과
주민번호 입력(xxxxxx-xxxxxxx) : 950529-1234567
>> 잘못된 주민번호~!!!
계속하려면 아무 키나 누르십시오 . . .
*/

/* 실행 결과
주민번호 입력(xxxxxx-xxxxxxx) : 1234
>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/