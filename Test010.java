/*==================================================
  ���� ������ �ڷ��� ����
  - ����
  	������ �ο��� ������ ������ ����
	���� ���̿� �ѷ��� ���ϴ� ���α׷��� �ۼ��Ѵ�.
	�������� : 10
==================================================*/

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

// ���� ��)
// ���� : xxxx
// �ѷ� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...


public class Test010
{
	public static void main(String[] args)
	{
		int r;

		r = 10;

		double b = r * r * 3.141592d;

		double c = r * 2 * 3.141592d;

		System.out.println("���� : " + b);
		System.out.println("�ѷ� : " + c);
		


		// �� Ű���� ��final�� : ������ ���ȭ~!!

		// �������� ����� ���
		/*
		int r;
		r=10;
		
		double area, length;

		area = r * r * pi;
		length = r * 2 * pi;

		System.out.println("���� : " + area);
		System.out.println("�ѷ� : " + length);

		�Ǵ�
		System.out.println("���� : ��\n�ѷ� : ��\n", area, length);
		System.out.println("���� : %f\n�ѷ� : %f\n", area, length);

		*/


	}
}

/* ���� ���
���� : 314.1592
�ѷ� : 62.83184
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

