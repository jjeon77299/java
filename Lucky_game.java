import java.util.Scanner;
import java.util.Random;
public class Lucky_game {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Player p1 = new Player();
		System.out.println("당신은 평화로운 여행을 하고있었습니다.");
		System.out.println("그런데 갑자기 앞에서 몬스터가 나타났습니다.");
		int i = 1;
		while(true){
			System.out.println(i + "번째턴");
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("공격   몬스터정보   내정보");
			String a = input.nextLine();
			if(a.equals("공격")) {
				p1.atk();
			}
			else if(a.equals("몬스터정보")) {
				p1.monster_dictionary();
				continue;
			}
			else if(a.equals("내정보")) {
				p1.player_dictionary();
				continue;
			}
			else {
				System.out.println("제대로 입력하십시요.");
				continue;
			}
			System.out.println("몬스터가 당신을 향해 공격합니다.");
			p1.monster_atk();
			if(p1.monster_hp() <= 0 &&p1.player_hp() <= 0) {
				System.out.println("고블린과 당신이 서로 죽었습니다");
				break;
			}
			else if(p1.monster_hp() <= 0) {
				System.out.println("당신은 고블린을 상대로 승리했습니다!");
				break;
			}
			else if(p1.player_hp() <= 0) {
				System.out.println("당신은 고블린의 몽둥이에의해 사망했습니다.");
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
		System.out.println("몬스터 남은 체력: "+this.monster_hp);
	}
	void monster_atk() {
		Random random = new Random();
		int a = this.monster_str;
		int r = (random.nextInt(a));
		this.hp = this.hp - r;
		System.out.println(r+"demage!");
		System.out.println("나의 남은 체력: "+this.hp);
	}
	void monster_dictionary() {
		System.out.println("고블린이다 피부는 초록색이고 손에는 나무로된 낡은 몽둥이을 가지고있다");
		System.out.println("체력: 30, 공격력: 0~7");
	}
	void player_dictionary() {
		System.out.println("평범한 인간이다");
		System.out.println("체력: 25, 공격력: 1~10");
	}
}