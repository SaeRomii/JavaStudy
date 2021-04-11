/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - StringBuffer Ŭ����
=========================================*/

/*
�� StringBuffer Ŭ������
   ���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
   String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
   StringBuffer Ŭ������ ���ڿ��� ����� ��
   ���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִٴ� ���̴�.

   ��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
   ��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
   ���� ������ ���� ũ�⸦ �ٲ� �� �ִ� ����� �����ϴ� ���̴�.

   ����, JDK 1.5 ���ĺ��ʹ�
   ���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�.
   StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
   ���� ū �������� multi-thread unsafe ��� ���̴�.
   ��, Syncronization�� ���� ������
   StringBuffer ���� ������ ���ü�(����ȭ) ������ ���ٸ�
   StringBuilder �� ����ϴ� ���� ������ ����ų �� �ִ�.

   thread : �۾����� ���� ����
   multi-thread unsafe ���� �۾� ����
   StringBuffer�� ����� �� ���� StringBuilder���� (�����ؾ��ϴϱ�)
   ������ ������ StringBuilder�� �� ����
*/

public class Test133
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");	//lang��Ű�� �ȿ� ����

		System.out.println(sb1 == sb2);
		//--==>> false
		// new�� �־ ���� �ٸ� �ּҰ���

		System.out.println(sb1.equals(sb2));			
		//--==>> false
		// Object �״�� �޾Ƽ� �����־ �������̵� ���⶧���� ���� �ּҰ� ������ �ٸ����� ���ϴ°Ŷ� false

		// toString�� Object�� �ڼ�
		// StringBuffer�� Object�� �ڼ�

		//sb1.toString() 
		//sb1�� ������ StringBuffer��ü������ sb1.toString()���� ���� ������ String��ü�� ����
		// String�� ��ȯ�ϱ� ������

		//sb1.toString().equals()
		// sb1.toString()�� String�̴ϱ� String�޼ҵ� . �ڿ� equals���

		System.out.println(sb1.toString().equals(sb2.toString()));
		//--==>> true
		// sb1.toString�� sb2.toString�� String��ü�̴ϱ� String���� equals�� ���� �� �񱳶� �Ѵ� seoul�̱⶧���� true

		/*
		String str1 = sb1.toString();
		String str2 = sb2.toString();

		System.out.println(str1.equals(str2));
		*/

		StringBuffer sb3 = new StringBuffer();
		//-- StringBuffer �⺻ ������ ȣ���(�ν��Ͻ� ���� ����)
		//	 �⺻������ �����Ǵ� ���� ũ�� ��16��

		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 16

		///////////////////////////////////////////////////////////////////////////////////

		System.out.println(sb3);
		//--==>> ��

		sb3.append("seoul");		// sb3 += "seoul"; �� sb3�� seoul��ŭ ����
									// sb3 = sb3 + "seoul"; �� sb3 = "" + "seoul"; �� sb3 = "seoul";
		sb3.append("korea");
		sb3.append("�츮����");
		sb3.append("���ѹα�");

		System.out.println(sb3);
		//--==>> seoulkorea�츮������ѹα�

		System.out.println(sb3.toString());
		//--==>> seoulkorea�츮������ѹα�

		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34
		// �ȿ� �����Ǵ� ������ �������� ���� ũ��� �ڵ����� �þ

		///////////////////////////////////////////////////////////////////////////////////

		// toUpperCase : �ҹ��ڸ� �빮�ڷ� ����
		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE

		// toLowerCase : �빮�ڸ� �ҹ��ڷ� ����
		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//--==>> java and oracle

		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());
		// sb3.to~Case�� String��ü�� ������

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		System.out.println(temp3.toLowerCase());
		System.out.println(sb3.toString().toUpperCase());
		//--==>> SEOULKOREA�츮������ѹα�
		//		 seoulkorea�츮������ѹα�
		//		 SEOULKOREA�츮������ѹα�


		// seoulkorea�츮������ѹα� �� sb3
		// �� ��� ���ڿ�(sb3) �� seoul ���ڿ� �տ�
		//	  ���ѱ����̶�� ���ڿ� �߰� (insert�� �����ϰ� �Ǹ� ���ڿ� �߰��Ǹ鼭 sb3 ��ü�� �����)
		//	  insert
		sb3.insert(0, "�ѱ�");
		System.out.println("seoul �տ� ���ѱ����߰� : " + sb3.toString());
		//--==>> seoul �տ� ���ѱ����߰� : �ѱ�seoulkorea�츮������ѹα�


		// �ѱ�seoulkorea�츮������ѹα� �� sb3(������)
		// �� ��� ���ڿ�(sb3) �� seoul ���ڿ� �ڿ�
		//	  ��������̶�� ���ڿ� �߰�
		//	  ��, ��� ���ڿ��� �ε����� ���� Ȯ������ ����... [����]
		
		// �� �ε��� ���� Ȯ���ؼ� �߰��ϱ�
		//sb3.insert(7, "���");
		//System.out.println("seoul �ڿ� ��������߰� : " + sb3.toString());
		//--==>> seoul �ڿ� ��������߰� : �ѱ�seoul���korea�츮������ѹα�

		// �� �ε��� ���� Ȯ������ �ʰ� �߰��ϱ�
		// step 1
		//System.out.println(sb3.indexOf("seoul"));
		//--==>> 2
		
		// step 2
		//sb3.insert(sb3.indexOf("seoul"), "���");
		//System.out.println(sb3.toString());
		//--==>> �ѱ����seoulkorea�츮������ѹα�

		// step 3
		//sb3.insert(sb3.indexOf("seoul"+5, "���"); �ٵ� 5�� �ε��� ���� ���Ŷ� �ȵ�
		//System.out.println(sb3.toString());
		//--==>> �ѱ�seoul���korea�츮������ѹα�

		// step 4
		//sb3.insert(sb3.indexOf("seoul")+("seoul"�� ����), "���");
		//System.out.println(sb3.toString());
		
		// step 5
		sb3.insert(sb3.indexOf("seoul")+"seoul".length(), "���");
		System.out.println(sb3.toString());
		//--==>> �ѱ�seoul���korea�츮������ѹα�

		// ���ڿ� ���� : delete
		// �� ���츮���󡻹��ڿ� ����
		//sb3.delete(14, 18);
		//System.out.println(sb3);
		//--==>> �ѱ�seoul���korea���ѹα�

		// ���� �ε��� Ȯ������ �ʰ� ���ڿ� ����
		//System.out.print(sb3.toString());
		sb3.delete(sb3.indexOf("�츮����"), sb3.indexOf("�츮����")+"�츮����".length());
		System.out.println(sb3);
		//--==>> �ѱ�seoul���korea���ѹα�


		// �� ��� ���ڿ�(sb3)����
		//	  ��korea������ ���ڿ� ����(korea ����)
		//	  ���� �ߴ���ó�� �迭�ƴϰ� sb3.length()�޼ҵ� ����Ͽ� ���
		
		// �ε��� Ȯ���ϰ� ����
		//sb3.delete(9, 19);
		//System.out.println(sb3);
		//--==>> �ѱ�seoul���

		// �ε��� Ȯ������ �ʰ� ����
		//sb3.delete(sb3�� "korea"���ڿ�������ġ, sb3�ǹ��ڿ�����)
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3.toString());
		//--==>> �ѱ�seoul���

		// �� ��� ���ڿ�(sb3)����
		//	  ��seoul������ ���ڿ� ����(seoul ����)
		sb3.delete(sb3.indexOf("seoul")+"seoul".length(), sb3.length());
		System.out.println(sb3);
		//--==>> �ѱ�seoul

		///////////////////////////////////////////////////////////////////////////////////

		// ���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34
		// ����ũ�� �״��
		// �ȿ� ���빰 �����ϸ� ����ũ�� �ڵ����� ���������� �ȿ� ���빰 �����ص� ���� ũ�� �پ���� ����

		
		// ���ڿ�(sb3)�� ���� Ȯ��
		System.out.println("���ڿ��� ���� : " + sb3.length());
		//--==>> ���ڿ��� ���� : 7

		// ���� ũ�� ���� �� ���� ���ڿ��� ��Ƶ� �� �ִ� ���� ũ���...
		sb3.trimToSize();

		// ���� ũ�� ���� ���� �ٽ� ���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.length());
		//--==> ���� ũ�� : 7
		
	}
}

