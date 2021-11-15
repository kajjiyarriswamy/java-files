//write a program to print the following form
//Ab
//Ba
//....so on
class Program5{
 public static void main(String[] args){
   char ch1='a';
    for(char ch='A';ch<='Z';ch++){
        System.out.println(ch+""+ch1++);
    }
 }
}