/*=============================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - ������ �ڷ���
  - �ڹ��� �⺻ ����� 
==============================================*/

// �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
// �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �� �ﰢ���� ���� ���ϱ� ��
// - �ﰢ���� �غ� �Է� : 3
// - �ﰢ���� ���� �Է� : 5

// >> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test013
{
	public static void main(String[] args) throws IOException
	{
		/* ���� Ǯ���ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;
		int c;        ���̴� ������ 2�� �־ �Ǽ��� ���� ���� �ֱ� ������ �Ǽ� �ڷ�������

		System.out.println(" �غ� : ");
		System.out.println(" ���� : ");

		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());

	
		c = a * b / 2;

		System.out.println(">> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : " + c);
		*/

		//�ܺηκ��� �����͸� �Է¹޵��� ó���ϱ� ���ؼ�
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����
		int underLength, height;		//--�غ�, ����
		double area;					//-- ���� (���̴� ������ 2�� �־ �Ǽ��� ���� ���� �ֱ� ������)


		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
		System.out.print("-�ﰢ���� �غ� �Է� : ");  // �ڿ� �Է¹޴°Ŷ� print��


		// �� ����ڰ� �Է��� ������(�غ�)��
		//	  ���� ���·� ��ȯ�� ��
		//	  ���� underLength �� ��Ƴ���
		underLength = Integer.parseInt(br.readLine());
		// ���Ҿ� �̰� �غ�~ ^^

		// �� �ٽ� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("-�ﰢ���� ���� �Է� : ");
		
		// �� ����ڰ� �Է��� ������(����)��
		//	  ���� ���·� ��ȯ�� ��
		//    ���� height �� ��Ƴ���
		//underLength = Integer.parseInt(br.readLine());
		height = Integer.parseInt(br.readLine());
		// �׸��� �̰� ����~ ^^
		// height �� ��ƾ߰���~? ^^


		// �� �ﰢ���� ���̸� ���ϴ� ���� ó��
		//area = underLength * height / 2;
		//             ����      ����  /2;
		//					����       /����;
		//					�� ������ �Ǵϱ�
		area = underLength * height / 2.0;
		//-- �Ǽ� �ڷ����� ��������� ������ ��������
		//   �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		//   ������ ��2���� �ƴ� �Ǽ��� ��2.0������ ������ ������ �����ϰ� �Ǹ�
		//	 �� ������ �Ǽ� ������� ó���ȴ�.
		

		// ��� ���
		//System.out.print();	����
		System.out.println();   //����
		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n", underLength, height, area);

	}
}

/* ���� ���
�� �ﰢ���� ���� ���ϱ� ��
-�ﰢ���� �غ� �Է� : 3
-�ﰢ���� ���� �Է� : 5

>> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : 7.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/