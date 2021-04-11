/*===================================
  ■■■ 컬렉션 (Collection) ■■■
===================================*/

// ○ 실습 문제
//	  현재 작성중인 Test158 클래스를 완성하여
//	  다음 기능을 가진 프로그램을 구현한다.

/*
실행 예

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 1

	1번째 요소 입력 : 가나다
	1번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N) : y

	2번째 요소 입력 : 라마바
	2번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N) : n

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 2

	[벡터 전체 출력]
		가나다
		라마바
	벡터 전체 출력 완료~!!!

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력 : 가나다

	[검색 결과 출력]
	항목이 존재합니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력 : 타파하

	[삭제 결과 출력]
	항목이 존재하지 않아 삭제할 수 없습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 5

	변경할 대상 입력 : 라마바
	수정할 내용 입력 : 가마바

	[변경 결과 출력]
	변경이 완료되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 6

	프로그램 종료
	계속하려면 아무 키나...
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus
{
	public static final int E_ADD=1;		//-- 요소 추가
	public static final int E_DISP=2;		//-- 요소 출력
	public static final int E_FIND=3;		//-- 요소 검색
	public static final int E_DEL=4;		//-- 요소 삭제
	public static final int E_CHA=5;		//-- 요소 변경
	public static final int E_EXIT=6;		//-- 종료
}

public class Test158
{
	// 주요 속성 구성
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;				//-- 선택값
	private static String con;				//-- 계속 여부

	// static 초기화 블럭
	static
	{
		// Vector 자료구조 생성
		vt = new Vector<Object>();

		// BufferedReader 클래스 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}

	// 메뉴 출력 메소드
	public static void menuDisp()		//static 보기 편하려고 넣어줌
	{
		System.out.println("\n\n\t[ 메뉴 선택 ]");
		System.out.println("\t1. 요소 추가");
		System.out.println("\t2. 요소 출력");
		System.out.println("\t3. 요소 검색");
		System.out.println("\t4. 요소 삭제");
		System.out.println("\t5. 요소 변경");
		System.out.println("\t6. 종료\n");

		System.out.print("\t>> 메뉴 선택(1~6) : ");
	}

	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException
	{	
		/* 둘중 편한거 작성
		do
		{
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<Menus.E_ADD sel>menus.E_EXIT);
		do while문으로 썼으면 밑에 switch문에서 default필요없음
		*/ 

		sel = Integer.parseInt(br.readLine());
	}

	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun()
	{
		switch (sel)
		{
		case Menus.E_ADD : addElement(); break;
		case Menus.E_DISP : dispElement(); break;
		case Menus.E_FIND : findElement(); break;
		case Menus.E_DEL : delElement(); break;
		case Menus.E_CHA : chaElement(); break;
		case Menus.E_EXIT : exit(); break;
		default : System.out.println("\t메뉴 선택 오류~!!!"); break;
		}
	}

	// 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		/*
		1번째 요소 입력 : 가나다
		1번째 요소 입력 성공~!!!
		요소 입력 계속(Y/N) : y

		2번째 요소 입력 : 라마바
		2번째 요소 입력 성공~!!!
		요소 입력 계속(Y/N) : n
		*/
		
		while (true)
		{
			System.out.printf("\n\t%d번째 요소 입력 : ", (vt.size()+1));
			vt.add(br.readLine());
			System.out.printf("\n\t%d번째 요소 입력 성공~!!!", vt.size());
			System.out.printf("\t요소 계속 입력(Y/N) : ");
			con = br.readLine();
			if (con.equalsIgnoreCase("Y"))
			{
				//Y&y면 요소 추가 입력하게 하기 n이면 멈추기
				continue;
			}
			else
				break;
		}

	}

	// 요소 출력 메소드
	public static void dispElement()
	{
		/*
		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 2

		[벡터 전체 출력]
			가나다
			라마바
		벡터 전체 출력 완료~!!!
		*/
		
		Iterator it = vt.iterator();		//벡터 메소드 중 Iterator를 Iterator로 반환
		String str;

		while (it.hasNext())			//Iterator를 통해서 데이터 출력하기
		{
			str = (String)it.next();	//다운캐스팅해서 String에 담아주기
			System.out.print(str + " ");
		}
		System.out.println();

		/*
		System.out.print("[벡터 전체 출력");
		for (String s : vt)
		{
			System.out.println("    " + s);
		}
		System.out.println("벡터 전체 출력 완료~!!!");
		*/
		
	}

	// 요소 검색 메소드
	public static void findElement() throws IOException
	{
		/*
		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 3

		검색할 요소 입력 : 가나다

		[검색 결과 출력]
		항목이 존재합니다.
		*/


		/*
		boolean tf;

		while (true)
		{
			System.out.print("검색할 요소 입력 : ");
			vt.contains(br.readLine());
			System.out.println("\n[검색 결과 출력]");
			if (tf)
			{
				System.out.println("항목이 존재합니다.\n");
			}
			else
				System.out.println("항목이 존재하지 않습니다.\n");
		}
		*/
	}

	// 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		/*
		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 4

		삭제할 요소 입력 : 타파하

		[삭제 결과 출력]
		항목이 존재하지 않아 삭제할 수 없습니다.
		*/

		boolean tf;

		System.out.print("삭제할 요소 입력 : ");
		String s = br.readLine();
		tf = vt.contains(s);

		System.out.print("\n[삭제 결과 출력]");
		if (tf)
		{
			vt.removes(s);
			System.out.print("삭제가 완료되었습니다.\n");
		}
		else
			System.out.print("항목이 존재하지 않아 삭제할 수 없습니다.");
		
	}

	// 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		/*
		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 5

		변경할 대상 입력 : 라마바
		수정할 내용 입력 : 가마바

		[변경 결과 출력]
		변경이 완료되었습니다.
		*/
		
		//vt.set(변경대상, 수정내용);
		
		int n;

		System.out.print("변경할 대상 입력 : ");
		n = vt.indexOf(br.readLine());
		System.out.print("수정할 내용 입력 : ");
		vt.set(n, br.readLine());

		System.out.println("\n[변경 결과 출력]");
		System.out.println("\n변경이 완료되었습니다.");

	}

	// 프로그램 종료 메소드
	public static void exit()
	{
		System.out.println("\n\t프로그램 종료");
		System.exit(-1);		//프로그램 전체종료
		//다른 상수값 넣어주면 위에 상수로 메뉴선택하게 한 내용이랑 헷갈려서 -1쓰기로 약속되어있음
	}

	// main() 메소드
	public static void main(String[] args) throws IOException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);		//무한루프
	}
}