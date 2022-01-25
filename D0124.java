public class D0124 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setAge(10);
		s1.setCls(10101);
		s1.setName("Lee");
	}

}

class Student extends human{
	int cls;
	public void temp() {
		super.setName("lee");
	}
	public void setName() {
		
	}
	public void setCls(int cls) {
		this.cls = cls;
	}
	public int showCls() {
		return this.cls;
	}
}