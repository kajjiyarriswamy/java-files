//write a program to find palindrome of a given number
class Program20{
 public static void main(String[] args){
   int num=232;
    int n=num;
   int rev=0;
  while(num>0){
    int rem=num%10;
     rev=rev*10+rem;
     num=num/10;
  }
   if(rev==n){
    System.out.println("palindrome");
   }
   else{
       System.out.println("Not a palindrome");
   }
 }
}