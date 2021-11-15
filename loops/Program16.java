//write a program to print the following form
class Program16{
 public static void main(String[] args){
   int a=5;
    int b=1;
    char ch='a';
    for(int i=1;i<=4;i++){
        a--;
        for(int j=1;j<=a;j++){
         System.out.print(" ");
        }
        for(int j=1;j<=b;j++){
         System.out.print(ch++);
        }
         b=b+2;
         System.out.println();
    }
 }
}