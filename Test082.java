/*===========================
  ���� �迭(array) ����
  - �迭�� ����� �ʱ�ȭ
  - �迭�� �⺻���� Ȱ��
============================*/

// �� �ǽ� ����
// ��char���ڷ����� �迭�� ����� ���ĺ� �빮�ڸ� ä���
// ä���� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// A B C D E F G ... W X Y Z
// ����Ϸ��� �ƹ� Ű��...

public class Test082
{
	public static void main(String[] args)
	{
		char[] arr = new char[26];
		for (int i=0, ch=65; i<arr.length; i++, ch++)		//26ȸ��
		{
			arr[i] = (char)ch;
			// arr[0] = (char)65;
			// arr[1] = (char)66;
			//	  :
			// arr[25] = (char)90;
		}

		// �迭 ��� ��ü ���
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
}

/* ���� ���
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/