//write a program to find reverse of a given number
class Program19{
 public static void main(String[] args){
   int num=235;
   int rev=0;
  while(num>0){
    int rem=num%10;
     rev=rev*10+rem;
     num=num/10;
  }
    System.out.println(rev);
 }
}