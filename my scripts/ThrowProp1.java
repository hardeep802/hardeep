class ThrowProp1{
    void m(){
       int i= 30/0;
    }
    void n(){
     m();
    }
    void p(){
       try{
           m();
      } catch (ArithmeticException ae){System.out.println("exception handled");}
    }
   public static void main(String[]args){
       ThrowProp1 obj= new ThrowProp1();
       obj.p();
       System.out.println("normal flow");
}
}