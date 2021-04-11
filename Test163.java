/*===================================
  ���� �÷��� (Collection) ����
===================================*/

// Set �� HashSet, TreeSet
// - ���� (�ǹ�) ����
// - �ߺ��� ������� �ʴ� ����(�⺻)

// TreeSet�� set�� �ڽ��� �ڽ� (set - sortedset - treeset ��)
// TreeSet�� ���ı���� �ִ�. �׷��� HashSet�� ������ �� ����(���󵵵� ����)

/*
�� TreeSet<E> Ŭ����

   - java.util.TreeSet<E> Ŭ������
     set �������̽��� ����� SortedSet �������̽��� ������ Ŭ������	(SortedSet �θ� set-�������̽� �������̽����� extends)
	 �����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ���ĵȴ�.
	
	 ���� set���� ���ı�� �߰�(Sort�� �����̴ϱ�)
*/

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;

// VO	�� Value Object
// DTO	�� Data Transfer Object
// DAO	�� Data Access Object

class GradeVO	//GradeDTO
{
	// �ֿ� �Ӽ� ����
	private String hak;
	private String name;
	private int kor, eng, mat;

	// getter / setter ����(privateȭ �Ǿ��ִ°� ������ getter setter ������)
	// setter
	void setHak(String hak)
	{
		this.hak = hak;
	}

	String getHak()
	{
		return hak;
	}
	
	void setName(String name)
	{
		this.name = name;
	}

	String getName()
	{
		return name;
	}
	
	void setKor(int kor)
	{
		this.kor = kor;
	}

	int getKor()
	{
		return kor;
	}

	void setEng(int eng)
	{
		this.eng = eng;
	}

	int getEng()
	{
		return eng;
	}

	void setMat(int mat)
	{
		this.mat = mat;
	}
	
	int getMat()
	{
		return mat;
	}

	// ������(����� ���� ������ �� 5���� �Ű������� ���� ������)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak=hak;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}

	// ������(����� ���� ������ �� �Ű����� ���� �⺻ ������)
	GradeVO()
	{

	}

	// �߰� �޼ҵ� ���� �� ���� ����
	int getTotal()
	{
		return kor + eng + mat;
	}
	
}

class MyComparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1, T o2)
	{
		GradeVO s1 = (GradeVO)o1;	//ObjectŸ���� GradeVOŸ������ ĳ����
		GradeVO s2 = (GradeVO)o2;

		// �й� ���� ��������
		//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		/*
		   2103     �谡��   90   80   70    240
		   2104     �弭��   80   70   60    210
		   2106     �̻���   12   23   34     69
		   2107     �輭��   50   50   50    150
		   2115     �ڳ���  100  100  100    300
		*/

		// ���� ���� ��������
		//return s1.getTotal() - s2.getTotal();	//-- �������� ����
		/*
		   2106     �̻���   12   23   34     69
		   2107     �輭��   50   50   50    150
		   2104     �弭��   80   70   60    210
		   2103     �谡��   90   80   70    240
		   2115     �ڳ���  100  100  100    300
		*/

		// ���� ���� ��������
		//return s2.getTotal() - s1.getTotal();
		/*
		   2115     �ڳ���  100  100  100    300
		   2103     �谡��   90   80   70    240
		   2104     �弭��   80   70   60    210
		   2107     �輭��   50   50   50    150
		   2106     �̻���   12   23   34     69
		*/

		// �̸� ����
		//return s1.getName() - s2.getName();
		//--==>> ���� �߻�(������ ����) String
		//return Integer.parseInt(s1.getName()) - Integer.parseInt(s2.getName());
		//--==>> ���� �߻�(��Ÿ�� ����)
		return s1.getName().compareTo(s2.getName());
		/*
		   2103     �谡��   90   80   70    240
		   2107     �輭��   50   50   50    150
		   2115     �ڳ���  100  100  100    300
		   2106     �̻���   12   23   34     69
		   2104     �弭��   80   70   60    210
		*/

	}
}

public class Test163
{
	public static void main(String[] args)
	{
		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		TreeSet<String> set = new TreeSet<String>();

		// set�̶�� TressSet �ڷᱸ���� ��� �߰� �� add()
		set.add("¯���¸�����");
		set.add("�Ʊ����Ѹ�");
		set.add("�Ƶ�����");
		set.add("���������緹��");
		set.add("��Ž���ڳ�");
		set.add("�ɽ�");
		set.add("���ϸ���");
		set.add("����ö��999");
		set.add("�̷��ҳ��ڳ�");

		// Iterator �� Ȱ���Ͽ� set ��� ��ü ���
		
		Iterator<String> it = set.iterator();

		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println("\n");
		//--==>> ���������緹�� ��Ž���ڳ� �̷��ҳ��ڳ� �ɽ� �Ʊ����Ѹ� �Ƶ����� ����ö��999 ¯���¸����� ���ϸ���
		

		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		//TreeSet<String> st = new TreeSet<String>();
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();

		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

		// ������ �ڷᱸ���� ��� �߰�
		//-- 2103 �谡�� 90 80 70
		//	 2104 �弭�� 80 70 60
		//	 2115 �ڳ��� 100 100 100
		//	 2106 �̻��� 12 23 34
		//	 2107 �輭�� 50 50 50
		
		//GradeVO vo1 = new GradeVO("2103", "�谡��", 90, 80, 70);
		//set2.add(vo1);

		set2.add(new GradeVO("2103", "�谡��", 90, 80, 70));
		set2.add(new GradeVO("2104", "�弭��", 80, 70, 60));
		set2.add(new GradeVO("2115", "�ڳ���", 100, 100, 100));
		set2.add(new GradeVO("2106", "�̻���", 12, 23, 34));
		set2.add(new GradeVO("2107", "�輭��", 50, 50, 50));


		// ��� �߰��� �ڷᱸ�� ��ü ���
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n", vo.getHak(), vo.getName(), 
				              vo.getKor(), vo.getEng(), vo.getMat(), vo.getTotal());
		}
		System.out.println();
	}
}