//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CircleTest
{

	// �ֽ� �ɷ��ִ°� ���� Ǭ ���

	int r;								//-- ������
	//double pi = 3.141592;
	final double PI = 3.141592;			//-- ������
	//-- ��final�� : ������ ���ȭ

	void input() throws IOException		// ������ �鿩�⼭ �߻��ϸ� ������ �����ٶ�� ������ throws IOException�� ���ʿ�
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		//r = sc.nextInt();
		r = Integer.parseInt(br.readLine());

	}

	double calLength()		// ���� () 	�� �̰� ������ ����!!!
	{
		double result;
		result = r * r * PI;
		return result;
	}

	double calArea()				// �ѷ�
	{
		double result;
		result = r * 2 * PI;
		return result;
	}

	void print(double a, double l)			// ��� ���
	{

		System.out.printf("�������� %d�� ���� \n", r);
		//System.out.println("�������� " + r + "�� ����");
		System.out.printf("���� ���� : %.2f\n", a);
		System.out.printf("���� �ѷ� : %.2f\n", l);
	}
}