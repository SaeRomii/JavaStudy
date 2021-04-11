/*===========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
  - if ~ else�� �ǽ�
===========================================*/

// ����ڷκ��� ������ ������ �� �� �Է¹޾�
// ���� �� ���� ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 45
// �� ��° ���� �Է� : 81
// �� ��° ���� �Է� : 13

// >> ���� ��� : 13 45 81
// ����Ϸ��� �ƹ� Ű��...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;		//--����ڰ� �Է��ϴ� ������ ������ ���� ����
		int temp;			//--�ӽ� ���� ����(�� ��)

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());


		// 2 2 2 | 3 2 1 | 2 1 3 | 3 1 2 | 1 3 2
		//       | 2 3 1 | 1 2 3 | 1 3 2 | 1 2 3   ù��° �ι�° ���ؼ� ������ �� ������ ���� �ڸ� �ٲ�
		//       | 2 1 3 |       | 1 2 3
		//       | 1 2 3


		//else if �ƴϰ� �ܵ� if�� �Է��ؾ��� else if�ϸ� ���� if�� ������ؼ�

		if (a>b)		// ù ��° ������ �� ��° �������� ũ�ٸ�...
		{
			// �� ����(a�� b)�� �ڸ��� �ٲ۴�.
			temp = a;
			a = b;
			b = temp;
		}

		if (b>c)		// �� ��° ������ �� ��° �������� ũ�ٸ�...
		{
			// �� ����(b�� c)�� �ڸ��� �ٲ۴�.
			temp = b;
			b = c;
			c = temp;
		}

		if (a>b)		// ù ��° ������ �� ��° �������� ũ�ٸ�...
		{
			// �� ����(a�� b)�� �ڸ��� �ٲ۴�.
			temp = a;
			a = b;
			b = temp;
		}


		System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b, c);



	}
}

/* ���� ���
ù ��° ���� �Է� : 45
�� ��° ���� �Է� : 81
�� ��° ���� �Է� : 13

>> ���� ��� : 13 45 81
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/