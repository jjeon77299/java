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
			System.out.print("������ �Է����ּ���: ");
			name[i] = sc.next();
			System.out.print("����⵵�� �Է����ּ���: ");
			birth[i] = sc.nextInt();
			age[i] = ageF(birth[i]);
		}
		System.out.println("�̸� ����⵵ ����");
		for(int i = 0;i<name.length;i++) {
			System.out.print(name[i]+" ");
			System.out.print(birth[i]+" ");
			System.out.print(age[i]);
			System.out.println();
		}
	}

}
