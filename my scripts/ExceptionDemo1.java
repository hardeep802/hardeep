class ExceptionDemo1{
	public static void main(String[]args){
		try{
			int a[]=new int[10];
			a[20]=50/0;
		}
		catch(ArrayIndexOutOfBoundsException iob){System.out.println("task2");}
		catch(ArithmeticException ae){System.out.println("task1");}
		catch(Exception e){System.out.println("task3");}
		System.out.println("rest of the code");
	}
}