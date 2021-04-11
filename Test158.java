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

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus
{
	public static final int E_ADD=1;		//-- ��� �߰�
	public static final int E_DISP=2;		//-- ��� ���
	public static final int E_FIND=3;		//-- ��� �˻�
	public static final int E_DEL=4;		//-- ��� ����
	public static final int E_CHA=5;		//-- ��� ����
	public static final int E_EXIT=6;		//-- ����
}

public class Test158
{
	// �ֿ� �Ӽ� ����
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;				//-- ���ð�
	private static String con;				//-- ��� ����

	// static �ʱ�ȭ ��
	static
	{
		// Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		// BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}

	// �޴� ��� �޼ҵ�
	public static void menuDisp()		//static ���� ���Ϸ��� �־���
	{
		System.out.println("\n\n\t[ �޴� ���� ]");
		System.out.println("\t1. ��� �߰�");
		System.out.println("\t2. ��� ���");
		System.out.println("\t3. ��� �˻�");
		System.out.println("\t4. ��� ����");
		System.out.println("\t5. ��� ����");
		System.out.println("\t6. ����\n");

		System.out.print("\t>> �޴� ����(1~6) : ");
	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException
	{	
		/* ���� ���Ѱ� �ۼ�
		do
		{
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<Menus.E_ADD sel>menus.E_EXIT);
		do while������ ������ �ؿ� switch������ default�ʿ����
		*/ 

		sel = Integer.parseInt(br.readLine());
	}

	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
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
		default : System.out.println("\t�޴� ���� ����~!!!"); break;
		}
	}

	// ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		/*
		1��° ��� �Է� : ������
		1��° ��� �Է� ����~!!!
		��� �Է� ���(Y/N) : y

		2��° ��� �Է� : �󸶹�
		2��° ��� �Է� ����~!!!
		��� �Է� ���(Y/N) : n
		*/
		
		while (true)
		{
			System.out.printf("\n\t%d��° ��� �Է� : ", (vt.size()+1));
			vt.add(br.readLine());
			System.out.printf("\n\t%d��° ��� �Է� ����~!!!", vt.size());
			System.out.printf("\t��� ��� �Է�(Y/N) : ");
			con = br.readLine();
			if (con.equalsIgnoreCase("Y"))
			{
				//Y&y�� ��� �߰� �Է��ϰ� �ϱ� n�̸� ���߱�
				continue;
			}
			else
				break;
		}

	}

	// ��� ��� �޼ҵ�
	public static void dispElement()
	{
		/*
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
		*/
		
		Iterator it = vt.iterator();		//���� �޼ҵ� �� Iterator�� Iterator�� ��ȯ
		String str;

		while (it.hasNext())			//Iterator�� ���ؼ� ������ ����ϱ�
		{
			str = (String)it.next();	//�ٿ�ĳ�����ؼ� String�� ����ֱ�
			System.out.print(str + " ");
		}
		System.out.println();

		/*
		System.out.print("[���� ��ü ���");
		for (String s : vt)
		{
			System.out.println("    " + s);
		}
		System.out.println("���� ��ü ��� �Ϸ�~!!!");
		*/
		
	}

	// ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		/*
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
		*/


		/*
		boolean tf;

		while (true)
		{
			System.out.print("�˻��� ��� �Է� : ");
			vt.contains(br.readLine());
			System.out.println("\n[�˻� ��� ���]");
			if (tf)
			{
				System.out.println("�׸��� �����մϴ�.\n");
			}
			else
				System.out.println("�׸��� �������� �ʽ��ϴ�.\n");
		}
		*/
	}

	// ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		/*
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
		*/

		boolean tf;

		System.out.print("������ ��� �Է� : ");
		String s = br.readLine();
		tf = vt.contains(s);

		System.out.print("\n[���� ��� ���]");
		if (tf)
		{
			vt.removes(s);
			System.out.print("������ �Ϸ�Ǿ����ϴ�.\n");
		}
		else
			System.out.print("�׸��� �������� �ʾ� ������ �� �����ϴ�.");
		
	}

	// ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		/*
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
		*/
		
		//vt.set(������, ��������);
		
		int n;

		System.out.print("������ ��� �Է� : ");
		n = vt.indexOf(br.readLine());
		System.out.print("������ ���� �Է� : ");
		vt.set(n, br.readLine());

		System.out.println("\n[���� ��� ���]");
		System.out.println("\n������ �Ϸ�Ǿ����ϴ�.");

	}

	// ���α׷� ���� �޼ҵ�
	public static void exit()
	{
		System.out.println("\n\t���α׷� ����");
		System.exit(-1);		//���α׷� ��ü����
		//�ٸ� ����� �־��ָ� ���� ����� �޴������ϰ� �� �����̶� �򰥷��� -1����� ��ӵǾ�����
	}

	// main() �޼ҵ�
	public static void main(String[] args) throws IOException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);		//���ѷ���
	}
}