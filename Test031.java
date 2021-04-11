/*===========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
  - if�� �ǽ�
===========================================*/

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �����Ѵ�.
// ��, BufferedReader �� readLine() �� ���� �Է¹��� �� �ֵ��� �ϸ�,
// printf() �� ���� ����� �� �ֵ��� �Ѵ�.

// ���� ��)
// �̸� �Է� : ������
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� �������Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80�Դϴ�.
// >> ����� B �Դϴ�.
// ����Ϸ��� �ƹ� Ű��...

// �� �� ��, ����� ��� ������ �������� ó���Ѵ�.
// 90�� �̻�             : A
// 80�� �̻� ~ 90�� �̸� : B
// 70�� �̻� ~ 80�� �̸� : C	
// 60�� �̻� ~ 70�� �̸� : D
// 60�� �̸�             : F

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;			//-- �̸�
		int kor, eng, mat;		//-- ����, ����, ����
		int tot;				//-- ����
		double avg;				//-- ���
		char grade = 'F';		//-- ���
		//char grade;


		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());

		// ���� ����
		tot = kor + eng + mat;

		// ��� ����
		avg = tot / 3.0;

		// ��� ����
		if (avg >= 90)		// 90�� �̻�
		{
			grade = 'A';
		}
		else if (avg >= 80) // else if (avg >= 80 && avg < 90)
		{
			grade = 'B';
		}
		else if (avg >= 70)
		{
			grade = 'C';
		}
		else if (avg >= 60)
		{
			grade = 'D';
		}
		else// if (avg < 60)
		{
			grade = 'F';
		}
		

		System.out.println();
		System.out.printf(">> ����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf(">> ���� ������ %d,\n", kor);
		System.out.printf(">> ���� ������ %d,\n", eng);
		System.out.printf(">> ���� ������ %d,\n", mat);
		System.out.printf(">> ������ %d�̰�, ����� %.2f�Դϴ�.\n", tot, avg);
		System.out.printf(">> ����� %c �Դϴ�.\n", grade);

	}
}

/* [���� ���]
�̸� �Է� : ������
���� ���� : 90
���� ���� : 80
���� ���� : 70

>> ����� �̸��� �������Դϴ�.
>> ���� ������ 90,
>> ���� ������ 80,
>> ���� ������ 70,
>> ������ 240�̰�, ����� 80.00�Դϴ�.
>> ����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
�̸� �Է� : �谡��
���� ���� : 90
���� ���� : 90
���� ���� : 90

>> ����� �̸��� �谡���Դϴ�.
>> ���� ������ 90,
>> ���� ������ 90,
>> ���� ������ 90,
>> ������ 270�̰�, ����� 90.00�Դϴ�.
>> ����� A �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
�̸� �Է� : ���ϸ�
���� ���� : 10
���� ���� : 20
���� ���� : 30

>> ����� �̸��� ���ϸ��Դϴ�.
>> ���� ������ 10,
>> ���� ������ 20,
>> ���� ������ 30,
>> ������ 60�̰�, ����� 20.00�Դϴ�.
>> ����� F �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/