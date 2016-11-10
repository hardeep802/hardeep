class ExcptDemo3{
	public static void main(String[]args){
		try{
			int i= 30/0;
			System.out.println("task completed");
		} catch( ArithmeticException e){System.out.println(e);}
		finally{System.out.println("important code");}
		System.out.println("rest of the code");
	}
}
