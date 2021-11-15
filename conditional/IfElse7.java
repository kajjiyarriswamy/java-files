//write a program to check the whether the given character is lowercase .
class IfElse7{
 public static void main(String[] args){
    char j='*';
     if((j>='a' && j<='z') || (j>='A' && j<='Z')){
         System.out.println("the given charater contains alphabit");
     }
       else if(j>='0' && j<='9'){
          System.out.println("the given charater contains digit");
       }
     else{
       System.out.println("the given character contains special character");
     }
 }
}