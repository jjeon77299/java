class Students{
	String name;
	int id;
	
	void setName(String str) {
		name = str;
	}
	void setId(int number) {
		id = number;
	}
	String getName() {
		return name;
	}
	int getId() {
		return id;
	}

}
public class StudentTest {

	public static void main(String[] args) {
		Students std = new Students();
		
		std.setName("Kim");
		std.setId(12345);
		
		System.out.println("�̸�: "+std.getName()+ " �й�: "+std.getId());
	}

}
