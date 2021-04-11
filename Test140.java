/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Math Ŭ����
=========================================*/

/*
�� java.lang.Math Ŭ������

   ����(Mathematics)�� ���õ� ������ �Ӽ��� �޼ҵ���� �����ϴ� Ŭ������
   �����ڰ� �ֱ� ������ �� �����ڰ� ��private������ ����Ǿ� �ֱ� ������
   �ܺο��� ��ü(�ν��Ͻ�)�� ������ �� ����.
   ��, ��Math ob = new Math();�� �� �̿� ���� ������ ����� �� ����.

   ��, ��� �޼ҵ尡 ��static������ ���ǵǾ� �����Ƿ�
   ��ü�� �������� �ʰ� �ٷ� �����Ͽ� ����ϴ� ���� �����ϴ�.

�� java.lang.Math Ŭ������ �ֿ� ��� �� �޼ҵ�

   - public static final double E = 2.71...;
     : �ڿ� �α� ���

   - public static final double PI = 3.141592...;
     : ������(��) // �� ����

   - public static double sin(double a)
   - public static double cos(double a)
   - public static double tan(double a)
     : sin(a), cos(a), tan(a) ���� ��ȯ�Ѵ�. (�ﰢ�Լ�)

   - public static double asic(double a)
   - public static double acos(double a)
   - public static double atan(double a)
     : asin(a), acos(a), atan(a) ���� ��ȯ�Ѵ�. (�ﰢ�Լ��� ���Լ�)

   - public static double toRadians(double angdeg)
     : ����(angdeg)�� ����(radian)���� �ٲپ� ��ȯ�Ѵ�.
   - public static double toDegrees(double angrad)
     ����(angrad)�� ������ �ٲپ� ��ȯ�Ѵ�.

   - public static double log(double a)
     : �α�(log) ���� ���Ͽ� ��ȯ�Ѵ�.

   - public static double sqrt(double a)
     : a�� �������� ���Ͽ� ��ȯ�Ѵ�.

   - public static double ceil(double a)
     : a���� ũ�ų� ���� ������ �Ǽ� ���·� ��ȯ�Ѵ�. (�ø��� ����)

   - public static double floor(double a)
     : a���� �۰ų� ���� ������ �Ǽ� ���·� ��ȯ�Ѵ�. (������ ����)

   - public static double pow(double a, double b)
     : a�� b���� ���Ͽ� ��ȯ�Ѵ�.

   - public static int round(float a)
     public static long round(double a)
	 : a�� �ݿø��Ͽ� �� ������� ��ȯ�Ѵ�.

   - public static double random()
     : 0.0 ~ 1.0 ������ ����(������ �Ǽ�)�� �߻����� �� ���� ��ȯ�Ѵ�.

*/

public class Test140
{
	public static void main(String[] args)
	{
		System.out.println("������ : " + Math.PI);
		System.out.println("2�� ������ : " + Math.sqrt(2));
		//--==>> ������ : 3.141592653589793
		//		 2�� ������ : 1.4142135623730951

		System.out.println("���̿� ���� Degree  : " + Math.toDegrees(Math.PI));
		System.out.println("2���̿� ���� Degree : " + Math.toDegrees(2.0*Math.PI));
		//--==>> ���̿� ���� Degree  : 180.0
		//		 2���̿� ���� Degree : 360.0

		double radian45 = Math.toRadians(45);		//������ �������� ��ȯ

		System.out.println("���� 45   : " + Math.sin(radian45));
		System.out.println("�ڽ��� 45 : " + Math.cos(radian45));
		System.out.println("ź��Ʈ 45 : " + Math.tan(radian45));
		//--==>> ���� 45   : 0.7071067811865475
		//		 �ڽ��� 45 : 0.7071067811865476
		//		 ź��Ʈ 45 : 0.9999999999999999

		System.out.println("�α� 25 : " + Math.log(25));
		//--==>> �α� 25 : 3.2188758248682006

		System.out.println("2�� 4�� : " + Math.pow(2, 4));
		//--==>> 2�� 4�� : 16.0

		int n=0;
		while (n<10)
		{
			System.out.println("0.0 ~ 1.0 ������ ���� : " + Math.random());
			n++;
		}
		/*
		//--==>> 0.0 ~ 1.0 ������ ���� : 0.08902780076872807
				 0.0 ~ 1.0 ������ ���� : 0.7985553325612638
				 0.0 ~ 1.0 ������ ���� : 0.6555250274824719
				 0.0 ~ 1.0 ������ ���� : 0.19101898949834006
				 0.0 ~ 1.0 ������ ���� : 0.32005818138807707
				 0.0 ~ 1.0 ������ ���� : 0.04088261130158344
				 0.0 ~ 1.0 ������ ���� : 0.6466011887910669
				 0.0 ~ 1.0 ������ ���� : 0.9453788095977586
				 0.0 ~ 1.0 ������ ���� : 0.14844286696285103
				 0.0 ~ 1.0 ������ ���� : 0.37734475262070943
		*/

	}
}