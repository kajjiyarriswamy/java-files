//write a program to print the following form
class Program17{
 public static void main(String[] args){
   int a=6;
    int b=1;
    int c=3;
    char ch='a';
    for(int i=1;i<=6;i++){
        a--;
        for(int j=1;j<=a;j++){
         System.out.print(" ");
        }
       if(i==1||i==3||i==5){
        for(int j=1;j<=b;j++){
         System.out.print(ch++);
        }
       }
         b=b+2;
        if(i==2||i==4||i==6){
           for(int k=1;k<=c;k++){
             System.out.print(k);
           }
          c=c+4;
        }
         
         System.out.println();
    }
 }
}