/*=============================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - �ڹ��� �⺻ ����� : printf()
==============================================*/


public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");	//--  ��\n�� ����

		//���� ��� �޼ҵ�
		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");	//-- ��\n�� ����
		System.out.printf("12345678901234567890%n");	//-- ��%n�� ����
		System.out.printf("%d + %d + %d\n", 10, 20, 30);
		//--==>>AAABBBCCC
		//--==>>1234567890123456789012345678901234567890
		//--==>>12345678901234567890
		//--==>>10 + 20 + 30
		//--==>>����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

		System.out.printf("%d\n", 123);
		System.out.printf("%7d\n", 123);
		System.out.printf("%10d\n", 123);      // �� 10ĭ�� ����µ� 123 ��ĭ ��Ƹ԰� �տ� 7ĭ����
		System.out.printf("%010d\n", 123);
		//--==>> 123
		//	         123
		//		        123
		//		 0000000123

		System.out.printf("%d\n", 365);
		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);
		//--==>> 365
		//		 +365
		//		 +365

		System.out.printf("%d\n", +365);
		//--==>> 365

		System.out.printf("%d\n", -365);
		//--==>> -365

		//System.out.printf("%-d\n", 365);
		//--==>> ���� �߻�(��Ÿ�� ����)

		System.out.printf("-%d\n", 365);
		//-==>> -365

		System.out.println();	// ����
		
		System.out.printf("%(d\n", -365);		// check~!!!
		System.out.printf("%(d\n", 365);		// check~!!!
		//--==>> (365)
		//		  365

		//System.out.printf("%d\n", 'A'); 
		//--==>> ���� �߻�(��Ÿ�� ����)
		// ���ڴ� %c�� ��ƾ��ϴµ� %d�� ��Ƽ� ������

		System.out.printf("%c\n", 'A');
		//System.out.printf("%c\n", "ABCD");
		//--==>> ���� �߻�(��Ÿ�� ����)
		// ���ڿ��� %c�� ��Ƽ� ������ %s�� ��ƾ���

		System.out.printf("%s\n", "ABCD");
		//--==>> A
		//		 ABCD

		System.out.println();	//����

		System.out.printf("%h\n", 365);   //365�� 16������ ǥ��
		System.out.printf("%o\n", 24);	  //24�� 30������ ǥ��
		//--==>> 16d
		//		 30

		System.out.println();	//����

		System.out.printf("%s\n", "true");
		System.out.printf("%b\n", true);
		//--==>> true			���ڿ�(String) true
		//		 true			boolean�� true
		
		//printf�� ��µǴ� ��� ������� ���ڿ��� ��µǴ� ����

		System.out.println();	//����

		System.out.printf("%f\n", 123.23);
		System.out.printf("%.2f\n", 123.23);
		System.out.printf("%.2f\n", 123.236);
		System.out.printf("%.2f\n", 123.231);
		System.out.printf("%8.2f\n", 123.236); //8.2�� �Ҽ��� ��°�ڸ����� �ڸ��� �� 8�ڸ� ������ �տ� ��ĭ����
		System.out.printf("%2.2f\n", 123.1244); //�Ҽ��� ��°�ڸ� �ڸ��� �� 2�ڸ� ������ �ϴ°ǵ� �� ��� �״��
		//--==>> 123.230000
		//		 123.23
		//		 123.24
		//		 123.23
		//		   123.24
		//		 123.12




	}
}

/* ���� ���
AAABBBCCC
1234567890123456789012345678901234567890
12345678901234567890
10 + 20 + 30
123
    123
       123
0000000123
365
+365
+365
365
-365
-365

(365)
365
A
ABCD

16d
30

true
true

123.230000
123.23
123.24
123.23
  123.24
123.12
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/