
public class D0121 {

	public static void main(String[] args) {
		Student s1 = new Student(100);
		Student s2 = new Student(100, "ȫ�浿");
		Student s3 = new Student();
		s1.addPoint(10);
		s2.addPoint(20);
		s3.addPoint(30);
		s1.hpDown();
		System.out.println(s2.showhp());
	}

}
class Student{
	private String name;
	private int point = 100;
	private int max_point = 200;
	private static int hp = 10;
	
	Student(int point, String name){
		this.point = point;
		this.name = name;
	}
	Student(int point){
		this.point = point;
	}
	Student(){
		
	}
	
	void addPoint(int point) {
		this.point = this.point + point;
		if(this.point > this.max_point) {
			this.point = this.max_point;
		}
	}
	
	int showPoint() {
		return this.point;
	}
	void hpDown() {
		this.hp--;
	}
	int showhp() {
		return this.hp;
	}
}