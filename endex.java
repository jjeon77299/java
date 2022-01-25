import java.util.Scanner;

public class endex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위, 바위 보 중 하나를 입력 하시오: ");
		String user = sc.nextLine();
		int computer = (int)(Math.random() * 3);
		if(user.equals("가위")) {
			if(computer == 0) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
				System.out.println("비겼습니다");
			}
			else if(computer == 1) {
				System.out.println("컴퓨터는 바위를 냈습니다.");
				System.out.println("당신이 졌습니다");
			}
			else if(computer == 2) {
				System.out.println("컴퓨터는 보를 냈습니다.");
				System.out.println("당신이 이겼습니다");
			}
		}
		if(user.equals("바위")) {
			if(computer == 0) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
				System.out.println("당신이 이겼습니다");
			}
			else if(computer == 1) {
				System.out.println("컴퓨터는 바위를 냈습니다.");
				System.out.println("비겼습니다");
			}
			else if(computer == 2) {
				System.out.println("컴퓨터는 보를 냈습니다.");
				System.out.println("당신이 졌습니다");
			}
		}
		if(user.equals("보")) {
			if(computer == 0) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
				System.out.println("당신이 졌습니다");
			}
			else if(computer == 1) {
				System.out.println("컴퓨터는 바위를 냈습니다.");
				System.out.println("당신이 이겼습니다");
			}
			else if(computer == 2) {
				System.out.println("컴퓨터는 보를 냈습니다.");
				System.out.println("비겼습니다");
			}
		}

	}

}
