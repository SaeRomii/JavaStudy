/*===================================================
  ���� �޼ҵ� �ߺ�����(Method Overloading) ����
  - �޼ҵ� �����ε��� ������ ���¿� �Ұ����� ����
===================================================*/


public class Test096
{
	public static void main(String[] args)
	{
		print();
		print(10);

		double result = print(10.1);					//�ڹٴ� = ���Կ����� ������ �����ʸ� ������ ������ �� �Ⱥ�����
		print(10.1);
		String temp = print(2.34);
	}
	
	public static void print(){}						// �޼ҵ� ������ �켱���� ����
	public static void print(int i){}					// 11��° ���� �Ű����� ���� 12��° ���� �Ű����� �־ �Ѵ� �� �� ����	
	//public static void print(int j){}					//--(X) �Ű����� ���ļ� �ȵ�
	public static void print(char c){}					//--(O) �� �ڵ� �� ��ȯ ��Ģ check
	public static void print(int i, int j){}
	public static void print(int i, double d){}			// Ÿ�� �޶� ���� �� �ڵ� �� ��ȯ ��Ģ check
	public static void print(double d, int k){}			// �� �ڵ� �� ��ȯ ��Ģ check
	public static double print(double){return 3.14;}	// 14��°�� ȣ�� �� �ڹٴ� ���и���
	public static void print(double d){}				// 15��°�� ȣ�� �� �ڹٴ� ���и���
	public static String print(double d){}				// ��ȯ �ڷ����� �������  �׷��� �ȵ�~!! �ڹ� ���и���
}