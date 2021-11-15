class One{
 public  void display(){
  System.out.println("i am from one");
 }
}
class Two extends One{
   public  void display(){
      super.display();
     System.out.println("i am from two");
   }
}
class Super{
 public static void main(String[] args){
     One a=new Two();
     a.display();
     return;
 }
}
    