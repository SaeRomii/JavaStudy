/*=======================================
  ���� Ŭ������ �ν��Ͻ� ����
  - Ŭ���� ���� ���� �� Ŭ���� ���� �ǽ�
=======================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// ��Ģ ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 30 15
// ������ ������ �Է�(+ - * /)    : +
// >> 30 + 15 = 45
// ����Ϸ��� �ƹ� Ű��....


import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// �� �ֿ� �Ӽ� ����
	int su1, su2;
	char op;

	void input() throws IOException								// ���Ƿ� �Է� �����Ŷ� �Ű����� �ʿ����
																// System.in.read()������ throws IOException �����
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		System.out.print("������ ������ �Է�(+ - * /)    : ");
		op = (char)System.in.read();
	}

	int cal()
	{
		int result=0;
		
		/* ���� Ǯ���� ���
		if (ch=='+')
			result=su1+su2;
		else if (ch=='-')
			result=su1-su2;
		else if (ch=='*')
			result=su1*su2;
		else if (ch=='/')
			result=su1/su2;
		else
		*/
		
		switch (op)
		{
		case '+': result=su1+su2; break;
		case '-': result=su1-su2; break;
		case '*': result=su1*su2; break;
		case '/': result=su1/su2; break;
		
		}

		return result;
	}

	void print(int r)
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, r);
	}

	
}

//main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test073
{
	public static void main(String[] args) throws IOException
	{
		//Calculate Ŭ���� ����� �ν��Ͻ� ����
		Calculate ob = new Calculate();

		//������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		ob.input();
		
		// ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		int result = ob.cal();
		ob.print(result);
	}
}

/* ���� ���
������ �� ���� �Է�(���� ����) : 30 15
������ ������ �Է�(+ - * /)    : +
>> 30 + 15 = 45
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/