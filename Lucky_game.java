import java.util.Scanner;
import java.util.Random;
public class Lucky_game {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Player p1 = new Player();
		System.out.println("����� ��ȭ�ο� ������ �ϰ��־����ϴ�.");
		System.out.println("�׷��� ���ڱ� �տ��� ���Ͱ� ��Ÿ�����ϴ�.");
		int i = 1;
		while(true){
			System.out.println(i + "��°��");
			System.out.println("������ �Ͻðڽ��ϱ�?");
			System.out.println("����   ��������   ������");
			String a = input.nextLine();
			if(a.equals("����")) {
				p1.atk();
			}
			else if(a.equals("��������")) {
				p1.monster_dictionary();
				continue;
			}
			else if(a.equals("������")) {
				p1.player_dictionary();
				continue;
			}
			else {
				System.out.println("����� �Է��Ͻʽÿ�.");
				continue;
			}
			System.out.println("���Ͱ� ����� ���� �����մϴ�.");
			p1.monster_atk();
			if(p1.monster_hp() <= 0 &&p1.player_hp() <= 0) {
				System.out.println("����� ����� ���� �׾����ϴ�");
				break;
			}
			else if(p1.monster_hp() <= 0) {
				System.out.println("����� ����� ���� �¸��߽��ϴ�!");
				break;
			}
			else if(p1.player_hp() <= 0) {
				System.out.println("����� ����� �����̿����� ����߽��ϴ�.");
				break;
			}
			i++;
		}
		input.close();
	}

}
class Player{
	private int hp = 25;
	private int monster_hp = 30;
	private int player_str = 10;
	private int monster_str = 8;
	int monster_hp(){
		return this.monster_hp;
	}
	int player_hp(){
		return this.hp;
	}
	void atk(){
		Random random = new Random();
		int a = this.player_str;
		int n = (random.nextInt(a)+1);
		this.monster_hp = this.monster_hp - n;
		System.out.println(n+"demage!");
		System.out.println("���� ���� ü��: "+this.monster_hp);
	}
	void monster_atk() {
		Random random = new Random();
		int a = this.monster_str;
		int r = (random.nextInt(a));
		this.hp = this.hp - r;
		System.out.println(r+"demage!");
		System.out.println("���� ���� ü��: "+this.hp);
	}
	void monster_dictionary() {
		System.out.println("����̴� �Ǻδ� �ʷϻ��̰� �տ��� �����ε� ���� �������� �������ִ�");
		System.out.println("ü��: 30, ���ݷ�: 0~7");
	}
	void player_dictionary() {
		System.out.println("����� �ΰ��̴�");
		System.out.println("ü��: 25, ���ݷ�: 1~10");
	}
}