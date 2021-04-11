/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Wrapper Ŭ����
=========================================*/
//BigInteger ���� ���� : ���� �ʹ� Ŀ�� ������ �ȵ��� ���ڿ��� �ٲ�

import java.math.BigInteger;

public class Test127
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;      21�� �Ѿ�� ����
		//long b1 = 123456789123456789L;	int�� �ڵ� ����ȯ �Ǵϱ� �ڿ� ���̻� L�ٿ������
		//long c1 = 123456789123456789123456789L;

		BigInteger a = new BigInteger("123456789123456789");		// ū ������
		BigInteger b = new BigInteger("123456789123456789");

		//System.out.println(a+b); ��ü�� ��������ϴ°� �ȵ�
		
		//BigInteger c = a + b;
		//System.out.println(c);

		// �� �Ϲ����� ��������ڸ� ���� ���� �Ұ���

		// �޼ҵ带 ���ؼ� �����ؾ���
		// ���ϱ�
		BigInteger c = a.add(b);							// BigInteger���� �����ϴ� add�޼ҵ� ��� ����
		System.out.println("���� ��� : " + c);				// add��� �޼ҵ带 ���� ���� ����
		//--==>> ���� ��� : 246913578246913578

		// ����
		BigInteger d = a.subtract(b);						// subtract �޼ҵ带 ���� ���� ����
		System.out.println("���� ��� : " + d);
		//--==>> ���� ��� : 0
		
		// ����
		BigInteger e = a.multiply(b);
		System.out.println("���� ��� : " + e);				// multiply �޼ҵ带 ���� ���� ����
		//--==>> ���� ��� : 15241578780673678515622620750190521

		// ������
		BigInteger f = a.divide(b);							// divide �޼ҵ带 ���� ������ ����
		System.out.println("������ ��� : " + f);
		//--==>> ������ ��� : 1

		// ������
		BigInteger g = new BigInteger("2");
		System.out.println("2�� 3�� : " + g.pow(3));
		//--==>> 2�� 3�� : 8
	}
}