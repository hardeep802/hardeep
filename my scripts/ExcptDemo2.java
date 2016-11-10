class ExcptDemo2{
	public static void main(String[]args){

		try{

			try{
				int a[]= new int[5];
				a[10]=5;
			} catch(ArrayIndexOutOfBoundsException aob){System.out.println(aob);}
			try{
				int i= 10/0;
			} catch(ArithmeticException ae){System.out.println(ae);}
		} catch(Exception e){ System.out.println("exception handled");}

		System.out.println("rest of the code...");
	}
}