/*=============================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - ������ �ڷ���
  - �ڹ��� �⺻ �����
==============================================*/

// ����ڷκ��� �̸��� ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : �ڳ���
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70

// ====[���]====
// �̸� : �ڳ���
// ���� : 240
// ==============
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

// ���� �� �� �� �ᵵ ������ import java.io.*;�� ������

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor;
		int eng;
		int math;

		System.out.print(" �̸��� �Է��ϼ��� : ");
		name = br.readLine();

		System.out.print(" \n���� ���� �Է� : ");

		kor = Integer.parseInt(br.readLine());

		System.out.print(" ���� ���� �Է� : ");

		eng = Integer.parseInt(br.readLine());

		System.out.print(" ���� ���� �Է� : ");

		math = Integer.parseInt(br.readLine());

		int sum;

		sum = kor + eng + math;

		System.out.println("====[���]====");
		System.out.println(" �̸� : " + name);
		System.out.println(" ���� : " + sum);
		System.out.println("==============");
		*/
		

		// InputStreamReader �ν��Ͻ� ���� + BufferedReader �ν��Ͻ� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);                 //���ٷ� ǥ���� ����

		// �ֿ� ���� ����
		String strName;			     //-- �̸� ����
		int nKor, nEng, nMat, nTot;	 //-- ����, ����, ����, ���� ����

		// �߰� ���� ����
		String strTemp;				 //-- ���ڿ� ������ �ӽ� ���� ����


		// ���� �� ó��
		// ������ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸��� �Է��ϼ��� : ");

		// ������ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strName = br.readLine();

		// ������ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
		System.out.print(" ���� ���� �Է� : ");

		// ������ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();				//-- ���ڿ� �ӽ� ����
		nKor = Integer.parseInt(strTemp);		//-- �ӽ����� ������ �� ��ȯ ��
												//	 �������� ������ ��Ƴ���

		// �� ����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
		System.out.print(" ���� ���� �Է� : ");

		// �� ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();				//-- ���ڿ� �ӽ� ����
		nEng = Integer.parseInt(strTemp);		//-- �ӽ����� ������ �� ��ȯ ��
												//   �������� ������ ��Ƴ���
		// �� ����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
		System.out.print(" ���� ���� �Է� : ");
		
		// �� ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();				//-- ���ڿ� �ӽ� ����
		nMat = Integer.parseInt(strTemp);		//-- �ӽ����� ������ �� ��ȯ ��
												//   �������� ������ ��Ƴ���

		// �� �Էµ� �����͵�(nKor, nEng, nMat)�� �����Ͽ� ���� �����ϱ�
		nTot = nKor + nEng + nMat;


		// ��� ���
		//System.out.println();		// ����
		System.out.println("====[���]====");
		System.out.println("�̸� : " + strName);
		System.out.println("���� : " + nTot);
		System.out.println("==============");


	}
}

/* ���� ���
�̸��� �Է��ϼ��� : �̻���
 ���� ���� �Է� : 50
 ���� ���� �Է� : 60
 ���� ���� �Է� : 70
====[���]====
�̸� : �̻���
���� : 180
==============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/