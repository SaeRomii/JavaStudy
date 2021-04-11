/*===================================
  ���� �÷��� (Collection) ����
===================================*/

// ���� �ڷᱸ�� ��ü ���� �� ������ ����� ���� �ڷ��� Ŭ���� Ȱ��
// �� �ڷ������� Ȱ��

import java.util.Vector;

// ����� ���� Ŭ���� ���� �� �ڷ���ó�� Ȱ��
class MyData
{
	// �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
	private String name;			//-- �̸�
	private int age;				//-- ����

	// getter / setter ����
	public String getName()			//name �ޱ�
	{
		return name;				//name ��ȯ name�Ӽ��� ���� getter ����
	} 

	public void setName(String name)				//�޾Ƽ� ���� �� �Ű������� ����
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	// ������(���� ���� ������)
	public MyData()
	{
		name = "";
		age = 0;
	}
	// ������(���� 2���� ������)
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

public class Test157
{
	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� �ν��Ͻ� ����
		Vector<MyData> v = new Vector<MyData>();
		//-- MyData ������� ������ �ν��Ͻ���
		//	 Vector �ڷᱸ�� v�� �����ϴ� ���� ����

		// ���� �ڷᱸ�� v��
		// ������ 16�� / �Ҽ��� 14�� / ������ 86��
		// ��Ƴ���


		// ��
		/*
		MyData st1 = new MyData();
		st1.setName("������");
		st1.setAge(16);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("�Ҽ���");
		st2.setAge(14);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("������");
		se3.setAge(86);
		v.add(st3);
		*/


		// ��
		MyData st1 = new MyData("������", 16);
		v.add(st1);
		MyData st2 = new MyData("�Ҽ���", 14);
		v.add(st2);
		MyData st3 = new MyData("������", 86);
		v.add(st3);
	

		// ��
		/*
		v.add(new MyData("������", 16));
		v.add(new MyData("�Ҽ���", 14));
		v.add(new MyData("������", 86));
		*/

		// ���� �ڷᱸ�� v�� ��� ����(���) ��ü ����ϱ�
		// ���� ��)
		// �̸�:������, ����:16
		// �̸�:�Ҽ���, ����:14
		// �̸�:������, ����:86
		
		/* ���� Ǯ���� ���
		for (MyData s : v)			//�迭�� �ƴϱ⶧���� st1.2.3 ������� ������ ���Ƿ� ���� s�� �ֱ�
		{
			System.out.println("�̸� :" + s.getName() + " ���� :" + s.getAge());
		}
		*/
		


		/* �������� Ǯ���ֽ� ��� ��
        for (MyData obj : v)
        {
			System.out.printf("�̸�:%s, ����:%d\n", obj.getName(), obj.getAge());
        }
		�̸�:������, ����:16
		�̸�:�Ҽ���, ����:14
		�̸�:������, ����:86
		*/
		


		/* �������� Ǯ���ֽ� ��� ��
		for (int i=0; i<v.size(); i++)
		{
			System.out.printf("�̸�:%s, ����:%d\n", v.elementAt(i).getName(), v.elementAt(i).getAge());
		}
		System.out.println();
		*/
		//�̸�:������, ����:16
		//�̸�:�Ҽ���, ����:14
		//�̸�:������, ����:86



		// �������� Ǯ���ֽ� ��� ��
		for (Object temp : v)	// temp�� Object�� ��ĳ���� ����
		{
			System.out.printf("�̸�:%s, ����:%d\n", ((MyData)temp).getName(), ((MyData)temp).getAge());	// MyData�� �ٿ�ĳ���� 
		}
		//�̸�:������, ����:16
		//�̸�:�Ҽ���, ����:14
		//�̸�:������, ����:86
		
	}
}

/* ���� ���
�̸� :������ ���� :16
�̸� :�Ҽ��� ���� :14
�̸� :������ ���� :86
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/