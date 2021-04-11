/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Calendar Ŭ����
=========================================*/

// �� �ǽ� ����
//	  ������ ��������
//	  �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������ Ȯ���Ͽ�
//	  ����� ����ϴ� ���α׷��� �����Ѵ�.
//	  ��, Calendar Ŭ������ Ȱ���Ͽ� ó���Ѵ�.

// ���� ��)
// ���� ��¥ : 2021-3-8 ������
// ��ĥ ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

// =========[Ȯ�ΰ��]=========
// 200�� �� : 2021-xx-xx x����
// ============================
// ����Ϸ��� �ƹ� Ű��...

// �� Ư�� ��¥�� �������� �� ���� ���ϴ� ���� �޼ҵ�
//	  ����¥��ü.add(Calendar.DATE, �� ��)��

import java.util.Scanner;
import java.util.Calendar;

public class Test139
{
	public static void main(String[] arg)
	{
		/*
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		int y, m, d, w, day;

		y=cal.get(Calendar.YEAR);
		m=cal.get(Calendar.MONTH)+1;
		d=cal.get(Calendar.DATE);
		w=cal.get(Calendar.DAY_OF_WEEK);

		String week = "";

		switch (w)
		{
		case 1: week="�Ͽ���"; break;
		case 2: week="������"; break;
		case 3: week="ȭ����"; break;
		case 4: week="������"; break;
		case 5: week="�����"; break;
		case 6: week="�ݿ���"; break;
		case 7: week="�����"; break;
		
		}

		System.out.printf("���� ��¥ : %d-%d-%d %s\n", y, m, d, week);
		
		do
		{
			System.out.print("��ĥ ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			day = sc.nextInt();
		}
		while (day<1);

		cal.add(Calendar.DATE, day);

		y=cal.get(Calendar.YEAR);
		m=cal.get(Calendar.MONTH)+1;
		d=cal.get(Calendar.DATE);
		w=cal.get(Calendar.DAY_OF_WEEK);

		System.out.print("=========[Ȯ�ΰ��]=========\n");
		System.out.printf("%d�� �� : %d-%d-%d %s\n", day, y, m, d, week);
		System.out.print("============================\n");
		*/
		
		// Scanner Ŭ���� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// Calendar Ŭ���� �ν��Ͻ� ����
		Calendar now = Calendar.getInstance();

		// �ֿ� ���� ����
		int nalsu;					//-- ����ڷκ��� �Է¹��� �� ��
		int y, m, d, w;				//-- ��, ��, ��, ����
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};

		// ������ ��, ��, ��, ���� Ȯ��(�������� : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		// ������ ��, ��, ��, ���� Ȯ�ΰ�� ���
		//System.out.println("���� ��¥ : " + y + "-" + m + "-" + d + " " + week[w-1] + "����");
		System.out.printf("���� ��¥ : %tF %tA\n", now, now);
		//--==>> ���� ��¥ : 2021-3-8 ������
		
		do
		{
			System.out.print("��ĥ ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);

		// �� �� ���ϱ� ����
		now.add(Calendar.DATE, nalsu);

		// ��� ���
		System.out.println();
		System.out.println("=========[Ȯ�ΰ��]=========");
		System.out.printf("%d�� �� : %tF %tA\n", nalsu, now, now);
		System.out.println("============================");
		
		// %t�� ��¥ ��ü 
		// %tF(��, ��, ��) , %tA(����) ����
	}
}

/* ���� ���
���� ��¥ : 2021-03-08 ������
��ĥ ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

=========[Ȯ�ΰ��]=========
200�� �� : 2021-09-24 �ݿ���
============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/