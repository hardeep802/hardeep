class ThrowDemo1{
  static void vote(int age){
       if(age<18){
           throw new ArithmeticException("no permission");
         } else{System.out.println("welcome to vote");}
}  
public static void main(String[]args){
       
      vote(30);
   }
}