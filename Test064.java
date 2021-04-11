/*============================================
  ���� ���� �帧�� ��Ʈ��(���) ����
  - break
============================================*/

// ������ ���� ó���� �̷������ ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ 1 ~ 1000 ���� �ȿ�����
// �����ϵ��� �ۼ��Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~1000) : -10
// ������ ���� �Է�(1~1000) : 0
// ������ ���� �Է�(1~1000) : 2021
// ������ ���� �Է�(1~1000) : 10
// >> 1 ~ 10 ������ �� : 55
// ����Ͻðڽ��ϱ�(Y/N)? : Y

// ������ ���� �Է�(1~1000) : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ͻðڽ��ϱ�?(Y/N) : N
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test064
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/* ���� Ǯ���� ���
		// �ֿ� ���� ����
		int a,b,c;
		char ch;

		while (true)
		{
			do
			{
				System.out.print("������ ���� �Է� : ");
				a = Integer.parseInt(br.readLine());
			}
			while (a<1 || a>1000);

			b=0;
		for (c=1; c<=a; c++)
			 b+=c;

		System.out.printf(">> 1 ~ %d ������ �� : %d\n", a, b);
		System.out.print(" ����Ͻðڽ��ϱ�?(Y/N) : ");
		ch=(char)System.in.read();

		if (ch=='y' || ch=='Y')
		{
			break;
		}

		}
		*/
		
		int n, s, i;					//-- ����� �Է°�, ������ 0���� �ʱ�ȭ, ��������
		char ch;						//-- ��� ���� �Է°�
		

		while (true)					//-- ���� ����(�ݺ�)
		{
			do							// �Է��ϰ� �ݺ��ؾ��ϴϱ� do while������
			{
				System.out.print("������ ���� �Է�(1~1000) : ");
				n = Integer.parseInt(br.readLine());	
			}
			while (n<1 || n>1000);		// �ݺ��� ���� ���� �� 1���� 1000������ �� �̿ܿ� ��Ȳ�϶� �ݺ��̴ϱ�
										// �������� || or
			// �׽�Ʈ
			//System.out.println("�Է��� ���� : " + n);  �� ok


			s=0;						//������ �����ϱ� ���� 0���� �ʱ�ȭ �ϸ� ������ ������ �ջ갪 �ȳ���
			for (i=1; i<=n; i++)
			{
			s += i;
			}

			// �׽�Ʈ
			//System.out.println("������ : " + s);   �� ok
			System.out.printf("\n>> 1 ~ %d ������ �� : %d\n", n, s);

			
			System.out.print("����Ͻðڽ��ϱ�?(Y/N) : ");
			ch = (char)System.in.read();     // char����ȯ �� ���
											 // y + \r + \n

			// �׽�Ʈ
			//System.out.println("��ӿ��� : " + ch);

			// �Է°��� �ҹ��� y�� �ƴϴ�. �� ch!='y'  �Է°��� �빮�� Y�� �ƴϴ�. �� ch!='Y'
			// ch=='Y'  ch=='y' �� ���������� Y,y�� �ν��ϰ� ������ ���ڴ� �ν� ���ص���
			if (ch!='y' && ch!='Y')			// ���������� or �������� �������� �ٲ�� &&�� �ٲ�
			{
				// �ݺ��� �� ��while(true)���� �������� �� �ִ� �ڵ� �ۼ� �ʿ�
				//-- ���� ���� �ǻ� ǥ���� �ߴٸ�
				//   �׵��� �����ߴ� �ݺ����� ���߰� ���������� �Ѵ�.
				break;
				//-- �����. (+ �׸��� ����������. �� while��)
			}

			// ���Ͱ�(\r\n) �߰� ó��
			System.in.skip(2);

		}// end while(true)
		
				
	}//end main()

}//end class Test064

/* ���� ���
������ ���� �Է�(1~1000) : 10

>> 1 ~ 10 ������ �� : 55
����Ͻðڽ��ϱ�?(Y/N) : y
������ ���� �Է�(1~1000) : 100

>> 1 ~ 100 ������ �� : 5050
����Ͻðڽ��ϱ�?(Y/N) : n
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


/*
������ ���� �Է�(1~1000) : -8
������ ���� �Է�(1~1000) : 1200
������ ���� �Է�(1~1000) : 100

>> 1 ~ 100 ������ �� : 5050
����Ͻðڽ��ϱ�?(Y/N) : y
������ ���� �Է�(1~1000) : 10

>> 1 ~ 10 ������ �� : 55
����Ͻðڽ��ϱ�?(Y/N) : Y
������ ���� �Է�(1~1000) : 100

>> 1 ~ 100 ������ �� : 5050
����Ͻðڽ��ϱ�?(Y/N) : n
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/