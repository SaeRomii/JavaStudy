/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Random Ŭ����
=========================================*/

/*
�� java.util.Random Ŭ������
   
   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �����ϴ� �޼ҵ�������
   0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ��� �߰����� ������� �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
   ���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.
*/

// �ζ� ��ȣ ������ (���� �߻� ���α׷�) �ǽ� ����

// ���α׷��� ����Ǹ� �⺻������ �ζǸ� 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 1 3 4 17 23 44
// 1 2 8 16 28 42
//       :
// ����Ϸ��� �ƹ� Ű��...
// 1~45����, �ߺ��� ����, ���������� ū���� ���

import java.util.Random;
import java.util.Arrays;		//ã�ƺ���

class Lotto
{
	/* ���� Ǯ���� ���
	int num[] = new int[6];
	Random random = new Random();

	void input()
	{
		for (int j=0; j<6; j++)		//��	0 1 2 3 4 5 
		{
			num[j] = random.nextInt(45)+1;
		
			for (int k=0; k<j; k++)
			{
				if (num[j]==num[k])
				{
					j--;			//0 1 2 �ε����� �־ 2�� �ߺ��� ������ �ٽ� ���� �ö󰡼� �ݺ� ���ƾ��ϴϱ�
				}
			}
		}

		for (int a=0; a<num.length-1; a++)		//��������
		{
			for (int b=a+1; b<num.length; b++)
			{
				if (num[a]>num[b])
				{
					num[a]=num[a]^num[b];
					num[b]=num[b]^num[a];
					num[a]=num[a]^num[b];
				}
			}
		}
		
	}
	

	void print()
	{
		for (int n : num)
		{
		System.out.printf("%4d", n);
		}
		System.out.println();
	}
	*/
	
	// �������� Ǯ���ֽ� ���
	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6��
	private int[] num = new int[6];

	// getter
	public int[] getNum()
	{
		return num;
	}

	// 6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		int cnt = 0;
		Random rd = new Random();
		int n;
		
		jump :
		while (cnt<6)							// cnt �� 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;				//rd.nextInt(45) 0~44���� ������ �� �ϳ� �����°� �׷��� +1����
			
			for (int i=0; i<cnt; i++)
			{
				// Ȯ��(�׽�Ʈ)
				//System.out.println("i : " + i + ", cnt : " + cnt);
				if (num[i]==n)			//���� �ٽ� �߻�
				{
					continue jump;				// continue ���̺�
				}
			}
			num[cnt++] = n;						// num[0] 27 num[1] 3 num[2] 14 ..... num[5] 30 �ߺ����� ������ ��ƶ�
		}

		// ���� �޼ҵ� ȣ��
		sorting();

	}//end start()
	
	// ���� �޼ҵ� ����
	private void sorting()	// ���� �޼ҵ�
	{
		Arrays.sort(num);
	}


}

public class Test141
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();
		
		for (int i=1; i<=5; i++)
		{
			// Ȯ��(�׽�Ʈ)
			lotto.start();

			// ��� ���
			for (int n : lotto.getNum())
			{
				System.out.printf("%4d", n);
			}
			System.out.println();
		}
		
		
		/*
		for (int i=1; i<=5; i++)
		{
			//lotto.input();
			//lotto.print();
		}
		*/
	}
}

/* ���� ���
  11  21  26  30  34  45
   6   9  15  24  25  32
   1   4   5  11  22  36
   5   6  25  29  30  31
   7  12  20  28  34  45
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/* ���� ���
   3   9  19  22  25  45
  10  11  18  19  36  43
   3  16  18  26  35  39
   1   8  22  27  31  38
   8   9  10  15  25  37
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/