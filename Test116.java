/*========================================
  ���� Ŭ���� ��� ����
  - �������̽�(Interface) 
========================================*/

// �� �ǽ� ����
//	  ���� ó�� ���α׷��� �����Ѵ�.
//	  ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 2		do while��
// 1��° �л��� �й� �̸� �Է�(���� ����) : 2104256 �ڹ��� Scanner
// ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2104257 �輭��
// ���� ���� ���� ���� �Է�   (���� ����) : 85 70 65

// 2104256 �ڹ��� 90 100 85		275		91
//				  �� �� ��
// 2104257 �輭�� 85 70 65		220		73
//				  �� �� ��

// ����Ϸ��� �ƹ� Ű��...

// 90 ~ 100 : ��
// 80 ~ 89  : ��
// 70 ~ 79  : ��
// 60 ~ 69  : ��
// ������   : ��


import java.util.Scanner;
import java.io.IOException;

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��
class Record
{
	String hak, name;		// �й�, �̸�
	int kor, eng, mat;		// ����, ����, ���� ����
	int tot, avg;			// ����, ���(���ǻ� ���� ó��)
}

// �������̽�
interface Sungjuk
{
	public void set();
	public void input();
	public void print();
}

// ���� �ذ� �������� �����ؾ� �� Ŭ����
class SungjukImpl extends Record implements Sungjuk
{
	int n, i, j;
	int[][] temp;
	char[][] rank;
	Record[] rc;

	//�ο���
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			n = sc.nextInt();

		}
		while (n<1 || n>10);

		rc = new Record[n];
		temp = new int[n][3];
		rank = new char[n][3];
	}

	// ����, ����
	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		for (i=0; i<n; i++)
		{
			rc[i] = new Record();

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", (i+1));
			rc[i].hak = sc.next();
			rc[i].name = sc.next();

			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			temp[i][0] = rc[i].kor = sc.nextInt();
			temp[i][1] = rc[i].eng = sc.nextInt();
			temp[i][2] = rc[i].mat = sc.nextInt();

			rc[i].tot = rc[i].kor + rc[i].eng + rc[i].mat;
			rc[i].avg = rc[i].tot/3;
		}
		System.out.println();
		
		// ����̾簡
		for (i=0; i<n; i++)
		{
			for (j=0; j<3; j++)
			{
				switch (temp[i][j]-temp[i][j]%10)
				{
				case 100: case 90: rank[i][j]='��'; break;
				case 80: rank[i][j]='��'; break;
				case 70: rank[i][j]='��'; break;
				case 60: rank[i][j]='��'; break;
				default: rank[i][j]='��'; break;
				
				}
			}
		}
	}

	@Override
	public void print()
	{
		for (i=0; i<n; i++)
		{
			System.out.printf("%s %s %3d %3d %3d\t %d %d\n", rc[i].hak, rc[i].name, rc[i].kor, rc[i].eng, rc[i].mat, rc[i].tot, rc[i].avg);

			System.out.printf("\t\t%c%3c%3c\n", rank[i][0], rank[i][1], rank[i][2]);
		}
	}
}
public class Test116
{
	public static void main(String[] args) throws IOException
	{
		// 
		// Sungjuk�� �������̽�
		Sungjuk ob;
		//SungjukImpl ob;

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����
		ob = new SungjukImpl();

		ob.set();
		ob.input();
		ob.print();
	}
}