
public class D0125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani[] = new Animal[2];
		ani[0] = new Dog();
		ani[1] = new Cat();
		
		((Dog)ani[0]).spc();
		ani[1].sound();
	}

}
abstract class Animal{
	public abstract void sound();
}
class Dog extends Animal{
	public void sound() {
		System.out.print("�۸�");
	}
	public  void spc() {
		System.out.println("����������");
	}
	
}

class Cat extends Animal{
		public void sound() {
			System.out.print("�߿�");
		}
}