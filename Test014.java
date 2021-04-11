/*=============================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 변수와 자료형
  - 자바의 기본 입출력
==============================================*/

// 사용자로부터 이름과 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입력하세요 : 박나현
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70

// ====[결과]====
// 이름 : 박나현
// 총점 : 240
// ==============
// 계속하려면 아무 키나 누르세요...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

// 위에 세 줄 다 써도 되지만 import java.io.*;도 가능함

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor;
		int eng;
		int math;

		System.out.print(" 이름을 입력하세요 : ");
		name = br.readLine();

		System.out.print(" \n국어 점수 입력 : ");

		kor = Integer.parseInt(br.readLine());

		System.out.print(" 영어 점수 입력 : ");

		eng = Integer.parseInt(br.readLine());

		System.out.print(" 수학 점수 입력 : ");

		math = Integer.parseInt(br.readLine());

		int sum;

		sum = kor + eng + math;

		System.out.println("====[결과]====");
		System.out.println(" 이름 : " + name);
		System.out.println(" 총점 : " + sum);
		System.out.println("==============");
		*/
		

		// InputStreamReader 인스턴스 생성 + BufferedReader 인스턴스 생성
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);                 //두줄로 표현한 구문

		// 주요 변수 선언
		String strName;			     //-- 이름 변수
		int nKor, nEng, nMat, nTot;	 //-- 국어, 영어, 수학, 총점 변수

		// 추가 변수 선언
		String strTemp;				 //-- 문자열 데이터 임시 저장 변수


		// 연산 및 처리
		// ·사용자에게 안내 메세지 출력(이름 입력 안내)
		System.out.print("이름을 입력하세요 : ");

		// ·사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strName = br.readLine();

		// ·사용자에게 안내 메세지 출력(국어점수 입력 안내)
		System.out.print(" 국어 점수 입력 : ");

		// ·사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();				//-- 문자열 임시 저장
		nKor = Integer.parseInt(strTemp);		//-- 임시저장 데이터 형 변환 후
												//	 국어점수 변수에 담아내기

		// · 사용자에게 안내 메세지 출력(영어점수 입력 안내)
		System.out.print(" 영어 점수 입력 : ");

		// · 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();				//-- 문자열 임시 저장
		nEng = Integer.parseInt(strTemp);		//-- 임시저장 데이터 형 변환 후
												//   영어점수 변수에 담아내기
		// · 사용자에게 안내 메세지 출력(수학점수 입력 안내)
		System.out.print(" 수학 점수 입력 : ");
		
		// · 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();				//-- 문자열 임시 저장
		nMat = Integer.parseInt(strTemp);		//-- 임시저장 데이터 형 변환 후
												//   수학점수 변수에 담아내기

		// · 입력된 데이터들(nKor, nEng, nMat)을 종합하여 총점 산출하기
		nTot = nKor + nEng + nMat;


		// 결과 출력
		//System.out.println();		// 개행
		System.out.println("====[결과]====");
		System.out.println("이름 : " + strName);
		System.out.println("총점 : " + nTot);
		System.out.println("==============");


	}
}

/* 실행 결과
이름을 입력하세요 : 이새롬
 국어 점수 입력 : 50
 영어 점수 입력 : 60
 수학 점수 입력 : 70
====[결과]====
이름 : 이새롬
총점 : 180
==============
계속하려면 아무 키나 누르십시오 . . .
*/