/*===========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
  - switch�� �ǽ�
===========================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ���·� ó���Ѵ�.

// ���� ��)
// ù ��° ���� �Է�    : 10
// �� ��° ���� �Է�    : 31
// ������ �Է�(+ - * /) : +

// >> 10 + 31 = 41
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/* ���� Ǯ���� ���

		int a, b;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

		switch (op)
		{
		case +: System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b)); 
		case -: System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b)); 
		case *: System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b)); 
		case /: System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b)); 
		default : System.out.print(
		
		}
		*/

		int a, b, result;
		char op;

		System.out.print("ù ��° ���� �Է�    : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�    : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

		// jdk 1.5�̻���� '' ��밡��
		// jdk 1.7�̻���ʹ� ���ڿ��� ��밡�� case �ڿ�
		switch (op)
		{
		case '+': result = a+b; break;
		case '-': result = a-b; break;
		case '*': result = a*b; break;
		case '/': result = a/b; break;
		default : return;	//-- �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
		// ���� ������� ������ ���� �ʰ� �����ϴ°� return�� �־ ����
		
		}

		// �� ��return�� : 1. ���� ��ȯ
		//				   2. �޼ҵ��� ����

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);



	}
}