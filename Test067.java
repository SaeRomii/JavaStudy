/*============================================
  ���� �޼ҵ� ���ȣ��(��� �޼ҵ�) ����
============================================*/

public class Test067
{
	public static void main(String[] args)
	{
		showHi(5);
	}

	public static void showHi(int cnt)	// 4
	{
		
		System.out.println("Hi~~!!!");
		if(cnt==1)						
			return;
		showHi(--cnt);					// showHi(3);  �ڿ��ִ� ���ҿ����� ������ --
										// ���Ǻι����� showHi�� ������ ������ ���ǹ� ����
		
	}

}

/* ���� ���
Hi~~!!!
Hi~~!!!
Hi~~!!!
Hi~~!!!
Hi~~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/