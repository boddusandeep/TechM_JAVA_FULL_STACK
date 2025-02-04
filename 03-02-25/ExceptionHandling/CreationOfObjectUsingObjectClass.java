package ExceptionHandling;

public class CreationOfObjectUsingObjectClass {
	
	public void function1() {
		System.out.println("the fun1 executed");
	}
	
	
	
	
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		CreationOfObjectUsingObjectClass obj1=new CreationOfObjectUsingObjectClass();
		obj1.function1();
		// creating object using Object Class 
		
		// Object class is the top class of all the Class
		
		@SuppressWarnings("deprecation")
		Object obj2=Class.forName("CreationOfObjectUsingObjectClass").newInstance();
		//((CreationOfObjectUsingObjectClass) obj2).function1();
		obj2.getClass();
		 
	}
	
	

}
