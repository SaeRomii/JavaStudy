/*=======================================
  ���� �ڹ��� �⺻ �����(I/O) ����
=======================================*/

// Reader �ǽ�
// Test166.java�� ��

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test168
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
		
		// System.in         : �ڹ��� ǥ�� �Է� ��Ʈ��(��ü) �� ����Ʈ ��� ��Ʈ��
		// InputStreamReader : ����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ(��ȯ��, ������ ���� ����)
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//-- InputStream�� ������ ����

		// Reader            : ���� ��� ��Ʈ�� ��ü
		Reader rd = new InputStreamReader(System.in);

		System.out.println("���ڿ� �Է�(����Ctrl+z)");
		
		
		while ((data = rd.read()) != -1)	//���� ��� ��Ʈ���� -1�� �ƴϸ� data�� ��ڴ�
		{
			ch = (char)data;				//data�� char����ȯ�ؼ� ch�� �ްڴ�.
			//System.out.print(ch);
		
			//--==>>
			/*
			���ڿ� �Է�(����Ctrl+z)
			1234
			1234
			abcd
			abcd
			ABCD
			ABCD
			�����ٶ�
			�����ٶ�
			^Z
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/

			// 3.15�Ͽ��� �ǽ��Ѱ� ����Ʈ ��� ��Ʈ���� �о�ͼ� �ѱ��� �����°Ű�, 3.16�Ͽ� �Ѱ� ���� ��� ��Ʈ���� �о�ͼ� �ѱ� �ȱ���
			

			// write() : OutputStream Ŭ������ ��ǥ�� �޼ҵ� (�� ����Ʈ ��Ʈ��)
			System.out.write(ch);				// �ѱ� ����
			//--==>>
			/*
			���ڿ� �Է�(����Ctrl+z)
			1234
			1234
			abcd
			abcd
			ABCD
			ABCD
			�����ٶ�
			 ��|
			^Z
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/


		}
	}
}