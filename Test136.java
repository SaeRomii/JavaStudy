/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - ���ڿ� ���� Ŭ����
  - ĳ���� ��(CharacterSet)
=========================================*/

/*
�� ĳ���� ��(Character Set)

   - �����ڵ�(unicode)
     ���� ǥ������ ������ 2����Ʈ���� ���� ������ ���� ���ں�ȣ
	 ü��(UCS : Iniversal Code System)�� ���Ѵ�.
	 ������ǻ��, IBM, ����ũ�μ���Ʈ ���� ���ҽþ����� ������
	 �����ڵ�(Unicod)�� 1990�⿡ ù ������ ��ǥ�Ͽ���,
	 ISO/IEC JTC1 ���� 1995�� 9�� ���� ǥ������ �����Ͽ���.
	 ���� ��Ī�� ISO/IEC 10646-1(Universal Multiple-Octet Coded Character Set)�̴�.

	 �������� ��ȯ�� ��Ȱ�ϰ� �ϱ� ���Ͽ� ���� 1���� �ο��Ǵ� ����
	 16��Ʈ�� �����Ͽ���. �ڵ� 1���ڴ� ����� 7��Ʈ, �񿵾�� 8��Ʈ, �ѱ��̳� �Ϻ����
	 16��Ʈ�� ���� ������ �Ǵµ� �̵��� ��� 16��Ʈ�� ������ ���̴�.

   - UTF-8�� UTF-16
     UTF-8�� UTF-16�� ���̸� �Ѹ���� ���ϸ�
	 ���ڸ� ǥ���� ���� ������ �ٸ��ٴ� ���̴�.
	 UTF-8�� 8��Ʈ�� ������ ��Ƽ����Ʈ���� ���ڸ� ǥ���ϰ�
	 UTF-16�� 16��Ʈ�� ������ ��Ƽ����Ʈ���� ���ڸ� ǥ���Ѵ�.

	 ��UTF-8(8bit UCS Transformation Format)
	   ������ �⺻������ ����ϴ� �ڵ�
	   UCS-2�� ���ǵǴ� ���� ������ �̿��Ͽ� ����� ���ڿ���
	   ����Ʈ ���� ��ȯ�ϴ� ����� 1�� 1���ڸ� 1~6����Ʈ ������
	   ��Ƽ����Ʈ�� ��ȯ�Ѵ�.

	 ��UTF-16(16bit UCS Transformation Format)
	   �ڹ��� �⺻ �ڵ�. �ڹٿ����� ���� �ϳ��� �����ϸ� ����Ʈ ����
	   �������̵�, �ѱ۹����̵� 2����Ʈ�� �����ϰ� �ȴ�.
	   UCS-2�� ���ǵǴ� ���� ������ �̿��ؼ� ����� ���ڿ���
	   UCS-4�� �Ϻ��� ���ڸ� ä���ֱ� ���� ���ڵ� ���.
	   UTF-8�� ������ �� �ִ�.
	   UCS-2�� �̿��� �� �ִ� ���ڼ��� ���� �ø� �� �ִ�.

   �� �ڹٴܿ����� UTF-16�� ����ϰ� �������� UTF-8�� ����ϱ� ������
   	  ��쿡 ���� ��ȯ�ؾ� �ϴ� ��Ȳ�� �߻��� �� �ִ�.

�� ���� �ڵ��� ����

   - KSC5601
     �ѱ� �ϼ��� ǥ��(�ѱ� 2,350�� ǥ��)
	 �ѱ۰���ǥ�� ����ó���о�(C)�� 5601�� ǥ�ؾ�

   - KSC5636
     �����ڿ� ���� ǥ��
	 �ѱ�����ǥ�� ����ó���о�(C)�� 5636�� ǥ�ؾ�
	 ���� ASCII Code���� ��������(\)�� ��(\)ǥ�÷� ��ü

   - EUC-KR(MS949)
     Bell-Laboratories ���� ���н� �󿡼� ������ �̿��� ���ڸ�
	 �����ϱ� ���� ������ Ȯ�� ���н� �ڵ�(Extend UNIX Code)��
	 �ѱ� ���ڵ� ���
	 ������ KSC5636���� ó���ϰ�, �ѱ��� KSC5601�� ó��
	 (EUC-KR(MS949) = KSC5601 + KSC5636)

   - UTF-8
     ������ ���ڴ� 1����Ʈ, �ѱ��� 3����Ʈ�� ǥ��
	 (������ ���� ��� UTF-8 �������� JSP�� �ۼ��� ������
	  ���ϵ� UTF-8 �������� �����ؾ� �Ѵ�.)

   - UTF-16
     �ڹ� �⺻ �����ڵ�
	 ������ ���ڴ� 1����Ʈ, �ѱ��� 2����Ʈ�� ǥ��

   - ISO-8859-1
     ������ ��� ǥ�⿡ �ʿ��� US-ASCII�� ���� 94���� ������ ������ ����

*/

