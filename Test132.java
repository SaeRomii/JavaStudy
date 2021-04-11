/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - String Ŭ����
=========================================*/

public class Test132
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		//--==>> seoul korea

		// �� ���ڿ� ����
		System.out.println(s.substring(6, 9));	// 6��°�ڸ�~9��°�ڸ����� = 6,7,8
		//--==>> kor
		//-- ��String Ŭ������ substring(s, e)��
		//	  String ���ڿ��� �������
		//	  s��°���� e-1��°����
		//	  (��, �ε����� 0���� ����)

		System.out.println(s.substring(7));
		//--==>> orea
		//-- ��String Ŭ������ substring(s)��
		//	  String ���ڿ��� �������
		//	  s��°���� ������...(��, ���ڿ��� ���� ���̸�ŭ...)

		// �� ���ڿ� �������� �� ��
		System.out.println(s.equals("seoul korea"));
		//--==>> true

		System.out.println(s.equals("seoul Korea"));
		//--==>> false
		// ��ҹ��� �ٸ��� false����(��ҹ��� ������ ����)

		System.out.println(s.equalsIgnoreCase("Seoul KoReA"));
		//--==>> false
		// equalsIgnoreCase�� ��ҹ��� ���� ����

		// �� ã���� �ϴ� ��� ���ڿ�(s)��
		//	  ��for�� ���ڿ��� �����ұ�?
		//	  �����Ѵٸ� �� ��ġ�� ��� �ɱ�?
		// indexOf

		// s���� seoul korea �������
		System.out.println(s.indexOf("kor"));
		//--==>> 6
		// 6��°���� �ִٰ� �˷���

		System.out.println(s.indexOf("ea"));
		//--==>> 9

		System.out.println(s.indexOf("e"));
		//--==>> 1
		// �ߺ��Ǵ� �� ������ �տ� �ִ� ��ġ�� �˷��� �ڿ����� �Ⱥ�

		System.out.println(s.indexOf("tt"));
		//--==>> -1
		// ã������ ���� ������ -1�� ����
		
		//-- ã���� �ϴ� ���ڿ��� ��� ���ڿ��� ������ ���
		//	 �� ���ڿ��� �ε����� ��ȯ������
		//	 �������� ���� ��� ������ ��ȯ�ϰ� �ȴ�. (-1)
		//   �������� -1�� ������ ���� 

		// �� ��� ���ڿ�(s)�� ��rea���� ���������� ���� Ȯ��
		//	  (true / false)
		//	  endsWith
		System.out.println(s.endsWith("rea"));
		//--==>> true

		System.out.println(s.endsWith("oul"));
		//--==>> false

		// �� ã���� �ϴ� ��� ���ڿ�(s)��
		//    ��e�����ڿ��� �����ұ�?
		//    �����Ѵٸ� �� ��ġ�� ��� �ɱ�?
		//    (��, �ڿ������� �˻�)
		//    lastIndexOf
		//    ��ĵ�� �ڿ������� �ϴµ� ���� ī������ �տ���������

		// seoul korea
		System.out.println(s.indexOf("e"));
		//--==>> 1

		System.out.println(s.indexOf("o"));
		//--==>> 2

		System.out.println(s.lastIndexOf("e"));
		//--==>> 9

		System.out.println(s.lastIndexOf("o"));
		//--==>> 7

		// �� ��� ���ڿ�(s) ��
		//	  ��6����° �ε��� ��ġ�� ���ڴ�?
		//	   charAt

		// seoul korea
		System.out.println(s.charAt(6));
		//--==> k

		//System.out.println(s.charAt(20));
		//--==>> ���� �߻�(��Ÿ�ӿ���)
		//-- java.lang.StringIndexOutOfBoundsException
		// String �ε��� ����ٴ� ��

		// �� ��� ���ڿ�(s)�� �� ���ڿ�("seoul corea")��
		//	  � ���ڿ��� �� ū��?
		//	  �� ���ڿ��� �ٸ��ٸ� ���̸� Ȯ��
		//	  compareTo
		System.out.println(s.compareTo("seoul corea"));
		//--==>> 8
		//-- c ~ k �� defghijk(8)

		System.out.println(s.compareTo("seoul koreb"));
		//--==>> -1
		// b����~a�����ϱ� -1 �����γ���

		System.out.println(s.compareTo("seoua korea"));
		//--==>> 11
		//--==>> a ~ l �� bcdefghijkl(11)

		// �� ��� ���ڿ�(s) ��
		//	  �ش� ���ڿ��� ã�� ���ϴ� ���·� ����
		//	  replaceAll
		s = "�츮���� ���ѹα� ���ѵ��� ����";
		s = s.replaceAll("����", "����");
		System.out.println("s : " + s);
		//--==>> s : �츮���� ���۹α� ���۵��� ����

		// �� ���� ����
		//	  .trim()
		s = "        ��        ��        ";
		System.out.println("|" + s + "|");
		//--==>> |        ��        ��        |

		System.out.println("|" + s.trim() + "|");	//trim�޼ҵ� �� �߶󳻴� ����� ���� �޼ҵ�
		//--==>> |��        ��|
		//-- ���� ���� �����ڸ� ���� ����
		//	 ���� ���� �����ڸ����� ���� �����ϴٰ� ���� �ƴѰ� ������ ����

		System.out.println("|" + s.replaceAll(" ", "") + "|");
		//--==>> |���|
		
		// format
		int n = 2345678;
		System.out.printf("%d", n);
		System.out.format("%d", n);	//2345678�� %d���·� ����ض�
		//--==>> 23456782345678

		System.out.println();

		s = String.format("%d", n);		//n�� %d���Ŀ� �°� ���ڿ� ���·� ��ȯ�ض�
		System.out.println(s);
		//--==>> 2345678

		s = String.format("%,d", n);
		System.out.println(s);
		//--==>> 2,345,678		����° �ڸ����� , ��

		double p = 3.141592;
		s = String.format("%f", p);
		System.out.println(s);
		//--==>> 3.141592

		s = String.format("%.2f", p);
		System.out.println(s);
		//--==>> 3.14

		String[] strArray = "�⺻,����,���".split(",");		// {"�⺻", "����", "���"}
		for (String str : strArray)		//strArray �迭�� �ִ°� �ϳ��� ������ ���� �϶�� �ݺ���
		{
			System.out.print(str + " ");
		}
		System.out.println();
		//--==>> �⺻ ���� ���

		
	}
}