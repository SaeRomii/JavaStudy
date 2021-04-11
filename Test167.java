/*=======================================
  ■■■ 자바의 기본 입출력(I/O) ■■■
=======================================*/

// OutputStream 실습

import java.io.OutputStream;
import java.io.IOException;

public class Test167
{
	public static void main(String[] args) throws IOException
	{
		// System.in	: 자바의 표준 입력 스트림 (객체)
		// System.out	: 자바의 표준 출력 스트림 (객체)
		OutputStream out = System.out;

		// 배열 구성
		byte[] ch = new byte[3];
		ch[0] = 65;		// A
		ch[1] = 97;		// a
		ch[2] = 122;	// z

		out.write(ch);		//-- 밖으로 내보낼 변수를 스트림에 기록(수도꼭지 물 틀때 ch를 순서대로 물줄기에 태움)

		//out.flush();		//Buffer 있을때 사용
							//-- 기록된 스트림을 내보내는 기능을 수행
							//	 지금은 Buffer를 활용하지 않고 있는 상황이기 때문에
							//	 생략이 가능한 코드
							//	 즉, 사용하지 않아도 출력에 지장이 없는 코드
							//	(하지만, Buffered 되어 있는 Stream 일 경우 생략 불가)

		out.close();		//-- 출력 스트림(물줄기)에 대한 리소스 반납
							//	 (out 스트림을(수도꼭지를) 잠가버린 상황)

		System.out.println("절대적인 신뢰도를 갖고 있는 구문");
	}
}