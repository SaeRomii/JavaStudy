
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
		

		System.out.print(" 이름을 입력하세요 : ");

		name = br.readLine();

		System.out.print(" 국어 점수 입력 : ");

		kor = Integer.parseInt(br.readLine());

		System.out.print(" 영어 점수 입력 : ");

		eng = Integer.parseInt(br.readLine());

		System.out.print(" 수학 점수 입력 : ");

		mat = Integer.parseInt(br.readLine());

		int sum;

		sum = kor + eng + mat;

		System.out.println("====[결과]====");
		System.out.println(" 이름 : " + name);
		System.out.println(" 총점 : " + sum);
		System.out.println("==============");

	}

}