/*===========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
  - switch�� �ǽ�
===========================================*/

// 1���� 3������ ���� �� �ϳ��� ����ڷκ��� �Է¹޾�
// �Է¹��� ������ŭ ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// ��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

// switch ���� �Ϲ� ���� �ҿ��Ѵ�. break�� ����
// switch ���� �⺻ ���� Ȱ���Ѵ�. break�� ���� �ʴ°�
// ��break���� �� �� ���� ����� �� �ֵ��� �Ѵ�. �⺻�𵨿��� �Է� ���� ���� ������ �Ҷ� ����

// ���� ��)
// ������ ���� �Է�(1~3) : 3
// �ڡڡ�
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է�(1~3) : 1
// ��
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է�(1~3) : 7
// �Է� ����
// ����Ϸ��� �ƹ� Ű��...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;
		String star = "";

		System.out.print("������ ���� �Է�(1~3) : ");
		a = Integer.parseInt(br.readLine());

		/* ���� Ǯ���� ���

		switch (a)   a�� �Է� ���� ����~
		{
		case 1: star = "��"; break;
		case 2: star = "�ڡ�"; break;
		case 3: star = "�ڡڡ�"; break;
		default : 
			System.out.println("�Է� ����");
		
		}
		System.out.println(star);

		switch (a)
		{
		default : 
			System.out.print("�Է� ����"); break;

		case 1 : 
		
		}
		*/

		/* �Ϲݸ�

		switch (a)
		{
		case 1: System.out.println("��"); break;
		case 2: System.out.println("�ڡ�"); break;
		case 3: System.out.println("�ڡڡ�"); break;
		default : System.out.println("�Է� ����"); //break;
		
		}
		*/

		// �⺻��
		switch (a)
		{
			//default : System.out.print("�Է� ����");
			//			break;							 �̷��� �ۼ��ص���

		case 3: System.out.print("��");
		case 2: System.out.print("��");
		case 1: System.out.print("��"); break;

		default : System.out.println("�Է� ����");
		}
		System.out.println();



	}
}