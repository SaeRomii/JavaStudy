/*=========================================
  ���� �ֹε�Ϲ�ȣ ��ȿ�� �˻����
=========================================*/

/*
�� �ֹι�ȣ ���� ����

   �� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.
   
      123456-1234567 (�� �ֹι�ȣ)
	  ****** ******
	  234567 892345  (�� �� �ڸ��� ������ ��)
   
   �� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.

   ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
       * * * * * *   * * * * * *
	   2 3 4 5 6 7   8 9 2 3 4 5
   --------------------------------
   ��14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15
     
	 == 217

   �� ������ ������� 11�� ������ ������������ ���Ѵ�.
	   19
	  -------
  11 | 217
       11
	  -------
	   107
	    99
	  -------
	     8 �� ������

   �� 11���� �������� �� ������� ���Ѵ�.
      
	  11 - 8 �� 3

	  �߰�~!
	  �긦 ������ ������� 11�̳� 10�� ������ �Ǿ��� ���
	  ex) 11 - 1 �� 10 (���ڸ� ������ 10���� ����� �� �������� �ֹι�ȣ ������ ����) �� 0
	      11 - 0 �� 11 (���ڸ� ������ 10���� ����� �� �������� �ֹι�ȣ ������ ����) �� 1

   �� �꿡�� ó���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ�
      ��ġ�ϴ��� ���Ѵ�.

   �� ������ ���ڿ� ���� ��� ��ȿ�� �ֹε�Ϲ�ȣ~!!!
   
*/

// ���� ��)
// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1862133
// >> ��Ȯ�� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ� Ű��...

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1234567
// >> �߸��� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ� Ű��...

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-18621		// �� �ڸ��� ������
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű��...

// �迭.length �� �迭���� ����(ũ��, ����) ���⼭ length�� �Ӽ�

