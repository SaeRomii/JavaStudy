/*===========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
  - �ݺ��� (while��) �ǽ�
===========================================*/

// ����ڷκ��� ������ �� ������ �Է¹޾�
// ���� ������ ū �������� ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 20
// >> 10 ~ 20 ������ �� : xxxx
// ����Ϸ��� �ƹ� Ű��...

// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 2
// >> 2 ~ 10 ������ �� : xxx
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* ���� Ǯ���� ���
		// ���� ����
		int a, b;
		int result=0;
		int ;				// 

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		if ()
		{
		}

		

		while (a<=b)
		{
			result += a;
			a++;
		}
		System.out.printf("%d ~ %d ������ �� : %d\n", a, b, result);
		*/
		
		// �ֿ� ���� ����
		int n, su1, su2, result=0;
		//--��������, ù ��° �Է°�, �� ��° �Է°�, �����(������ ���� ���)
		// �������� : ���� ������ 1�� ����

		// ���� �� ó��
		// ����ڿ��� �ȳ� �޼��� ��� �� �Է°� ��Ƴ���
		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());

		// ������ ���꿡 ���� �ռ�
		// �Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		// ���� ������ ū �������� ��� �Ǿ���ϴϱ�
		// ��, su1�� su2���� Ŭ ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��
		if (su1>su2)
		{
			// �� ���� �ڸ� �ٲ�
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}
		
		n = su1;

		while (n<=su2)
		{
			result += n;
			n++;
		}

		

		// ��� ���
		System.out.printf(">> %d ~ %d ������ �� : %d\n", su1, su2, result);

	}
}

/* ���� ���
ù ��° ���� �Է� : 50
�� ��° ���� �Է� : 1
>> 1 ~ 50 ������ �� : 1275
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 1
�� ��° ���� �Է� : 100
>> 1 ~ 100 ������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/