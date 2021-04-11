/*===================================
  ���� �÷��� (Collection) ����
===================================*/

// �� �ǽ� ����
//	  ���� �ۼ����� Test158 Ŭ������ �ϼ��Ͽ�
//	  ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 1

	1��° ��� �Է� : ������
	1��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N) : y

	2��° ��� �Է� : �󸶹�
	2��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N) : n

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 2

	[���� ��ü ���]
		������
		�󸶹�
	���� ��ü ��� �Ϸ�~!!!

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է� : ������

	[�˻� ��� ���]
	�׸��� �����մϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : Ÿ����

	[���� ��� ���]
	�׸��� �������� �ʾ� ������ �� �����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : �󸶹�
	������ ���� �Է� : ������

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 6

	���α׷� ����
	����Ϸ��� �ƹ� Ű��...
*/

import java.util.Scanner;
import java.io.IOException;
import java.util.Vector;

class Data
{	
	Vector<Data> v = new Vector<Data>();

	public void start()
	{
		Scanner sc = new Scanner(System.in);
		int n;
		do
		{
			System.out.println("[�޴� ����]");
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ���");
			System.out.println("3. ��� �˻�");
			System.out.println("4. ��� ����");
			System.out.println("5. ��� ����");
			System.out.println("6. ����     ");
			System.out.print(">>�޴� ����(1~6) : ");
			n = sc.nextInt();
			System.out.println();
		}
		while (n<1 || n>6);

		switch (n)
		{
		case 1:add(); break;
		case 2:print(); break;
		case 3:search(); break;
		case 4:remove(); break;
		case 5:alter(); break;
		case 6:System.out.println("���α׷� ����"); return;
		
		}
	}

	public void add()
	{
		int idx = v.size()+1;
		char op;

		while (true)
		{
			System.out.print(idx + "��° ��� �Է� : ");
			v.add(sc.next());
			System.out.println(idx + "��° ��� �Է� ����~!!!")
			idx++;

			try
			{
				System.out.print("��� �Է� ���(Y/N) : ");
				op = (char)System.in.read();
				System.out.println();
				if (op!='Y' || op!='y')
				{
					break;
				}
			}
			catch (IOException e)
			{
				System.out.println("���� �Է� ����!");
			}
		}
		start();
	}

	public void print()	//��ü ���
	{
		System.out.println("[���� ��ü ���]");
		for (String s : v)
		{
			System.out.println("     " + s);
		}
		System.out.println("���� ��ü ��� �Ϸ�~!!!");
		start();
	}

	public void search()
	{
		Scanner sc = new Scanner;
		boolean tf;

		System.out.print("�˻��� ��� �Է� : ")
		tf = v.contains(sc.next());

		System.out.println("\n[�˻� ��� ���");
		if (tf)
		{
			System.out.println("�׸��� �����մϴ�.\n");
		}
		else
			System.out.println("�׸��� �������� �ʽ��ϴ�.\n");
		start();
	}

	public void remove()
	{
		Scanner sc = new Scanner(System.in);
		boolean tf;

		System.out.print("������ ��� �Է� : ");
		String s = sc.next();
		tf = v.contains(s);

		System.out.println("\n[���� ��� ���]");
		if (tf)
		{
			v.remove(s);
			System.out.println("���������� ������ �Ϸ�Ǿ����ϴ�.\n");
		}
		else
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.\n");
		start();
	}

	public void alter()
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("������ ��� �Է� : ");
		n = v.indexOf(sc.next());
		System.out.print("������ ��� �Է� : ");
		v.set(n, sc.next());
		System.out.println("\n[���� ��� ���]");
		System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
		start();
	}

}

public class Test158_1
{
	public static void main(String[] args) throws IOException
	{
		Data ob = new Data();
	}
}