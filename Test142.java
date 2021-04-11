/*=========================================
  ■■■ 예외(Exception) 처리 ■■■
=========================================*/

/*
○ 프로그램에서 발생하는 오류(Error)는

   ① 잘못된 문법을 사용하거나 변수 등을 정의하지 않은 상태에서
      사용함으로써 컴파일 단계에서 발생하는 문법적 오류(Error)

   ② 프로그램을 실행하는 과정에서 발생되는 런타임 오류(Error)로 나눌 수 있다.

      - 개발자가 문제 분석을 잘못하거나 실수에 의해
	    엉뚱한 결과를 가져오게 되는 논리적인 오류(Error)와

	  - 시스템 이상에서 발생되는 시스템 오류(Error), 그리고

	  - 프로그램 실행 중 발생되는 비정상적인 상황을 의미하는
	    예외사항(Exception)이 있다.

		예를 들어
		→ 어떤 수를 0으로 나누거나
		→ 배열 첨자를 벗어나는 상황이 발생하거나
		→ 존재하지 않는 파일을 오픈하여 읽어들인다거나

		* 프로그램 실행하면서 발생하는 오류는 설계도에 문제가 있는것
		  우리가 복구할 수 있는거 Exception 우리가 복구할 수 없으면 Error

==> 개발자가 이런 예외 사항이 발생할 경우를 미리 예측하여
    적절히 대응하기 위한 절차를 구현하도록 문법을 정리해놓은 것
	예.외.처.리


※ 정리해 놓은 문법(메뉴얼 같은거 → Exception 클래스)

   - 예외는 프로그램 실행 중 발생할 수 있는
     명령어의 정상적인 흐름을 방해하는 이벤트로
	 자바에서 예외는 하나의 오브젝트(Object, 객체)이다.

   - 프로그램 실행 중에 메소드 안에서 오류(Error)가 발생하게 될 경우,
     메소드는 그 오류에 해당하는 예외 오브젝트를 만들고
	 그것을 자바 런타임 시스템(Runtime System)에 전달해 준다.

   - 자바에서의 모든 예외 클래스는 Throwable 클래스나
     Throwable 클래스의 하위 클래스를 상속받아 사용한다.
	 (자바로 만든 모든 클래스는 Object 클래스를 상속받음 그래서 Object처럼 모든 예외는 Throwalbe 가능함)

   - Throwable 클래스는 예외를 설명하는 문장이나
     예외가 발생할 때의 프로그램의 상태에 관한 정보를 포함하고 있다. 

   - Throwable 클래스에서 파생된 클래스

     ① Exception 클래스
	    Exception 예외 클래스는 일반적으로 프로그래머에 의해
		복원될 수 있는 예외 상황으로 메소드가 실행 중에 던지는 예외를 가리킨다.
	 
	 ② Error 클래스
		심각한 예외의 형태로 개발자가 복원할 수 없는 형태의 예외이다.

※ 예외(Exception)의 종류

   - checked exception (BufferedReader에서 readLine 쓸 때 throws IOException 안쓰면 실행 안되게 했는데 이게 checked exception)
     메소드 내에서 예외가 발생한 경우
	 메소드를 정의할 때 『throws』문에 메소드 내에서 발생할 수 있는
	 예외들을 명시해 주거나 또는, 그 예외를 『try-catch』해서
	 처리해 주어야만 하는 예외이다.
	 컴파일러가 컴파일 하는 과정에서 『checked exception』이
	 『throws』 되는가의 여부나 혹은 『try-catch』되는지의 여부를 판단하여
	 프로그램에서 예외를 처리하지 않으면 컴파일 자체가 불가능하다.

   - unchecked exception
     사전에 처리하지 않아도 컴파일러가 체크하지 않는 런타임 시에 발생하는 예외

○ java.lang.Throwable 클래스의 주요 메소드

   - String toString()		Throwable에서 오버라이딩 했음(이전에 Object에서 가져왔음)
     : Throwable 각각에 대한 설명을 문자열 형태로 반환한다.
   - void printStackTrace(PrintStream s)
   - void printStackTrace(PrintWriter w)
     : 표준 출력 스트림에 스택 호출 목록을 마지막 메소드부터 출력한다.

○ 주요 런타임 예외 클래스

   - ArithmeticException
     : 수치 계산상의 오류(0으로 나누기 등)
   - ArrayStoreException
     : 배열에 잘못된 데이터 형을 저장하려 했을 때 발생하는 오류
   - IndexOutOfBoundsException
     : 배열, 문자열, 벡터 등에서 인덱스 범위가 벗어난 경우 발생하는 오류
   - ClassCastException
     : 클래스 변환을 잘못한 경우 발생하는 오류
   - NullPointerException
     : 빈 객체를 참조하는 경우(초기화 되지 않은 변수 사용 등) 발생하는 오류
   - SecurityException
     : 자바의 내부 보안 사항을 위반하였을 경우 발생하는 오류
	        :
			:
			:
*/

