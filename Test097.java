/*================================
  ■■■ 배열(Array) ■■■
  - 배열의 복사
=================================*/

// Test098.java와 비교~!!!

// ※ 배열 변수의 복사는 데이터 복사, 주소값 복사 두 가지 형태가 존재한다.

//	  주소값 복사 → 얕은 복사 → 원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법
//								  (배열 뿐 아니라 모든 참조형 데이터에 해당하는 복사)
//	  데이터 복사 → 깊은 복사 → 실제 요소로 들어있는 값에 대한 복사로
//								  원본을 수정해도 복사본에 영향을 미치지 않는 복사 방법

// 주소값 복사 (얕은복사)

public class Test097
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};			//-- 배열 원본
		int[] copys;								//-- 복사본으로 만들 배열
													// nums의 값이 copys = nums;에서 들어가는게 아니라 nums의 주소값이 들어감
													// nums랑 copys는 주소값 나오기때문에 참조변수

		int temp;									//-- 실습 진행(테스트)을 위한 임시 변수

		// check
		copys = nums;								// nums를 copys에 대입 → 복사

		temp = nums[0];	//nums 배열의 0번째 값을 temp에 넣기 = 10

		nums[0] = 1500; //nums 배열 0번째자리인 10에 10대신 1500이 들어간거임

		for (int i=0; i<copys.length; i++) 
		{
			System.out.printf("%d\t", copys[i]);	//\t 탭키랑 같음
		}
		System.out.println();

		System.out.println("temp : " + temp);
		//--==>> temp : 10
	}
}