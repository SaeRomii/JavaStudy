/*===========================
  ���� �迭(array) ����
  - �迭�� �迭(2���� �迭)
============================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5x5)�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
 1  2  3  4  5		�� a == 0
 5  1  2  3  4		�� a == 1
 4  5  1  2  3		�� a == 2
 3  4  5  1  2		�� a == 3
 2  3  4  5  1		�� a == 4
����Ϸ��� �ƹ� Ű��...
*/

public class Test089
{
	public static void main(String[] args)
	{
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];
		
		
		/* ���� Ǯ���� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=n;
				n++;
			}
			for (int k=i; k<arr[i].length; k++)
			{
				arr[i][k]=n;
				n++;
			}
			n=1;
			
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		*/

		// �ʱ�ȭ
		// 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5
		for (int a=0; a<arr.length; a++)			// a �� 0 1 2 3 4
		{
			for (int b=a, n=1; n<=5; n++)			// b=a�� �س����� a�� 1�϶� b�� 1���� ����
													// n++�� �� ������ 5��° ���� ���⶧���� �տ��� n=1���� 5�̸����� �ϱ�� �߱⶧����
													// �׹�° ������� ����
			{										// n �� 1 2 3 4 5 / 1 2 3 4 5
				arr[a][b] = n;

				b++;
				if (b==5)							// b�� 0�̵Ǹ� 0���� �ʱ�ȭ
				{
					b=0;
				}
			}
		}

		// �迭�� �迭 ��� ��ü ���

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}//end main()
}//end class

/* ���� ���
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/