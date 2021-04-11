/*===================================
  ���� �÷��� (Collection) ����
===================================*/

// Vector v = new Vector();
//-- ����ִ� Vector �ڷᱸ�� ����

// Vector v = new Vector(8);
//-- 8���� �ʱ� elements�� ���� Vector �ڷᱸ�� ����
//   8���� ��� ä������ �Ǹ�(���ڶ�� �Ǹ�) �ڵ����� Ȯ��ȴ�.

// Vector v = new Vector(3, 5);
//-- 3���� �ʱ� elements�� ���� Vector �ڷᱸ�� ����
//   3���� ��� ä������ �Ǹ�(���ڶ�� �Ǹ�) 5���� ����

// �� ���ʹ� ������ ��ҷμ� ������, �Ǽ���, ���ڿ�... ����
//	  ��Ƴ��� ���� �����ϴ�.
//	  �� ���� ��� �� ������ ������ Ȯ�� -- check~!!!

import java.util.Vector;
import java.util.Iterator;

// MyVector Ŭ���� ���� �� Object�� ��Ƶ� VectorŬ���� ��ӹ���
class MyVector extends Vector<Object>	// �׳� class MyVector�� ������ ���� �ƴѵ� extends Vector<Object>���� ���͵� �� MyVector�� Vector<Ovject>�� ���ϰ� �ż�
{
	/*
	... ���� Vector ��� ���
	*/
	
	// ������
	MyVector()
	{
		// Vector(���� Ŭ����) ������ ȣ��
		super(1, 1);		// 12��° �� ������ Vector v = new Vector(3, 5)�� ���� �ƶ� 
		//-- ù ��° ���� : �־��� �뷮
		//	 �� ��° ���� : ������
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}

	void addFloat(float f)
	{
		addElement(new Float(f));
	}

	void addString(String s)
	{
		addElement(s);
	}

	void addCharArray(char[] a)
	{
		addElement(a);
	}

	void write()
	{
		/* ���� ��ҵ� ����ϴ°� ������ Iterator ���� �ȵ�.. char ���ڹ迭���� �ؽ��ڵ峪��
		Iterator<Object> it = this.iterator();

		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		5
		3.14
		�ȳ��ϼ���
		[C@15db9742
		*/

		// �� ����� ��
		Object o;
		int length = size();

		System.out.println("���� ��� ���� : " + length);
		//--==>> ���� ��� ���� : 4

		for (int i=0; i<length; i++)		//length 4��(addInt, addFloat, 
		{
			o = elementAt(i);

			// ��instanceof�� ������
			//-- ó���ؾ� �ϴ� ����� ��ü Ÿ�� Ȯ��
			if (o instanceof Integer)
			{
				System.out.println("������ : " + o);
			}
			else if (o instanceof Float)
			{
				System.out.println("�Ǽ��� : " + o);
			}
			else if (o instanceof String)
			{
				System.out.println("���ڿ��� : " + o.toString());
			}
			else if (o instanceof char[])
			{
				//System.out.println("���ڹ迭 : " + o);
				//System.out.println("���ڹ迭 : " + o.toString());
				//--==>> Object���� �������°Ŷ� �ؽ��ڵ� ����
				
				/* ��
				System.out.print("���ڹ迭 : ");
				for (char ch : (char[])o)		// o�� char �迭Ÿ������ ����ȯ�ϴ°�
				{
					System.out.print(ch);
				}
				System.out.println();
				//--==>> ������ : 5
				//		 �Ǽ��� : 3.14	
				//		 ���ڿ��� : �ȳ��ϼ���
				//		 ���ڹ迭 : study
				*/
				
				// ��
				System.out.println("���ڹ迭 : " + String.copyValueOf((char[])o));		// ���� �迭�� ���ڿ��� ó�����ִ°�
				/*
				������ : 5
				�Ǽ��� : 3.14
				���ڿ��� : �ȳ��ϼ���
				���ڹ迭 : study
				*/
			}
			else
			{
				System.out.println("Ÿ�� Ȯ�� �Ұ�~!!!");
			}
		}
	}
}

public class Test154
{
	public static void main(String[] args)
	{
		// MyVector Ŭ���� �ν��Ͻ� ����
		MyVector v = new MyVector();

		// �ֿ� ���� ���� �� �ʱ�ȭ
		int digit = 5;
		float real = 3.14f;
		String s = new String("�ȳ��ϼ���");
		char[] letters = {'s', 't', 'u', 'd', 'y'};

		v.addInt(digit);		//addInt�� ���� ���� �ڷᱸ���� ���� ����

		//v.write();
		//--==>> 5

		v.addFloat(real);		//addFloat�� ���� ���� �ڷᱸ���� �Ǽ� ����

		//v.write();
		//--==>> 3.14

		v.addString(s);			//addString�� ���� ���� �ڷᱸ���� ���ڿ� ����

		//v.write();
		//--==>> �ȳ��ϼ���

		v.addCharArray(letters);	//addCharArray ���� ���� �ڷᱸ���� ���� �迭 ����

		v.write();
		//--==>> [C@15db9742 �ؽ��ڵ峪��
	}
}

// ���ʹ� elementsŸ���� ���۷��� Ÿ�� ��ҷ� �Ѱܹ޾Ƽ� ó���ϴ°ɷ� ��������
// ũ����¼�� Ÿ�� ������ ���� ��ڽ��ؼ� �� ����� ����