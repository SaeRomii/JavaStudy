/*======================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - �ڹ� �ҽ� �ڵ� �Է� �� ������ �ǽ�
  - println() �� print()
======================================*/

public class Test002
{
     public static void main(String[] args)
     {
		 System.out.println("ù ��° ����...");
		 System.out.print("�� ��° ����...\n");
		 System.out.print("�� ��° ����...\n\n");
		 System.out.print("�� ��° ����...\n\n\n");
		 //-- ��println()�� �޼ҵ�� ��print()�� �޼ҵ��� ���̴�
		 // ���� ��ŵ(�ٹٲ�, ����) ������ �ִ�.
		 // ��\n���� ���ڿ��� �����ϸ� ���� ��ŵ�� �����ϴ�.
		 // ���� �� ����ϴ� �͵� �����ϴ�.

		 System.out.println(7);      // ���� 7
		 System.out.println('7');    // ����7
		 System.out.println("7");    // ���ڿ�7

		 System.out.println(7+7);
		 System.out.println('7'+'7'); // ���� 7�� �ڹٿ��� 55�� �׷��� 55+55=110
		 System.out.println("7"+"7");


     }

}

/* ��� ���
7
7
7
14
110
77
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
