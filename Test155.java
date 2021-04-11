/*===================================
  ���� �÷��� (Collection) ����
===================================*/

import java.util.Vector;
import java.util.Collections;

public class Test155
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args)
	{
		// v ��� Vector �ڷᱸ�� ����
		Vector<String> v = new Vector<String>();

		// v ��� Vector �ڷᱸ���� colors ��� �߰�
		for (String color : colors)
		{
			v.add(color);
		}
		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("������ ���  : " + v.lastElement());
		System.out.println("����� ����  : " + v.size());

		System.out.println();
		/*
		ù ��° ��� : ����
		�� ��° ��� : ���
		������ ���  : ����
		����� ����  : 6
		*/


		// �� ù ��° ��Ҹ� ���Ͼ硻���� ���� �� set()
		v.set(0, "�Ͼ�");

		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("����� ����  : " + v.size());
		System.out.println();
		/*
		ù ��° ��� : �Ͼ�		�Ͼ����� ����ǰ� �и��� �ƴ϶� �������� �����
		�� ��° ��� : ���
		����� ����  : 6
		*/


		// �� ù ��° ��ҿ� ����Ȳ���߰� �� insertElementAt()
		v.insertElementAt("��Ȳ", 0);

		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("����� ����  : " + v.size());
		System.out.println();
		/*
		ù ��° ��� : ��Ȳ
		�� ��° ��� : �Ͼ�		��Ȳ�� ù��°�� ������ �ڷ� �� �и�
		����� ����  : 7
		*/

		
		// �� ��ü ���
		System.out.print("��ü ��� : " );
		for (String str : v)		//for each��
		{
			System.out.print(str + " ");
		}
		System.out.println("\n");
		//--==>> ��ü ��� : ��Ȳ �Ͼ� ��� �ʷ� �Ķ� ���� ����


		// �� �������� ����
		Collections.sort(v);

		// �� �������� ���� ���� �ٽ� ��ü ���
		System.out.print("�������� ���� ���� ��ü ��� : " );
		for (String str : v)		//for each��
		{
			System.out.print(str + " ");
		}
		System.out.println("\n");
		//--==>> �������� ���� ���� ��ü ��� : ��� ���� ���� ��Ȳ �ʷ� �Ķ� �Ͼ�  
		//		 �����ٶ������ ���ĵ�

		
		// �� �˻�
		// ��Collections.binarySearch();��
		// �˻� ��� ����. ��, �������� ���ĵ� �ڷῡ���� ��� ����.
		// �˻� ����� �������� ���� ��� ������ ��ȯ�Ѵ�.

		int idxBlue = Collections.binarySearch(v, "�Ķ�");		//v Vector�ڷ������� �Ķ� ã��
		System.out.printf("�Ķ� : %d��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
		System.out.println();
		//--==>> �Ķ� : 5��° �ε����� ��ġ�ϰ� �ִ�.
		// ���� �ε��� ���� : ��� ���� ���� ��Ȳ �ʷ� �Ķ� �Ͼ�  

		int idxPurple = Collections.binarySearch(v, "����");
		System.out.printf("���� : %d��° �ε����� ��ġ�ϰ� �ִ�.\n", idxPurple);
		System.out.println();
		//--==>> ���� : -2��° �ε����� ��ġ�ϰ� �ִ�.
		// �˻� ����� �������� �ʾƼ� ������ ��ȯ�ȴ�.


		// �� �������� ����
		Collections.sort(v, Collections.reverseOrder());

		// �� �������� ���� ���� �ٽ� ��ü ���
		System.out.print("�������� ���� ���� ��ü ��� : " );
		for (String str : v)		//for each��
		{
			System.out.print(str + " ");
		}
		System.out.println("\n");
		//--==>> �������� ���� ���� ��ü ��� : �Ͼ� �Ķ� �ʷ� ��Ȳ ���� ���� ���

		
		// �� �������� ���� ���� �Ķ� �˻�
		idxBlue = Collections.binarySearch(v, "�Ķ�");		//v Vector�ڷ������� �Ķ� ã��
		System.out.printf("�Ķ� : %d��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
		System.out.println();
		//--==>> �Ķ� : -8��° �ε����� ��ġ�ϰ� �ִ�.
		// �ε����� ������ �������� �����̶� �˻� �������� ����. ������ ��ȯ
		

		// �ٽ� �������ؼ� ã��� ������~!
		idxBlue = Collections.binarySearch(v, "�Ķ�", Collections.reverseOrder());		//v Vector�ڷ������� �Ķ� ã��
		System.out.printf("�Ķ� : %d��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
		System.out.println();
		//--==>> �Ķ� : 1��° �ε����� ��ġ�ϰ� �ִ�.




	}
}