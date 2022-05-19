
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fahrenheit = 100;
		float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
		
		//C = 5/9 * (F-32) 공식
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	}

}
