
public class App {

	public static void main(String[] args) {

		Human tom = new Human();
		walker(tom);
		
		Robots wale = new Robots();
		walker(wale);
		
		walker(new walkable() {

			@Override
			public void walk() {

				System.out.println("Custom Object Walking");
			}
			
		});
	}
	
	public static void walker(walkable walkableEntity) {
		walkableEntity.walk();
	}

}
