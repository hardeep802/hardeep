 class ExceptionDemo {
	public static void main (String[]args){
		try{
			int i= 10/0;
		}catch (ArithmeticException ae){
			System.out.println(ae);
		}
		System.out.println("rest of the code...");
	}

}
