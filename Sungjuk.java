import java.util.Scanner;

class Sungjuk
{
	/*
	int n;			//인원수
	Record[] rec;	//Record 배열 학생들 record에 담기
	String[] subject = {"국어 점수 : ", "수학 점수 : ", "영어 점수 : "};
	
	//인원 수 입력
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("인원 수 입력(1~100) : ");
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
			
			System.out.printf("%d번째 학생의 이름 입력 : ", (i+1));
			rec[i].name = sc.next();
		
			for (int j=0; j<subject.length; j++)		//과목 점수 
			{
				System.out.print(subject[j]);
			
				rec[i].score[j] = sc.nextInt();			//점수 입력값 변수에 담기

				rec[i].tot += rec[i].score[j];
			}
			rec[i].avg = rec[i].tot/3.0;
		}
		

	}

	// 순위
	void rank()
	{
		for (int i=0; i<n; i++)
		{
			rec[i].rank = 1;

			for (int j=0; j<n; j++)
			{
				if (rec[i].avg < rec[j].avg)			// 평균 비교
				{
					rec[i].rank++;
				}
			}
		}
	}
	
	// 출력
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

	// 속성 : 인원수, Record 형태의 배열
	// 주요 속성 구성
	// private로 감춰져있음
	private int inwon;			//-- 인원 수
	private Record[] recArr;	//-- Record 배열 선언
								//	 (학생 1명 당 Record 배열방 1개 활용) Record클래스 
	String[] subTitle = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};
	

	// 기능 : 인원수 입력, 상세 데이터 입력, 총점/평균 산출, 결과 출력
	// 메소드 정의
	// ① 인원수 입력
	public void set()			// 위에 int inwon;으로 담을 자료 만들어놔서 void로 
	{
		Scanner sc = new Scanner(System.in);


		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);		// 논리연산자 ||(OR) 1보다 작거나 100보다 클 때 반복
		
		// Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
		// 배열방을 inwon만큼 생성한 것이지,
		// Record 클래스의 인스턴스를 생성한 것은 아니다.
		recArr = new Record[inwon];			// 인스턴스 생성 아니고 배열 생성 인원수만큼 방을 만들겠다는 배열 생성!!
											// Record[] recArr; 요기
											// 인원수 입력하고 학생 1명을 표현할 수 있는 속성들로 구성 하려함 
	}

	// 기능 : 인원수 입력, 상세 데이터 입력, 총점/평균 산출, 결과 출력
	// 메소드 정의
	// ② 상세 데이터 입력 + ③ 총점/평균 산출
	public void input()							// 이름이랑 점수 입력받는거라 매개변수 넘겨 받을거 없어서 void
	{
		Scanner sc = new Scanner(System.in);

		for (int i=0; i<inwon; i++)				// 인원수만큼 반복 (inwon == recArr.length)
		{
			// Record 클래스 기반의 인스턴스 생성
			//Record rec = new Record();
			//recArr[i] = rec;
			recArr[i] = new Record();			// 위에 두줄 합친거

			System.out.printf("%d번째 학생의 이름 입력 : ", (i+1));
			recArr[i].name = sc.next();									// Record 크래스 기반 인스턴스 생성 recArr에 담기
			
			/*
			System.out.print("국어 점수 : ");
			recArr[i].score[0] = sc.nextInt();
			recArr[i].tot += recArr[i].score[0];						// recArr.tot를 score 0번째 값 더하기

			System.out.print("영어 점수 : ");
			recArr[i].score[1] = sc.nextInt();
			recArr[i].tot += recArr[i].score[1];

			System.out.print("수학 점수 : ");
			recArr[i].score[2] = sc.nextInt();
			recArr[i].tot += recArr[i].score[2];
			*/

			for (int j=0; j<subTitle.length; j++)			// 0 1 2 이렇게 세번 돌거임
			{
				// 안내 메시지 출력
				System.out.print(subTitle[i]);				// 138,142,146번째 줄
				
				// 사용자가 입력한 데이터를 스코어(score) 배열에 담아내기
				recArr[i].score[j] = sc.nextInt();			// 139, 143, 147번째 줄

				// 국어, 영어, 수학 점수 데이터를 반복적으로 입력받는 동안
				// 그 과정에서 총점 누적하기
				recArr[i].tot += recArr[i].score[j];		// 140, 144, 148번째 줄
			}

			// 평균 산출하기
			recArr[i].avg = recArr[i].tot/3.0;
		}
		// recArr 배열은 Record[] 라고 있는 타입만 담을 수 있음
	}//end input()

	// 기능 : 인원수 입력, 상세 데이터 입력, 총점/평균 산출, 결과 출력
	// 메소드 정의
	// ④ 결과 출력
	public void print()						//이름, 국어, 영어, 수학 점수 입력 매개변수 없음 외부에서 접근 가능하게 public
	{
		// 석차 산출 메소드 호출구문 추가~!!!
		ranking();

		System.out.println();	//개행

		// 학생 1인 당 반복 출력 구문
		for (int i=0; i<inwon; i++)		//-- 학생 인원 수 만큼 반복
		{
			// 이름 출력
			System.out.printf("%5s", recArr[i].name);		//recArr 배열의 i번째 이름

			// 성적(국어, 영어, 수학) 반복 출력
			for (int j=0; j<3; j++)		//-- 0 1 2 국어 영어 수학 반복
			{
				System.out.printf("%4d", recArr[i].score[j]);	//score[j]
			}

			// 총점 평균 출력
			System.out.printf("%5d", recArr[i].tot);
			System.out.printf("%8.2f", recArr[i].avg);

			// 석차 출력 구문 추가
			System.out.printf("%5d", recArr[i].rank);

			System.out.println();		//개행
		}
	}//end print()

	// 메소드 추가 정의
	// ⑤ 석차 산출
	private void ranking()				//값을 받아서 비교  출력하는 메소드에서 호출할 수 있게
	{
		// 루프 변수
		int i,j;

		// 모든 학생들의 등수(석차)를 1로 초기화
		for (i=0; i<inwon; i++)
		{
			recArr[i].rank = 1;
		}

		// 등수(석차) 산출
		for (i=0; i<inwon-1; i++)			// i → 비교 기준을 설정하는 인덱스, 기준 대상 데이터가 마지막꺼는 해당되지 않아서 inwon-1 넣은거
		{
			for (j=i+1; j<inwon; j++)		// 첫번째 데이터가 기준일때 두번째 데이터랑 비교해야하니까 j=i+1
			{
				if (recArr[i].avg > recArr[j].avg)	//기준 데이터가 비교 데이터보다 크다면
				{
					// 비교데이터의 rank를 1만큼 증가
					recArr[j].rank++;
				}
				else if (recArr[j].avg > recArr[i].avg)	//비교 데이터가 기준 데이터보다 크다면
				{
					// 기준데이터의 rank를 1만큼 증가
					recArr[i].rank++;
				}// 기준 데이터 i 비교 데이터 j
			}
		}
	}

}

