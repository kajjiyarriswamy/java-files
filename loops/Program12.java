//write a program to print the following form
class Program12{
 public static void main(String[] args){
   int space=3;
   int star=0;
   
    for(int i=1;i<=7;i++){
      if(i<=4){
         space--;
         star++;
      }
      else{
         space++;
         star--;
      }
      for(int j=1;j<=space;j++){
       System.out.print(" ");  
      }
      for(int k=1;k<=star;k++){
       System.out.print("*");
      }
      if(i>=3 && i<=5){
       for(int k=1;k<=4;k++){
       System.out.print("*");
       }
      }
      else{
       for(int j=1;j<=4;j++){
       System.out.print(" ");
      }
     }
     for(int k=1;k<=star;k++){
       System.out.print("*");
     }
      
      System.out.println();
    }
 }
}