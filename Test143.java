/*=========================================
  ■■■ 예외(Exception) 처리 ■■■
=========================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test143
{
	private String[] data = new String[3];

	public void proc() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n=0;

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
	public static void main(String[] args) throws IOException
	{
		Test143 ob = new Test143();
		ob.proc();	//proc이라는 메소드 불러온거라 위에서 throws IOException 예외처리해줘서 메인메소드에서도
					//해줘야함
	}
}