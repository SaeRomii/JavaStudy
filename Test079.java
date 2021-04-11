/*=======================================================
  ���� Ŭ������ �ν��Ͻ� ����
  - ������(Constructor)�� �ʱ�ȭ ����(Initialized Block)
=======================================================*/

public class Test079
{
	/*

	int n=100;
	int m=200;
	>> �̰� �� �� ����� ���ÿ� �ʱ�ȭ�ϴ°� ����
	*/

	int n;
	int m;
	
	// �ʱ�ȭ ����(Initialized Block)
	{
		n=100;					//Ŭ�������� ���� ������� �ȵ� �޼ҵ� �ȿ����� ���� {} ���� �ȿ����� ����
		m=200;						
		System.out.println("�ʱ�ȭ ���� ����...");
	}

	// ������(Constructor)
	Test079()
	{
		n=10;
		m=20;
		System.out.println("������ ����...");
	}

	Test079(int n, int m)
	{
		this.n = n;
		this.m = m;
		System.out.println("���� �ִ� ������ ����...");
	}

	void write()
	{
		System.out.println("n : " + n + ", m : " + m);
	}
	

	public static void main(String[] args)
	{
		Test079 ob1 = new Test079();
		ob1.write();
		//--==>> �ʱ�ȭ ���� ����...
		//		 ������ ����...
		//		 n : 10, m : 20

		Test079 ob2 = new Test079(1234, 5678);
		ob2.write();
		//--==>> �ʱ�ȭ ���� ����...
		//		 ���� �ִ� ������ ����...
		//		 n : 1234, m : 5678
	}
}
