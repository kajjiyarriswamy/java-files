//Program to find the Amstrong number,take number with three digits.
class AmStrongNumber{
  public static void main(String[] args){
     int num=333;
     int rem;
     int sum=0;
     int n=num;
       while(num>0){
         rem=num%10;
         num=num/10;
         sum=sum+(rem*rem*rem);
       }
     if(sum==n){
      System.out.println("The given number is Amstrong number:"+n);
     }
     else{
       System.out.println("The given number is not Amstrong number:"+n);
     }
   }
}