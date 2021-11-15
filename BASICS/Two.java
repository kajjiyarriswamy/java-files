class One{
 public  void display(){
  System.out.println("i am from one");
 }
}
class Two extends One{
   public  void display(){
     System.out.println("i am from two");
   }
 public static void main(String[] args){
     Two a=new Two();
     a.display();
     return;
 }
}
    