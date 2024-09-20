package e03_super;

public class Person extends Animal{
	private String name;
	
	//자식 생성자가 부모 생성자에 필요한 값을 받아서
	//부모 생성자에게 전달함 --> super(값....) : 부모 생성자를 호출하는 부분
	//자식 생성자가 제일 먼저 해야되는 일이, 부모 생성자를 호출하는 부분
	//super --> 부모 클래스를 의미함, this --> 자기자신 의미함
	public Person(int age) {
//		System.out.println(age); //부모생성자 실행전에는 다른 코드 삽입 X
		super(age);
		// TODO Auto-generated constructor stub
	}

	public Person(int age, String name) {
		super(age);
		this.name = name;
	}
	
	@Override
	public void printAge() {
		System.out.println(name + "의 나이는 " + age + "입니다.");
	}
	
	
}


