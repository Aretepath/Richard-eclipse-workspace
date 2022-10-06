
public class AppConvertLamda2 {

	public static void main(String[] args) {

		Human tom = new Human();
		walker(tom);
		
		Robots wale = new Robots();
		walker(wale);
		
		walker( () -> 
		{System.out.println("Custom Object Walking");
		System.out.println("Custom Object has fallen over");
		});
		
		ALambdaInterface helloVar = () -> System.out.println("hello there");
		Calculate sumVar = (a, b) -> a+b;
		helloVar.sometype();
		System.out.println(sumVar.compute(4, 9));
		
		Calculate nonZeroDivider =  (a, b) -> {
			 if(a==0) {
				return 0;		 
		 }
		 return a/b;
		 };
		 
		 System.out.println(nonZeroDivider.compute(10, 5));
		 
		 StringWorker reverser = (s) -> {
			 String result = "";
			 for(int i = s.length() -1; i >=0; i--) {
				 result += s.charAt(i);			 
			 }
			 return result;
			 
		 };
		 
		 System.out.println(reverser.Work("Vehicle"));
		 
		 NumberWorker computedNumber = (n) -> {
				int result = 1;
				for(int i =1; i <= n; i++) {
					result = i*result;
				}
				return result;
		 };
		 System.out.println(computedNumber.compute(10));
	}
	
	public static void walker(walkable walkableEntity) {
		walkableEntity.walk();
		
	}
	
	
	
	public void sayHello() {
		System.out.println("Hello there");
	}

	public int sum(int arg1,int arg2) {
		return arg1+arg2;
	}
	
	public int nonZeroDivide(int arg1,int arg2) {
		if(arg1==0) {
			return 0;
		}
		return arg1/arg2;
	}
	
	interface StringWorker{
		public String Work(String str);
	}
	
	public int factorial(int num) {
		int result = 1;
		for(int i =1; i >= num; i++) {
			result = i*result;
		}
		return result;
	}
	
	public interface NumberWorker {
		public int compute(int a);

	}
	
	
}
