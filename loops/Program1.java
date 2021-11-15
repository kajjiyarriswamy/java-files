//write a program to print the following form
//A1a
//B2b
//....so on
class Program1{
 public static void main(String[] args){
     char ch1='a';
      int i=1;
    for(char ch='A';ch<='Z';ch++){
        System.out.println(ch+""+i+++ch1++);
    }
 }
}