/*===================================
  ���� Ŭ������ �ν��Ͻ� ����
====================================*/

// �� �ǽ� ����
// ���� ���̿� �ѷ� ���ϱ�

// Ŭ���� ���� �ϳ� �� �����
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ ����������(������) �����Ѵ�.
// (Ŭ������ : CircleTest) �� CircleTest.java

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

// ���� ��)
// ������ �Է� : xx

// >> �������� xx �� ����
// >> ���� : xxx.xx
// >> �ѷ� : xxx.xx
// ����Ϸ��� �ƹ� Ű��...

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		/* ���� Ǯ���� ���
		CircleTest ob = new CircleTest();		// ob = object
		double a, b;

		ob.input();
		a = ob.calLength();
		b = ob.calArea();

		ob.print(a, b);
		*/

		CircleTest ob = new CircleTest();
		ob.input();								// ������ �� ����ϴµ� CircleTest�� �ִ� �޼ҵ忡 �ִ� br.readLine�� ���� ��� ġ��
												// �ۿ� ��������� �ϴ� throws IOException�� ���鼭 ���θ޼ҵ� �ڿ� �ۼ��ϰԵǸ�
												// ���� Ǯ���� ��Ĵ�� �Ƚᵵ�� ���θ޼ҵ� �ʿ��� ���ԵǸ� �ƿ� ������ �����°�
		double length = ob.calLength();
		double area = ob.calArea();
		
		
		/*
		System.out.println("area : " + area);
		System.out.println("length : " + length);
		*/
		
		ob.print(length, area);
	}
}

/* ������
������ �Է� : 25
�������� 25�� ����
���� ���� : 1963.50
���� �ѷ� : 157.08
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/