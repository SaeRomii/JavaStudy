
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class homework
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor;
		int eng;
		int mat;
		

		System.out.print(" �̸��� �Է��ϼ��� : ");

		name = br.readLine();

		System.out.print(" ���� ���� �Է� : ");

		kor = Integer.parseInt(br.readLine());

		System.out.print(" ���� ���� �Է� : ");

		eng = Integer.parseInt(br.readLine());

		System.out.print(" ���� ���� �Է� : ");

		mat = Integer.parseInt(br.readLine());

		int sum;

		sum = kor + eng + mat;

		System.out.println("====[���]====");
		System.out.println(" �̸� : " + name);
		System.out.println(" ���� : " + sum);
		System.out.println("==============");

	}

}