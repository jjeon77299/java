import java.util.Scanner;

public class endex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����, ���� �� �� �ϳ��� �Է� �Ͻÿ�: ");
		String user = sc.nextLine();
		int computer = (int)(Math.random() * 3);
		if(user.equals("����")) {
			if(computer == 0) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("�����ϴ�");
			}
			else if(computer == 1) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("����� �����ϴ�");
			}
			else if(computer == 2) {
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
				System.out.println("����� �̰���ϴ�");
			}
		}
		if(user.equals("����")) {
			if(computer == 0) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("����� �̰���ϴ�");
			}
			else if(computer == 1) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("�����ϴ�");
			}
			else if(computer == 2) {
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
				System.out.println("����� �����ϴ�");
			}
		}
		if(user.equals("��")) {
			if(computer == 0) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("����� �����ϴ�");
			}
			else if(computer == 1) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				System.out.println("����� �̰���ϴ�");
			}
			else if(computer == 2) {
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
				System.out.println("�����ϴ�");
			}
		}

	}

}
