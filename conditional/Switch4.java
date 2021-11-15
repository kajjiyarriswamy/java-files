//write a program to display the output in the following manner i) if the character contains a digit then display the character contains the digitii) if the character contains a alphabit then display the character contains the alphabit iii) else we need to diplay the charater contains special charater.
class Switch4{
 public static void main(String[] args){
     switch ('1'){
       case 'A':{
         System.out.println("the given charater contains alphabit");
         break;
       }
       case '1':{
         System.out.println("the given charater contains digit");
          break;
       }
     default :{
         System.out.println("the given character contains special charater");
     }
   }
 }
}