import java.io.UnsupportedEncodingException;

public class Test136
{
	public static void main(String[] args) //throws UnsupportedEncodingException
	{
		byte[] buf;
		String name = new String("������");

		System.out.println("����Ʈ ĳ���ͼ� : " + System.getProperty("file.encoding"));	//encoding���ڵ�
		//--==>> ����Ʈ ĳ���ͼ� : MS949
		
		// ��String.getBytes()��
		//	: ����Ʈ ĳ���ͼ��� ������� ����Ʈ �迭�� ��ȯ�ϴ� �޼ҵ�
		buf = name.getBytes();

		System.out.println("buf �迭�� length : " + buf.length);	//���⼭ length�� �Ӽ�
		//--==>> buf �迭�� length : 6
		// �ѱ��ڴ� 2����Ʈ

		System.out.println();


		try	// throws UnsupportedEncodingException�� �����°ǵ� �������ʰ� ���𰡸� ����(try)�ؼ� ��ƺ��ڴ�(catch)
		{
			// UTF-8 ĳ���� ���� ������� ����Ʈ �迭�� ��ȯ�ϴ� �޼ҵ�
			// �Է°� ����� IO��� ǥ�� �ٵ� �װ� ������ ������ �� ó���ϴ°� IOExcption
			// UnsupportedEncodingException �� �������� �ʴ� ���ڵ��� ���α׷� ���ο��� ���� ������ ������ ����� �Ǹ�
			// ������ִ°��� ���ϰ�
			// throws UnsupportedEncodingException �� ����Ѱ� ������ ����� ������ �����ڴٴ� ��
			// ��ġ�� import java.io.UnsupportedEncodingException
			buf = name.getBytes("UTF-8");

			System.out.println("buf �迭�� length : " + buf.length);
			//--==>> buf �迭�� length : 9
			//UTF-8�� �ɰ��� 9���� ���ٴ� ��

			System.out.println();

			// UTF-8 ���·� ����� ����Ʈ �迭��
			// String ��ü�� �Ķ���Ͱ� UTF-8�� �ο��Ͽ� ����
			//System.out.println("value1 : " + new String("������"));		//���ڿ� Ŭ���� ������
			//System.out.println("value1 : " + new String(����Ʈ�迭, ���ڵ����));
			System.out.println("value1 : " + new String(buf, "UTF-8"));
			//--==>> value1 : ������

			System.out.println();
			
			// ����Ʈ ĳ���ͼ����� ����� ����Ʈ �迭��
			// String ��ü�� ����
			//System.out.println("value2 : " + new String(����Ʈ�迭));
			System.out.println("value2 : " + new String(buf));
			//--==>> value2 : �??��?��
			// buf�迭�� MS949�ε� �̰� 9�������� 2���� ���ļ� ���ڸ���°Ŷ� �����Գ���

			System.out.println();

			//------------------------����
			
			// �� ����
			String convert = new String(name.getBytes("EUC-KR"), "UTF-8");	// ���ڵ� ����� �ٸ�������� ��ȯ�ϰ�����
																			// �ٵ� ��� ��ȯ�Ȱ� �ƴ�(�����ȶ����� �ȵȰ���)
																			// �����ϴ°ǵ� �߸� ������ä�� ��������

			System.out.println("value3 : " + convert);
			//--==>> value3 : ??????

			buf = convert.getBytes();	// EUC-KR
			System.out.println("buf �迭�� length : " + buf.length);
			//--==>> buf �迭�� length : 6

			buf = convert.getBytes("UTF-8");
			System.out.println("buf �迭�� length : " + buf.length);
			//--==>> buf �迭�� length : 18

			/*
			�� EUC-KR�� UTF-8�� ��ȯ�Ѵٰ� ���� ���� �ڵ��� �ع�����
			   �̷��� ��ȯ���� ���� ����Ʈ �迭�� ������
			   EUC-KR �̵�... UTF-8�̵�...
			   ��� ����Ʈ �迭�� �о���� �����ִ� ���� Ȯ���� �� �ִ�.

			   �̹� ���� ���·� ������ String ��ü�� ����Ʈ �迭��
			   � ������ε� ������ �Ұ����ϴ�.
			*/
			


		}
		catch (UnsupportedEncodingException e)	// e�� ����
		{
			System.out.println(e.toString());	//e�� �Ѿ���°� �������� UTF-8 108��°���� �Ѿ�ͼ� �������� �ʰ�
												//���߹�ó����(catch)���� �Ѱܼ� ó����
		}
		
		


	}
}