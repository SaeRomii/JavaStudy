/*=========================================
  ���� ����(Exception) ó�� ����
=========================================*/

/*
�� ���α׷����� �߻��ϴ� ����(Error)��

   �� �߸��� ������ ����ϰų� ���� ���� �������� ���� ���¿���
      ��������ν� ������ �ܰ迡�� �߻��ϴ� ������ ����(Error)

   �� ���α׷��� �����ϴ� �������� �߻��Ǵ� ��Ÿ�� ����(Error)�� ���� �� �ִ�.

      - �����ڰ� ���� �м��� �߸��ϰų� �Ǽ��� ����
	    ������ ����� �������� �Ǵ� ������ ����(Error)��

	  - �ý��� �̻󿡼� �߻��Ǵ� �ý��� ����(Error), �׸���

	  - ���α׷� ���� �� �߻��Ǵ� ���������� ��Ȳ�� �ǹ��ϴ�
	    ���ܻ���(Exception)�� �ִ�.

		���� ���
		�� � ���� 0���� �����ų�
		�� �迭 ÷�ڸ� ����� ��Ȳ�� �߻��ϰų�
		�� �������� �ʴ� ������ �����Ͽ� �о���δٰų�

		* ���α׷� �����ϸ鼭 �߻��ϴ� ������ ���赵�� ������ �ִ°�
		  �츮�� ������ �� �ִ°� Exception �츮�� ������ �� ������ Error

==> �����ڰ� �̷� ���� ������ �߻��� ��츦 �̸� �����Ͽ�
    ������ �����ϱ� ���� ������ �����ϵ��� ������ �����س��� ��
	��.��.ó.��


�� ������ ���� ����(�޴��� ������ �� Exception Ŭ����)

   - ���ܴ� ���α׷� ���� �� �߻��� �� �ִ�
     ��ɾ��� �������� �帧�� �����ϴ� �̺�Ʈ��
	 �ڹٿ��� ���ܴ� �ϳ��� ������Ʈ(Object, ��ü)�̴�.

   - ���α׷� ���� �߿� �޼ҵ� �ȿ��� ����(Error)�� �߻��ϰ� �� ���,
     �޼ҵ�� �� ������ �ش��ϴ� ���� ������Ʈ�� �����
	 �װ��� �ڹ� ��Ÿ�� �ý���(Runtime System)�� ������ �ش�.

   - �ڹٿ����� ��� ���� Ŭ������ Throwable Ŭ������
     Throwable Ŭ������ ���� Ŭ������ ��ӹ޾� ����Ѵ�.
	 (�ڹٷ� ���� ��� Ŭ������ Object Ŭ������ ��ӹ��� �׷��� Objectó�� ��� ���ܴ� Throwalbe ������)

   - Throwable Ŭ������ ���ܸ� �����ϴ� �����̳�
     ���ܰ� �߻��� ���� ���α׷��� ���¿� ���� ������ �����ϰ� �ִ�. 

   - Throwable Ŭ�������� �Ļ��� Ŭ����

     �� Exception Ŭ����
	    Exception ���� Ŭ������ �Ϲ������� ���α׷��ӿ� ����
		������ �� �ִ� ���� ��Ȳ���� �޼ҵ尡 ���� �߿� ������ ���ܸ� ����Ų��.
	 
	 �� Error Ŭ����
		�ɰ��� ������ ���·� �����ڰ� ������ �� ���� ������ �����̴�.

�� ����(Exception)�� ����

   - checked exception (BufferedReader���� readLine �� �� throws IOException �Ⱦ��� ���� �ȵǰ� �ߴµ� �̰� checked exception)
     �޼ҵ� ������ ���ܰ� �߻��� ���
	 �޼ҵ带 ������ �� ��throws������ �޼ҵ� ������ �߻��� �� �ִ�
	 ���ܵ��� ����� �ְų� �Ǵ�, �� ���ܸ� ��try-catch���ؼ�
	 ó���� �־�߸� �ϴ� �����̴�.
	 �����Ϸ��� ������ �ϴ� �������� ��checked exception����
	 ��throws�� �Ǵ°��� ���γ� Ȥ�� ��try-catch���Ǵ����� ���θ� �Ǵ��Ͽ�
	 ���α׷����� ���ܸ� ó������ ������ ������ ��ü�� �Ұ����ϴ�.

   - unchecked exception
     ������ ó������ �ʾƵ� �����Ϸ��� üũ���� �ʴ� ��Ÿ�� �ÿ� �߻��ϴ� ����

�� java.lang.Throwable Ŭ������ �ֿ� �޼ҵ�

   - String toString()		Throwable���� �������̵� ����(������ Object���� ��������)
     : Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�.
   - void printStackTrace(PrintStream s)
   - void printStackTrace(PrintWriter w)
     : ǥ�� ��� ��Ʈ���� ���� ȣ�� ����� ������ �޼ҵ���� ����Ѵ�.

�� �ֿ� ��Ÿ�� ���� Ŭ����

   - ArithmeticException
     : ��ġ ������ ����(0���� ������ ��)
   - ArrayStoreException
     : �迭�� �߸��� ������ ���� �����Ϸ� ���� �� �߻��ϴ� ����
   - IndexOutOfBoundsException
     : �迭, ���ڿ�, ���� ��� �ε��� ������ ��� ��� �߻��ϴ� ����
   - ClassCastException
     : Ŭ���� ��ȯ�� �߸��� ��� �߻��ϴ� ����
   - NullPointerException
     : �� ��ü�� �����ϴ� ���(�ʱ�ȭ ���� ���� ���� ��� ��) �߻��ϴ� ����
   - SecurityException
     : �ڹ��� ���� ���� ������ �����Ͽ��� ��� �߻��ϴ� ����
	        :
			:
			:
*/

