/*=====================================
  ���� Ŭ���� ��� ����
  - ���(Inheritance)
=====================================*/

// �� �ǽ� ����
//	  ������ ���� ���α׷��� �����Ѵ�.
//	  ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15
// ������ �Է�(+ - * /) : -
// >> 20 - 15 = 5
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class AClass
{
	protected int x, y;
	protected char op;

	AClass()
	{
		
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

class BClass extends AClass
{
	/*
	private int a, b;

	BClass()
	{
		super();
	}


	public void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		super.x = sc.nextInt();
		super.y = sc.nextInt();

		System.out.print("������ �Է�(+ - * /) : ");
		super.op = (char)System.in.read();

	}

	public void cal()
	{
		double result =0;

		this.a=a;
		this.b=b;

		if (super.op=='+')
		{
			result=a+b;
		}
		else if (super.op=='-')
		{
			result=a-b;
		}
		else if (super.op=='*')
		{
			result=a*b;
		}
		else if (super.op=='/')
		{
			result=a/b;
		}

		write(result);
		
	}
	*/

	BClass()
	{
		
	}

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		String temp = br.readLine();
		String[] str = temp.split("\\s");	// ������ �� ����
		// �� ���ڿ�.split("������");
		//	  ex) "��� ���� �ٳ��� ���� ����".split(����);
		//		   ��ȯ �� �迭 �� {"���", "����", "�ٳ���", "����", "����"}
		//	  ex) "1 23 456 7".split(����);
		//		   ��ȯ �� �迭 �� {"1", "23", "456", "7"}

		//==>> String[] str = {"20", "15"};

		if (str.length!=2)
		{
			return false;	// ���� ��ȯ �� false �׸��� �޼ҵ� ����
		}					// false(����)�� ��ȯ�ϸ� �޼ҵ� ����

		// �� �� ���ǹ��� ������ ��� �Ʒ��� �ڵ尡 �����ִ� ��Ȳ�̴���
		//	  �� �̻� �������� �ʰ� ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.

		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

		/*
		if (op!='+' && op!='-' && op!='*' && op!='/')	//���� ��������
		{
			return false;
		}
		return true;
		*/

		if (op=='+' || op=='-' || op=='*' || op=='/')
		{
			return true;
		}
		return false;
	}// end input()

	double calc()
	{
		double result = 0;

		switch (op)
		{
		case '+': result=x+y; break;
		case '-': result=x-y; break;
		case '*': result=x*y; break;
		case '/': result=(double)x/y; break;
		}
		return result;
	}

	
}

// main()�޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test108
{
	public static void main(String[] args) throws IOException
	{
		BClass ob = new BClass();

		if (!ob.input())		//���� void�� �߾ ob.input�ϸ� �Ǵµ� ������ boolean input�ؼ� if���ǹ�����
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();
		ob.write(result);
	}
}

/* ���� ���
������ �� ���� �Է�(���� ����) : 20 15
������ �Է�(+ - * /) : -
>> 20 - 15 = 5.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/