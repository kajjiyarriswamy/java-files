//Program to find the whether a given is Strong number or not.
class StrongNumber{
  public static void main(String[] args){
     int num=456;
     int sum=0;
     int rem;
       while(num>0){
         rem=num%10;
         sum=sum+factorial(rem);
         num=num/10;
       }
       public static int factorial(int num){
         int fact=1;
      for(int i=1;i<=num;i++){
        fact=fact*i;
      }
     return ;
   }
     if(n==sum){
      System.out.println("The given number is strong number :"+n);
     }
     else{
       System.out.println("The given number is not strong number :"+n);
     }
 }
}