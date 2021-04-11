/*=======================================
  ■■■ 자바의 기본 입출력(I/O) ■■■
=======================================*/

// Reader 실습
// Test166.java와 비교

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test168
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
		
		// System.in         : 자바의 표준 입력 스트림(객체) → 바이트 기반 스트림
		// InputStreamReader : 바이트 기반 스트림을 문자 기반 스트림으로 변환(변환기, 번역기 역할 수행)
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//-- InputStream은 번역기 역할

		// Reader            : 문자 기반 스트림 객체
		Reader rd = new InputStreamReader(System.in);

		System.out.println("문자열 입력(종료Ctrl+z)");
		
		
		while ((data = rd.read()) != -1)	//문자 기반 스트림을 -1이 아니면 data에 담겠다
		{
			ch = (char)data;				//data를 char형변환해서 ch에 받겠다.
			//System.out.print(ch);
		
			//--==>>
			/*
			문자열 입력(종료Ctrl+z)
			1234
			1234
			abcd
			abcd
			ABCD
			ABCD
			가나다라
			가나다라
			^Z
			계속하려면 아무 키나 누르십시오 . . .
			*/

			// 3.15일에서 실습한건 바이트 기반 스트림을 읽어와서 한글이 깨지는거고, 3.16일에 한건 문자 기반 스트림을 읽어와서 한글 안깨짐
			

			// write() : OutputStream 클래스의 대표적 메소드 (→ 바이트 스트림)
			System.out.write(ch);				// 한글 깨짐
			//--==>>
			/*
			문자열 입력(종료Ctrl+z)
			1234
			1234
			abcd
			abcd
			ABCD
			ABCD
			가나다라
			 섆|
			^Z
			계속하려면 아무 키나 누르십시오 . . .
			*/


		}
	}
}