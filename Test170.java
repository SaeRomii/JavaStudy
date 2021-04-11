/*=======================================
  ���� �ڹ��� �⺻ �����(I/O) ����
=======================================*/

// Reader writer �ǽ�

import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.Reader;

public class Test170
{
	public void process(InputStream is)		//����Ʈ ��� �Է� ��Ʈ�� �Ű������� ����
	{
		int data;

		System.out.println("���ڿ� �Է�(����:Ctrl+z)");

		try
		{
			// �Ű����� is ��� ����Ʈ ����� �Է� ��Ʈ�� ��ü(InputStream)�� 
			// ���� ��Ʈ������ ��ȯ�Ͽ� Reader Ÿ���� rd���� ������ �� �ֵ��� ó��
			Reader rd = new InputStreamReader(is);		// rd�� ���� ��� ��Ʈ��
			
			// ����Ʈ ��� ��Ʈ���� �ڹ� �⺻ ��� ��Ʈ�� ��ü(OutputStream - System.out)��
			// ���� ��Ʈ������ ��ȯ�Ͽ� Writer Ÿ���� wt���� ������ �� �ֵ��� ó��
			Writer wt = new OutputStreamWriter(System.out);

			while ((data=rd.read()) != -1)
			{
				wt.write(data);		//-- ���� ��� ��Ʈ������ write ���(wt�� ���ٱ� write�� ������ ������)
				wt.flush();			//-- ����� ��Ʈ���� �о�� ������ (�ֻ�� �ǽ���)
			}
		}
		catch (IOException e)		//IOException �߻������� 
		{
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args)
	{
		Test170 ob = new Test170();
		ob.process(System.in);			//����Ʈ ��� �Է� ���� �Ű������� �ѱ�
	}
}

/* ���� ���
���ڿ� �Է�(����:Ctrl+z)
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
