/*===================================
  ■■■ 컬렉션 (Collection) ■■■
===================================*/

import java.util.Queue;
import java.util.LinkedList;		//Queue의 하위객체
		
public class Test152
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};

	public static void main(String[] args)
	{
		// Queue 자료구조 생성
		Queue<String> qu = new LinkedList<String>();

		// qu 라는 해당 자료구조(Queue)에 colors 데이터 입력 → offer()
		/* 내가 풀었던 방식
		for (String color : colors)
		{
			qu.add(color);
		}
		*/
		for (String color : colors)
		{
			qu.offer(color);
		}
		

		// 해당 자료구조의 모든 데이터 출력
		while (qu.peek()!=null)		//null이 아니면 채워지면
		{
			System.out.print(qu.poll() + " ");
		}
		System.out.println();
		//--==>> 검정 노랑 초록 파랑 빨강 연두
	}
}