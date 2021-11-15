// changed
class AphabitDigitSpecial{
 public static void main(String[] args){
    char i='2';
    if((i>='a' && i<='z')||(i>='A' && i<='Z')){
       System.out.println(i + "is an alphabit");
     }
     else if(i>='0' && i<='9'){
       System.out.println(i +"is an digit");
     }
     else{
      System.out.println(i +"is a special character");
     }
     
 }
}