// �� ���ڿ�.length() �� ���ڿ��� ���� ��ȯ ���⼭ length()�� �޼ҵ�  ���ڿ��� ���̰� ��������� ��ȯ���ִ� �޼ҵ�
//	  ���ڿ�.substring() �� ���ڿ� ����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test101
{
	public static void main(String[] args) throws IOException
	{
		// �׽�Ʈ
		//String strTemp = "���ع�����λ��� ������⵵��";
		//System.out.println(strTemp.length());
		//--==>> 15

		// �׽�Ʈ
		//System.out.println("�������� �� �ҳ���".length());
		//--==>> 10

		// �׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 5));
		//--==>> de
		// substring(m, n) �� ���ڿ� �ε��� m��° ���� n-1��°���� ����
		//					  �ε����� 0����...

		// �׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 24));
		//--==>> defghijklmnopqrstuvwx

		// �׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 25));
		//--==>> defghijklmnopqrstuvwxy

		// �׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 26));
		//--==>> defghijklmnopqrstuvwxyz
		
		// �׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 27));
		//--==>> ���� �߻�(��Ÿ�� ����)
		//		 java.lang.StringIndexOutOfBoundsException

		// �׽�Ʈ
		//System.out.println("���̿��������װڳ�".substring(4, 9)); �޼ҵ� �����ε�
		//--==>> �����װڳ�

		// �׽�Ʈ
		//System.out.println("������������".substring(3));
		//System.out.println("������������".substring(3, "������������".length()));
		//System.out.println("������������".substring(3,6));
		//System.out.println("������");
		/*
		--==>> ������
			   ������
			   ������
			   ������
		*/
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int[] gop = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		String num;
		int sum=0;		//���� ���� �� ������ ��� 

		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");
		num = br.readLine();

		if (num.length()<14 || num.length()>14)
		{
			System.out.print("�Է� ����~!!!\n");
			return;
		}

		for (int i=0; i<13; i++)
		{
			if (i==6)			// -ó��
			{
				continue;
			}
			sum += gop[i]*Integer.parseInt(num.substring(i, (i+1)));		// ���� ���� �� tot�� ���
		}
		
		int result = 11-sum%11;

		if (result==Integer.parseInt(num.substring(13)))
		{
			System.out.print(">> ��Ȯ�� �ֹι�ȣ~!!!\n");
		}
		else
			System.out.print(">> �߸��� �ֹι�ȣ~!!!\n");
		*/

		// �Է¹��� �ֹι�ȣ
		String str;

		// �ֹι�ȣ�� ������� �������� �� �迭 ����
		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		//							   - ������ �����ؼ� �������� �ȵǴϱ� 0���� �־���

		// ���� ���� �� ������
		int tot=0;		// tot�� ������ �������� �ʰ� ������ �����ϴ°Ŷ� 0���� �ʱ�ȭ

		// ����ڿ��� �ȳ� �޼��� ��� �� �ֹι�ȣ �Է¹ޱ�
		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");
		str = br.readLine();

		if (str.length()!=14)	// str�� (�Է¹��� �ֹι�ȣ) 14�ڸ��� �ƴ϶��
		{
			System.out.println(">> �Է� ����~!!!");
			return;	// �޼ҵ� ���� �� ���α׷� ���� return����� �Է� ���� �޼��� �� ���� ������ �ȳ�����
		}

		// Ȯ��(�׽�Ʈ)
		//System.out.println(">> �ڸ����� ������ ��Ȳ~!!!");

		for (int i=0; i<13; i++)	// chk.length�� ���� i �� 0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			if (i==6)				// ������ �� �ڸ��� 0���� �����ϱ� 
									// i�� �� �ڸ��� ���� �Ʒ� tot ������ ��� �����ϰ� ����ض�(�� ���� ���ڶ� �ֹι�ȣ �������)
			{
				continue;			// (�޺κ� �����ϰ�) ����ض�
			}
			// �� continue�� ������ �޺κ�
			tot += chk[i]*Integer.parseInt(str.substring(i, (i+1)));	//chr�� i��° �ڸ��� �ֹι�ȣ i��° �ڸ� ���� �� ���� 
			// chk[0]*Integer.parseInt(str.substrint(0,1));
			// (���������� ����ȯ) �ֹι�ȣ �Է¹����� ���ڿ��� �޾Ƽ�
			// tot�� ��� �� ������ ������Ű�� �ؾ��ϴϱ� +=��� �����

		}
		//-----------------------------------����� ��� ���� ���� ��Ȳ�̸�
		// ��Ģ�� �°� ���� ������ ������ ����� ��� ���� ����
		// ���� tot�� ����ִ� ���°� �ȴ�.

		int su = 11-tot%11;
		// tot���� 11���� ������ ��� ����, �״��� 11���� �� ���
		
		// �׽�Ʈ(Ȯ��)
		//System.out.println(su);
		/*
		--==>> �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 950529-2199011
			   1
			   ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/

		// ���� ��� ��� ������ �߰� ���� �ʿ�
		// �� su�� ���� ���� ����� �� �ڸ��� ���� ���
		//	  �ֹι�ȣ ������ �ڸ����� ���� �� ���� ��Ȳ
		su = su%10;		//su %= 10;

		//-- ������� �����ϸ� ����� ����� �߰����� ��� ���� ��Ȳ�̸�
		//	 ���� ���� ����� ���� su�� ����ִ� ��Ȳ�� �ȴ�.

		// ���� ��� ���
		//if (su == Integer.parseInt(�ֹι�ȣ�������ڸ�����))
		if (su == Integer.parseInt(str.substring(13)))
		{
			System.out.println(">> ��Ȯ�� �ֹι�ȣ~!!!");		// true��
		}
		else
		{
			System.out.println(">> �߸��� �ֹι�ȣ~!!!");		// false��
		}
	}					  
}

/* ���� ���
�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 950529-2199011
>> ��Ȯ�� �ֹι�ȣ~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/* ���� ���
�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 950529-1234567
>> �߸��� �ֹι�ȣ~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/* ���� ���
�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 1234
>> �Է� ����~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/