// 컴파일이 안되면 IOException 처리가 안된거 그걸 보고 checked exception이라고함


import java.io.BufferedReader;	
import java.io.InputStreamReader;	
import java.io.IOException;				

public class Test142					   //아무것도 안쓴게 ①
{										   //IOException 예외 처리 방법 ②
	public static void main(String[] args) //throws IOException
	{
		// BufferedReader 클래스 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언
		int a, b, c;


		// 예외처리 방법 ②
		/*		여기서 throws IOException 안써주면 처리가 안돼서 컴파일 에러 발생
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		c = a + b;
		System.out.println("결과 : " + c);
		*/
	

		// 예외처리 방법 ③ - checked exception
		/*
		try		//try 블럭
		{
			System.out.print("첫 번째 정수 입력 : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력 : ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("결과 : " + c);
		}
		catch (IOException e)
		{
			// IOException → checked exception
			// → 메소드 정의하는 과정에서 throws 한 예외
			//	  잡아내거나 던지지 않는 경우 컴파일 에러 발생
			System.out.println(e.toString());
		}
		*/
		

		// 예외처리 방법 ④ -unchecked exception
		/*
		try		//try 블럭
		{
			System.out.print("첫 번째 정수 입력 : ");	// "ABC" 이런건 정수가 아니라서 예외처리해야함
			a = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력 : ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("결과 : " + c);
		}
		catch (IOException e1)
		{
			System.out.println(e1.toString());	//여기서 toString은 IOException에서 받아서 쓰는거
		}
		catch (NumberFormatException e2)
		{	
			// NumberFormatException → unchecked exception
			//-- 런타임 시 발생할 수 있는 예외로
			//	 반드시 던질 필요도, 잡아낼 필요도 없다.
			System.out.println(e2.toString());	//Object의 toString 상속받아서 NumberFormatException에서 받아서 씀
												//여기서 예외처리해주면 숫자형태 입력하라는 구문나오게함
			System.out.println("숫자 형태의 데이터를 입력하세요");
		}
		*/
		

		// 예외처리 방법 ⑤ - 통합해서 처리하는 방법
		/*
		try		//try 블럭
		{
			System.out.print("첫 번째 정수 입력 : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력 : ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("결과 : " + c);
		}
		catch (Exception e)							// 컴파일 됐으면 IOEception에 대한 처리가 된거임..
		{											// 한번에 통합해서 처리한거임
			System.out.println("예외 처리~!!!");	// Exception을 쓰면 IOException 인정을 해줌
			System.out.println(e.toString());		// Excetpion을 쓰면 NumberFormatExcetpion도 인정 해줌
			System.out.println(e.getMessage());
			System.out.println("printStackTrace.....");
			e.printStackTrace();
		}
		*/
		

		// 예외처리 방법 ⑥
		try		//try 블럭
		{
			System.out.print("첫 번째 정수 입력 : ");	// "ABC" 이런건 정수가 아니라서 예외처리해야함
			a = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력 : ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("결과 : " + c);
		}
		catch (IOException e1)
		{
			System.out.println(e1.toString());
		}
		catch (NumberFormatException e2)
		{	
			System.out.println("숫자 형태의 데이터를 입력하세요");
		}
		finally
		{
			// 예외가 발생하거나 발생하지 않거나 언제나 실행되는 영역(원래 예외 발생하면 첫 번째 정수 입력받고 
			// 숫자형태 데이터 입력하라는 구문 나오고 끝남
			System.out.println("고생 많으셨습니다. 감사합니다.");
		}
	}
}