//write a program to check the whether the given character is alphabit.
class Vowel{
 public static void main(String[] args){
    char ch='D';
     if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
      switch (ch){
      case 'a':
      case 'A':
      case 'e':
      case 'E':
      case 'i':
      case 'I':
      case 'o':
      case 'O':
      case 'u':
      case 'U':{
        System.out.println(ch + "is an vowel");
        break;
      }
     default:{System.out.println(ch + "is an consonent"); }
    }
   }
   else{
       System.out.println(ch  +  "is not an alphabit");
   }
 }
}