/*==================================
  ���� Ŭ������ �ν��Ͻ� ����
  - Ŭ������ �ν��Ͻ� Ȱ��
===================================*/

// �� �ǽ� ����
// 1 ~ 3 ������ ���� ������ ������ �߻�����
// ����, ����, �� ���� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.    �� ��ȣ 0 1 2 �ϱ� +1�� ������ҵ�

// ���� ������ �� 1:����, 2:����, 3:��

// ���� ��)
// 1:����, 2:����, 3:�� �� �Է�(1~3) : 4
// 1:����, 2:����, 3:�� �� �Է�(1~3) : -10
// 1:����, 2:����, 3:�� �� �Է�(1~3) : 2
// - ����   :����
// - ��ǻ�� :��										//random Ȱ��
// >> �º�������� : ��ǻ�Ͱ� �̰���ϴ�~!!!		//���ؾ��ҵ�
// ����Ϸ��� �ƹ� Ű��...

import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	int user;
	int com;
	/*
	String[] game = {"����", "����", "��"};
		
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		Random rd = new Random();
		com = rd.nextInt(3)+1; // ��ǻ�� �������� �迭 �� ��ȣ�� 0 1 2 �ε� ���� ���� ���� 1~3���� ���ؼ� +1�������

		do
		{
			System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
				
	}

	void print()
	{
		System.out.printf("-���� : %s\n", game[user-1]);		//���� 1 2 3���� �����µ� �迭�� 0 1 2 �� ���̴ϱ� -1
		System.out.printf("-��ǻ�� : %s\n", game[com-1]);
		

		if ((user==1 && com==2) || (user==2 && com==3)  || (user==3 && com==1))	//������ 1�϶� ��ǻ�Ͱ� 2�̸� �¸�, ������ 2�϶� ��ǻ�Ͱ� 3�̸� �¸�, ������ 3�϶� ��ǻ�Ͱ� 1�̸� �¸�
		{
			System.out.print(">> �º�������� : ��ǻ�Ͱ� �̰���ϴ�~!!!\n");	
		}
		if ((user==2 && com==1) || (user==3 && com==2) || (user==1 && com==3))
		{
			System.out.print(">> �º�������� : ������ �̰���ϴ�~!!!\n");
		}
	}
}
*/
	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3) + 1;			//��ǻ�Ͱ� �ϴ°Ŵϱ� com�� ��� 3+1�� �迭�� ���� 0���� �����̶�
	}

	public void input()
	{
		runCom();				//��ǻ�Ͱ� ���� �����ϰ� ������ �ޱ�

		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);

	}

	public void middleCalc()
	{
		String[] str = {"����", "����", "��"};

		System.out.println("- ���� : " + str[user-1]);
		System.out.println("- ��ǻ�� : " + str[com-1]);
	}

	public String resultCalc()
	{
		String result = "���º�";

		if ((user==1 && com==3) || (user==2 && com==1) || (user==3 && com==2))
		{
			result = "����� �¸��߽��ϴ�~!!!";
		}
		if ((user==1 && com==2) || (user==2 && com==3) || (user==3 && com==1))
		{
			result = "��ǻ�Ͱ� �¸��߽��ϴ�~!!!";
		}
		return result;
	}

	public void print(String result)
	{
		System.out.println(">> �º�������� : " + result);
	}
}

public class Test095
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);
	}
}

/* ���� ���
1:����, 2:����, 3:�� �� �Է�(1~3) : 2
- ���� : ����
- ��ǻ�� : ����
>> �º�������� : ����� �¸��߽��ϴ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/