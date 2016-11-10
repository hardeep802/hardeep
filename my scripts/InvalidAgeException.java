class InvalidAgeException extends Exception{
	InvalidAgeException() {
		this("Invalid age");
	}
	InvalidAgeException(String s){
		super(s);
	}

}
