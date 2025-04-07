package MainOverloading;

public class MainOverload {
	
	public static void main(String[] args) {
	        System.out.println("Main with String[] args");
	        main(10); 
	        main("Katharine");
	    }

	 
	    public static void main(int a) {
	        System.out.println("Overloaded main with int: " + a);
	    }

	
	    public static void main(String name) {
	        System.out.println("Overloaded main with String: " + name);
	    }
	}

