
public class AppConvertLamda {

	public static void main(String[] args) {

		Human tom = new Human();
		walker(tom);
		
		Robots wale = new Robots();
		walker(wale);
		
		walker( () -> 
		{System.out.println("Custom Object Walking");
		System.out.println("Custom Object has fallen over");
		});
	}
	
	public static void walker(walkable walkableEntity) {
		walkableEntity.walk();
	}

}
