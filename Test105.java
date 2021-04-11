/*=====================================
  ���� ����(Sort) �˰��� ����
=====================================*/

// �� �ǽ� ����
//	  ����ڷκ��� ���� �л��� ���� �����͸� ���� ���·� �Է¹޾�
//	  ������ ���� ������ ����� �ο��Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//	  ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է� : 5
// �̸� ���� �Է�(1) : ������ 90
// �̸� ���� �Է�(2) : ������ 80
// �̸� ���� �Է�(3) : �Ҽ��� 85
// �̸� ���� �Է�(4) : ������ 75
// �̸� ���� �Է�(5) : ������ 95

//================
// 1�� ������ 95
// 2�� ������ 90
// 3�� �Ҽ��� 85
// 4�� ������ 80
// 5�� ������ 75
//================
// ����Ϸ��� �ƹ� Ű��...

import java.util.Scanner;

public class Test105
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int inwon;
		int i=1, j;
		int pass=0;
		boolean flag;

		System.out.print("�ο� �� �Է� : ");
		inwon = sc.nextInt();

		//�迭�� �����
		String[] name = new String[inwon];		//�̸�
		int[] score = new int[inwon];			//����
		int[] rank = new int[inwon];			//���
		String temp;

		do
		{
			System.out.print("�̸� ���� �Է�(" + i + ") : ");
			name[i-1] = sc.next();			//�̸��� ���ڿ�
			score[i-1] = sc.nextInt(); 
		}
		while (i++<inwon);

		do
		{
			pass++;
			flag = false;

			for (j=0; j<inwon-pass; j++)
			{
				if (score[j]<score[j+1])
				{
					temp=name[j];
					name[j]=name[j+1];
					name[j+1]=temp;

					score[j]=score[j]^score[j+1];		//�ڸ� �ٲ��� ����Ʈ�� ���ϴ°Ŷ� String�� �ȵ�
					score[j+1]=score[j+1]^score[j];
					score[j]=score[j]^score[j+1];

					flag = true;

				}
			}
		}
		while (flag);

		for (i=0; i<inwon; i++)
		{
			rank[i]=1;						//1���̶�� �����Ͽ�
			for (j=0; j<inwon; j++)
			{
				if (score[i]<score[j])
				{
					rank[i] += 1;
				}
			}
		}


		System.out.println("\n================");

		for (i=0; i<inwon; i++)		//�迭 �̿��ؼ� ����� ����Ҷ�
		{
			System.out.printf("%d�� %s %d\n", rank[i], name[i], score[i]);
		}
		System.out.println("================");

		
	}
}

/* ���� ���
�ο� �� �Է� : 3
�̸� ���� �Է�(1) : ���� 90
�̸� ���� �Է�(2) : ���� 95
�̸� ���� �Է�(3) : �ϸ� 100

================
1�� �ϸ� 100
2�� ���� 95
3�� ���� 90
================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/