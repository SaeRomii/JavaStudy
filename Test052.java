/*===========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
  - �ݺ��� (while��) �ǽ�
===========================================*/

// ����
// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �� �� ������ ��ü �հ�, ¦���� �հ�, Ȧ���� ����
// ���� ��������� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 284
// >> 1 ~ 284 ���� ������ �� : xxxx
// >> 1 ~ 284 ���� ¦���� �� : xxxx
// >> 1 ~ 284 ���� Ȧ���� �� : xxxx
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a;						// ���� ���� ���� ����
		int b=0, c=0, d=0;			// ������, ¦����, Ȧ����
		int e=1;					// ��������

		System.out.print("������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		while (e<=a)
		{
			b += e;

			if (e%2==0)
				c += e;
			else if (e%2!=0)
				d += e;
			
			e++;
		}
		System.out.printf(">> 1~ %d ���� ������ �� : %d\n", a, b);
		System.out.printf(">> 1~ %d ���� ¦���� �� : %d\n", a, c);
		System.out.printf(">> 1~ %d ���� Ȧ���� �� : %d\n", a, d);


	}
}

/* ���� ���
������ ���� �Է� : 284
>> 1~ 284 ���� ������ �� : 40470
>> 1~ 284 ���� ¦���� �� : 20306
>> 1~ 284 ���� Ȧ���� �� : 20164
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/