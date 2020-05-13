import java.util.Scanner;

public class StudentEx {
/*
 * 	StudentEx(){
		Student[] student = new Student[10];
		student[0] = new Student("홍길동", 20, 1);
		student[1] = new Student("홍길동", 30, 2);
		student[2] = new Student("홍길동", 40, 3);
		student[3] = new Student("홍길동", 50, 4);
		student[4] = new Student("홍길동", 60, 5);
		student[5] = new Student("홍길동", 70, 6);
		student[6] = new Student("홍길동", 80, 7);
		student[7] = new Student("홍길동", 90, 8);
		student[8] = new Student("홍길동", 100, 9);
		student[9] = new Student("홍길동", 110, 10);
		//뒤에 toString()은 생략된거기 때문에 넣어도되고 생략해도됨
		for(int i = 0;i< student.length ; i++) {
			System.out.println("학생 " +i+ " = "+student[i].toString());
		}
*/	
		private Student[] stud = new Student[10];
		int cnt=0;
		
		Scanner scan_stu = new Scanner(System.in);
	StudentEx() {
		while(true) {
			System.out.println("1.학생 입력\n2.학생출력\n3.종료");
			int select = scan_stu.nextInt();
			if(select ==1) {
				scan_stu.nextLine();
				System.out.println("학생 이름 입력 : ");
				String name = scan_stu.nextLine();
				System.out.println("학생 나이 입력 : ");
				int age = scan_stu.nextInt();
				
				stud[cnt] = new Student(name, age, (cnt+1));
				System.out.println(cnt+1+"명의 학생을 등록했습니다.");
				System.out.println();
				cnt++;
			}
			else if(select ==2) {
				for(int i = 0;i< stud.length ; i++) {
					System.out.println("학생 " +(i+1)+ " = "+stud[i].toString());
				}
			}
			else {
				break;
			}
			
		}
		
	}
	public static void main(String[] args) {
		new StudentEx();
	}
}
