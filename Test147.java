/*=========================================
  ���� ����(Exception) ó�� ����
  - ��Ƴ� ���� �ٽ� ������
=========================================*/

public class Test147
{
	public static void main(String[] args)
	{
		Test147 ob = new Test147();

		try
		{
			int a = ob.getValue(-3);
			System.out.println("a : " + a);
		}
		catch (Exception e)
		{
			System.out.println("printStackTrace.....(main)");
			e.printStackTrace();
		}
	}

	public int getDate(int data) throws Exception
	{
		if (data<0)
			throw new Exception("data�� 0���� �۽��ϴ�.");	// �� ���ο� ���� �߻�
		return data + 10;
	}

	public int getValue(int value)	throws Exception //getValue�� getDate �ҷ���
	{
		int a=0;
		
		try
		{
			a = getDate(-2);								// �� ���� �߻�(������ �ҷ����°Ŵϱ�)

		}
		catch (Exception e)									// �� ���� ��Ƴ�
		{
			// ��Ƴ� ���ܿ� ���� ó��
			System.out.println("printStackTrace....");
			e.printStackTrace();

			// �� ��Ƴ� ���ܸ� �ٽ� ������(23��°�� throws Exception �ְ�, main �޼ҵ忡 try catch�� �ֱ�)
			throw e;
			//-- �鿡�� ��Ƴ� ���ܸ� �ٽ� �� �޼ҵ带 ȣ���� �������� ������ ����
			// ��throw e�� �ּ� ó�� ��
			// ��, ��Ƴ� ���ܸ� �ٽ� ������ ���� ���
			// main() �޼ҵ��� try~catch�� ������� �ʰ� �ȴ�.
		}
		
		return a;	//try�� �ȿ� �־��
		
	}
}

/* ���� ���
printStackTrace....
java.lang.Exception: data�� 0���� �۽��ϴ�.
        at Test147.getDate(Test147.java:27)
        at Test147.getValue(Test147.java:37)
        at Test147.main(Test147.java:14)
printStackTrace.....(main)
java.lang.Exception: data�� 0���� �۽��ϴ�.
        at Test147.getDate(Test147.java:27)
        at Test147.getValue(Test147.java:37)
        at Test147.main(Test147.java:14)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/