/*==============================
  ���� ������(Operator) ����
  - ��Ʈ ���� ������
==============================*/


public class Test022
{
	public static void main(String[] args)
	{
		int a = 10, b = -10;

		System.out.printf("~a : %d\n", ~a);
		System.out.printf("~b : %d\n", ~b);
	}
}

/*
              ��Ʈ������
a=10 �� 00001010 �� 11110101 (���) ==> -11
                       ��
					   ��2�� ���� = (1�Ǻ���) + (+1)
					   ��
					00001011 �� 11

b=-10 �� 00001010 �� 11110101
                    +       1
					---------
					11110110
*/


/* ���� ���
~a : -11
~b : 9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/