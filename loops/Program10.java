//write a program to print the following form
class Program10{
 public static void main(String[] args){
   int a=5;
    int b=0;
    for(int i=1;i<=5;i++){
         a--;
         b++;
      for(int j=1;j<=a;j++){
         System.out.print(" "); 
      }
      for(int k=1;k<=b;k++){
       System.out.print("*");
      }
      System.out.println();
    }
 }
}