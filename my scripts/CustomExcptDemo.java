public class CustomExcptDemo {
	static void validate(int age) throws InvalidAgeException{
		if(age<18){
			throw new InvalidAgeException("Please wait till you are 18+. So sorry.");
		} else{System.out.println("welcome to vote");}
	}
	public static void main(String[] args) {
		try{
			validate(15);
		}catch(InvalidAgeException ia){System.out.println("Exception occured " +ia);}
		System.out.println("rest of the code");
	}
			
	}
	

