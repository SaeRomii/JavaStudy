/*=========================================
  ■■■ 예외(Exception) 처리 ■■■
=========================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test144
{
	private String[] data = new String[3];

	public void proc() // throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n=0;

		try		//try catch 문 써서 던져서 나온게 아님
		{
			System.out.print("이름 입력[종료:Ctrl+z] : ");

			while ((str=br.readLine()) != null)
			{
				data[n++]=str;
				System.out.print("이름 입력[종료:Ctrl+z] : ");	//Ctrl+z누르면 null이라서 while문 빠져나감
			}

			System.out.println("입력된 내용...");
			for (String s : data)
			{
				if (s != null)	//null이 아니면 배열에 입력해둔거 출력해줌
				{
					System.out.println(s);
				}
			}
		}
		catch (IOException e1)
		{
			System.out.println(e1.toString());
		}
		catch (ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("예외 발생~!!!");
			System.out.println("getMessage : " + e2.getMessage());
			System.out.println("toString   : " + e2.toString());
			System.out.println("printStackTrace......");
			e2.printStackTrace();
		}

		
	}
	public static void main(String[] args) //throws IOException
	{
		Test144 ob = new Test144();
		ob.proc();	// 위에서 try catch문으로 예외처리해줘서 IOException 처리가 됐음 → 컴파일 에러안남
	}
}