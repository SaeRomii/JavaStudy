/*===========================
  ���� �迭(array) ����
  - �迭�� ����� �ʱ�ȭ
  - �迭�� �⺻���� Ȱ��
============================*/

// �� �ǽ� ����
// ����ڷκ��� �ο� ���� �Է¹ް�
// �̷��� �Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹޾�
// �Է¹��� ������ ��ü ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �Է� ó���� �л� �� �Է�(��, 1~10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : �̻��� 010-1111-1111
// �̸� ��ȭ��ȣ �Է�[2](���� ����) : ���ذ� 010-2222-2222
// �̸� ��ȭ��ȣ �Է�[3](���� ����) : ������ 010-3333-3333

// ---------------------
// ��ü �л� �� : 3��
// ---------------------
//   �̸�     ��ȭ��ȣ
// �̻��� 010-1111-1111
// ���ذ� 010-2222-2222
// ������ 010-3333-3333

// int[] arr = new int[����];
import java.io.IOException;
import java.util.Scanner;

public class Test083
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);

		/*
		int n;								// �Է¹��� ����

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			n = sc.nextInt();
		}
		while (n<1 || n>10);

		String[] name = new String[n];
		String[] tel = new String[n];

		for (int i=0; i<n; i++)
		{
			System.out.print("�̸� ��ȭ��ȣ �Է�[" + (i+1) + "](���� ����) : ");
			name[i] = sc.next();
			tel[i] = sc.next();
		}


		System.out.println("---------------------");
		System.out.println("��ü �л� �� : " + n);
		System.out.println("---------------------");
		System.out.println("  �̸�     ��ȭ��ȣ  ");

		for (int i=0; i<n; i++)
		{
			System.out.printf("%4s %14s\n ", name[i], tel[i]);
		}
		System.out.println();
		*/

		int memCount = 0;
		
		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			memCount = sc.nextInt();
		}
		while (memCount<1 || memCount>10);		// memCount�� 1���� �۰ų� memCount�� 10���� Ŭ ��� ���� ����

		// �׽�Ʈ
		//System.out.println("����ڰ� �Է��� �ο� �� : " + memCount);

		// �̸� ���� �迭 ���� �� �Է¹��� �ο� �� ��ŭ�� �迭�� ����
		String[] names = new String[memCount];		//������ �Է¹��� ������ memCount��~!
		
		// ��ȭ��ȣ ���� �迭 ���� �� �Է¹��� �ο� �� ��ŭ�� �迭�� ����
		String[] tels = new String[memCount];		// String[] tels = new String[names.length]; 
		//010 ���� �Ǿ� 0�̸� String�ؾ��� int�ϸ� 0 ������

		// �ݺ����� Ȱ���Ͽ� ������� �Է� �����͸� �迭�� ��Ƴ���
		for (int n=0; n<memCount; n++)				// n<memCount, n<names.length, n<tels.length �� �� ��
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ���� : ", (n+1));
			// �̻��� 010-1111-1111
			names[n] = sc.next();
			tels[n] = sc.next();
		}

		// ���� ���(�̸�, ��ȭ��ȣ) �Է�
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("��ü �л� �� : %d��\n", memCount);
		System.out.println("---------------------");
		System.out.println("  �̸�     ��ȭ��ȣ  ");

		for (int m=0; m<memCount; m++)
			System.out.printf("%3s %14s\n", names[m], tels[m]);

		System.out.println("---------------------");
	}
}

/* ���� ���
�Է� ó���� �л� �� �Է�(��, 1~10) : 4
�̸� ��ȭ��ȣ �Է�[1](���� ���� : �谡�� 010-1111-1111
�̸� ��ȭ��ȣ �Է�[2](���� ���� : ������ 010-2222-2222
�̸� ��ȭ��ȣ �Է�[3](���� ���� : ������ 010-3333-3333
�̸� ��ȭ��ȣ �Է�[4](���� ���� : ������ 010-4444-4444

---------------------
��ü �л� �� : 4��
---------------------
  �̸�     ��ȭ��ȣ
�谡��  010-1111-1111
������  010-2222-2222
������  010-3333-3333
������  010-4444-4444
---------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/