// �������� �ȵǸ� IOException ó���� �ȵȰ� �װ� ���� checked exception�̶����


import java.io.BufferedReader;	
import java.io.InputStreamReader;	
import java.io.IOException;				

public class Test142					   //�ƹ��͵� �Ⱦ��� ��
{										   //IOException ���� ó�� ��� ��
	public static void main(String[] args) //throws IOException
	{
		// BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����
		int a, b, c;


		// ����ó�� ��� ��
		/*		���⼭ throws IOException �Ƚ��ָ� ó���� �ȵż� ������ ���� �߻�
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		c = a + b;
		System.out.println("��� : " + c);
		*/
	

		// ����ó�� ��� �� - checked exception
		/*
		try		//try ��
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("��� : " + c);
		}
		catch (IOException e)
		{
			// IOException �� checked exception
			// �� �޼ҵ� �����ϴ� �������� throws �� ����
			//	  ��Ƴ��ų� ������ �ʴ� ��� ������ ���� �߻�
			System.out.println(e.toString());
		}
		*/
		

		// ����ó�� ��� �� -unchecked exception
		/*
		try		//try ��
		{
			System.out.print("ù ��° ���� �Է� : ");	// "ABC" �̷��� ������ �ƴ϶� ����ó���ؾ���
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("��� : " + c);
		}
		catch (IOException e1)
		{
			System.out.println(e1.toString());	//���⼭ toString�� IOException���� �޾Ƽ� ���°�
		}
		catch (NumberFormatException e2)
		{	
			// NumberFormatException �� unchecked exception
			//-- ��Ÿ�� �� �߻��� �� �ִ� ���ܷ�
			//	 �ݵ�� ���� �ʿ䵵, ��Ƴ� �ʿ䵵 ����.
			System.out.println(e2.toString());	//Object�� toString ��ӹ޾Ƽ� NumberFormatException���� �޾Ƽ� ��
												//���⼭ ����ó�����ָ� �������� �Է��϶�� ������������
			System.out.println("���� ������ �����͸� �Է��ϼ���");
		}
		*/
		

		// ����ó�� ��� �� - �����ؼ� ó���ϴ� ���
		/*
		try		//try ��
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("��� : " + c);
		}
		catch (Exception e)							// ������ ������ IOEception�� ���� ó���� �Ȱ���..
		{											// �ѹ��� �����ؼ� ó���Ѱ���
			System.out.println("���� ó��~!!!");	// Exception�� ���� IOException ������ ����
			System.out.println(e.toString());		// Excetpion�� ���� NumberFormatExcetpion�� ���� ����
			System.out.println(e.getMessage());
			System.out.println("printStackTrace.....");
			e.printStackTrace();
		}
		*/
		

		// ����ó�� ��� ��
		try		//try ��
		{
			System.out.print("ù ��° ���� �Է� : ");	// "ABC" �̷��� ������ �ƴ϶� ����ó���ؾ���
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("��� : " + c);
		}
		catch (IOException e1)
		{
			System.out.println(e1.toString());
		}
		catch (NumberFormatException e2)
		{	
			System.out.println("���� ������ �����͸� �Է��ϼ���");
		}
		finally
		{
			// ���ܰ� �߻��ϰų� �߻����� �ʰų� ������ ����Ǵ� ����(���� ���� �߻��ϸ� ù ��° ���� �Է¹ް� 
			// �������� ������ �Է��϶�� ���� ������ ����
			System.out.println("��� �����̽��ϴ�. �����մϴ�.");
		}
	}
}