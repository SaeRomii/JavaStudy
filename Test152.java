/*===================================
  ���� �÷��� (Collection) ����
===================================*/

import java.util.Queue;
import java.util.LinkedList;		//Queue�� ������ü
		
public class Test152
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args)
	{
		// Queue �ڷᱸ�� ����
		Queue<String> qu = new LinkedList<String>();

		// qu ��� �ش� �ڷᱸ��(Queue)�� colors ������ �Է� �� offer()
		/* ���� Ǯ���� ���
		for (String color : colors)
		{
			qu.add(color);
		}
		*/
		for (String color : colors)
		{
			qu.offer(color);
		}
		

		// �ش� �ڷᱸ���� ��� ������ ���
		while (qu.peek()!=null)		//null�� �ƴϸ� ä������
		{
			System.out.print(qu.poll() + " ");
		}
		System.out.println();
		//--==>> ���� ��� �ʷ� �Ķ� ���� ����
	}
}