import java.io.IOException;

class ThrowsDemo{
   void m() throws IOException{
       throw new IOException("Device Error");
    }
   void n() throws IOException{
     m();
    }
   void p(){
      try{
        n();
       } catch(Exception e){System.out.println("handled");}
    }
  public static void main(String[]args){
    ThrowsDemo obj = new ThrowsDemo();
    obj.p();
    System.out.println("normal flow");
}
}
  
     