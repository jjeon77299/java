import java.util.Scanner;

public class Birthage {

	static int ageF(int name) {
		return 2022-name;
	}
	
	
	public static void main(String[] args) {
		String[] name = new String[2];
		int [] birth = new int[2];
		int[] age = new int[2];
		for(int i = 0;i<name.length;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("성명을 입력해주세요: ");
			name[i] = sc.next();
			System.out.print("출생년도를 입력해주세요: ");
			birth[i] = sc.nextInt();
			age[i] = ageF(birth[i]);
		}
		System.out.println("이름 출생년도 나이");
		for(int i = 0;i<name.length;i++) {
			System.out.print(name[i]+" ");
			System.out.print(birth[i]+" ");
			System.out.print(age[i]);
			System.out.println();
		}
	}

}
