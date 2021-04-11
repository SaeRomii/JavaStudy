/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Wrapper Ŭ����
=========================================*/

public class Test126
{
	public static void main(String[] args)
	{
		boolean bi = true;
		Boolean wrapBi = new Boolean(bi);			//-- �ν��Ͻ� ����
		Boolean wBi = bi;							//-- ���� �ڽ�

		int n = 300;
		Integer wrapN = new Integer(n);
		int n2 = wrapN;								//-- ��ü�� ���� �� ���� ��ڽ�

		float f = 300.3f;
		Float wrapF = new Float(f);					//-- ��ü ����

		// ��ü�� toString
		System.out.println(wrapBi.toString());		//--==>> true
		System.out.println(wrapN.toString());		//--==>> 300
		System.out.println(wrapF.toString());		//--==>> 300.3

		// �׽�Ʈ(��)
		Object obj = new Object();					// obj�� ��ü
		System.out.println(obj);					//--==>> java.lang.Object@15db9742
		System.out.println(obj.toString());			//--==>> java.lang.Object@15db9742
		// String�� ��ȯ�ϴ� println ��ü��(Object obj)
		// {
		//     toString() Ȱ��...
	    // }
		// Object Ÿ���� toStringȰ��
	
		// �������̵��� toString ��ü�� ��µ�
		System.out.println(wrapBi);					//--==>> true
		System.out.println(wrapN);					//--==>> 300
		System.out.println(wrapF);					//--==>> 300.3

		System.out.println(wBi);					//--==>> true
		System.out.println(n2);						//--==>> 300

		System.out.println("\n-----------------------------------------------------------------\n");

		// Integer Ŭ����

		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  12

		ni = Integer.parseInt("0101", 2);		//���ڿ��� ù��° ���ڰ�, �ι�° ���ڰ����� �ް� �� �����ε�
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :   5
		//		 "0101"�� 2�������� �ٲ�� 5�� ����� 5����

		ni = Integer.parseInt("12", 8);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  10
		//		 12�� 8������ �ٲ� ��

		ni = Integer.parseInt("A", 16);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni : 10
		//		 A�� 16������ �ٲ� ��

		sn = Integer.toBinaryString(20);
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 10100
		//	     2���� ���·� �ٲ� ��

		sn = Integer.toHexString(31);
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 1f
		//		 16���� ���·� �ٲ� ��

		sn = Integer.toOctalString(31);
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 37
		//		 8���� ���·� �ٲ� ��

		Integer num = new Integer(50);
		System.out.println(num.toString());
		//--==>> 50

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4);
		// valueOf �� �Ϲ����� ������ ��ü�� ��ȯ����
		//--==>> 345



	}
}