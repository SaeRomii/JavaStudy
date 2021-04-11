/*===================================
  ���� �÷��� (Collection) ����
===================================*/

// ����Ʈ���� ������ �����͸� �־ ������.

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

class Demo
{
	// ��ü ��� �޼ҵ�
	public void printList(List<String> lists)
	{
		System.out.println("\nLists -------------------------");
		for (String s : lists)
		{
			System.out.print(s + " ");
		}
		System.out.println();
	}

	// ���� ��� �޼ҵ�
	public void printReverseList(List<String> lists)
	{
		System.out.println("\nReversed Lists ----------------");

		ListIterator<String> li = lists.listIterator(lists.size());
		// ListIterator�� List���� �����ϴ� �������̽��� List�� ���Ե� ��� ��ü�� ��������� 
		// Ž���ϸ鼭 ��ü�� ���� �� �ִ� ����� ����
		
		//��� �� �������� ��� �� ListIterator�� Ȱ���Ͽ� ��� �� hasPrevious() / previous() �޼ҵ� Ȱ��
		while (li.hasPrevious())
		{
			String s = li.previous();
			System.out.print(s + " ");
		}
		System.out.println();

	}

	// ����� �����ϴ� ���ڿ� �˻� �޼ҵ�
	public void searchList(List<String> lists, String searchValue)	//�ڷ� �Ѱ��ְ�, ã�����ϴ°�
	{
		Iterator<String> it = lists.iterator();
		System.out.println("\n��" + searchValue + "���� �����ϴ� ���ڿ� -------------------------");
		while (it.hasNext())
		{
			String s = it.next();

			// �� ��s.startsWith(searchValue)��
			//--  ���� �� ����(���ڿ�)�� searchValue �ΰ�?
			//	  �׷��ٸ� ����Ѵ�. �ƴϸ�, ������� �ʴ´�.
			if (s.startsWith(searchValue))
			{
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}

	// �˻�(���� �ε��� ~ �� �ε���)
	List<String> searchList(List<String> lists, int start, int end)
	{
		return lists.subList(start, end+1);
	}

	// ����(���� �ε��� ~ �� �ε���)
	void removeItems(List<String> lists, int start, int end)
	{
		lists.subList(start, end+1).clear();
	}
}


public class Test161
{
	public static void main(String[] args)
	{
		String[] data = {"�츮����", "���ѹα�", "�츮�Ǽ�", "��������", "������Ʈ"};

		Demo demo = new Demo();

		Vector<String> v = new Vector<String>();
		ArrayList<String> list = new ArrayList<String>();
		LinkedList<String> link = new LinkedList<String>();

		/*
		�� ArrayList �� ���Ͽ� LinkedList �� �����
		   - ����
		     ���ڷ��� ���԰� ������ �����ϴ�.  (ArrayList�� �翷�� �޸� �������� �ٸ� ��ġ�� �̵��ؼ� ���� ���� �ؾ��ؼ� ����)
			 ������Ʈ ������ �ڷ��� �̵��� �ʿ����� �ʴ�.
			 ����� �� ��� ����� ������ �����ϴ�.
			 ���������� ��� ����� �Ҵ��� �ʿ����� �ʴ�.
		   - ����
		     ���������� ������� ���� ���� ������ ���� �ִ�.
			 ���˰����� �����ϴ�.
			 ��Ư�� �ڷ��� Ž�� �ð��� ���� �ҿ�ȴ�.


			 LinkedList�� �ڷᰡ ������ ����Ǿ� �־ ������ � ��ġ���ֵ� ���Ḹ �Ǿ������� ����
			 �߰��� �����Ϸ��� �ϸ� ���� ���� �� ���� ���ο� �޸� ��ġ�� �ִ� ���̶� �����ϸ��
		*/

		for (String s : data)
		{
			v.add(s);
			list.add(s);
			link.add(s);
		}

		// �⺻ ��ü ���
		demo.printList(v);
		demo.printList(list);
		demo.printList(link);
		//--==>>
		/*
		Lists -------------------------
		�츮���� ���ѹα� �츮�Ǽ� �������� ������Ʈ

		Lists -------------------------
		�츮���� ���ѹα� �츮�Ǽ� �������� ������Ʈ

		Lists -------------------------
		�츮���� ���ѹα� �츮�Ǽ� �������� ������Ʈ
		*/

		// ���� ��ü ���
		demo.printReverseList(v);
		demo.printReverseList(list);
		demo.printReverseList(link);
		//--==>>
		/*
		Reversed Lists ----------------
		������Ʈ �������� �츮�Ǽ� ���ѹα� �츮����

		Reversed Lists ----------------
		������Ʈ �������� �츮�Ǽ� ���ѹα� �츮����

		Reversed Lists ----------------
		������Ʈ �������� �츮�Ǽ� ���ѹα� �츮����
		*/

		// �˻� ���
		demo.searchList(v, "��");
		demo.searchList(list, "����");
		demo.searchList(link, "����");

		//--==>> 
		/*
		���롻�� �����ϴ� ���ڿ� -------------------------

		���ѹα�

		��������
		������Ʈ

		���������� �����ϴ� ���ڿ� -------------------------




		������Ʈ

		�����ѡ��� �����ϴ� ���ڿ� -------------------------

		���ѹα�

		��������
		*/

		List<String> sub = demo.searchList(list, 1, 3);
		demo.printList(sub);
		//--==>> Lists -------------------------
		//		 ���ѹα� �츮�Ǽ� ��������

		List<String> clear = demo.removeItems(list, 1, 3);
		demo.printList(sub);
	}
}