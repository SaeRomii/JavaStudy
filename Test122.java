/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Object Ŭ����
=========================================*/

// �� Test121.java�� ��

// import java.lang.*;

public class Test122 // extends Object
{
	/*
	Object ����� ���
	*/
	
	// Object Ŭ�����κ��� �������� toString() �޼ҵ� ������
	@Override
	public String toString()
	{
		// return Ŭ������@�ؽ��ڵ�;
		//		  ------------------ String

		return "�������� toString()...";

	}

	public static void main(String[] args)
	{
		Test122 ob = new Test122();

		System.out.println("ob.toString : " + ob.toString());
		//--==>> ob.toString : Test122@15db9742

		System.out.println("ob          : " + ob);
		//--==>> ob          : Test122@15db9742
		
		// �޼ҵ� ������ ��...(17~25��°�� ���������� Ŭ������@�ؽ��ڵ� ���Դµ� ������ �� �ؿ�ó�� ����)
		//--==>> ob.toString : �������� toString()...
		//		 ob          : �������� toString()...
	}
}