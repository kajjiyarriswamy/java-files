class IfElseLadder{
 public static void main(String[] args){
    int i=10;
    if(i%3==0 && i%4==0){
       System.out.println("goodmorning");
     }
     else if(i%3==0){
       System.out.println("goodafternoon");
     }
     else if(i%4==0){
      System.out.println("goodevening");
     }
     else{
      System.out.println("goodnight");
     }
     
 }
}