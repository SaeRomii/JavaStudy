/*=======================================
  ■■■ 자바의 기본 입출력(I/O) ■■■
=======================================*/

// Reader writer 실습

import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.Reader;

public class Test170
{
	public void process(InputStream is)		//바이트 기반 입력 스트림 매개변수로 받음
	{
		int data;

		System.out.println("문자열 입력(종료:Ctrl+z)");

		try
		{
			// 매개변수 is 라는 바이트 기반의 입력 스트림 객체(InputStream)를 
			// 문자 스트림으로 변환하여 Reader 타입의 rd에서 참조할 수 있도록 처리
			Reader rd = new InputStreamReader(is);		// rd는 문자 기반 스트림
			
			// 바이트 기반 스트림인 자바 기본 출력 스트림 객체(OutputStream - System.out)를
			// 문자 스트림으로 변환하여 Writer 타입의 wt에서 참조할 수 있도록 처리
			Writer wt = new OutputStreamWriter(System.out);

			while ((data=rd.read()) != -1)
			{
				wt.write(data);		//-- 문자 기반 스트림에서 write 사용(wt는 물줄기 write는 수제비 같은거)
				wt.flush();			//-- 기록한 스트림을 밀어내어 내보냄 (주사기 피스톤)
			}
		}
		catch (IOException e)		//IOException 발생했을때 
		{
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args)
	{
		Test170 ob = new Test170();
		ob.process(System.in);			//바이트 기반 입력 변수 매개변수로 넘김
	}
}

/* 실행 결과
문자열 입력(종료:Ctrl+z)
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
