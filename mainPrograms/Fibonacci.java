//Program to find the Fibonacci series.
class Fibonacci{
  public static void main(String[] args){
     int a=0;
     int b=1;
     int res=0;
       while(res<1000){
         res=a+b;
     if(res<=1000){
      System.out.println(res);
     }
     else{
       break;
     }
    a=b;
    b=res;
   }
 }
}