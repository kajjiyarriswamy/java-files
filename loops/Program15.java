//write a program to print the following form
class Program15{
 public static void main(String[] args){
   int a=0;
    int b=1;
    for(int i=1;i<=4;i++){
        a++;
        for(int j=1;j<=a;j++){
         System.out.print(b++);
        }
         System.out.println();
    }
 }
}