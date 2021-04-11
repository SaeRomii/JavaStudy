/*=====================================
  ���� Ŭ���� ��� ����
  - �߻� Ŭ����(Abstract)
=====================================*/

/*
�� �߻� Ŭ����(abstract)��
   ���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
   ���� Ŭ�������� �������̵�(Overriding)�� ������ ����Ǵ� �޼ҵ忡 ����
   �޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.

�� ���� �� ����
   [��������������] abstract class Ŭ������
   {
		[��������������] abstract �ڷ��� �޼ҵ��([�Ű�����], ...);
   }

�� Ư¡
   Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
   �� Ŭ������ Ŭ���� �̸� �տ� ��abstract�� Ű���带 �ٿ�
   �߻� Ŭ������ ����ؾ� �ϸ�, 
   �߻� Ŭ������ ����ؼ� ������ ��쿡��
   �ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
   �߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ����������
   ��ü�� ������ �� ���� ���̴�.

   ��, �߻� Ŭ������ ���������� ������ �� ���� ������
   ����� ���ؼ��� �����ϸ�,
   �߻� Ŭ�������� ��ӹ��� ���� Ŭ����������
   �ݵ�� �߻� �޼ҵ带 �������̵�(Overriding)�ؾ� �Ѵ�.

�� ��abstract�� Ű�����
   Ŭ������ �޼ҵ忡���� ����� �� ������
   ��� ������ ���� ���������� ��� �Ұ����ϴ�.
*/

abstract class SortInt	//protected�� ���� ��Ӿ� Ŭ�����ΰ� �� �� ����
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();			//sorting �޼ҵ� ȣ��  �����ϰڴ�
	}

	// �߻� �޼ҵ�(abstract)
	protected abstract void sorting();	// ����⸸ �ϰ� ���� ���ҰŶ� ; ��� abstract �Ἥ �߻� �޼ҵ� �����
										// � �������� ���� ����⸸��

	protected int dataLength()
	{
		return value.length;	//value ���� ��ȯ
	}

	// ũ�� �� �޼ҵ�
	// final Ű����� �� Ŭ������ ��ӹ޴� Ŭ�������� �� �޼ҵ带 �������� �� ����.
	protected final int compare(int i, int j)	//value i��° j��° ũ���
												//�������̵� �Ұ���� final Ű���� �־���
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
		{
			return 0;		//
		}
		else if (x>y)
		{
			return 1;		// �տ� ũ�� 1
		}
		else
			return -1;		// �ڿ� ũ�� -1			
	}
	
	// �ڸ� �ٲٱ� �޼ҵ�
	// final Ű����� ���� �� Ŭ������ ��ӹ޴� Ŭ��������
	// ��� �� �޼ҵ常ŭ�� Overriding �ؼ� ������� ���ƶ� ��� �ǹ� ����
	protected final void swap(int i, int j)		//�������̵� �Ұ���� final Ű���� �־���
	{
		// �ڸ� �ٲٱ�
		int temp = value[i];
		value[i] = value[j];
		value[j]=temp;
	}
}

// SortInt(�߻�Ŭ����)�� ��ӹ��� Ŭ���� �� �߻�Ŭ���� �� �߻�޼ҵ�������(�������̵�) �� �Ϲ�����Ŭ����
public class Test110 extends SortInt
//public abstract class Test110 extends SortInt
{
	int i, j;		//��������

	static int[] data = {7, 10, 3, 8, 7};		//���ʴ�� ������ �ҽ� �ϳ���, �������� �Ѱ� �����

	//---------------------------------------------------
	// �� ĭ ä���ֱ�~!!!
	//---------------------------------------------------
	
	@Override
	protected void sorting()
	{	
		// ��������
		for (i=0; i<dataLength()-1; i++)
		{
			for (j=i+1; j<dataLength(); j++)
			{
				if (compare(i, j)>0)		// ũ�� ��(���� ����)
				{
					swap(i,j);				// �ڸ� �ٲ�
				}
				
				System.out.print((i+1) + "Round Data : ");		// ��ȸ���ߴ��� �˾ƺ��°�
				for (int n : data)
				{
					System.out.print(n + " ");
				}
				System.out.println();		
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.print("Source Data : ");
		for (int n : data)
		{
			System.out.print(n + " ");
		}
		System.out.println();
		
		Test110 ob = new Test110();
		ob.sort(data);

		System.out.print("Sorted Data : ");
		for (int n : data)
		{
			System.out.print(n + " ");
		}
		System.out.println();
	}
}

/* ���� ���
Source Data : 7 10 3 8 7
Sorted Data : 3 7 7 8 10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/