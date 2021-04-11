import java.util.Scanner;

class Sungjuk
{
	/*
	int n;			//�ο���
	Record[] rec;	//Record �迭 �л��� record�� ���
	String[] subject = {"���� ���� : ", "���� ���� : ", "���� ���� : "};
	
	//�ο� �� �Է�
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			n = sc.nextInt();
		}
		while (n<1 || n>100);

		rec = new Record[n];
		
	}

	void write()
	{
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<n; i++)
		{
			rec[i] = new Record();
			
			System.out.printf("%d��° �л��� �̸� �Է� : ", (i+1));
			rec[i].name = sc.next();
		
			for (int j=0; j<subject.length; j++)		//���� ���� 
			{
				System.out.print(subject[j]);
			
				rec[i].score[j] = sc.nextInt();			//���� �Է°� ������ ���

				rec[i].tot += rec[i].score[j];
			}
			rec[i].avg = rec[i].tot/3.0;
		}
		

	}

	// ����
	void rank()
	{
		for (int i=0; i<n; i++)
		{
			rec[i].rank = 1;

			for (int j=0; j<n; j++)
			{
				if (rec[i].avg < rec[j].avg)			// ��� ��
				{
					rec[i].rank++;
				}
			}
		}
	}
	
	// ���
	void print()
	{
		for (int i=0; i<n; i++)
		{
			System.out.printf("%5s", rec[i].name);

		for (int j=0; j<subject.length; j++)
		{
			System.out.printf("%4d", rec[i].score[j]);
		}	
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);
			System.out.printf("%8d", rec[i].rank);
			System.out.println();
		}
		
	}
	*/

	// �Ӽ� : �ο���, Record ������ �迭
	// �ֿ� �Ӽ� ����
	// private�� ����������
	private int inwon;			//-- �ο� ��
	private Record[] recArr;	//-- Record �迭 ����
								//	 (�л� 1�� �� Record �迭�� 1�� Ȱ��) RecordŬ���� 
	String[] subTitle = {"���� ���� : ", "���� ���� : ", "���� ���� : "};
	

	// ��� : �ο��� �Է�, �� ������ �Է�, ����/��� ����, ��� ���
	// �޼ҵ� ����
	// �� �ο��� �Է�
	public void set()			// ���� int inwon;���� ���� �ڷ� �������� void�� 
	{
		Scanner sc = new Scanner(System.in);


		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);		// �������� ||(OR) 1���� �۰ų� 100���� Ŭ �� �ݺ�
		
		// Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
		// �迭���� inwon��ŭ ������ ������,
		// Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.
		recArr = new Record[inwon];			// �ν��Ͻ� ���� �ƴϰ� �迭 ���� �ο�����ŭ ���� ����ڴٴ� �迭 ����!!
											// Record[] recArr; ���
											// �ο��� �Է��ϰ� �л� 1���� ǥ���� �� �ִ� �Ӽ���� ���� �Ϸ��� 
	}

	// ��� : �ο��� �Է�, �� ������ �Է�, ����/��� ����, ��� ���
	// �޼ҵ� ����
	// �� �� ������ �Է� + �� ����/��� ����
	public void input()							// �̸��̶� ���� �Է¹޴°Ŷ� �Ű����� �Ѱ� ������ ��� void
	{
		Scanner sc = new Scanner(System.in);

		for (int i=0; i<inwon; i++)				// �ο�����ŭ �ݺ� (inwon == recArr.length)
		{
			// Record Ŭ���� ����� �ν��Ͻ� ����
			//Record rec = new Record();
			//recArr[i] = rec;
			recArr[i] = new Record();			// ���� ���� ��ģ��

			System.out.printf("%d��° �л��� �̸� �Է� : ", (i+1));
			recArr[i].name = sc.next();									// Record ũ���� ��� �ν��Ͻ� ���� recArr�� ���
			
			/*
			System.out.print("���� ���� : ");
			recArr[i].score[0] = sc.nextInt();
			recArr[i].tot += recArr[i].score[0];						// recArr.tot�� score 0��° �� ���ϱ�

			System.out.print("���� ���� : ");
			recArr[i].score[1] = sc.nextInt();
			recArr[i].tot += recArr[i].score[1];

			System.out.print("���� ���� : ");
			recArr[i].score[2] = sc.nextInt();
			recArr[i].tot += recArr[i].score[2];
			*/

			for (int j=0; j<subTitle.length; j++)			// 0 1 2 �̷��� ���� ������
			{
				// �ȳ� �޽��� ���
				System.out.print(subTitle[i]);				// 138,142,146��° ��
				
				// ����ڰ� �Է��� �����͸� ���ھ�(score) �迭�� ��Ƴ���
				recArr[i].score[j] = sc.nextInt();			// 139, 143, 147��° ��

				// ����, ����, ���� ���� �����͸� �ݺ������� �Է¹޴� ����
				// �� �������� ���� �����ϱ�
				recArr[i].tot += recArr[i].score[j];		// 140, 144, 148��° ��
			}

			// ��� �����ϱ�
			recArr[i].avg = recArr[i].tot/3.0;
		}
		// recArr �迭�� Record[] ��� �ִ� Ÿ�Ը� ���� �� ����
	}//end input()

	// ��� : �ο��� �Է�, �� ������ �Է�, ����/��� ����, ��� ���
	// �޼ҵ� ����
	// �� ��� ���
	public void print()						//�̸�, ����, ����, ���� ���� �Է� �Ű����� ���� �ܺο��� ���� �����ϰ� public
	{
		// ���� ���� �޼ҵ� ȣ�ⱸ�� �߰�~!!!
		ranking();

		System.out.println();	//����

		// �л� 1�� �� �ݺ� ��� ����
		for (int i=0; i<inwon; i++)		//-- �л� �ο� �� ��ŭ �ݺ�
		{
			// �̸� ���
			System.out.printf("%5s", recArr[i].name);		//recArr �迭�� i��° �̸�

			// ����(����, ����, ����) �ݺ� ���
			for (int j=0; j<3; j++)		//-- 0 1 2 ���� ���� ���� �ݺ�
			{
				System.out.printf("%4d", recArr[i].score[j]);	//score[j]
			}

			// ���� ��� ���
			System.out.printf("%5d", recArr[i].tot);
			System.out.printf("%8.2f", recArr[i].avg);

			// ���� ��� ���� �߰�
			System.out.printf("%5d", recArr[i].rank);

			System.out.println();		//����
		}
	}//end print()

	// �޼ҵ� �߰� ����
	// �� ���� ����
	private void ranking()				//���� �޾Ƽ� ��  ����ϴ� �޼ҵ忡�� ȣ���� �� �ְ�
	{
		// ���� ����
		int i,j;

		// ��� �л����� ���(����)�� 1�� �ʱ�ȭ
		for (i=0; i<inwon; i++)
		{
			recArr[i].rank = 1;
		}

		// ���(����) ����
		for (i=0; i<inwon-1; i++)			// i �� �� ������ �����ϴ� �ε���, ���� ��� �����Ͱ� ���������� �ش���� �ʾƼ� inwon-1 ������
		{
			for (j=i+1; j<inwon; j++)		// ù��° �����Ͱ� �����϶� �ι�° �����Ͷ� ���ؾ��ϴϱ� j=i+1
			{
				if (recArr[i].avg > recArr[j].avg)	//���� �����Ͱ� �� �����ͺ��� ũ�ٸ�
				{
					// �񱳵������� rank�� 1��ŭ ����
					recArr[j].rank++;
				}
				else if (recArr[j].avg > recArr[i].avg)	//�� �����Ͱ� ���� �����ͺ��� ũ�ٸ�
				{
					// ���ص������� rank�� 1��ŭ ����
					recArr[i].rank++;
				}// ���� ������ i �� ������ j
			}
		}
	}

}

