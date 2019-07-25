package demo;


public class Demo {
	
	
	
	public static void main(String[] args) {
		String string = "1234,1234,1234";
		boolean matches = string.matches("([0-9]{4}[,]?)+");
		System.out.println(matches);
	}

}
