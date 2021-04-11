/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Wrapper Ŭ����
=========================================*/

// Wrapper Ŭ���� ������ Number
// Object - Number ����

public class Test129
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);			//-- boxing
		Integer i2 = new Integer(i);	//-- boxing

		System.out.println(b2);			//--==>> 3
		System.out.println(i2);			//--==>> 256

		print(b2);
		print(i2);
	}

	// Object
	// Number
	// �� java.lang.Number Ŭ����(�߻� Ŭ����)
	//	  ��� Wrapper Ŭ�������� �θ� Ŭ����(���� Ŭ����, ���� Ŭ����)�̴�.
	//	  b2, i2 �ڷ����� Number n�� �Ѿ���鼭
	//	  �� ĳ������ �Ͼ�� �ȴ�.	(Auto-Boxing ����)

	/*
	static void print(Object n)		//���� Object �����ͼ�
	{
		System.out.println(n);
	}
	*/

	static void print(Number n)			// NumberŬ������ ���� �� ����
	{	
		System.out.println(n);
		//System.out.println(Object obj)
		// Integer �� Number �� Object
		// System.out.println(n.toString());  toString�� Integer toString�̶� Number�� 

	}
	// ĳ���� �����ؼ� �ϳ��� ���

	
	/* Number�� Object�� �ȴ����� �ؿ�ó�� �� �����������
	static void print(Byte b)
	{
		System.out.println(b);
	}

	static void print(Integer i)
	{
		System.out.println(i);
	}
	*/

}