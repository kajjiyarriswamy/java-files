//write a program to print the following form
//A1a
//B1b
//....so on
class Program2{
 public static void main(String[] args){
     char ch1='a';
    for(char ch='A';ch<='Z';ch++){
        System.out.println(ch+"1"+ch1++);
    }
 }
}