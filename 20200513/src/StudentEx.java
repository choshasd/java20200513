import java.util.Scanner;

public class StudentEx {
/*
 * 	StudentEx(){
		Student[] student = new Student[10];
		student[0] = new Student("ȫ�浿", 20, 1);
		student[1] = new Student("ȫ�浿", 30, 2);
		student[2] = new Student("ȫ�浿", 40, 3);
		student[3] = new Student("ȫ�浿", 50, 4);
		student[4] = new Student("ȫ�浿", 60, 5);
		student[5] = new Student("ȫ�浿", 70, 6);
		student[6] = new Student("ȫ�浿", 80, 7);
		student[7] = new Student("ȫ�浿", 90, 8);
		student[8] = new Student("ȫ�浿", 100, 9);
		student[9] = new Student("ȫ�浿", 110, 10);
		//�ڿ� toString()�� �����Ȱű� ������ �־�ǰ� �����ص���
		for(int i = 0;i< student.length ; i++) {
			System.out.println("�л� " +i+ " = "+student[i].toString());
		}
*/	
		private Student[] stud = new Student[10];
		int cnt=0;
		
		Scanner scan_stu = new Scanner(System.in);
	StudentEx() {
		while(true) {
			System.out.println("1.�л� �Է�\n2.�л����\n3.����");
			int select = scan_stu.nextInt();
			if(select ==1) {
				scan_stu.nextLine();
				System.out.println("�л� �̸� �Է� : ");
				String name = scan_stu.nextLine();
				System.out.println("�л� ���� �Է� : ");
				int age = scan_stu.nextInt();
				
				stud[cnt] = new Student(name, age, (cnt+1));
				System.out.println(cnt+1+"���� �л��� ����߽��ϴ�.");
				System.out.println();
				cnt++;
			}
			else if(select ==2) {
				for(int i = 0;i< stud.length ; i++) {
					System.out.println("�л� " +(i+1)+ " = "+stud[i].toString());
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
