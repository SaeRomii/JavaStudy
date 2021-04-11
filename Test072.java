/*=======================================
  ���� Ŭ������ �ν��Ͻ� ����
  - Ŭ���� ���� ���� �� Ŭ���� ���� �ǽ�
=======================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �� ������ ���� �����Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �Է� ó�� �������� BufferedReader �� readLine() �� ����ϸ�,
// �Է¹��� �����Ͱ� 1���� �۰ų� 1000���� ū ���
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~1000) : 1002
// ������ ���� �Է�(1~1000) : -20
// ������ ���� �Է�(1~1000) : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	int a;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			a = Integer.parseInt(br.readLine());
		}
		while (a<1 || a>1000);									//�� ���ǿ� ���� ������ ���� ���� a = Integer~
	}

	int calResult()
	{
		int sum=0;

		for (int i=0; i<=a; i++)
		{
			sum+=i;
		}

		return sum;
	}

	void print(int b)
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n", a, b);
	}

	
}

public class Test072
{
	public static void main(String[] args) throws IOException
	{
		Hap ob = new Hap();
		ob.input();						// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��~!!! �� throws IOException ó��

		int a = ob.calResult();			// ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��~!!! �� int�� ����� ��ȯ �� �޾Ƴ� �� �ִ� ó��

		ob.print(a);					// ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��~!!! �� �Ű����� ����
		

	}
}

/* ���� ���
������ ���� �Է�(1~1000) : -5
������ ���� �Է�(1~1000) : 2000
������ ���� �Է�(1~1000) : 500
>> 1 ~ 500 ������ �� : 125250
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/