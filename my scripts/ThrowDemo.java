class ThrowDemo{
	void vote(int age){
		if(age<18){
			throw new ArithmeticException("no permission");
		} else{System.out.println("welcome to vote");}
	}  
	public static void main(String[]args){
		ThrowDemo obj= new ThrowDemo();
		obj.vote(30);
	}
}
