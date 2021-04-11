/*=================================
  ���� ������(Operator) ����
  - ���� ������ == ���� ������
=================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������... �������� ������� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է��� BufferedReader �� readLine() �� Ȱ���ϰ�
// ������ ���� �����ڸ� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 2000
// 2000�� �� ����
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է� : 2011
// 2011�� �� ���
// ����Ϸ��� �ƹ� Ű��...

// �� ������ �Ǻ� ����
//    ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
//    �Ǵ�, 400�� ����̸� ����~!!!
//    �׷��� ������... ���~!!!

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year;
		String strResult;

		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());

		strResult = (year%4==0 && year%100!=0 || year%400==0) ? "����" : "���";

		System.out.printf("%d�� �� %s\n", year, strResult);
	}
}

/* [���� ���]
������ ���� �Է� : 2020
2020�� �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է� : 2021
2021�� �� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/