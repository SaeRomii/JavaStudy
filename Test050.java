/*===========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
  - �ݺ��� (while��) �ǽ�
===========================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������... �Ҽ����� �ƴ����� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 10 
// 10 �� �Ҽ� �ƴ�   ��±��� �ݺ��Ǵ°� �ƴ϶� ��±����� �ۿ� �־����
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է� : 11
// 11 �� �Ҽ�
// ����Ϸ��� �ƹ� Ű��..

// �Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿��� � ���ε� ���� �� ���� ��
//		  ��, 1�� �Ҽ� �ƴ�

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test050
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		/*
		int a=0;
		System.out.print("������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		while (a%a==)
		{

			a++;
		}
		*/

		//�ֿ� ���� ����
		int num;					//--  ����ڰ� �Է��ϴ� ������ ������ ��Ƶ� ����

		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		int n=2;					//-- ������� �Է°��� �������
									//	 ������ ������ ������ ����(1�� ���� ����)

		boolean flag = true;		//-- �Ҽ���  flag��� ������ ���� ���� �������� üũ��

		while (n<num)
		{
			if (num%n==0)
			{
				flag = false;		//-- �Ҽ� �ƴϴ�
				//System.out.println(n);
				break;				//-- while�� Ż��
			}
			n++;
		}

		// ��� ���
		if (flag && num!=1)
		{							
			System.out.printf("%d �� �Ҽ�\n", num);
		}
		else
		{
			System.out.printf("%d �� �Ҽ� �ƴ�\n", num);
		}
		// �� {} ��������
	
	}
}

/* ������
������ ���� �Է� : 10
10 �� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 29
29 �� �Ҽ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 1
1 �� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/