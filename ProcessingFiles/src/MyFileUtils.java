import com.clark.exceptions.FooRunTimeException;

public class MyFileUtils {
	
	public int subtract10FromLargerNumber(int number) throws FooRunTimeException {
		if(number <10) {
			throw new FooRunTimeException("The number was smaller than 10");
		}
		return number -10;
	}


}
